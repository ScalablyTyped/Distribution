package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the `Response` field in the Dialogflow console.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessage extends StObject {
  
  /**
    * Displays a basic card for Actions on Google.
    */
  var basicCard: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCard] = js.native
  
  /**
    * Displays a card.
    */
  var card: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageCard] = js.native
  
  /**
    * Displays a carousel card for Actions on Google.
    */
  var carouselSelect: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect] = js.native
  
  /**
    * Displays an image.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageImage] = js.native
  
  /**
    * Displays a link out suggestion chip for Actions on Google.
    */
  var linkOutSuggestion: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion] = js.native
  
  /**
    * Displays a list card for Actions on Google.
    */
  var listSelect: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect] = js.native
  
  /**
    * Returns a response containing a custom, platform-specific payload. See
    * the Intent.Message.Platform type for a description of the structure that
    * may be required for your platform.
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Optional. The platform that this message is intended for.
    */
  var platform: js.UndefOr[String] = js.native
  
  /**
    * Displays quick replies.
    */
  var quickReplies: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageQuickReplies] = js.native
  
  /**
    * Returns a voice or text-only response for Actions on Google.
    */
  var simpleResponses: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses] = js.native
  
  /**
    * Displays suggestion chips for Actions on Google.
    */
  var suggestions: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions] = js.native
  
  /**
    * Plays audio from a file in Telephony Gateway.
    */
  var telephonyPlayAudio: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio] = js.native
  
  /**
    * Synthesizes speech in Telephony Gateway.
    */
  var telephonySynthesizeSpeech: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech] = js.native
  
  /**
    * Transfers the call in Telephony Gateway.
    */
  var telephonyTransferCall: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall] = js.native
  
  /**
    * Returns a text response.
    */
  var text: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageText] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessage {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessage]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicCard(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCard): Self = StObject.set(x, "basicCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicCardUndefined: Self = StObject.set(x, "basicCard", js.undefined)
    
    @scala.inline
    def setCard(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    @scala.inline
    def setCarouselSelect(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect): Self = StObject.set(x, "carouselSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarouselSelectUndefined: Self = StObject.set(x, "carouselSelect", js.undefined)
    
    @scala.inline
    def setImage(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLinkOutSuggestion(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion): Self = StObject.set(x, "linkOutSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkOutSuggestionUndefined: Self = StObject.set(x, "linkOutSuggestion", js.undefined)
    
    @scala.inline
    def setListSelect(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect): Self = StObject.set(x, "listSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSelectUndefined: Self = StObject.set(x, "listSelect", js.undefined)
    
    @scala.inline
    def setPayload(value: StringDictionary[js.Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setQuickReplies(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageQuickReplies): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
    
    @scala.inline
    def setSimpleResponses(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    @scala.inline
    def setSuggestions(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setTelephonyPlayAudio(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio): Self = StObject.set(x, "telephonyPlayAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephonyPlayAudioUndefined: Self = StObject.set(x, "telephonyPlayAudio", js.undefined)
    
    @scala.inline
    def setTelephonySynthesizeSpeech(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech): Self = StObject.set(x, "telephonySynthesizeSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephonySynthesizeSpeechUndefined: Self = StObject.set(x, "telephonySynthesizeSpeech", js.undefined)
    
    @scala.inline
    def setTelephonyTransferCall(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall): Self = StObject.set(x, "telephonyTransferCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephonyTransferCallUndefined: Self = StObject.set(x, "telephonyTransferCall", js.undefined)
    
    @scala.inline
    def setText(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
