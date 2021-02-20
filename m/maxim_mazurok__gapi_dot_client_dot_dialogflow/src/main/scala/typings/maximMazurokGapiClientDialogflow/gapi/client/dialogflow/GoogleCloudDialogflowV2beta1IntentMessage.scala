package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessage extends StObject {
  
  /** Displays a basic card for Actions on Google. */
  var basicCard: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageBasicCard] = js.native
  
  /** Browse carousel card for Actions on Google. */
  var browseCarouselCard: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard] = js.native
  
  /** Displays a card. */
  var card: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageCard] = js.native
  
  /** Displays a carousel card for Actions on Google. */
  var carouselSelect: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect] = js.native
  
  /** Displays an image. */
  var image: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageImage] = js.native
  
  /** Displays a link out suggestion chip for Actions on Google. */
  var linkOutSuggestion: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion] = js.native
  
  /** Displays a list card for Actions on Google. */
  var listSelect: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageListSelect] = js.native
  
  /** The media content card for Actions on Google. */
  var mediaContent: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageMediaContent] = js.native
  
  /** A custom platform-specific response. */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1IntentMessage with TopLevel[js.Any]
  ] = js.native
  
  /** Optional. The platform that this message is intended for. */
  var platform: js.UndefOr[String] = js.native
  
  /** Displays quick replies. */
  var quickReplies: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageQuickReplies] = js.native
  
  /** Rich Business Messaging (RBM) carousel rich card response. */
  var rbmCarouselRichCard: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard] = js.native
  
  /** Standalone Rich Business Messaging (RBM) rich card response. */
  var rbmStandaloneRichCard: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard] = js.native
  
  /** Rich Business Messaging (RBM) text response. RBM allows businesses to send enriched and branded versions of SMS. See https://jibe.google.com/business-messaging. */
  var rbmText: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageRbmText] = js.native
  
  /** Returns a voice or text-only response for Actions on Google. */
  var simpleResponses: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses] = js.native
  
  /** Displays suggestion chips for Actions on Google. */
  var suggestions: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageSuggestions] = js.native
  
  /** Table card for Actions on Google. */
  var tableCard: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageTableCard] = js.native
  
  /** Plays audio from a file in Telephony Gateway. */
  var telephonyPlayAudio: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio] = js.native
  
  /** Synthesizes speech in Telephony Gateway. */
  var telephonySynthesizeSpeech: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech] = js.native
  
  /** Transfers the call in Telephony Gateway. */
  var telephonyTransferCall: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall] = js.native
  
  /** Returns a text response. */
  var text: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageText] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessage {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessage]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicCard(value: GoogleCloudDialogflowV2beta1IntentMessageBasicCard): Self = StObject.set(x, "basicCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicCardUndefined: Self = StObject.set(x, "basicCard", js.undefined)
    
    @scala.inline
    def setBrowseCarouselCard(value: GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard): Self = StObject.set(x, "browseCarouselCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowseCarouselCardUndefined: Self = StObject.set(x, "browseCarouselCard", js.undefined)
    
    @scala.inline
    def setCard(value: GoogleCloudDialogflowV2beta1IntentMessageCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    @scala.inline
    def setCarouselSelect(value: GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect): Self = StObject.set(x, "carouselSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarouselSelectUndefined: Self = StObject.set(x, "carouselSelect", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleCloudDialogflowV2beta1IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLinkOutSuggestion(value: GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion): Self = StObject.set(x, "linkOutSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkOutSuggestionUndefined: Self = StObject.set(x, "linkOutSuggestion", js.undefined)
    
    @scala.inline
    def setListSelect(value: GoogleCloudDialogflowV2beta1IntentMessageListSelect): Self = StObject.set(x, "listSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSelectUndefined: Self = StObject.set(x, "listSelect", js.undefined)
    
    @scala.inline
    def setMediaContent(value: GoogleCloudDialogflowV2beta1IntentMessageMediaContent): Self = StObject.set(x, "mediaContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaContentUndefined: Self = StObject.set(x, "mediaContent", js.undefined)
    
    @scala.inline
    def setPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1IntentMessage with TopLevel[js.Any]
    ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setQuickReplies(value: GoogleCloudDialogflowV2beta1IntentMessageQuickReplies): Self = StObject.set(x, "quickReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickRepliesUndefined: Self = StObject.set(x, "quickReplies", js.undefined)
    
    @scala.inline
    def setRbmCarouselRichCard(value: GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard): Self = StObject.set(x, "rbmCarouselRichCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRbmCarouselRichCardUndefined: Self = StObject.set(x, "rbmCarouselRichCard", js.undefined)
    
    @scala.inline
    def setRbmStandaloneRichCard(value: GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard): Self = StObject.set(x, "rbmStandaloneRichCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRbmStandaloneRichCardUndefined: Self = StObject.set(x, "rbmStandaloneRichCard", js.undefined)
    
    @scala.inline
    def setRbmText(value: GoogleCloudDialogflowV2beta1IntentMessageRbmText): Self = StObject.set(x, "rbmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRbmTextUndefined: Self = StObject.set(x, "rbmText", js.undefined)
    
    @scala.inline
    def setSimpleResponses(value: GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    @scala.inline
    def setSuggestions(value: GoogleCloudDialogflowV2beta1IntentMessageSuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setTableCard(value: GoogleCloudDialogflowV2beta1IntentMessageTableCard): Self = StObject.set(x, "tableCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCardUndefined: Self = StObject.set(x, "tableCard", js.undefined)
    
    @scala.inline
    def setTelephonyPlayAudio(value: GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio): Self = StObject.set(x, "telephonyPlayAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephonyPlayAudioUndefined: Self = StObject.set(x, "telephonyPlayAudio", js.undefined)
    
    @scala.inline
    def setTelephonySynthesizeSpeech(value: GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech): Self = StObject.set(x, "telephonySynthesizeSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephonySynthesizeSpeechUndefined: Self = StObject.set(x, "telephonySynthesizeSpeech", js.undefined)
    
    @scala.inline
    def setTelephonyTransferCall(value: GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall): Self = StObject.set(x, "telephonyTransferCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephonyTransferCallUndefined: Self = StObject.set(x, "telephonyTransferCall", js.undefined)
    
    @scala.inline
    def setText(value: GoogleCloudDialogflowV2beta1IntentMessageText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
