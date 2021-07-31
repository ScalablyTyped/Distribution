package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadAsync extends StObject {
  
  var autoRetryAfter: js.UndefOr[Double] = js.undefined
  
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  
  var batch: js.UndefOr[Boolean] = js.undefined
  
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  var concurrent: js.UndefOr[Boolean] = js.undefined
  
  var maxAutoRetries: js.UndefOr[Double] = js.undefined
  
  var removeField: js.UndefOr[String] = js.undefined
  
  var removeUrl: js.UndefOr[String] = js.undefined
  
  var removeVerb: js.UndefOr[String] = js.undefined
  
  var saveField: js.UndefOr[String] = js.undefined
  
  var saveUrl: js.UndefOr[String] = js.undefined
  
  var useArrayBuffer: js.UndefOr[Boolean] = js.undefined
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object UploadAsync {
  
  @scala.inline
  def apply(): UploadAsync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadAsync]
  }
  
  @scala.inline
  implicit class UploadAsyncMutableBuilder[Self <: UploadAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRetryAfter(value: Double): Self = StObject.set(x, "autoRetryAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRetryAfterUndefined: Self = StObject.set(x, "autoRetryAfter", js.undefined)
    
    @scala.inline
    def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
    
    @scala.inline
    def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    @scala.inline
    def setConcurrent(value: Boolean): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
    
    @scala.inline
    def setMaxAutoRetries(value: Double): Self = StObject.set(x, "maxAutoRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAutoRetriesUndefined: Self = StObject.set(x, "maxAutoRetries", js.undefined)
    
    @scala.inline
    def setRemoveField(value: String): Self = StObject.set(x, "removeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFieldUndefined: Self = StObject.set(x, "removeField", js.undefined)
    
    @scala.inline
    def setRemoveUrl(value: String): Self = StObject.set(x, "removeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUrlUndefined: Self = StObject.set(x, "removeUrl", js.undefined)
    
    @scala.inline
    def setRemoveVerb(value: String): Self = StObject.set(x, "removeVerb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveVerbUndefined: Self = StObject.set(x, "removeVerb", js.undefined)
    
    @scala.inline
    def setSaveField(value: String): Self = StObject.set(x, "saveField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveFieldUndefined: Self = StObject.set(x, "saveField", js.undefined)
    
    @scala.inline
    def setSaveUrl(value: String): Self = StObject.set(x, "saveUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveUrlUndefined: Self = StObject.set(x, "saveUrl", js.undefined)
    
    @scala.inline
    def setUseArrayBuffer(value: Boolean): Self = StObject.set(x, "useArrayBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseArrayBufferUndefined: Self = StObject.set(x, "useArrayBuffer", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
