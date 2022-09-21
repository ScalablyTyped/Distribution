package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1VideoPayload extends StObject {
  
  /**
    * FPS of the video.
    */
  var frameRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Video format.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Signed uri of the video file in the service bucket.
    */
  var signedUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of video thumbnails.
    */
  var videoThumbnails: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1VideoThumbnail]] = js.undefined
  
  /**
    * Video uri from the user bucket.
    */
  var videoUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1VideoPayload {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1VideoPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1VideoPayload]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1VideoPayload](x: Self) {
    
    inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateNull: Self = StObject.set(x, "frameRate", null)
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setSignedUri(value: String): Self = StObject.set(x, "signedUri", value.asInstanceOf[js.Any])
    
    inline def setSignedUriNull: Self = StObject.set(x, "signedUri", null)
    
    inline def setSignedUriUndefined: Self = StObject.set(x, "signedUri", js.undefined)
    
    inline def setVideoThumbnails(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1VideoThumbnail]): Self = StObject.set(x, "videoThumbnails", value.asInstanceOf[js.Any])
    
    inline def setVideoThumbnailsUndefined: Self = StObject.set(x, "videoThumbnails", js.undefined)
    
    inline def setVideoThumbnailsVarargs(value: SchemaGoogleCloudDatalabelingV1beta1VideoThumbnail*): Self = StObject.set(x, "videoThumbnails", js.Array(value*))
    
    inline def setVideoUri(value: String): Self = StObject.set(x, "videoUri", value.asInstanceOf[js.Any])
    
    inline def setVideoUriNull: Self = StObject.set(x, "videoUri", null)
    
    inline def setVideoUriUndefined: Self = StObject.set(x, "videoUri", js.undefined)
  }
}
