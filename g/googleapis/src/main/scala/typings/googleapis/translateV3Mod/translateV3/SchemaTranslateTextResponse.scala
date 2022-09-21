package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTranslateTextResponse extends StObject {
  
  /**
    * Text translation responses if a glossary is provided in the request. This can be the same as `translations` if no terms apply. This field has the same length as `contents`.
    */
  var glossaryTranslations: js.UndefOr[js.Array[SchemaTranslation]] = js.undefined
  
  /**
    * Text translation responses with no glossary applied. This field has the same length as `contents`.
    */
  var translations: js.UndefOr[js.Array[SchemaTranslation]] = js.undefined
}
object SchemaTranslateTextResponse {
  
  inline def apply(): SchemaTranslateTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranslateTextResponse]
  }
  
  extension [Self <: SchemaTranslateTextResponse](x: Self) {
    
    inline def setGlossaryTranslations(value: js.Array[SchemaTranslation]): Self = StObject.set(x, "glossaryTranslations", value.asInstanceOf[js.Any])
    
    inline def setGlossaryTranslationsUndefined: Self = StObject.set(x, "glossaryTranslations", js.undefined)
    
    inline def setGlossaryTranslationsVarargs(value: SchemaTranslation*): Self = StObject.set(x, "glossaryTranslations", js.Array(value*))
    
    inline def setTranslations(value: js.Array[SchemaTranslation]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setTranslationsVarargs(value: SchemaTranslation*): Self = StObject.set(x, "translations", js.Array(value*))
  }
}
