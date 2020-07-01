package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    audioTracks: js.Array[Double] = null,
    diarizationSpeakerCount: js.UndefOr[Double] = js.undefined,
    enableAutomaticPunctuation: js.UndefOr[Boolean] = js.undefined,
    enableSpeakerDiarization: js.UndefOr[Boolean] = js.undefined,
    enableWordConfidence: js.UndefOr[Boolean] = js.undefined,
    filterProfanity: js.UndefOr[Boolean] = js.undefined,
    languageCode: String = null,
    maxAlternatives: js.UndefOr[Double] = js.undefined,
    speechContexts: js.Array[SchemaGoogleCloudVideointelligenceV1SpeechContext] = null
  ): SchemaGoogleCloudVideointelligenceV1SpeechTranscriptionConfig = {
    val __obj = js.Dynamic.literal()
    if (audioTracks != null) __obj.updateDynamic("audioTracks")(audioTracks.asInstanceOf[js.Any])
    if (!js.isUndefined(diarizationSpeakerCount)) __obj.updateDynamic("diarizationSpeakerCount")(diarizationSpeakerCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutomaticPunctuation)) __obj.updateDynamic("enableAutomaticPunctuation")(enableAutomaticPunctuation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSpeakerDiarization)) __obj.updateDynamic("enableSpeakerDiarization")(enableSpeakerDiarization.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableWordConfidence)) __obj.updateDynamic("enableWordConfidence")(enableWordConfidence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filterProfanity)) __obj.updateDynamic("filterProfanity")(filterProfanity.get.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAlternatives)) __obj.updateDynamic("maxAlternatives")(maxAlternatives.get.asInstanceOf[js.Any])
    if (speechContexts != null) __obj.updateDynamic("speechContexts")(speechContexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1SpeechTranscriptionConfig]
  }
}

