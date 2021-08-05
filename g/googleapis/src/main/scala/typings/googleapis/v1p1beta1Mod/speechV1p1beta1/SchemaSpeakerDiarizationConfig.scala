package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpeakerDiarizationConfig extends StObject {
  
  /**
    * *Optional* If &#39;true&#39;, enables speaker detection for each
    * recognized word in the top alternative of the recognition result using a
    * speaker_tag provided in the WordInfo.
    */
  var enableSpeakerDiarization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * *Optional* Only used if diarization_speaker_count is not set. Maximum
    * number of speakers in the conversation. This range gives you more
    * flexibility by allowing the system to automatically determine the correct
    * number of speakers. If not set, the default value is 6.
    */
  var maxSpeakerCount: js.UndefOr[Double] = js.undefined
  
  /**
    * *Optional* Only used if diarization_speaker_count is not set. Minimum
    * number of speakers in the conversation. This range gives you more
    * flexibility by allowing the system to automatically determine the correct
    * number of speakers. If not set, the default value is 2.
    */
  var minSpeakerCount: js.UndefOr[Double] = js.undefined
}
object SchemaSpeakerDiarizationConfig {
  
  inline def apply(): SchemaSpeakerDiarizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpeakerDiarizationConfig]
  }
  
  extension [Self <: SchemaSpeakerDiarizationConfig](x: Self) {
    
    inline def setEnableSpeakerDiarization(value: Boolean): Self = StObject.set(x, "enableSpeakerDiarization", value.asInstanceOf[js.Any])
    
    inline def setEnableSpeakerDiarizationUndefined: Self = StObject.set(x, "enableSpeakerDiarization", js.undefined)
    
    inline def setMaxSpeakerCount(value: Double): Self = StObject.set(x, "maxSpeakerCount", value.asInstanceOf[js.Any])
    
    inline def setMaxSpeakerCountUndefined: Self = StObject.set(x, "maxSpeakerCount", js.undefined)
    
    inline def setMinSpeakerCount(value: Double): Self = StObject.set(x, "minSpeakerCount", value.asInstanceOf[js.Any])
    
    inline def setMinSpeakerCountUndefined: Self = StObject.set(x, "minSpeakerCount", js.undefined)
  }
}
