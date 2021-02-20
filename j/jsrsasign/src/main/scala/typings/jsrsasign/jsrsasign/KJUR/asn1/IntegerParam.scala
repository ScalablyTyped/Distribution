package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerParam extends StObject {
  
  var int: Double = js.native
}
object IntegerParam {
  
  @scala.inline
  def apply(int: Double): IntegerParam = {
    val __obj = js.Dynamic.literal(int = int.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParam]
  }
  
  @scala.inline
  implicit class IntegerParamMutableBuilder[Self <: IntegerParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInt(value: Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
  }
}
