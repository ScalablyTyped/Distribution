package typings.googleapis.localservicesV1Mod.localservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse extends StObject {
  
  /**
    * List of detailed lead reports uniquely identified by external lead id.
    */
  var detailedLeadReports: js.UndefOr[js.Array[SchemaGoogleAdsHomeservicesLocalservicesV1DetailedLeadReport]] = js.undefined
  
  /**
    * Pagination token to retrieve the next page of results. When `next_page_token` is not filled in, there is no next page and the list returned is the last page in the result set.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse {
  
  inline def apply(): SchemaGoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse]
  }
  
  extension [Self <: SchemaGoogleAdsHomeservicesLocalservicesV1SearchDetailedLeadReportsResponse](x: Self) {
    
    inline def setDetailedLeadReports(value: js.Array[SchemaGoogleAdsHomeservicesLocalservicesV1DetailedLeadReport]): Self = StObject.set(x, "detailedLeadReports", value.asInstanceOf[js.Any])
    
    inline def setDetailedLeadReportsUndefined: Self = StObject.set(x, "detailedLeadReports", js.undefined)
    
    inline def setDetailedLeadReportsVarargs(value: SchemaGoogleAdsHomeservicesLocalservicesV1DetailedLeadReport*): Self = StObject.set(x, "detailedLeadReports", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
