package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerDplProcessingDownload extends StObject {
  
  var url: js.UndefOr[String] = js.native
}
object PDFViewerDplProcessingDownload {
  
  @scala.inline
  def apply(): PDFViewerDplProcessingDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerDplProcessingDownload]
  }
  
  @scala.inline
  implicit class PDFViewerDplProcessingDownloadMutableBuilder[Self <: PDFViewerDplProcessingDownload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
