package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instructs the speech recognizer how to process the audio content.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2InputAudioConfig extends js.Object {
  /**
    * Required. Audio encoding of the audio content to process.
    */
  var audioEncoding: js.UndefOr[String] = js.native
  /**
    * Required. The language of the supplied audio. Dialogflow does not do
    * translations. See [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes. Note that queries
    * in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of phrase hints which are used to boost accuracy
    * of speech recognition. Refer to [Cloud Speech API
    * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
    * for more details.
    */
  var phraseHints: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. Sample rate (in Hertz) of the audio content sent in the query.
    * Refer to [Cloud Speech API
    * documentation](https://cloud.google.com/speech-to-text/docs/basics) for
    * more details.
    */
  var sampleRateHertz: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudDialogflowV2InputAudioConfig {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2InputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2InputAudioConfig]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2InputAudioConfigOps[Self <: SchemaGoogleCloudDialogflowV2InputAudioConfig] (val x: Self) extends AnyVal {
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
    def setAudioEncoding(value: String): Self = this.set("audioEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioEncoding: Self = this.set("audioEncoding", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setPhraseHintsVarargs(value: String*): Self = this.set("phraseHints", js.Array(value :_*))
    @scala.inline
    def setPhraseHints(value: js.Array[String]): Self = this.set("phraseHints", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhraseHints: Self = this.set("phraseHints", js.undefined)
    @scala.inline
    def setSampleRateHertz(value: Double): Self = this.set("sampleRateHertz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRateHertz: Self = this.set("sampleRateHertz", js.undefined)
  }
  
}

