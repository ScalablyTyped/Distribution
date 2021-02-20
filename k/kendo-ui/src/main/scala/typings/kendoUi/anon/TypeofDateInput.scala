package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.DateInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDateInput extends StObject {
  
  /* static member */
  def extend(proto: js.Object): DateInput = js.native
  
  /* static member */
  var fn: DateInput = js.native
}
object TypeofDateInput {
  
  @scala.inline
  def apply(extend: js.Object => DateInput, fn: DateInput): TypeofDateInput = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDateInput]
  }
  
  @scala.inline
  implicit class TypeofDateInputMutableBuilder[Self <: TypeofDateInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => DateInput): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: DateInput): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
