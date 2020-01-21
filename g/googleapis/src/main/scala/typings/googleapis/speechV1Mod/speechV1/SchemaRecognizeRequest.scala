package typings.googleapis.speechV1Mod.speechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The top-level message sent by the client for the `Recognize` method.
  */
@js.native
trait SchemaRecognizeRequest extends js.Object {
  /**
    * *Required* The audio data to be recognized.
    */
  var audio: js.UndefOr[SchemaRecognitionAudio] = js.native
  /**
    * *Required* Provides information to the recognizer that specifies how to
    * process the request.
    */
  var config: js.UndefOr[SchemaRecognitionConfig] = js.native
}

object SchemaRecognizeRequest {
  @scala.inline
  def apply(audio: SchemaRecognitionAudio = null, config: SchemaRecognitionConfig = null): SchemaRecognizeRequest = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRecognizeRequest]
  }
}

