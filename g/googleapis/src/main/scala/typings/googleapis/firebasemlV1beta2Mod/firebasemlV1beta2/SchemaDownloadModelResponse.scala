package typings.googleapis.firebasemlV1beta2Mod.firebasemlV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDownloadModelResponse extends StObject {
  
  /**
    * Output only. A download URI for the model/zip file.
    */
  var downloadUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time that the download URI link expires. If the link has expired, the REST call must be repeated.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The format of the model being downloaded.
    */
  var modelFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The size of the file(s), if this information is available.
    */
  var sizeBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaDownloadModelResponse {
  
  inline def apply(): SchemaDownloadModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadModelResponse]
  }
  
  extension [Self <: SchemaDownloadModelResponse](x: Self) {
    
    inline def setDownloadUri(value: String): Self = StObject.set(x, "downloadUri", value.asInstanceOf[js.Any])
    
    inline def setDownloadUriNull: Self = StObject.set(x, "downloadUri", null)
    
    inline def setDownloadUriUndefined: Self = StObject.set(x, "downloadUri", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setModelFormat(value: String): Self = StObject.set(x, "modelFormat", value.asInstanceOf[js.Any])
    
    inline def setModelFormatNull: Self = StObject.set(x, "modelFormat", null)
    
    inline def setModelFormatUndefined: Self = StObject.set(x, "modelFormat", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesNull: Self = StObject.set(x, "sizeBytes", null)
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
