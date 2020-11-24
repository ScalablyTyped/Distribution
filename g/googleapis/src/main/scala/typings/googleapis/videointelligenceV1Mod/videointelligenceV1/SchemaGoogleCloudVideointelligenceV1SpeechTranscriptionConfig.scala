package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config for SPEECH_TRANSCRIPTION.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1SpeechTranscriptionConfig extends js.Object {
  
  /**
    * *Optional* For file formats, such as MXF or MKV, supporting multiple
    * audio tracks, specify up to two tracks. Default: track 0.
    */
  var audioTracks: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * *Optional* If set, specifies the estimated number of speakers in the
    * conversation. If not set, defaults to &#39;2&#39;. Ignored unless
    * enable_speaker_diarization is set to true.
    */
  var diarizationSpeakerCount: js.UndefOr[Double] = js.native
  
  /**
    * *Optional* If &#39;true&#39;, adds punctuation to recognition result
    * hypotheses. This feature is only available in select languages. Setting
    * this for requests in other languages has no effect at all. The default
    * &#39;false&#39; value does not add punctuation to result hypotheses.
    * NOTE: &quot;This is currently offered as an experimental service,
    * complimentary to all users. In the future this may be exclusively
    * available as a premium feature.&quot;
    */
  var enableAutomaticPunctuation: js.UndefOr[Boolean] = js.native
  
  /**
    * *Optional* If &#39;true&#39;, enables speaker detection for each
    * recognized word in the top alternative of the recognition result using a
    * speaker_tag provided in the WordInfo. Note: When this is true, we send
    * all the words from the beginning of the audio for the top alternative in
    * every consecutive responses. This is done in order to improve our speaker
    * tags as our models learn to identify the speakers in the conversation
    * over time.
    */
  var enableSpeakerDiarization: js.UndefOr[Boolean] = js.native
  
  /**
    * *Optional* If `true`, the top result includes a list of words and the
    * confidence for those words. If `false`, no word-level confidence
    * information is returned. The default is `false`.
    */
  var enableWordConfidence: js.UndefOr[Boolean] = js.native
  
  /**
    * *Optional* If set to `true`, the server will attempt to filter out
    * profanities, replacing all but the initial character in each filtered
    * word with asterisks, e.g. &quot;f***&quot;. If set to `false` or omitted,
    * profanities won&#39;t be filtered out.
    */
  var filterProfanity: js.UndefOr[Boolean] = js.native
  
  /**
    * *Required* The language of the supplied audio as a
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
    * Example: &quot;en-US&quot;. See [Language
    * Support](https://cloud.google.com/speech/docs/languages) for a list of
    * the currently supported language codes.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * *Optional* Maximum number of recognition hypotheses to be returned.
    * Specifically, the maximum number of `SpeechRecognitionAlternative`
    * messages within each `SpeechTranscription`. The server may return fewer
    * than `max_alternatives`. Valid values are `0`-`30`. A value of `0` or `1`
    * will return a maximum of one. If omitted, will return a maximum of one.
    */
  var maxAlternatives: js.UndefOr[Double] = js.native
  
  /**
    * *Optional* A means to provide context to assist the speech recognition.
    */
  var speechContexts: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1SpeechContext]] = js.native
}
object SchemaGoogleCloudVideointelligenceV1SpeechTranscriptionConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1SpeechTranscriptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1SpeechTranscriptionConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1SpeechTranscriptionConfigOps[Self <: SchemaGoogleCloudVideointelligenceV1SpeechTranscriptionConfig] (val x: Self) extends AnyVal {
    
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
    def setAudioTracksVarargs(value: Double*): Self = this.set("audioTracks", js.Array(value :_*))
    
    @scala.inline
    def setAudioTracks(value: js.Array[Double]): Self = this.set("audioTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioTracks: Self = this.set("audioTracks", js.undefined)
    
    @scala.inline
    def setDiarizationSpeakerCount(value: Double): Self = this.set("diarizationSpeakerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiarizationSpeakerCount: Self = this.set("diarizationSpeakerCount", js.undefined)
    
    @scala.inline
    def setEnableAutomaticPunctuation(value: Boolean): Self = this.set("enableAutomaticPunctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutomaticPunctuation: Self = this.set("enableAutomaticPunctuation", js.undefined)
    
    @scala.inline
    def setEnableSpeakerDiarization(value: Boolean): Self = this.set("enableSpeakerDiarization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSpeakerDiarization: Self = this.set("enableSpeakerDiarization", js.undefined)
    
    @scala.inline
    def setEnableWordConfidence(value: Boolean): Self = this.set("enableWordConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableWordConfidence: Self = this.set("enableWordConfidence", js.undefined)
    
    @scala.inline
    def setFilterProfanity(value: Boolean): Self = this.set("filterProfanity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterProfanity: Self = this.set("filterProfanity", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setMaxAlternatives(value: Double): Self = this.set("maxAlternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAlternatives: Self = this.set("maxAlternatives", js.undefined)
    
    @scala.inline
    def setSpeechContextsVarargs(value: SchemaGoogleCloudVideointelligenceV1SpeechContext*): Self = this.set("speechContexts", js.Array(value :_*))
    
    @scala.inline
    def setSpeechContexts(value: js.Array[SchemaGoogleCloudVideointelligenceV1SpeechContext]): Self = this.set("speechContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechContexts: Self = this.set("speechContexts", js.undefined)
  }
}
