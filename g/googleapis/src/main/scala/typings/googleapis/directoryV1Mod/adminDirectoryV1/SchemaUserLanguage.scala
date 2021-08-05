package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a language entry.
  */
trait SchemaUserLanguage extends StObject {
  
  /**
    * Other language. User can provide own language name if there is no
    * corresponding Google III language code. If this is set LanguageCode
    * can&#39;t be set
    */
  var customLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Language Code. Should be used for storing Google III LanguageCode string
    * representation for language. Illegal values cause SchemaException.
    */
  var languageCode: js.UndefOr[String] = js.undefined
}
object SchemaUserLanguage {
  
  inline def apply(): SchemaUserLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserLanguage]
  }
  
  extension [Self <: SchemaUserLanguage](x: Self) {
    
    inline def setCustomLanguage(value: String): Self = StObject.set(x, "customLanguage", value.asInstanceOf[js.Any])
    
    inline def setCustomLanguageUndefined: Self = StObject.set(x, "customLanguage", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
