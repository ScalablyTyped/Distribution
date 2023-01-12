package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.DateInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDateInput extends StObject {
  
  /* static member */
  def extend(proto: js.Object): DateInput
  
  /* static member */
  var fn: DateInput
}
object TypeofDateInput {
  
  inline def apply(extend: js.Object => DateInput, fn: DateInput): TypeofDateInput = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDateInput] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => DateInput): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: DateInput): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
