package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaI18nLanguageSnippet extends StObject {
  
  /**
    * A short BCP-47 code that uniquely identifies a language.
    */
  var hl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human-readable name of the language in the language itself.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaI18nLanguageSnippet {
  
  inline def apply(): SchemaI18nLanguageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaI18nLanguageSnippet]
  }
  
  extension [Self <: SchemaI18nLanguageSnippet](x: Self) {
    
    inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlNull: Self = StObject.set(x, "hl", null)
    
    inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
