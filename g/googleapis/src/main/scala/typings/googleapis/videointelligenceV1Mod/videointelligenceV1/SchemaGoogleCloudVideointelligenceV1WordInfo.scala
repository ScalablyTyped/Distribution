package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Word-specific information for recognized words. Word information is only
  * included in the response when certain request parameters are set, such as
  * `enable_word_time_offsets`.
  */
trait SchemaGoogleCloudVideointelligenceV1WordInfo extends StObject {
  
  /**
    * Output only. The confidence estimate between 0.0 and 1.0. A higher number
    * indicates an estimated greater likelihood that the recognized words are
    * correct. This field is set only for the top alternative. This field is
    * not guaranteed to be accurate and users should not rely on it to be
    * always provided. The default of 0.0 is a sentinel value indicating
    * `confidence` was not set.
    */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /**
    * Time offset relative to the beginning of the audio, and corresponding to
    * the end of the spoken word. This field is only set if
    * `enable_word_time_offsets=true` and only in the top hypothesis. This is
    * an experimental feature and the accuracy of the time offset can vary.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A distinct integer value is assigned for every speaker
    * within the audio. This field specifies which one of those speakers was
    * detected to have spoken this word. Value ranges from 1 up to
    * diarization_speaker_count, and is only set if speaker diarization is
    * enabled.
    */
  var speakerTag: js.UndefOr[Double] = js.undefined
  
  /**
    * Time offset relative to the beginning of the audio, and corresponding to
    * the start of the spoken word. This field is only set if
    * `enable_word_time_offsets=true` and only in the top hypothesis. This is
    * an experimental feature and the accuracy of the time offset can vary.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * The word corresponding to this set of information.
    */
  var word: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1WordInfo {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1WordInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1WordInfo]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1WordInfoMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1WordInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setSpeakerTag(value: Double): Self = StObject.set(x, "speakerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakerTagUndefined: Self = StObject.set(x, "speakerTag", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
