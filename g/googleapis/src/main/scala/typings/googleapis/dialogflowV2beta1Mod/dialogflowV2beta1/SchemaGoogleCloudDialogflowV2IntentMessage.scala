package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corresponds to the `Response` field in the Dialogflow console.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessage extends js.Object {
  /**
    * The basic card response for Actions on Google.
    */
  var basicCard: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageBasicCard] = js.native
  /**
    * The card response.
    */
  var card: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageCard] = js.native
  /**
    * The carousel card response for Actions on Google.
    */
  var carouselSelect: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect] = js.native
  /**
    * The image response.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageImage] = js.native
  /**
    * The link out suggestion chip for Actions on Google.
    */
  var linkOutSuggestion: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestion] = js.native
  /**
    * The list card response for Actions on Google.
    */
  var listSelect: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageListSelect] = js.native
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
    * The quick replies response.
    */
  var quickReplies: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies] = js.native
  /**
    * The voice and text-only responses for Actions on Google.
    */
  var simpleResponses: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses] = js.native
  /**
    * The suggestion chips for Actions on Google.
    */
  var suggestions: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageSuggestions] = js.native
  /**
    * The text response.
    */
  var text: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageText] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessage {
  @scala.inline
  def apply(
    basicCard: SchemaGoogleCloudDialogflowV2IntentMessageBasicCard = null,
    card: SchemaGoogleCloudDialogflowV2IntentMessageCard = null,
    carouselSelect: SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect = null,
    image: SchemaGoogleCloudDialogflowV2IntentMessageImage = null,
    linkOutSuggestion: SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestion = null,
    listSelect: SchemaGoogleCloudDialogflowV2IntentMessageListSelect = null,
    payload: StringDictionary[js.Any] = null,
    platform: String = null,
    quickReplies: SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies = null,
    simpleResponses: SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses = null,
    suggestions: SchemaGoogleCloudDialogflowV2IntentMessageSuggestions = null,
    text: SchemaGoogleCloudDialogflowV2IntentMessageText = null
  ): SchemaGoogleCloudDialogflowV2IntentMessage = {
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
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessage]
  }
}

