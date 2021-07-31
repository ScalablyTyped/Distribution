package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttPdfExportEvent
  extends StObject
     with GanttEvent {
  
  var promise: js.UndefOr[JQueryPromise[js.Any]] = js.undefined
}
object GanttPdfExportEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Gantt): GanttPdfExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttPdfExportEvent]
  }
  
  @scala.inline
  implicit class GanttPdfExportEventMutableBuilder[Self <: GanttPdfExportEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromise(value: JQueryPromise[js.Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
