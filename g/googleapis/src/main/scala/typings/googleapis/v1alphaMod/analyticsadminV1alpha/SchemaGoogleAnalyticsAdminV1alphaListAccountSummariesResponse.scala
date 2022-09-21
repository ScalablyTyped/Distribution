package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaListAccountSummariesResponse extends StObject {
  
  /**
    * Account summaries of all accounts the caller has access to.
    */
  var accountSummaries: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaAccountSummary]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaListAccountSummariesResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaListAccountSummariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaListAccountSummariesResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaListAccountSummariesResponse](x: Self) {
    
    inline def setAccountSummaries(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaAccountSummary]): Self = StObject.set(x, "accountSummaries", value.asInstanceOf[js.Any])
    
    inline def setAccountSummariesUndefined: Self = StObject.set(x, "accountSummaries", js.undefined)
    
    inline def setAccountSummariesVarargs(value: SchemaGoogleAnalyticsAdminV1alphaAccountSummary*): Self = StObject.set(x, "accountSummaries", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
