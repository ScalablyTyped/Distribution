package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofValidator extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Validator
  
  /* static member */
  var fn: Validator
}
object TypeofValidator {
  
  inline def apply(extend: js.Object => Validator, fn: Validator): TypeofValidator = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofValidator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofValidator] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Validator): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Validator): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
