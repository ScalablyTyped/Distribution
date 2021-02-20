package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about an i18n language, such as language code and
  * human-readable name.
  */
@js.native
trait SchemaI18nLanguageSnippet extends StObject {
  
  /**
    * A short BCP-47 code that uniquely identifies a language.
    */
  var hl: js.UndefOr[String] = js.native
  
  /**
    * The human-readable name of the language in the language itself.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaI18nLanguageSnippet {
  
  @scala.inline
  def apply(): SchemaI18nLanguageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaI18nLanguageSnippet]
  }
  
  @scala.inline
  implicit class SchemaI18nLanguageSnippetMutableBuilder[Self <: SchemaI18nLanguageSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
