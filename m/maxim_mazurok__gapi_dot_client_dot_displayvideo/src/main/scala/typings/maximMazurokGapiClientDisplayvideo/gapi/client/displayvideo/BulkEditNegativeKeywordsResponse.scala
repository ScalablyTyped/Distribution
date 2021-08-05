package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditNegativeKeywordsResponse extends StObject {
  
  /** The list of negative keywords that have been successfully created. This list will be absent if empty. */
  var negativeKeywords: js.UndefOr[js.Array[NegativeKeyword]] = js.undefined
}
object BulkEditNegativeKeywordsResponse {
  
  inline def apply(): BulkEditNegativeKeywordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditNegativeKeywordsResponse]
  }
  
  extension [Self <: BulkEditNegativeKeywordsResponse](x: Self) {
    
    inline def setNegativeKeywords(value: js.Array[NegativeKeyword]): Self = StObject.set(x, "negativeKeywords", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordsUndefined: Self = StObject.set(x, "negativeKeywords", js.undefined)
    
    inline def setNegativeKeywordsVarargs(value: NegativeKeyword*): Self = StObject.set(x, "negativeKeywords", js.Array(value :_*))
  }
}
