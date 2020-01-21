package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The only message returned to the client by the `Recognize` method. It
  * contains the result as zero or more sequential `SpeechRecognitionResult`
  * messages.
  */
@js.native
trait SchemaRecognizeResponse extends js.Object {
  /**
    * Output only. Sequential list of transcription results corresponding to
    * sequential portions of audio.
    */
  var results: js.UndefOr[js.Array[SchemaSpeechRecognitionResult]] = js.native
}

object SchemaRecognizeResponse {
  @scala.inline
  def apply(results: js.Array[SchemaSpeechRecognitionResult] = null): SchemaRecognizeResponse = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRecognizeResponse]
  }
}

