package typings.iotaLibJs.anon

import typings.iotaLibJs.mod.TransactionObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputsArray extends StObject {
  
  var inputs: js.Array[TransactionObject] = js.native
}
object InputsArray {
  
  @scala.inline
  def apply(inputs: js.Array[TransactionObject]): InputsArray = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsArray]
  }
  
  @scala.inline
  implicit class InputsArrayMutableBuilder[Self <: InputsArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: js.Array[TransactionObject]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: TransactionObject*): Self = StObject.set(x, "inputs", js.Array(value :_*))
  }
}
