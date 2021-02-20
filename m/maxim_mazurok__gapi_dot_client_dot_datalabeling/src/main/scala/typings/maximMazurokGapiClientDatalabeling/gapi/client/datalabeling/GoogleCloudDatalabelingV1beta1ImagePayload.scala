package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ImagePayload extends StObject {
  
  /** A byte string of a thumbnail image. */
  var imageThumbnail: js.UndefOr[String] = js.native
  
  /** Image uri from the user bucket. */
  var imageUri: js.UndefOr[String] = js.native
  
  /** Image format. */
  var mimeType: js.UndefOr[String] = js.native
  
  /** Signed uri of the image file in the service bucket. */
  var signedUri: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ImagePayload {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ImagePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImagePayload]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ImagePayloadMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ImagePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageThumbnail(value: String): Self = StObject.set(x, "imageThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageThumbnailUndefined: Self = StObject.set(x, "imageThumbnail", js.undefined)
    
    @scala.inline
    def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setSignedUri(value: String): Self = StObject.set(x, "signedUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedUriUndefined: Self = StObject.set(x, "signedUri", js.undefined)
  }
}
