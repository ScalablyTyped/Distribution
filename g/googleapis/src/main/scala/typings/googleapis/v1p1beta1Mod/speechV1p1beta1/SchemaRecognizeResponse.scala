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
  def apply(): SchemaRecognizeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognizeResponse]
  }
  @scala.inline
  implicit class SchemaRecognizeResponseOps[Self <: SchemaRecognizeResponse] (val x: Self) extends AnyVal {
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
    def setResultsVarargs(value: SchemaSpeechRecognitionResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[SchemaSpeechRecognitionResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

