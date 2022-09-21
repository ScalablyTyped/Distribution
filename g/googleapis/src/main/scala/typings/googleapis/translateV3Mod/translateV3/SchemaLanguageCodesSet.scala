package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLanguageCodesSet extends StObject {
  
  /**
    * The BCP-47 language code(s) for terms defined in the glossary. All entries are unique. The list contains at least two entries. Expected to be an exact match for GlossaryTerm.language_code.
    */
  var languageCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaLanguageCodesSet {
  
  inline def apply(): SchemaLanguageCodesSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguageCodesSet]
  }
  
  extension [Self <: SchemaLanguageCodesSet](x: Self) {
    
    inline def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodesNull: Self = StObject.set(x, "languageCodes", null)
    
    inline def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
    
    inline def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value*))
  }
}
