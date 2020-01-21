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
  def apply(
    audioConfig: SchemaGoogleCloudDialogflowV2beta1InputAudioConfig = null,
    event: SchemaGoogleCloudDialogflowV2beta1EventInput = null,
    text: SchemaGoogleCloudDialogflowV2beta1TextInput = null
  ): SchemaGoogleCloudDialogflowV2beta1QueryInput = {
    val __obj = js.Dynamic.literal()
    if (audioConfig != null) __obj.updateDynamic("audioConfig")(audioConfig.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1QueryInput]
  }
}

