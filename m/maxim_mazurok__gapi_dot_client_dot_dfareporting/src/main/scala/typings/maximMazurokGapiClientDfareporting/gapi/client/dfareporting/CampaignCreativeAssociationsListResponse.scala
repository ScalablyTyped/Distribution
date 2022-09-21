package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignCreativeAssociationsListResponse extends StObject {
  
  /** Campaign creative association collection */
  var campaignCreativeAssociations: js.UndefOr[js.Array[CampaignCreativeAssociation]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaignCreativeAssociationsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object CampaignCreativeAssociationsListResponse {
  
  inline def apply(): CampaignCreativeAssociationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignCreativeAssociationsListResponse]
  }
  
  extension [Self <: CampaignCreativeAssociationsListResponse](x: Self) {
    
    inline def setCampaignCreativeAssociations(value: js.Array[CampaignCreativeAssociation]): Self = StObject.set(x, "campaignCreativeAssociations", value.asInstanceOf[js.Any])
    
    inline def setCampaignCreativeAssociationsUndefined: Self = StObject.set(x, "campaignCreativeAssociations", js.undefined)
    
    inline def setCampaignCreativeAssociationsVarargs(value: CampaignCreativeAssociation*): Self = StObject.set(x, "campaignCreativeAssociations", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
