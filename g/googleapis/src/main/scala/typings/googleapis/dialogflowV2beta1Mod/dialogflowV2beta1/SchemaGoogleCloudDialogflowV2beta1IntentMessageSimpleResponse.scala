package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The simple response message containing speech or text.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse extends js.Object {
  /**
    * Optional. The text to display.
    */
  var displayText: js.UndefOr[String] = js.native
  /**
    * One of text_to_speech or ssml must be provided. Structured spoken
    * response to the user in the SSML format. Mutually exclusive with
    * text_to_speech.
    */
  var ssml: js.UndefOr[String] = js.native
  /**
    * One of text_to_speech or ssml must be provided. The plain text of the
    * speech output. Mutually exclusive with ssml.
    */
  var textToSpeech: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse {
  @scala.inline
  def apply(displayText: String = null, ssml: String = null, textToSpeech: String = null): SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse = {
    val __obj = js.Dynamic.literal()
    if (displayText != null) __obj.updateDynamic("displayText")(displayText.asInstanceOf[js.Any])
    if (ssml != null) __obj.updateDynamic("ssml")(ssml.asInstanceOf[js.Any])
    if (textToSpeech != null) __obj.updateDynamic("textToSpeech")(textToSpeech.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]
  }
}

