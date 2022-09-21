package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplaceNegativeKeywordsResponse extends StObject {
  
  /**
    * The full list of negative keywords now present in the negative keyword list.
    */
  var negativeKeywords: js.UndefOr[js.Array[SchemaNegativeKeyword]] = js.undefined
}
object SchemaReplaceNegativeKeywordsResponse {
  
  inline def apply(): SchemaReplaceNegativeKeywordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceNegativeKeywordsResponse]
  }
  
  extension [Self <: SchemaReplaceNegativeKeywordsResponse](x: Self) {
    
    inline def setNegativeKeywords(value: js.Array[SchemaNegativeKeyword]): Self = StObject.set(x, "negativeKeywords", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordsUndefined: Self = StObject.set(x, "negativeKeywords", js.undefined)
    
    inline def setNegativeKeywordsVarargs(value: SchemaNegativeKeyword*): Self = StObject.set(x, "negativeKeywords", js.Array(value*))
  }
}
