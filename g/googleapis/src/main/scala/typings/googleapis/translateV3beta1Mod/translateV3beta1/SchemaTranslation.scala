package typings.googleapis.translateV3beta1Mod.translateV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTranslation extends StObject {
  
  /**
    * The BCP-47 language code of source text in the initial request, detected automatically, if no source language was passed within the initial request. If the source language was passed, auto-detection of the language does not occur and this field is empty.
    */
  var detectedLanguageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The `glossary_config` used for this translation.
    */
  var glossaryConfig: js.UndefOr[SchemaTranslateTextGlossaryConfig] = js.undefined
  
  /**
    * Only present when `model` is present in the request. `model` here is normalized to have project number. For example: If the `model` requested in TranslationTextRequest is `projects/{project-id\}/locations/{location-id\}/models/general/nmt` then `model` here would be normalized to `projects/{project-number\}/locations/{location-id\}/models/general/nmt`.
    */
  var model: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Text translated into the target language. If an error occurs during translation, this field might be excluded from the response.
    */
  var translatedText: js.UndefOr[String | Null] = js.undefined
}
object SchemaTranslation {
  
  inline def apply(): SchemaTranslation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranslation]
  }
  
  extension [Self <: SchemaTranslation](x: Self) {
    
    inline def setDetectedLanguageCode(value: String): Self = StObject.set(x, "detectedLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguageCodeNull: Self = StObject.set(x, "detectedLanguageCode", null)
    
    inline def setDetectedLanguageCodeUndefined: Self = StObject.set(x, "detectedLanguageCode", js.undefined)
    
    inline def setGlossaryConfig(value: SchemaTranslateTextGlossaryConfig): Self = StObject.set(x, "glossaryConfig", value.asInstanceOf[js.Any])
    
    inline def setGlossaryConfigUndefined: Self = StObject.set(x, "glossaryConfig", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setTranslatedText(value: String): Self = StObject.set(x, "translatedText", value.asInstanceOf[js.Any])
    
    inline def setTranslatedTextNull: Self = StObject.set(x, "translatedText", null)
    
    inline def setTranslatedTextUndefined: Self = StObject.set(x, "translatedText", js.undefined)
  }
}
