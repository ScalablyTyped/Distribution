package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetectedLanguage extends StObject {
  
  /**
    * The confidence of the detection result for this language.
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The BCP-47 language code of source content in the request, detected automatically.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaDetectedLanguage {
  
  inline def apply(): SchemaDetectedLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectedLanguage]
  }
  
  extension [Self <: SchemaDetectedLanguage](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
