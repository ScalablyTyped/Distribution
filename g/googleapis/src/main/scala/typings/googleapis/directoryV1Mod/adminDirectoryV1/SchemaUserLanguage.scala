package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a language entry.
  */
@js.native
trait SchemaUserLanguage extends StObject {
  
  /**
    * Other language. User can provide own language name if there is no
    * corresponding Google III language code. If this is set LanguageCode
    * can&#39;t be set
    */
  var customLanguage: js.UndefOr[String] = js.native
  
  /**
    * Language Code. Should be used for storing Google III LanguageCode string
    * representation for language. Illegal values cause SchemaException.
    */
  var languageCode: js.UndefOr[String] = js.native
}
object SchemaUserLanguage {
  
  @scala.inline
  def apply(): SchemaUserLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserLanguage]
  }
  
  @scala.inline
  implicit class SchemaUserLanguageMutableBuilder[Self <: SchemaUserLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomLanguage(value: String): Self = StObject.set(x, "customLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomLanguageUndefined: Self = StObject.set(x, "customLanguage", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
