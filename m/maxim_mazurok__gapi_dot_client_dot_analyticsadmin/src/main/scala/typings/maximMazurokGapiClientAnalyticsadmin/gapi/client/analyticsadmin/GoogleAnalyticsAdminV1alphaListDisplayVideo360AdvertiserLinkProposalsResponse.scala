package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse extends StObject {
  
  /** List of DisplayVideo360AdvertiserLinkProposals. */
  var displayVideo360AdvertiserLinkProposals: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse](x: Self) {
    
    inline def setDisplayVideo360AdvertiserLinkProposals(value: js.Array[GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]): Self = StObject.set(x, "displayVideo360AdvertiserLinkProposals", value.asInstanceOf[js.Any])
    
    inline def setDisplayVideo360AdvertiserLinkProposalsUndefined: Self = StObject.set(x, "displayVideo360AdvertiserLinkProposals", js.undefined)
    
    inline def setDisplayVideo360AdvertiserLinkProposalsVarargs(value: GoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal*): Self = StObject.set(x, "displayVideo360AdvertiserLinkProposals", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
