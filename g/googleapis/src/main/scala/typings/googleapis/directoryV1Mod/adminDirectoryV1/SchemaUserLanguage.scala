package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserLanguage extends StObject {
  
  /**
    * Other language. User can provide their own language name if there is no corresponding ISO 639 language code. If this is set, `languageCode` can't be set.
    */
  var customLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ISO 639 string representation of a language. See [Language Codes](/admin-sdk/directory/v1/languages) for the list of supported codes. Valid language codes outside the supported set will be accepted by the API but may lead to unexpected behavior. Illegal values cause `SchemaException`. If this is set, `customLanguage` can't be set.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If present, controls whether the specified `languageCode` is the user's preferred language. If `customLanguage` is set, this can't be set. Allowed values are `preferred` and `not_preferred`.
    */
  var preference: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserLanguage {
  
  inline def apply(): SchemaUserLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserLanguage]
  }
  
  extension [Self <: SchemaUserLanguage](x: Self) {
    
    inline def setCustomLanguage(value: String): Self = StObject.set(x, "customLanguage", value.asInstanceOf[js.Any])
    
    inline def setCustomLanguageNull: Self = StObject.set(x, "customLanguage", null)
    
    inline def setCustomLanguageUndefined: Self = StObject.set(x, "customLanguage", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPreference(value: String): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceNull: Self = StObject.set(x, "preference", null)
    
    inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
  }
}
