package typings.googleapis.localservicesV1Mod.localservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse extends StObject {
  
  /**
    * List of account reports which maps 1:1 to a particular linked GLS account.
    */
  var accountReports: js.UndefOr[js.Array[SchemaGoogleAdsHomeservicesLocalservicesV1AccountReport]] = js.undefined
  
  /**
    * Pagination token to retrieve the next page of results. When `next_page_token` is not filled in, there is no next page and the list returned is the last page in the result set.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse {
  
  inline def apply(): SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse]
  }
  
  extension [Self <: SchemaGoogleAdsHomeservicesLocalservicesV1SearchAccountReportsResponse](x: Self) {
    
    inline def setAccountReports(value: js.Array[SchemaGoogleAdsHomeservicesLocalservicesV1AccountReport]): Self = StObject.set(x, "accountReports", value.asInstanceOf[js.Any])
    
    inline def setAccountReportsUndefined: Self = StObject.set(x, "accountReports", js.undefined)
    
    inline def setAccountReportsVarargs(value: SchemaGoogleAdsHomeservicesLocalservicesV1AccountReport*): Self = StObject.set(x, "accountReports", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
