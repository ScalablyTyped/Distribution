package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetectLanguageResponse extends StObject {
  
  /**
    * The most probable language detected by the Translation API. For each request, the Translation API will always return only one result.
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
