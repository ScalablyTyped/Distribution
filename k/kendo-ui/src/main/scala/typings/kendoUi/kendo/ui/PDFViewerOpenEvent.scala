package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerOpenEvent
  extends StObject
     with PDFViewerEvent {
  
  var file: js.UndefOr[Any] = js.undefined
}
object PDFViewerOpenEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PDFViewer): PDFViewerOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerOpenEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFViewerOpenEvent] (val x: Self) extends AnyVal {
    
    inline def setFile(value: Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
