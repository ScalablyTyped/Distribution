package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia extends js.Object {
  
  /**
    * Required. Publicly reachable URI of the file. The RBM platform determines the MIME type of the file from the content-type field in the HTTP headers when the platform fetches the
    * file. The content-type field must be present and accurate in the HTTP response from the URL.
    */
  var fileUri: js.UndefOr[String] = js.native
  
  /**
    * Required for cards with vertical orientation. The height of the media within a rich card with a vertical layout. For a standalone card with horizontal layout, height is not
    * customizable, and this field is ignored.
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * Optional. Publicly reachable URI of the thumbnail.If you don't provide a thumbnail URI, the RBM platform displays a blank placeholder thumbnail until the user's device downloads the
    * file. Depending on the user's setting, the file may not download automatically and may require the user to tap a download button.
    */
  var thumbnailUri: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileUri(value: String): Self = this.set("fileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileUri: Self = this.set("fileUri", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setThumbnailUri(value: String): Self = this.set("thumbnailUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailUri: Self = this.set("thumbnailUri", js.undefined)
  }
}
