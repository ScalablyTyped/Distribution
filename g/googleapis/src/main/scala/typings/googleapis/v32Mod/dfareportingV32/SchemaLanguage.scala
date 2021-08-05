package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a language that can be targeted by ads.
  */
trait SchemaLanguage extends StObject {
  
  /**
    * Language ID of this language. This is the ID used for targeting and
    * generating reports.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#language&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Format of language code is an ISO 639 two-letter language code optionally
    * followed by an underscore followed by an ISO 3166 code. Examples are
    * &quot;en&quot; for English or &quot;zh_CN&quot; for Simplified Chinese.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this language.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaLanguage {
  
  inline def apply(): SchemaLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguage]
  }
  
  extension [Self <: SchemaLanguage](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
