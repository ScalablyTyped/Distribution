package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an example that the agent is trained on.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentTrainingPhrase extends js.Object {
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
  var parts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart]] = js.native
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

object SchemaGoogleCloudDialogflowV2IntentTrainingPhrase {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentTrainingPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentTrainingPhrase]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentTrainingPhraseOps[Self <: SchemaGoogleCloudDialogflowV2IntentTrainingPhrase] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPartsVarargs(value: SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart*): Self = this.set("parts", js.Array(value :_*))
    @scala.inline
    def setParts(value: js.Array[SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart]): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParts: Self = this.set("parts", js.undefined)
    @scala.inline
    def setTimesAddedCount(value: Double): Self = this.set("timesAddedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimesAddedCount: Self = this.set("timesAddedCount", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

