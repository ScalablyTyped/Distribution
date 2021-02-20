package typings.googleapis.translateV2Mod.translateV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLanguagesResource extends StObject {
  
  /**
    * Supported language code, generally consisting of its ISO 639-1
    * identifier. (E.g. &#39;en&#39;, &#39;ja&#39;). In certain cases, BCP-47
    * codes including language + region identifiers are returned (e.g.
    * &#39;zh-TW&#39; and &#39;zh-CH&#39;)
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Human readable name of the language localized to the target language.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaLanguagesResource {
  
  @scala.inline
  def apply(): SchemaLanguagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguagesResource]
  }
  
  @scala.inline
  implicit class SchemaLanguagesResourceMutableBuilder[Self <: SchemaLanguagesResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
