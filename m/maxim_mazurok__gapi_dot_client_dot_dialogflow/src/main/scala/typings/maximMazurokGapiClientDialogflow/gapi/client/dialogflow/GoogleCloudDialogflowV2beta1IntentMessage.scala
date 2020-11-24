package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessage extends js.Object {
  
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
  implicit class GoogleCloudDialogflowV2beta1IntentMessageOps[Self <: GoogleCloudDialogflowV2beta1IntentMessage] (val x: Self) extends AnyVal {
    
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
    def setBasicCard(value: GoogleCloudDialogflowV2beta1IntentMessageBasicCard): Self = this.set("basicCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicCard: Self = this.set("basicCard", js.undefined)
    
    @scala.inline
    def setBrowseCarouselCard(value: GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCard): Self = this.set("browseCarouselCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowseCarouselCard: Self = this.set("browseCarouselCard", js.undefined)
    
    @scala.inline
    def setCard(value: GoogleCloudDialogflowV2beta1IntentMessageCard): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    
    @scala.inline
    def setCarouselSelect(value: GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect): Self = this.set("carouselSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarouselSelect: Self = this.set("carouselSelect", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleCloudDialogflowV2beta1IntentMessageImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setLinkOutSuggestion(value: GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion): Self = this.set("linkOutSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkOutSuggestion: Self = this.set("linkOutSuggestion", js.undefined)
    
    @scala.inline
    def setListSelect(value: GoogleCloudDialogflowV2beta1IntentMessageListSelect): Self = this.set("listSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListSelect: Self = this.set("listSelect", js.undefined)
    
    @scala.inline
    def setMediaContent(value: GoogleCloudDialogflowV2beta1IntentMessageMediaContent): Self = this.set("mediaContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaContent: Self = this.set("mediaContent", js.undefined)
    
    @scala.inline
    def setPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1IntentMessage with TopLevel[js.Any]
    ): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setQuickReplies(value: GoogleCloudDialogflowV2beta1IntentMessageQuickReplies): Self = this.set("quickReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickReplies: Self = this.set("quickReplies", js.undefined)
    
    @scala.inline
    def setRbmCarouselRichCard(value: GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCard): Self = this.set("rbmCarouselRichCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRbmCarouselRichCard: Self = this.set("rbmCarouselRichCard", js.undefined)
    
    @scala.inline
    def setRbmStandaloneRichCard(value: GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCard): Self = this.set("rbmStandaloneRichCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRbmStandaloneRichCard: Self = this.set("rbmStandaloneRichCard", js.undefined)
    
    @scala.inline
    def setRbmText(value: GoogleCloudDialogflowV2beta1IntentMessageRbmText): Self = this.set("rbmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRbmText: Self = this.set("rbmText", js.undefined)
    
    @scala.inline
    def setSimpleResponses(value: GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses): Self = this.set("simpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleResponses: Self = this.set("simpleResponses", js.undefined)
    
    @scala.inline
    def setSuggestions(value: GoogleCloudDialogflowV2beta1IntentMessageSuggestions): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    
    @scala.inline
    def setTableCard(value: GoogleCloudDialogflowV2beta1IntentMessageTableCard): Self = this.set("tableCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCard: Self = this.set("tableCard", js.undefined)
    
    @scala.inline
    def setTelephonyPlayAudio(value: GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio): Self = this.set("telephonyPlayAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelephonyPlayAudio: Self = this.set("telephonyPlayAudio", js.undefined)
    
    @scala.inline
    def setTelephonySynthesizeSpeech(value: GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech): Self = this.set("telephonySynthesizeSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelephonySynthesizeSpeech: Self = this.set("telephonySynthesizeSpeech", js.undefined)
    
    @scala.inline
    def setTelephonyTransferCall(value: GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall): Self = this.set("telephonyTransferCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelephonyTransferCall: Self = this.set("telephonyTransferCall", js.undefined)
    
    @scala.inline
    def setText(value: GoogleCloudDialogflowV2beta1IntentMessageText): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
