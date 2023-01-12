package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.MultiViewCalendar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMultiViewCalendar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): MultiViewCalendar
  
  /* static member */
  var fn: MultiViewCalendar
}
object TypeofMultiViewCalendar {
  
  inline def apply(extend: js.Object => MultiViewCalendar, fn: MultiViewCalendar): TypeofMultiViewCalendar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMultiViewCalendar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofMultiViewCalendar] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => MultiViewCalendar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: MultiViewCalendar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
