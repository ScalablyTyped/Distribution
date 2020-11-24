package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2InputAudioConfig extends js.Object {
  
  /** Required. Audio encoding of the audio content to process. */
  var audioEncoding: js.UndefOr[String] = js.native
  
  /**
    * If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with information about the recognized speech words, e.g. start and end time offsets. If false or
    * unspecified, Speech doesn't return any word-level information.
    */
  var enableWordInfo: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. The language of the supplied audio. Dialogflow does not do translations. See [Language Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of
    * the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Which Speech model to select for the given request. Select the model best suited to your domain to get best results. If a model is not explicitly specified, then we auto-select a
    * model based on the parameters in the InputAudioConfig. If enhanced speech model is enabled for the agent and an enhanced version of the specified model for the language does not
    * exist, then the speech is recognized using the standard version of the specified model. Refer to [Cloud Speech API
    * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for more details.
    */
  var model: js.UndefOr[String] = js.native
  
  /** Which variant of the Speech model to use. */
  var modelVariant: js.UndefOr[String] = js.native
  
  /**
    * A list of strings containing words and phrases that the speech recognizer should recognize with higher likelihood. See [the Cloud Speech
    * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more details. This field is deprecated. Please use [speech_contexts]() instead. If you specify
    * both [phrase_hints]() and [speech_contexts](), Dialogflow will treat the [phrase_hints]() as a single additional [SpeechContext]().
    */
  var phraseHints: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more
    * details.
    */
  var sampleRateHertz: js.UndefOr[Double] = js.native
  
  /**
    * If `false` (default), recognition does not cease until the client closes the stream. If `true`, the recognizer will detect a single spoken utterance in input audio. Recognition
    * ceases when it detects the audio's voice has stopped or paused. In this case, once a detected intent is received, the client should close the stream and start a new request with a
    * new stream as needed. Note: This setting is relevant only for streaming methods. Note: When specified, InputAudioConfig.single_utterance takes precedence over
    * StreamingDetectIntentRequest.single_utterance.
    */
  var singleUtterance: js.UndefOr[Boolean] = js.native
  
  /** Context information to assist speech recognition. See [the Cloud Speech documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more details. */
  var speechContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2SpeechContext]] = js.native
}
object GoogleCloudDialogflowV2InputAudioConfig {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2InputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2InputAudioConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2InputAudioConfigOps[Self <: GoogleCloudDialogflowV2InputAudioConfig] (val x: Self) extends AnyVal {
    
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
    def setEnableWordInfo(value: Boolean): Self = this.set("enableWordInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableWordInfo: Self = this.set("enableWordInfo", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setModelVariant(value: String): Self = this.set("modelVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelVariant: Self = this.set("modelVariant", js.undefined)
    
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
    
    @scala.inline
    def setSingleUtterance(value: Boolean): Self = this.set("singleUtterance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleUtterance: Self = this.set("singleUtterance", js.undefined)
    
    @scala.inline
    def setSpeechContextsVarargs(value: GoogleCloudDialogflowV2SpeechContext*): Self = this.set("speechContexts", js.Array(value :_*))
    
    @scala.inline
    def setSpeechContexts(value: js.Array[GoogleCloudDialogflowV2SpeechContext]): Self = this.set("speechContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechContexts: Self = this.set("speechContexts", js.undefined)
  }
}
