package typings.googleapis.translateV2Mod.translateV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTranslationsResource extends StObject {
  
  /**
    * The source language of the initial request, detected automatically, if
    * no source language was passed within the initial request. If the
    * source language was passed, auto-detection of the language will not
    * occur and this field will be empty.
    */
  var detectedSourceLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The `model` type used for this translation. Valid values are
    * listed in public documentation. Can be different from requested `model`.
    * Present only if specific model type was explicitly requested.
    */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Text translated into the target language.
    */
  var translatedText: js.UndefOr[String | Null] = js.undefined
}
object SchemaTranslationsResource {
  
  inline def apply(): SchemaTranslationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranslationsResource]
  }
  
  extension [Self <: SchemaTranslationsResource](x: Self) {
    
    inline def setDetectedSourceLanguage(value: String): Self = StObject.set(x, "detectedSourceLanguage", value.asInstanceOf[js.Any])
    
    inline def setDetectedSourceLanguageNull: Self = StObject.set(x, "detectedSourceLanguage", null)
    
    inline def setDetectedSourceLanguageUndefined: Self = StObject.set(x, "detectedSourceLanguage", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setTranslatedText(value: String): Self = StObject.set(x, "translatedText", value.asInstanceOf[js.Any])
    
    inline def setTranslatedTextNull: Self = StObject.set(x, "translatedText", null)
    
    inline def setTranslatedTextUndefined: Self = StObject.set(x, "translatedText", js.undefined)
  }
}
