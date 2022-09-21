package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVoice extends StObject {
  
  /**
    * The languages that this voice supports, expressed as [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g. "en-US", "es-419", "cmn-tw").
    */
  var languageCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of this voice. Each distinct voice has a unique name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The natural sample rate (in hertz) for this voice.
    */
  var naturalSampleRateHertz: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The gender of this voice.
    */
  var ssmlGender: js.UndefOr[String | Null] = js.undefined
}
object SchemaVoice {
  
  inline def apply(): SchemaVoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoice]
  }
  
  extension [Self <: SchemaVoice](x: Self) {
    
    inline def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodesNull: Self = StObject.set(x, "languageCodes", null)
    
    inline def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
    
    inline def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNaturalSampleRateHertz(value: Double): Self = StObject.set(x, "naturalSampleRateHertz", value.asInstanceOf[js.Any])
    
    inline def setNaturalSampleRateHertzNull: Self = StObject.set(x, "naturalSampleRateHertz", null)
    
    inline def setNaturalSampleRateHertzUndefined: Self = StObject.set(x, "naturalSampleRateHertz", js.undefined)
    
    inline def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
    
    inline def setSsmlGenderNull: Self = StObject.set(x, "ssmlGender", null)
    
    inline def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
  }
}
