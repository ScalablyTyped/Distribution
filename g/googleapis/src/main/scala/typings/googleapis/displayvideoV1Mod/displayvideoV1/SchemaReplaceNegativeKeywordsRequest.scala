package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplaceNegativeKeywordsRequest extends StObject {
  
  /**
    * The negative keywords that will replace the existing keywords in the negative keyword list, specified as a list of NegativeKeywords.
    */
  var newNegativeKeywords: js.UndefOr[js.Array[SchemaNegativeKeyword]] = js.undefined
}
object SchemaReplaceNegativeKeywordsRequest {
  
  inline def apply(): SchemaReplaceNegativeKeywordsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceNegativeKeywordsRequest]
  }
  
  extension [Self <: SchemaReplaceNegativeKeywordsRequest](x: Self) {
    
    inline def setNewNegativeKeywords(value: js.Array[SchemaNegativeKeyword]): Self = StObject.set(x, "newNegativeKeywords", value.asInstanceOf[js.Any])
    
    inline def setNewNegativeKeywordsUndefined: Self = StObject.set(x, "newNegativeKeywords", js.undefined)
    
    inline def setNewNegativeKeywordsVarargs(value: SchemaNegativeKeyword*): Self = StObject.set(x, "newNegativeKeywords", js.Array(value*))
  }
}
