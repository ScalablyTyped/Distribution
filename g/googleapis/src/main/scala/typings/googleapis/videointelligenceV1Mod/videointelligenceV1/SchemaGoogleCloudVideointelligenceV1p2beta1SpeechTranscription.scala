package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A speech recognition result corresponding to a portion of the audio.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1SpeechTranscription extends js.Object {
  /**
    * May contain one or more recognition hypotheses (up to the maximum
    * specified in `max_alternatives`).  These alternatives are ordered in
    * terms of accuracy, with the top (first) alternative being the most
    * probable, as ranked by the recognizer.
    */
  var alternatives: js.UndefOr[
    js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternative]
  ] = js.native
  /**
    * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
    * language tag of the language in this result. This language code was
    * detected to have the most likelihood of being spoken in the audio.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1SpeechTranscription {
  @scala.inline
  def apply(
    alternatives: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternative] = null,
    languageCode: String = null
  ): SchemaGoogleCloudVideointelligenceV1p2beta1SpeechTranscription = {
    val __obj = js.Dynamic.literal()
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1SpeechTranscription]
  }
}

