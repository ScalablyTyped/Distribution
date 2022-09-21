package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditNegativeKeywordsResponse extends StObject {
  
  /**
    * The list of negative keywords that have been successfully created. This list will be absent if empty.
    */
  var negativeKeywords: js.UndefOr[js.Array[SchemaNegativeKeyword]] = js.undefined
}
object SchemaBulkEditNegativeKeywordsResponse {
  
  inline def apply(): SchemaBulkEditNegativeKeywordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditNegativeKeywordsResponse]
  }
  
  extension [Self <: SchemaBulkEditNegativeKeywordsResponse](x: Self) {
    
    inline def setNegativeKeywords(value: js.Array[SchemaNegativeKeyword]): Self = StObject.set(x, "negativeKeywords", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordsUndefined: Self = StObject.set(x, "negativeKeywords", js.undefined)
    
    inline def setNegativeKeywordsVarargs(value: SchemaNegativeKeyword*): Self = StObject.set(x, "negativeKeywords", js.Array(value*))
  }
}
