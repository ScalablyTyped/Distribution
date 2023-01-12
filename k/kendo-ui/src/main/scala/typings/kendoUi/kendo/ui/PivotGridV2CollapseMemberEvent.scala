package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridV2CollapseMemberEvent
  extends StObject
     with PivotGridV2Event {
  
  var axis: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object PivotGridV2CollapseMemberEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PivotGridV2): PivotGridV2CollapseMemberEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridV2CollapseMemberEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotGridV2CollapseMemberEvent] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
