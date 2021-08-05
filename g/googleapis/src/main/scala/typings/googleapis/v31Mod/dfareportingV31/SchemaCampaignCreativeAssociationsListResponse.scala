package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Campaign Creative Association List Response
  */
trait SchemaCampaignCreativeAssociationsListResponse extends StObject {
  
  /**
    * Campaign creative association collection
    */
  var campaignCreativeAssociations: js.UndefOr[js.Array[SchemaCampaignCreativeAssociation]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#campaignCreativeAssociationsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaCampaignCreativeAssociationsListResponse {
  
  inline def apply(): SchemaCampaignCreativeAssociationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaignCreativeAssociationsListResponse]
  }
  
  extension [Self <: SchemaCampaignCreativeAssociationsListResponse](x: Self) {
    
    inline def setCampaignCreativeAssociations(value: js.Array[SchemaCampaignCreativeAssociation]): Self = StObject.set(x, "campaignCreativeAssociations", value.asInstanceOf[js.Any])
    
    inline def setCampaignCreativeAssociationsUndefined: Self = StObject.set(x, "campaignCreativeAssociations", js.undefined)
    
    inline def setCampaignCreativeAssociationsVarargs(value: SchemaCampaignCreativeAssociation*): Self = StObject.set(x, "campaignCreativeAssociations", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
