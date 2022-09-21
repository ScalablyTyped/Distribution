package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditNegativeKeywordsRequest extends StObject {
  
  /**
    * The negative keywords to create in batch, specified as a list of NegativeKeywords.
    */
  var createdNegativeKeywords: js.UndefOr[js.Array[SchemaNegativeKeyword]] = js.undefined
  
  /**
    * The negative keywords to delete in batch, specified as a list of keyword_values.
    */
  var deletedNegativeKeywords: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBulkEditNegativeKeywordsRequest {
  
  inline def apply(): SchemaBulkEditNegativeKeywordsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditNegativeKeywordsRequest]
  }
  
  extension [Self <: SchemaBulkEditNegativeKeywordsRequest](x: Self) {
    
    inline def setCreatedNegativeKeywords(value: js.Array[SchemaNegativeKeyword]): Self = StObject.set(x, "createdNegativeKeywords", value.asInstanceOf[js.Any])
    
    inline def setCreatedNegativeKeywordsUndefined: Self = StObject.set(x, "createdNegativeKeywords", js.undefined)
    
    inline def setCreatedNegativeKeywordsVarargs(value: SchemaNegativeKeyword*): Self = StObject.set(x, "createdNegativeKeywords", js.Array(value*))
    
    inline def setDeletedNegativeKeywords(value: js.Array[String]): Self = StObject.set(x, "deletedNegativeKeywords", value.asInstanceOf[js.Any])
    
    inline def setDeletedNegativeKeywordsNull: Self = StObject.set(x, "deletedNegativeKeywords", null)
    
    inline def setDeletedNegativeKeywordsUndefined: Self = StObject.set(x, "deletedNegativeKeywords", js.undefined)
    
    inline def setDeletedNegativeKeywordsVarargs(value: String*): Self = StObject.set(x, "deletedNegativeKeywords", js.Array(value*))
  }
}
