package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerDplProcessing extends StObject {
  
  var download: js.UndefOr[PDFViewerDplProcessingDownload] = js.undefined
  
  var loadOnDemand: js.UndefOr[Boolean] = js.undefined
  
  var read: js.UndefOr[PDFViewerDplProcessingRead] = js.undefined
  
  var upload: js.UndefOr[PDFViewerDplProcessingUpload] = js.undefined
}
object PDFViewerDplProcessing {
  
  inline def apply(): PDFViewerDplProcessing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerDplProcessing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFViewerDplProcessing] (val x: Self) extends AnyVal {
    
    inline def setDownload(value: PDFViewerDplProcessingDownload): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setLoadOnDemand(value: Boolean): Self = StObject.set(x, "loadOnDemand", value.asInstanceOf[js.Any])
    
    inline def setLoadOnDemandUndefined: Self = StObject.set(x, "loadOnDemand", js.undefined)
    
    inline def setRead(value: PDFViewerDplProcessingRead): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setUpload(value: PDFViewerDplProcessingUpload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
