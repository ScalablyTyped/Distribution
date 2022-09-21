package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ImagePayload extends StObject {
  
  /**
    * A byte string of a thumbnail image.
    */
  var imageThumbnail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Image uri from the user bucket.
    */
  var imageUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Image format.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Signed uri of the image file in the service bucket.
    */
  var signedUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ImagePayload {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ImagePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ImagePayload]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ImagePayload](x: Self) {
    
    inline def setImageThumbnail(value: String): Self = StObject.set(x, "imageThumbnail", value.asInstanceOf[js.Any])
    
    inline def setImageThumbnailNull: Self = StObject.set(x, "imageThumbnail", null)
    
    inline def setImageThumbnailUndefined: Self = StObject.set(x, "imageThumbnail", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriNull: Self = StObject.set(x, "imageUri", null)
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setSignedUri(value: String): Self = StObject.set(x, "signedUri", value.asInstanceOf[js.Any])
    
    inline def setSignedUriNull: Self = StObject.set(x, "signedUri", null)
    
    inline def setSignedUriUndefined: Self = StObject.set(x, "signedUri", js.undefined)
  }
}
