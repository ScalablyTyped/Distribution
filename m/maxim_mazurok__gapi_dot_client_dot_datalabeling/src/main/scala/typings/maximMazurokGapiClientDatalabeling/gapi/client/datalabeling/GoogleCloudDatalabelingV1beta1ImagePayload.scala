package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ImagePayload extends StObject {
  
  /** A byte string of a thumbnail image. */
  var imageThumbnail: js.UndefOr[String] = js.undefined
  
  /** Image uri from the user bucket. */
  var imageUri: js.UndefOr[String] = js.undefined
  
  /** Image format. */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** Signed uri of the image file in the service bucket. */
  var signedUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ImagePayload {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ImagePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImagePayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ImagePayload] (val x: Self) extends AnyVal {
    
    inline def setImageThumbnail(value: String): Self = StObject.set(x, "imageThumbnail", value.asInstanceOf[js.Any])
    
    inline def setImageThumbnailUndefined: Self = StObject.set(x, "imageThumbnail", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setSignedUri(value: String): Self = StObject.set(x, "signedUri", value.asInstanceOf[js.Any])
    
    inline def setSignedUriUndefined: Self = StObject.set(x, "signedUri", js.undefined)
  }
}
