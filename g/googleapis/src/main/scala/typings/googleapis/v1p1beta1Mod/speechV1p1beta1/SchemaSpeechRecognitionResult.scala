package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A speech recognition result corresponding to a portion of the audio.
  */
trait SchemaSpeechRecognitionResult extends StObject {
  
  /**
    * Output only. May contain one or more recognition hypotheses (up to the
    * maximum specified in `max_alternatives`). These alternatives are ordered
    * in terms of accuracy, with the top (first) alternative being the most
    * probable, as ranked by the recognizer.
    */
  var alternatives: js.UndefOr[js.Array[SchemaSpeechRecognitionAlternative]] = js.undefined
  
  /**
    * For multi-channel audio, this is the channel number corresponding to the
    * recognized result for the audio from that channel. For
    * audio_channel_count = N, its output values can range from &#39;1&#39; to
    * &#39;N&#39;.
    */
  var channelTag: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
    * language tag of the language in this result. This language code was
    * detected to have the most likelihood of being spoken in the audio.
    */
  var languageCode: js.UndefOr[String] = js.undefined
}
object SchemaSpeechRecognitionResult {
  
  inline def apply(): SchemaSpeechRecognitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpeechRecognitionResult]
  }
  
  extension [Self <: SchemaSpeechRecognitionResult](x: Self) {
    
    inline def setAlternatives(value: js.Array[SchemaSpeechRecognitionAlternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
    
    inline def setAlternativesVarargs(value: SchemaSpeechRecognitionAlternative*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
    
    inline def setChannelTag(value: Double): Self = StObject.set(x, "channelTag", value.asInstanceOf[js.Any])
    
    inline def setChannelTagUndefined: Self = StObject.set(x, "channelTag", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
