package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessage extends StObject {
  
  /**
    * Displays a basic card for Actions on Google.
    */
  var basicCard: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCard] = js.undefined
  
  /**
    * Browse carousel card for Actions on Google.
    */
  var browseCarouselCard: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard] = js.undefined
  
  /**
    * Displays a card.
    */
  var card: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageCard] = js.undefined
  
  /**
    * Displays a carousel card for Actions on Google.
    */
  var carouselSelect: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect] = js.undefined
  
  /**
    * Displays an image.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageImage] = js.undefined
  
  /**
    * Displays a link out suggestion chip for Actions on Google.
    */
  var linkOutSuggestion: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion] = js.undefined
  
  /**
    * Displays a list card for Actions on Google.
    */
  var listSelect: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect] = js.undefined
  
  /**
    * The media content card for Actions on Google.
    */
  var mediaContent: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageMediaContent] = js.undefined
  
  /**
    * A custom platform-specific response.
    */
  var payload: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Optional. The platform that this message is intended for.
    */
  var platform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Displays quick replies.
    */
  var quickReplies: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageQuickReplies] = js.undefined
  
  /**
    * Rich Business Messaging (RBM) carousel rich card response.
    */
  var rbmCarouselRichCard: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard] = js.undefined
  
  /**
    * Standalone Rich Business Messaging (RBM) rich card response.
    */
  var rbmStandaloneRichCard: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard] = js.undefined
  
  /**
    * Rich Business Messaging (RBM) text response. RBM allows businesses to send enriched and branded versions of SMS. See https://jibe.google.com/business-messaging.
    */
  var rbmText: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmText] = js.undefined
  
  /**
    * Returns a voice or text-only response for Actions on Google.
    */
  var simpleResponses: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses] = js.undefined
  
  /**
    * Displays suggestion chips for Actions on Google.
    */
  var suggestions: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions] = js.undefined
  
  /**
    * Table card for Actions on Google.
    */
  var tableCard: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageTableCard] = js.undefined
  
  /**
    * Plays audio from a file in Telephony Gateway.
    */
  var telephonyPlayAudio: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio] = js.undefined
  
  /**
    * Synthesizes speech in Telephony Gateway.
    */
  var telephonySynthesizeSpeech: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech] = js.undefined
  
  /**
    * Transfers the call in Telephony Gateway.
    */
  var telephonyTransferCall: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall] = js.undefined
  
  /**
    * Returns a text response.
    */
  var text: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1IntentMessageText] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessage {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessage]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessage](x: Self) {
    
    inline def setBasicCard(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCard): Self = StObject.set(x, "basicCard", value.asInstanceOf[js.Any])
    
    inline def setBasicCardUndefined: Self = StObject.set(x, "basicCard", js.undefined)
    
    inline def setBrowseCarouselCard(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard): Self = StObject.set(x, "browseCarouselCard", value.asInstanceOf[js.Any])
    
    inline def setBrowseCarouselCardUndefined: Self = StObject.set(x, "browseCarouselCard", js.undefined)
    
    inline def setCard(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setCarouselSelect(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect): Self = StObject.set(x, "carouselSelect", value.asInstanceOf[js.Any])
    
    inline def setCarouselSelectUndefined: Self = StObject.set(x, "carouselSelect", js.undefined)
    
    inline def setImage(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLinkOutSuggestion(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion): Self = StObject.set(x, "linkOutSuggestion", value.asInstanceOf[js.Any])
    
    inline def setLinkOutSuggestionUndefined: Self = StObject.set(x, "linkOutSuggestion", js.undefined)
    
    inline def setListSelect(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect): Self = StObject.set(x, "listSelect", value.asInstanceOf[js.Any])
    
    inline def setListSelectUndefined: Self = StObject.set(x, "listSelect", js.undefined)
    
    inline def setMediaContent(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageMediaContent): Self = StObject.set(x, "mediaContent", value.asInstanceOf[js.Any])
    
    inline def setMediaContentUndefined: Self = StObject.set(x, "mediaContent", js.undefined)
    
    inline def setPayload(value: StringDictionary[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setQuickReplies(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageQuickReplies): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
    
    inline def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
    
    inline def setRbmCarouselRichCard(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard): Self = StObject.set(x, "rbmCarouselRichCard", value.asInstanceOf[js.Any])
    
    inline def setRbmCarouselRichCardUndefined: Self = StObject.set(x, "rbmCarouselRichCard", js.undefined)
    
    inline def setRbmStandaloneRichCard(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard): Self = StObject.set(x, "rbmStandaloneRichCard", value.asInstanceOf[js.Any])
    
    inline def setRbmStandaloneRichCardUndefined: Self = StObject.set(x, "rbmStandaloneRichCard", js.undefined)
    
    inline def setRbmText(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmText): Self = StObject.set(x, "rbmText", value.asInstanceOf[js.Any])
    
    inline def setRbmTextUndefined: Self = StObject.set(x, "rbmText", js.undefined)
    
    inline def setSimpleResponses(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    inline def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    inline def setSuggestions(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setTableCard(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTableCard): Self = StObject.set(x, "tableCard", value.asInstanceOf[js.Any])
    
    inline def setTableCardUndefined: Self = StObject.set(x, "tableCard", js.undefined)
    
    inline def setTelephonyPlayAudio(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio): Self = StObject.set(x, "telephonyPlayAudio", value.asInstanceOf[js.Any])
    
    inline def setTelephonyPlayAudioUndefined: Self = StObject.set(x, "telephonyPlayAudio", js.undefined)
    
    inline def setTelephonySynthesizeSpeech(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech): Self = StObject.set(x, "telephonySynthesizeSpeech", value.asInstanceOf[js.Any])
    
    inline def setTelephonySynthesizeSpeechUndefined: Self = StObject.set(x, "telephonySynthesizeSpeech", js.undefined)
    
    inline def setTelephonyTransferCall(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall): Self = StObject.set(x, "telephonyTransferCall", value.asInstanceOf[js.Any])
    
    inline def setTelephonyTransferCallUndefined: Self = StObject.set(x, "telephonyTransferCall", js.undefined)
    
    inline def setText(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
