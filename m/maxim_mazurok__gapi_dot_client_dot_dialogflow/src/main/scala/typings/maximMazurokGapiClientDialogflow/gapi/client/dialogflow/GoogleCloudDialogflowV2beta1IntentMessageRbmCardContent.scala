package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent extends StObject {
  
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
  implicit class GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmCardContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setMedia(value: GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setSuggestions(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
