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
  
  inline def apply(): UploadAsync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadAsync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadAsync] (val x: Self) extends AnyVal {
    
    inline def setAutoRetryAfter(value: Double): Self = StObject.set(x, "autoRetryAfter", value.asInstanceOf[js.Any])
    
    inline def setAutoRetryAfterUndefined: Self = StObject.set(x, "autoRetryAfter", js.undefined)
    
    inline def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
    
    inline def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
    
    inline def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setConcurrent(value: Boolean): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
    
    inline def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
    
    inline def setMaxAutoRetries(value: Double): Self = StObject.set(x, "maxAutoRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxAutoRetriesUndefined: Self = StObject.set(x, "maxAutoRetries", js.undefined)
    
    inline def setRemoveField(value: String): Self = StObject.set(x, "removeField", value.asInstanceOf[js.Any])
    
    inline def setRemoveFieldUndefined: Self = StObject.set(x, "removeField", js.undefined)
    
    inline def setRemoveUrl(value: String): Self = StObject.set(x, "removeUrl", value.asInstanceOf[js.Any])
    
    inline def setRemoveUrlUndefined: Self = StObject.set(x, "removeUrl", js.undefined)
    
    inline def setRemoveVerb(value: String): Self = StObject.set(x, "removeVerb", value.asInstanceOf[js.Any])
    
    inline def setRemoveVerbUndefined: Self = StObject.set(x, "removeVerb", js.undefined)
    
    inline def setSaveField(value: String): Self = StObject.set(x, "saveField", value.asInstanceOf[js.Any])
    
    inline def setSaveFieldUndefined: Self = StObject.set(x, "saveField", js.undefined)
    
    inline def setSaveUrl(value: String): Self = StObject.set(x, "saveUrl", value.asInstanceOf[js.Any])
    
    inline def setSaveUrlUndefined: Self = StObject.set(x, "saveUrl", js.undefined)
    
    inline def setUseArrayBuffer(value: Boolean): Self = StObject.set(x, "useArrayBuffer", value.asInstanceOf[js.Any])
    
    inline def setUseArrayBufferUndefined: Self = StObject.set(x, "useArrayBuffer", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
