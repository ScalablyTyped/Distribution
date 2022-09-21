package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGlossaryTerm extends StObject {
  
  /**
    * The language for this glossary term.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The text for the glossary term.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGlossaryTerm {
  
  inline def apply(): SchemaGlossaryTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlossaryTerm]
  }
  
  extension [Self <: SchemaGlossaryTerm](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
