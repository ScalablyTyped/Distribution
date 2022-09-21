package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSupportedLanguage extends StObject {
  
  /**
    * Human readable name of the language localized in the display language specified in the request.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Supported language code, generally consisting of its ISO 639-1 identifier, for example, 'en', 'ja'. In certain cases, BCP-47 codes including language and region identifiers are returned (for example, 'zh-TW' and 'zh-CN')
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Can be used as source language.
    */
  var supportSource: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Can be used as target language.
    */
  var supportTarget: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSupportedLanguage {
  
  inline def apply(): SchemaSupportedLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSupportedLanguage]
  }
  
  extension [Self <: SchemaSupportedLanguage](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setSupportSource(value: Boolean): Self = StObject.set(x, "supportSource", value.asInstanceOf[js.Any])
    
    inline def setSupportSourceNull: Self = StObject.set(x, "supportSource", null)
    
    inline def setSupportSourceUndefined: Self = StObject.set(x, "supportSource", js.undefined)
    
    inline def setSupportTarget(value: Boolean): Self = StObject.set(x, "supportTarget", value.asInstanceOf[js.Any])
    
    inline def setSupportTargetNull: Self = StObject.set(x, "supportTarget", null)
    
    inline def setSupportTargetUndefined: Self = StObject.set(x, "supportTarget", js.undefined)
  }
}
