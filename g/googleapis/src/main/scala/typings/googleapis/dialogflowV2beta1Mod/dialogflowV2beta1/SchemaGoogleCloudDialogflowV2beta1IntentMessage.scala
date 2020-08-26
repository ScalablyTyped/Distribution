package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corresponds to the `Response` field in the Dialogflow console.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessage extends js.Object {
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
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessage] (val x: Self) extends AnyVal {
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
    def setBasicCard(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCard): Self = this.set("basicCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasicCard: Self = this.set("basicCard", js.undefined)
    @scala.inline
    def setCard(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageCard): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setCarouselSelect(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect): Self = this.set("carouselSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarouselSelect: Self = this.set("carouselSelect", js.undefined)
    @scala.inline
    def setImage(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLinkOutSuggestion(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion): Self = this.set("linkOutSuggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkOutSuggestion: Self = this.set("linkOutSuggestion", js.undefined)
    @scala.inline
    def setListSelect(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect): Self = this.set("listSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListSelect: Self = this.set("listSelect", js.undefined)
    @scala.inline
    def setPayload(value: StringDictionary[js.Any]): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setQuickReplies(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageQuickReplies): Self = this.set("quickReplies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickReplies: Self = this.set("quickReplies", js.undefined)
    @scala.inline
    def setSimpleResponses(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses): Self = this.set("simpleResponses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleResponses: Self = this.set("simpleResponses", js.undefined)
    @scala.inline
    def setSuggestions(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    @scala.inline
    def setTelephonyPlayAudio(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio): Self = this.set("telephonyPlayAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTelephonyPlayAudio: Self = this.set("telephonyPlayAudio", js.undefined)
    @scala.inline
    def setTelephonySynthesizeSpeech(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech): Self = this.set("telephonySynthesizeSpeech", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTelephonySynthesizeSpeech: Self = this.set("telephonySynthesizeSpeech", js.undefined)
    @scala.inline
    def setTelephonyTransferCall(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall): Self = this.set("telephonyTransferCall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTelephonyTransferCall: Self = this.set("telephonyTransferCall", js.undefined)
    @scala.inline
    def setText(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageText): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

