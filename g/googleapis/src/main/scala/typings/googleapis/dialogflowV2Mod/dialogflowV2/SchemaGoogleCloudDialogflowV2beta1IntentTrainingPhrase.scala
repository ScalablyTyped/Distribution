package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an example that the agent is trained on.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentTrainingPhrase extends js.Object {
  /**
    * Output only. The unique identifier of this training phrase.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The ordered list of training phrase parts. The parts are
    * concatenated in order to form the training phrase.  Note: The API does
    * not automatically annotate training phrases like the Dialogflow Console
    * does.  Note: Do not forget to include whitespace at part boundaries, so
    * the training phrase is well formatted when the parts are concatenated. If
    * the training phrase does not need to be annotated with parameters, you
    * just need a single part with only the Part.text field set.  If you want
    * to annotate the training phrase, you must create multiple parts, where
    * the fields of each part are populated in one of two ways:  - `Part.text`
    * is set to a part of the phrase that has no parameters. -   `Part.text` is
    * set to a part of the phrase that you want to annotate,     and the
    * `entity_type`, `alias`, and `user_defined` fields are all     set.
    */
  var parts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentTrainingPhrasePart]] = js.native
  /**
    * Optional. Indicates how many times this example was added to the intent.
    * Each time a developer adds an existing sample by editing an intent or
    * training, this counter is increased.
    */
  var timesAddedCount: js.UndefOr[Double] = js.native
  /**
    * Required. The type of the training phrase.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentTrainingPhrase {
  @scala.inline
  def apply(
    name: String = null,
    parts: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentTrainingPhrasePart] = null,
    timesAddedCount: Int | Double = null,
    `type`: String = null
  ): SchemaGoogleCloudDialogflowV2beta1IntentTrainingPhrase = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (timesAddedCount != null) __obj.updateDynamic("timesAddedCount")(timesAddedCount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentTrainingPhrase]
  }
}

