package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCampaignsListResponse extends StObject {
  
  /**
    * Campaign collection.
    */
  var campaigns: js.UndefOr[js.Array[SchemaCampaign]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaignsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaCampaignsListResponse {
  
  inline def apply(): SchemaCampaignsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaignsListResponse]
  }
  
  extension [Self <: SchemaCampaignsListResponse](x: Self) {
    
    inline def setCampaigns(value: js.Array[SchemaCampaign]): Self = StObject.set(x, "campaigns", value.asInstanceOf[js.Any])
    
    inline def setCampaignsUndefined: Self = StObject.set(x, "campaigns", js.undefined)
    
    inline def setCampaignsVarargs(value: SchemaCampaign*): Self = StObject.set(x, "campaigns", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
