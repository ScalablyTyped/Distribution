package typings.googleapis.speechV1Mod.speechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Alternative hypotheses (a.k.a. n-best list).
  */
@js.native
trait SchemaSpeechRecognitionAlternative extends js.Object {
  /**
    * Output only. The confidence estimate between 0.0 and 1.0. A higher number
    * indicates an estimated greater likelihood that the recognized words are
    * correct. This field is set only for the top alternative of a
    * non-streaming result or, of a streaming result where `is_final=true`.
    * This field is not guaranteed to be accurate and users should not rely on
    * it to be always provided. The default of 0.0 is a sentinel value
    * indicating `confidence` was not set.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Output only. Transcript text representing the words that the user spoke.
    */
  var transcript: js.UndefOr[String] = js.native
  /**
    * Output only. A list of word-specific information for each recognized
    * word. Note: When `enable_speaker_diarization` is true, you will see all
    * the words from the beginning of the audio.
    */
  var words: js.UndefOr[js.Array[SchemaWordInfo]] = js.native
}

object SchemaSpeechRecognitionAlternative {
  @scala.inline
  def apply(
    confidence: js.UndefOr[Double] = js.undefined,
    transcript: String = null,
    words: js.Array[SchemaWordInfo] = null
  ): SchemaSpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (transcript != null) __obj.updateDynamic("transcript")(transcript.asInstanceOf[js.Any])
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpeechRecognitionAlternative]
  }
}

