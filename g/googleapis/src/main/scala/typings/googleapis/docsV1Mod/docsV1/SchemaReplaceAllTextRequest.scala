package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplaceAllTextRequest extends StObject {
  
  /**
    * Finds text in the document matching this substring.
    */
  var containsText: js.UndefOr[SchemaSubstringMatchCriteria] = js.undefined
  
  /**
    * The text that will replace the matched text.
    */
  var replaceText: js.UndefOr[String | Null] = js.undefined
}
object SchemaReplaceAllTextRequest {
  
  inline def apply(): SchemaReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllTextRequest]
  }
  
  extension [Self <: SchemaReplaceAllTextRequest](x: Self) {
    
    inline def setContainsText(value: SchemaSubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
    
    inline def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
    
    inline def setReplaceText(value: String): Self = StObject.set(x, "replaceText", value.asInstanceOf[js.Any])
    
    inline def setReplaceTextNull: Self = StObject.set(x, "replaceText", null)
    
    inline def setReplaceTextUndefined: Self = StObject.set(x, "replaceText", js.undefined)
  }
}
