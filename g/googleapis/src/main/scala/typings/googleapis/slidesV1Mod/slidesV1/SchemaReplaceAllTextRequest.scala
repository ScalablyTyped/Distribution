package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplaceAllTextRequest extends StObject {
  
  /**
    * Finds text in a shape matching this substring.
    */
  var containsText: js.UndefOr[SchemaSubstringMatchCriteria] = js.undefined
  
  /**
    * If non-empty, limits the matches to page elements only on the given pages. Returns a 400 bad request error if given the page object ID of a notes master, or if a page with that object ID doesn't exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
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
    
    inline def setPageObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageObjectIds", value.asInstanceOf[js.Any])
    
    inline def setPageObjectIdsNull: Self = StObject.set(x, "pageObjectIds", null)
    
    inline def setPageObjectIdsUndefined: Self = StObject.set(x, "pageObjectIds", js.undefined)
    
    inline def setPageObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageObjectIds", js.Array(value*))
    
    inline def setReplaceText(value: String): Self = StObject.set(x, "replaceText", value.asInstanceOf[js.Any])
    
    inline def setReplaceTextNull: Self = StObject.set(x, "replaceText", null)
    
    inline def setReplaceTextUndefined: Self = StObject.set(x, "replaceText", js.undefined)
  }
}
