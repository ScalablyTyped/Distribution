package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Campaign List Response
  */
trait SchemaCampaignsListResponse extends StObject {
  
  /**
    * Campaign collection.
    */
  var campaigns: js.UndefOr[js.Array[SchemaCampaign]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#campaignsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaCampaignsListResponse {
  
  inline def apply(): SchemaCampaignsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaignsListResponse]
  }
  
  extension [Self <: SchemaCampaignsListResponse](x: Self) {
    
    inline def setCampaigns(value: js.Array[SchemaCampaign]): Self = StObject.set(x, "campaigns", value.asInstanceOf[js.Any])
    
    inline def setCampaignsUndefined: Self = StObject.set(x, "campaigns", js.undefined)
    
    inline def setCampaignsVarargs(value: SchemaCampaign*): Self = StObject.set(x, "campaigns", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
