package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1InputAudioConfig extends StObject {
  
  /**
    * Required. Audio encoding of the audio content to process.
    */
  var audioEncoding: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only used in Participants.AnalyzeContent and Participants.StreamingAnalyzeContent. If `false` and recognition doesn't return any result, trigger `NO_SPEECH_RECOGNIZED` event to Dialogflow agent.
    */
  var disableNoSpeechRecognizedEvent: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with information about the recognized speech words, e.g. start and end time offsets. If false or unspecified, Speech doesn't return any word-level information.
    */
  var enableWordInfo: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The language of the supplied audio. Dialogflow does not do translations. See [Language Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Which Speech model to select for the given request. Select the model best suited to your domain to get best results. If a model is not explicitly specified, then we auto-select a model based on the parameters in the InputAudioConfig. If enhanced speech model is enabled for the agent and an enhanced version of the specified model for the language does not exist, then the speech is recognized using the standard version of the specified model. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for more details.
    */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Which variant of the Speech model to use.
    */
  var modelVariant: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of strings containing words and phrases that the speech recognizer should recognize with higher likelihood. See [the Cloud Speech documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more details. This field is deprecated. Please use [speech_contexts]() instead. If you specify both [phrase_hints]() and [speech_contexts](), Dialogflow will treat the [phrase_hints]() as a single additional [SpeechContext]().
    */
  var phraseHints: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
    */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If `false` (default), recognition does not cease until the client closes the stream. If `true`, the recognizer will detect a single spoken utterance in input audio. Recognition ceases when it detects the audio's voice has stopped or paused. In this case, once a detected intent is received, the client should close the stream and start a new request with a new stream as needed. Note: This setting is relevant only for streaming methods. Note: When specified, InputAudioConfig.single_utterance takes precedence over StreamingDetectIntentRequest.single_utterance.
    */
  var singleUtterance: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Context information to assist speech recognition. See [the Cloud Speech documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more details.
    */
  var speechContexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1SpeechContext]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1InputAudioConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1InputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1InputAudioConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1InputAudioConfig](x: Self) {
    
    inline def setAudioEncoding(value: String): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
    
    inline def setAudioEncodingNull: Self = StObject.set(x, "audioEncoding", null)
    
    inline def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
    
    inline def setDisableNoSpeechRecognizedEvent(value: Boolean): Self = StObject.set(x, "disableNoSpeechRecognizedEvent", value.asInstanceOf[js.Any])
    
    inline def setDisableNoSpeechRecognizedEventNull: Self = StObject.set(x, "disableNoSpeechRecognizedEvent", null)
    
    inline def setDisableNoSpeechRecognizedEventUndefined: Self = StObject.set(x, "disableNoSpeechRecognizedEvent", js.undefined)
    
    inline def setEnableWordInfo(value: Boolean): Self = StObject.set(x, "enableWordInfo", value.asInstanceOf[js.Any])
    
    inline def setEnableWordInfoNull: Self = StObject.set(x, "enableWordInfo", null)
    
    inline def setEnableWordInfoUndefined: Self = StObject.set(x, "enableWordInfo", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setModelVariant(value: String): Self = StObject.set(x, "modelVariant", value.asInstanceOf[js.Any])
    
    inline def setModelVariantNull: Self = StObject.set(x, "modelVariant", null)
    
    inline def setModelVariantUndefined: Self = StObject.set(x, "modelVariant", js.undefined)
    
    inline def setPhraseHints(value: js.Array[String]): Self = StObject.set(x, "phraseHints", value.asInstanceOf[js.Any])
    
    inline def setPhraseHintsNull: Self = StObject.set(x, "phraseHints", null)
    
    inline def setPhraseHintsUndefined: Self = StObject.set(x, "phraseHints", js.undefined)
    
    inline def setPhraseHintsVarargs(value: String*): Self = StObject.set(x, "phraseHints", js.Array(value*))
    
    inline def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    inline def setSampleRateHertzNull: Self = StObject.set(x, "sampleRateHertz", null)
    
    inline def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    inline def setSingleUtterance(value: Boolean): Self = StObject.set(x, "singleUtterance", value.asInstanceOf[js.Any])
    
    inline def setSingleUtteranceNull: Self = StObject.set(x, "singleUtterance", null)
    
    inline def setSingleUtteranceUndefined: Self = StObject.set(x, "singleUtterance", js.undefined)
    
    inline def setSpeechContexts(value: js.Array[SchemaGoogleCloudDialogflowV2beta1SpeechContext]): Self = StObject.set(x, "speechContexts", value.asInstanceOf[js.Any])
    
    inline def setSpeechContextsUndefined: Self = StObject.set(x, "speechContexts", js.undefined)
    
    inline def setSpeechContextsVarargs(value: SchemaGoogleCloudDialogflowV2beta1SpeechContext*): Self = StObject.set(x, "speechContexts", js.Array(value*))
  }
}
