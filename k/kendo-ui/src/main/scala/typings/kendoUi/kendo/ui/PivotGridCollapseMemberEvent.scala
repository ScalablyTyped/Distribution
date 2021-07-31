package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridCollapseMemberEvent
  extends StObject
     with PivotGridEvent {
  
  var axis: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[js.Array[String]] = js.undefined
}
object PivotGridCollapseMemberEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PivotGrid): PivotGridCollapseMemberEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridCollapseMemberEvent]
  }
  
  @scala.inline
  implicit class PivotGridCollapseMemberEventMutableBuilder[Self <: PivotGridCollapseMemberEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
  }
}
