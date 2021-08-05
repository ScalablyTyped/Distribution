package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Word-specific information for recognized words.
  */
trait SchemaWordInfo extends StObject {
  
  /**
    * Output only. Time offset relative to the beginning of the audio, and
    * corresponding to the end of the spoken word. This field is only set if
    * `enable_word_time_offsets=true` and only in the top hypothesis. This is
    * an experimental feature and the accuracy of the time offset can vary.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Time offset relative to the beginning of the audio, and
    * corresponding to the start of the spoken word. This field is only set if
    * `enable_word_time_offsets=true` and only in the top hypothesis. This is
    * an experimental feature and the accuracy of the time offset can vary.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The word corresponding to this set of information.
    */
  var word: js.UndefOr[String] = js.undefined
}
object SchemaWordInfo {
  
  inline def apply(): SchemaWordInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWordInfo]
  }
  
  extension [Self <: SchemaWordInfo](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
