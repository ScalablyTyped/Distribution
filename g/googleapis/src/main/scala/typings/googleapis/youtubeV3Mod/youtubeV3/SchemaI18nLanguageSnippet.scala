package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about an i18n language, such as language code and
  * human-readable name.
  */
trait SchemaI18nLanguageSnippet extends StObject {
  
  /**
    * A short BCP-47 code that uniquely identifies a language.
    */
  var hl: js.UndefOr[String] = js.undefined
  
  /**
    * The human-readable name of the language in the language itself.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaI18nLanguageSnippet {
  
  inline def apply(): SchemaI18nLanguageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaI18nLanguageSnippet]
  }
  
  extension [Self <: SchemaI18nLanguageSnippet](x: Self) {
    
    inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
