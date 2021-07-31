package typings.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressInputs extends StObject {
  
  var address: String
  
  var inputs: js.Array[String]
}
object AddressInputs {
  
  @scala.inline
  def apply(address: String, inputs: js.Array[String]): AddressInputs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressInputs]
  }
  
  @scala.inline
  implicit class AddressInputsMutableBuilder[Self <: AddressInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value :_*))
  }
}
