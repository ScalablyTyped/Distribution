package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the query input. It can contain either:  1.  An audio config
  * which     instructs the speech recognizer how to process the speech audio.
  * 2.  A conversational query in the form of text,.  3.  An event that
  * specifies which intent to trigger.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1QueryInput extends js.Object {
  /**
    * Instructs the speech recognizer how to process the speech audio.
    */
  var audioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1InputAudioConfig] = js.native
  /**
    * The event to be processed.
    */
  var event: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1EventInput] = js.native
  /**
    * The natural language text to be processed.
    */
  var text: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1TextInput] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1QueryInput {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1QueryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1QueryInput]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1QueryInputOps[Self <: SchemaGoogleCloudDialogflowV2beta1QueryInput] (val x: Self) extends AnyVal {
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
    def setAudioConfig(value: SchemaGoogleCloudDialogflowV2beta1InputAudioConfig): Self = this.set("audioConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioConfig: Self = this.set("audioConfig", js.undefined)
    @scala.inline
    def setEvent(value: SchemaGoogleCloudDialogflowV2beta1EventInput): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setText(value: SchemaGoogleCloudDialogflowV2beta1TextInput): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

