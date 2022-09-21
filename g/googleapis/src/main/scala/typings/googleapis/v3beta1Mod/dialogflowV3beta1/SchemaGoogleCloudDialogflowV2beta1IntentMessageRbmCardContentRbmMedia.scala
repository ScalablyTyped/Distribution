package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia extends StObject {
  
  /**
    * Required. Publicly reachable URI of the file. The RBM platform determines the MIME type of the file from the content-type field in the HTTP headers when the platform fetches the file. The content-type field must be present and accurate in the HTTP response from the URL.
    */
  var fileUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required for cards with vertical orientation. The height of the media within a rich card with a vertical layout. For a standalone card with horizontal layout, height is not customizable, and this field is ignored.
    */
  var height: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Publicly reachable URI of the thumbnail.If you don't provide a thumbnail URI, the RBM platform displays a blank placeholder thumbnail until the user's device downloads the file. Depending on the user's setting, the file may not download automatically and may require the user to tap a download button.
    */
  var thumbnailUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia](x: Self) {
    
    inline def setFileUri(value: String): Self = StObject.set(x, "fileUri", value.asInstanceOf[js.Any])
    
    inline def setFileUriNull: Self = StObject.set(x, "fileUri", null)
    
    inline def setFileUriUndefined: Self = StObject.set(x, "fileUri", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setThumbnailUri(value: String): Self = StObject.set(x, "thumbnailUri", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUriNull: Self = StObject.set(x, "thumbnailUri", null)
    
    inline def setThumbnailUriUndefined: Self = StObject.set(x, "thumbnailUri", js.undefined)
  }
}
