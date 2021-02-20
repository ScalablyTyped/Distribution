package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofValidator extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Validator = js.native
  
  /* static member */
  var fn: Validator = js.native
}
object TypeofValidator {
  
  @scala.inline
  def apply(extend: js.Object => Validator, fn: Validator): TypeofValidator = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofValidator]
  }
  
  @scala.inline
  implicit class TypeofValidatorMutableBuilder[Self <: TypeofValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Validator): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Validator): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
