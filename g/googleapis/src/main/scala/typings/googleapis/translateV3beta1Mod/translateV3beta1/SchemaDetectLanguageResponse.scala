package typings.googleapis.translateV3beta1Mod.translateV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetectLanguageResponse extends StObject {
  
  /**
    * A list of detected languages sorted by detection confidence in descending order. The most probable language first.
    */
  var languages: js.UndefOr[js.Array[SchemaDetectedLanguage]] = js.undefined
}
object SchemaDetectLanguageResponse {
  
  inline def apply(): SchemaDetectLanguageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectLanguageResponse]
  }
  
  extension [Self <: SchemaDetectLanguageResponse](x: Self) {
    
    inline def setLanguages(value: js.Array[SchemaDetectedLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: SchemaDetectedLanguage*): Self = StObject.set(x, "languages", js.Array(value*))
  }
}
