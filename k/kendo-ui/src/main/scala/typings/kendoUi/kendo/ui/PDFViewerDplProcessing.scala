package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerDplProcessing extends StObject {
  
  var download: js.UndefOr[PDFViewerDplProcessingDownload] = js.native
  
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  
  var read: js.UndefOr[PDFViewerDplProcessingRead] = js.native
  
  var upload: js.UndefOr[PDFViewerDplProcessingUpload] = js.native
}
object PDFViewerDplProcessing {
  
  @scala.inline
  def apply(): PDFViewerDplProcessing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerDplProcessing]
  }
  
  @scala.inline
  implicit class PDFViewerDplProcessingMutableBuilder[Self <: PDFViewerDplProcessing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownload(value: PDFViewerDplProcessingDownload): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setLoadOnDemand(value: Boolean): Self = StObject.set(x, "loadOnDemand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadOnDemandUndefined: Self = StObject.set(x, "loadOnDemand", js.undefined)
    
    @scala.inline
    def setRead(value: PDFViewerDplProcessingRead): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setUpload(value: PDFViewerDplProcessingUpload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
