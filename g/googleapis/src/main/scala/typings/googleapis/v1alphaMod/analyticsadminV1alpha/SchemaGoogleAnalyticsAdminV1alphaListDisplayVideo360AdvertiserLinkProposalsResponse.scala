package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse extends StObject {
  
  /**
    * List of DisplayVideo360AdvertiserLinkProposals.
    */
  var displayVideo360AdvertiserLinkProposals: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse](x: Self) {
    
    inline def setDisplayVideo360AdvertiserLinkProposals(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]): Self = StObject.set(x, "displayVideo360AdvertiserLinkProposals", value.asInstanceOf[js.Any])
    
    inline def setDisplayVideo360AdvertiserLinkProposalsUndefined: Self = StObject.set(x, "displayVideo360AdvertiserLinkProposals", js.undefined)
    
    inline def setDisplayVideo360AdvertiserLinkProposalsVarargs(value: SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal*): Self = StObject.set(x, "displayVideo360AdvertiserLinkProposals", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
