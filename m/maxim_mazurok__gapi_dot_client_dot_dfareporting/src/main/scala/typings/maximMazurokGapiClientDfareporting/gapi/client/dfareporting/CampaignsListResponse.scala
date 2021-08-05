package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignsListResponse extends StObject {
  
  /** Campaign collection. */
  var campaigns: js.UndefOr[js.Array[Campaign]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaignsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object CampaignsListResponse {
  
  inline def apply(): CampaignsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignsListResponse]
  }
  
  extension [Self <: CampaignsListResponse](x: Self) {
    
    inline def setCampaigns(value: js.Array[Campaign]): Self = StObject.set(x, "campaigns", value.asInstanceOf[js.Any])
    
    inline def setCampaignsUndefined: Self = StObject.set(x, "campaigns", js.undefined)
    
    inline def setCampaignsVarargs(value: Campaign*): Self = StObject.set(x, "campaigns", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
