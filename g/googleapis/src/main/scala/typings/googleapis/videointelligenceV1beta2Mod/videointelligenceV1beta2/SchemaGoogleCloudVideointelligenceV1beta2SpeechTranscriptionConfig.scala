package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config for SPEECH_TRANSCRIPTION.
  */
trait SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig extends StObject {
  
  /**
    * *Optional* For file formats, such as MXF or MKV, supporting multiple
    * audio tracks, specify up to two tracks. Default: track 0.
    */
  var audioTracks: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * *Optional* If set, specifies the estimated number of speakers in the
    * conversation. If not set, defaults to &#39;2&#39;. Ignored unless
    * enable_speaker_diarization is set to true.
    */
  var diarizationSpeakerCount: js.UndefOr[Double] = js.undefined
  
  /**
    * *Optional* If &#39;true&#39;, adds punctuation to recognition result
    * hypotheses. This feature is only available in select languages. Setting
    * this for requests in other languages has no effect at all. The default
    * &#39;false&#39; value does not add punctuation to result hypotheses.
    * NOTE: &quot;This is currently offered as an experimental service,
    * complimentary to all users. In the future this may be exclusively
    * available as a premium feature.&quot;
    */
  var enableAutomaticPunctuation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *Optional* If &#39;true&#39;, enables speaker detection for each
    * recognized word in the top alternative of the recognition result using a
    * speaker_tag provided in the WordInfo. Note: When this is true, we send
    * all the words from the beginning of the audio for the top alternative in
    * every consecutive responses. This is done in order to improve our speaker
    * tags as our models learn to identify the speakers in the conversation
    * over time.
    */
  var enableSpeakerDiarization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *Optional* If `true`, the top result includes a list of words and the
    * confidence for those words. If `false`, no word-level confidence
    * information is returned. The default is `false`.
    */
  var enableWordConfidence: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *Optional* If set to `true`, the server will attempt to filter out
    * profanities, replacing all but the initial character in each filtered
    * word with asterisks, e.g. &quot;f***&quot;. If set to `false` or omitted,
    * profanities won&#39;t be filtered out.
    */
  var filterProfanity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *Required* The language of the supplied audio as a
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
    * Example: &quot;en-US&quot;. See [Language
    * Support](https://cloud.google.com/speech/docs/languages) for a list of
    * the currently supported language codes.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * *Optional* Maximum number of recognition hypotheses to be returned.
    * Specifically, the maximum number of `SpeechRecognitionAlternative`
    * messages within each `SpeechTranscription`. The server may return fewer
    * than `max_alternatives`. Valid values are `0`-`30`. A value of `0` or `1`
    * will return a maximum of one. If omitted, will return a maximum of one.
    */
  var maxAlternatives: js.UndefOr[Double] = js.undefined
  
  /**
    * *Optional* A means to provide context to assist the speech recognition.
    */
  var speechContexts: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2SpeechContext]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscriptionConfig](x: Self) {
    
    inline def setAudioTracks(value: js.Array[Double]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    inline def setAudioTracksUndefined: Self = StObject.set(x, "audioTracks", js.undefined)
    
    inline def setAudioTracksVarargs(value: Double*): Self = StObject.set(x, "audioTracks", js.Array(value :_*))
    
    inline def setDiarizationSpeakerCount(value: Double): Self = StObject.set(x, "diarizationSpeakerCount", value.asInstanceOf[js.Any])
    
    inline def setDiarizationSpeakerCountUndefined: Self = StObject.set(x, "diarizationSpeakerCount", js.undefined)
    
    inline def setEnableAutomaticPunctuation(value: Boolean): Self = StObject.set(x, "enableAutomaticPunctuation", value.asInstanceOf[js.Any])
    
    inline def setEnableAutomaticPunctuationUndefined: Self = StObject.set(x, "enableAutomaticPunctuation", js.undefined)
    
    inline def setEnableSpeakerDiarization(value: Boolean): Self = StObject.set(x, "enableSpeakerDiarization", value.asInstanceOf[js.Any])
    
    inline def setEnableSpeakerDiarizationUndefined: Self = StObject.set(x, "enableSpeakerDiarization", js.undefined)
    
    inline def setEnableWordConfidence(value: Boolean): Self = StObject.set(x, "enableWordConfidence", value.asInstanceOf[js.Any])
    
    inline def setEnableWordConfidenceUndefined: Self = StObject.set(x, "enableWordConfidence", js.undefined)
    
    inline def setFilterProfanity(value: Boolean): Self = StObject.set(x, "filterProfanity", value.asInstanceOf[js.Any])
    
    inline def setFilterProfanityUndefined: Self = StObject.set(x, "filterProfanity", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMaxAlternatives(value: Double): Self = StObject.set(x, "maxAlternatives", value.asInstanceOf[js.Any])
    
    inline def setMaxAlternativesUndefined: Self = StObject.set(x, "maxAlternatives", js.undefined)
    
    inline def setSpeechContexts(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2SpeechContext]): Self = StObject.set(x, "speechContexts", value.asInstanceOf[js.Any])
    
    inline def setSpeechContextsUndefined: Self = StObject.set(x, "speechContexts", js.undefined)
    
    inline def setSpeechContextsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2SpeechContext*): Self = StObject.set(x, "speechContexts", js.Array(value :_*))
  }
}
