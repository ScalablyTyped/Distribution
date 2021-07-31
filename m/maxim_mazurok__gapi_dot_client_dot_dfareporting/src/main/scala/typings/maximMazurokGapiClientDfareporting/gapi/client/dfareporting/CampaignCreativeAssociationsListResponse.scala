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
  
  @scala.inline
  def apply(): CampaignCreativeAssociationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignCreativeAssociationsListResponse]
  }
  
  @scala.inline
  implicit class CampaignCreativeAssociationsListResponseMutableBuilder[Self <: CampaignCreativeAssociationsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaignCreativeAssociations(value: js.Array[CampaignCreativeAssociation]): Self = StObject.set(x, "campaignCreativeAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignCreativeAssociationsUndefined: Self = StObject.set(x, "campaignCreativeAssociations", js.undefined)
    
    @scala.inline
    def setCampaignCreativeAssociationsVarargs(value: CampaignCreativeAssociation*): Self = StObject.set(x, "campaignCreativeAssociations", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
