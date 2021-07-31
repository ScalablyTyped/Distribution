package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2InputAudioConfig extends StObject {
  
  /** Required. Audio encoding of the audio content to process. */
  var audioEncoding: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with information about the recognized speech words, e.g. start and end time offsets. If false or
    * unspecified, Speech doesn't return any word-level information.
    */
  var enableWordInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The language of the supplied audio. Dialogflow does not do translations. See [Language Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of
    * the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Which Speech model to select for the given request. Select the model best suited to your domain to get best results. If a model is not explicitly specified, then we auto-select a
    * model based on the parameters in the InputAudioConfig. If enhanced speech model is enabled for the agent and an enhanced version of the specified model for the language does not
    * exist, then the speech is recognized using the standard version of the specified model. Refer to [Cloud Speech API
    * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for more details.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /** Which variant of the Speech model to use. */
  var modelVariant: js.UndefOr[String] = js.undefined
  
  /**
    * A list of strings containing words and phrases that the speech recognizer should recognize with higher likelihood. See [the Cloud Speech
    * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more details. This field is deprecated. Please use [speech_contexts]() instead. If you specify
    * both [phrase_hints]() and [speech_contexts](), Dialogflow will treat the [phrase_hints]() as a single additional [SpeechContext]().
    */
  var phraseHints: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more
    * details.
    */
  var sampleRateHertz: js.UndefOr[Double] = js.undefined
  
  /**
    * If `false` (default), recognition does not cease until the client closes the stream. If `true`, the recognizer will detect a single spoken utterance in input audio. Recognition
    * ceases when it detects the audio's voice has stopped or paused. In this case, once a detected intent is received, the client should close the stream and start a new request with a
    * new stream as needed. Note: This setting is relevant only for streaming methods. Note: When specified, InputAudioConfig.single_utterance takes precedence over
    * StreamingDetectIntentRequest.single_utterance.
    */
  var singleUtterance: js.UndefOr[Boolean] = js.undefined
  
  /** Context information to assist speech recognition. See [the Cloud Speech documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more details. */
  var speechContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2SpeechContext]] = js.undefined
}
object GoogleCloudDialogflowV2InputAudioConfig {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2InputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2InputAudioConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2InputAudioConfigMutableBuilder[Self <: GoogleCloudDialogflowV2InputAudioConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioEncoding(value: String): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
    
    @scala.inline
    def setEnableWordInfo(value: Boolean): Self = StObject.set(x, "enableWordInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableWordInfoUndefined: Self = StObject.set(x, "enableWordInfo", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setModelVariant(value: String): Self = StObject.set(x, "modelVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVariantUndefined: Self = StObject.set(x, "modelVariant", js.undefined)
    
    @scala.inline
    def setPhraseHints(value: js.Array[String]): Self = StObject.set(x, "phraseHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhraseHintsUndefined: Self = StObject.set(x, "phraseHints", js.undefined)
    
    @scala.inline
    def setPhraseHintsVarargs(value: String*): Self = StObject.set(x, "phraseHints", js.Array(value :_*))
    
    @scala.inline
    def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    @scala.inline
    def setSingleUtterance(value: Boolean): Self = StObject.set(x, "singleUtterance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUtteranceUndefined: Self = StObject.set(x, "singleUtterance", js.undefined)
    
    @scala.inline
    def setSpeechContexts(value: js.Array[GoogleCloudDialogflowV2SpeechContext]): Self = StObject.set(x, "speechContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechContextsUndefined: Self = StObject.set(x, "speechContexts", js.undefined)
    
    @scala.inline
    def setSpeechContextsVarargs(value: GoogleCloudDialogflowV2SpeechContext*): Self = StObject.set(x, "speechContexts", js.Array(value :_*))
  }
}
