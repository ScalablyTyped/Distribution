package typings.googleapis.dialogflowV2Mod.dialogflowV2

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
  def apply(
    basicCard: SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCard = null,
    card: SchemaGoogleCloudDialogflowV2beta1IntentMessageCard = null,
    carouselSelect: SchemaGoogleCloudDialogflowV2beta1IntentMessageCarouselSelect = null,
    image: SchemaGoogleCloudDialogflowV2beta1IntentMessageImage = null,
    linkOutSuggestion: SchemaGoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestion = null,
    listSelect: SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect = null,
    payload: StringDictionary[js.Any] = null,
    platform: String = null,
    quickReplies: SchemaGoogleCloudDialogflowV2beta1IntentMessageQuickReplies = null,
    simpleResponses: SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponses = null,
    suggestions: SchemaGoogleCloudDialogflowV2beta1IntentMessageSuggestions = null,
    telephonyPlayAudio: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio = null,
    telephonySynthesizeSpeech: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech = null,
    telephonyTransferCall: SchemaGoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCall = null,
    text: SchemaGoogleCloudDialogflowV2beta1IntentMessageText = null
  ): SchemaGoogleCloudDialogflowV2beta1IntentMessage = {
    val __obj = js.Dynamic.literal()
    if (basicCard != null) __obj.updateDynamic("basicCard")(basicCard.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (carouselSelect != null) __obj.updateDynamic("carouselSelect")(carouselSelect.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (linkOutSuggestion != null) __obj.updateDynamic("linkOutSuggestion")(linkOutSuggestion.asInstanceOf[js.Any])
    if (listSelect != null) __obj.updateDynamic("listSelect")(listSelect.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (quickReplies != null) __obj.updateDynamic("quickReplies")(quickReplies.asInstanceOf[js.Any])
    if (simpleResponses != null) __obj.updateDynamic("simpleResponses")(simpleResponses.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (telephonyPlayAudio != null) __obj.updateDynamic("telephonyPlayAudio")(telephonyPlayAudio.asInstanceOf[js.Any])
    if (telephonySynthesizeSpeech != null) __obj.updateDynamic("telephonySynthesizeSpeech")(telephonySynthesizeSpeech.asInstanceOf[js.Any])
    if (telephonyTransferCall != null) __obj.updateDynamic("telephonyTransferCall")(telephonyTransferCall.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessage]
  }
}

