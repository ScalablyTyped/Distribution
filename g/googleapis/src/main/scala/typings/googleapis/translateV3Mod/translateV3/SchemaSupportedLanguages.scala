package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSupportedLanguages extends StObject {
  
  /**
    * A list of supported language responses. This list contains an entry for each language the Translation API supports.
    */
  var languages: js.UndefOr[js.Array[SchemaSupportedLanguage]] = js.undefined
}
object SchemaSupportedLanguages {
  
  inline def apply(): SchemaSupportedLanguages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSupportedLanguages]
  }
  
  extension [Self <: SchemaSupportedLanguages](x: Self) {
    
    inline def setLanguages(value: js.Array[SchemaSupportedLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: SchemaSupportedLanguage*): Self = StObject.set(x, "languages", js.Array(value*))
  }
}
