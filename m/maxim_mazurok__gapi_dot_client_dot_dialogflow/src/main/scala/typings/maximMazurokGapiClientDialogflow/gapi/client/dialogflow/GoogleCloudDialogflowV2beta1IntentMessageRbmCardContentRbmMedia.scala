package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia extends StObject {
  
  /**
    * Required. Publicly reachable URI of the file. The RBM platform determines the MIME type of the file from the content-type field in the HTTP headers when the platform fetches the
    * file. The content-type field must be present and accurate in the HTTP response from the URL.
    */
  var fileUri: js.UndefOr[String] = js.undefined
  
  /**
    * Required for cards with vertical orientation. The height of the media within a rich card with a vertical layout. For a standalone card with horizontal layout, height is not
    * customizable, and this field is ignored.
    */
  var height: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Publicly reachable URI of the thumbnail.If you don't provide a thumbnail URI, the RBM platform displays a blank placeholder thumbnail until the user's device downloads the
    * file. Depending on the user's setting, the file may not download automatically and may require the user to tap a download button.
    */
  var thumbnailUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileUri(value: String): Self = StObject.set(x, "fileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUriUndefined: Self = StObject.set(x, "fileUri", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setThumbnailUri(value: String): Self = StObject.set(x, "thumbnailUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUriUndefined: Self = StObject.set(x, "thumbnailUri", js.undefined)
  }
}
