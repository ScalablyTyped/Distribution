package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubstringMatchCriteria extends StObject {
  
  /**
    * Indicates whether the search should respect case: - `True`: the search is case sensitive. - `False`: the search is case insensitive.
    */
  var matchCase: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The text to search for in the document.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubstringMatchCriteria {
  
  inline def apply(): SchemaSubstringMatchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubstringMatchCriteria]
  }
  
  extension [Self <: SchemaSubstringMatchCriteria](x: Self) {
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    inline def setMatchCaseNull: Self = StObject.set(x, "matchCase", null)
    
    inline def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
