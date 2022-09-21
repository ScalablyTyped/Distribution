package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleTypeLocalizedText extends StObject {
  
  /**
    * The text's BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Localized string in the language corresponding to `language_code' below.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleTypeLocalizedText {
  
  inline def apply(): SchemaGoogleTypeLocalizedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleTypeLocalizedText]
  }
  
  extension [Self <: SchemaGoogleTypeLocalizedText](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
