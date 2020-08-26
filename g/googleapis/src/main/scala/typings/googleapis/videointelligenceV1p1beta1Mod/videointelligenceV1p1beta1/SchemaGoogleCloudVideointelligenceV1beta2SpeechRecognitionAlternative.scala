package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Alternative hypotheses (a.k.a. n-best list).
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative extends js.Object {
  /**
    * The confidence estimate between 0.0 and 1.0. A higher number indicates an
    * estimated greater likelihood that the recognized words are correct. This
    * field is typically provided only for the top hypothesis, and only for
    * `is_final=true` results. Clients should not rely on the `confidence`
    * field as it is not guaranteed to be accurate or consistent. The default
    * of 0.0 is a sentinel value indicating `confidence` was not set.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Transcript text representing the words that the user spoke.
    */
  var transcript: js.UndefOr[String] = js.native
  /**
    * A list of word-specific information for each recognized word.
    */
  var words: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2WordInfo]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternativeOps[Self <: SchemaGoogleCloudVideointelligenceV1beta2SpeechRecognitionAlternative] (val x: Self) extends AnyVal {
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    @scala.inline
    def setTranscript(value: String): Self = this.set("transcript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranscript: Self = this.set("transcript", js.undefined)
    @scala.inline
    def setWordsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2WordInfo*): Self = this.set("words", js.Array(value :_*))
    @scala.inline
    def setWords(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2WordInfo]): Self = this.set("words", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
  
}

