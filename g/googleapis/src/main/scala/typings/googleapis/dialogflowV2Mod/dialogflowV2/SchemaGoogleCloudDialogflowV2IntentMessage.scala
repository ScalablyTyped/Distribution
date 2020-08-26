package typings.googleapis.dialogflowV2Mod.dialogflowV2

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
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessage]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageOps[Self <: SchemaGoogleCloudDialogflowV2IntentMessage] (val x: Self) extends AnyVal {
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
    def setBasicCard(value: SchemaGoogleCloudDialogflowV2IntentMessageBasicCard): Self = this.set("basicCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasicCard: Self = this.set("basicCard", js.undefined)
    @scala.inline
    def setCard(value: SchemaGoogleCloudDialogflowV2IntentMessageCard): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setCarouselSelect(value: SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect): Self = this.set("carouselSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarouselSelect: Self = this.set("carouselSelect", js.undefined)
    @scala.inline
    def setImage(value: SchemaGoogleCloudDialogflowV2IntentMessageImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLinkOutSuggestion(value: SchemaGoogleCloudDialogflowV2IntentMessageLinkOutSuggestion): Self = this.set("linkOutSuggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkOutSuggestion: Self = this.set("linkOutSuggestion", js.undefined)
    @scala.inline
    def setListSelect(value: SchemaGoogleCloudDialogflowV2IntentMessageListSelect): Self = this.set("listSelect", value.asInstanceOf[js.Any])
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
    def setQuickReplies(value: SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies): Self = this.set("quickReplies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickReplies: Self = this.set("quickReplies", js.undefined)
    @scala.inline
    def setSimpleResponses(value: SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponses): Self = this.set("simpleResponses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleResponses: Self = this.set("simpleResponses", js.undefined)
    @scala.inline
    def setSuggestions(value: SchemaGoogleCloudDialogflowV2IntentMessageSuggestions): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    @scala.inline
    def setText(value: SchemaGoogleCloudDialogflowV2IntentMessageText): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

