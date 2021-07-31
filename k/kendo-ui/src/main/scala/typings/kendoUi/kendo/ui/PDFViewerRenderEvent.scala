package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerRenderEvent
  extends StObject
     with PDFViewerEvent {
  
  var page: js.UndefOr[js.Any] = js.undefined
}
object PDFViewerRenderEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PDFViewer): PDFViewerRenderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerRenderEvent]
  }
  
  @scala.inline
  implicit class PDFViewerRenderEventMutableBuilder[Self <: PDFViewerRenderEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: js.Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
