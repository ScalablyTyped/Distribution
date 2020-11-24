package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent extends js.Object {
  
  /** Optional. Description of the card (at most 2000 bytes). At least one of the title, description or media must be set. */
  var description: js.UndefOr[String] = js.native
  
  /** Optional. However at least one of the title, description or media must be set. Media (image, GIF or a video) to include in the card. */
  var media: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia] = js.native
  
  /** Optional. List of suggestions to include in the card. */
  var suggestions: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion]] = js.native
  
  /** Optional. Title of the card (at most 200 bytes). At least one of the title, description or media must be set. */
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setMedia(value: GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion*): Self = this.set("suggestions", js.Array(value :_*))
    
    @scala.inline
    def setSuggestions(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
