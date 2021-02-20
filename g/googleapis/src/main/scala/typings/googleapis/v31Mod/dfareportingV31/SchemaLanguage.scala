package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a language that can be targeted by ads.
  */
@js.native
trait SchemaLanguage extends StObject {
  
  /**
    * Language ID of this language. This is the ID used for targeting and
    * generating reports.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#language&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Format of language code is an ISO 639 two-letter language code optionally
    * followed by an underscore followed by an ISO 3166 code. Examples are
    * &quot;en&quot; for English or &quot;zh_CN&quot; for Simplified Chinese.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Name of this language.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaLanguage {
  
  @scala.inline
  def apply(): SchemaLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguage]
  }
  
  @scala.inline
  implicit class SchemaLanguageMutableBuilder[Self <: SchemaLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
