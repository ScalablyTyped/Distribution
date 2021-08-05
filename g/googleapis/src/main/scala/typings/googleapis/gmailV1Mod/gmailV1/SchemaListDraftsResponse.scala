package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDraftsResponse extends StObject {
  
  /**
    * List of drafts.
    */
  var drafts: js.UndefOr[js.Array[SchemaDraft]] = js.undefined
  
  /**
    * Token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Estimated total number of results.
    */
  var resultSizeEstimate: js.UndefOr[Double] = js.undefined
}
object SchemaListDraftsResponse {
  
  inline def apply(): SchemaListDraftsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDraftsResponse]
  }
  
  extension [Self <: SchemaListDraftsResponse](x: Self) {
    
    inline def setDrafts(value: js.Array[SchemaDraft]): Self = StObject.set(x, "drafts", value.asInstanceOf[js.Any])
    
    inline def setDraftsUndefined: Self = StObject.set(x, "drafts", js.undefined)
    
    inline def setDraftsVarargs(value: SchemaDraft*): Self = StObject.set(x, "drafts", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResultSizeEstimate(value: Double): Self = StObject.set(x, "resultSizeEstimate", value.asInstanceOf[js.Any])
    
    inline def setResultSizeEstimateUndefined: Self = StObject.set(x, "resultSizeEstimate", js.undefined)
  }
}
