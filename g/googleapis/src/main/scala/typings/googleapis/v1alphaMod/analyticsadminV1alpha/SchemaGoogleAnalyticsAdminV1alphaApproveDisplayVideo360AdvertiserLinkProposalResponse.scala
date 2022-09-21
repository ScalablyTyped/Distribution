package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse extends StObject {
  
  /**
    * The DisplayVideo360AdvertiserLink created as a result of approving the proposal.
    */
  var displayVideo360AdvertiserLink: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse](x: Self) {
    
    inline def setDisplayVideo360AdvertiserLink(value: SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink): Self = StObject.set(x, "displayVideo360AdvertiserLink", value.asInstanceOf[js.Any])
    
    inline def setDisplayVideo360AdvertiserLinkUndefined: Self = StObject.set(x, "displayVideo360AdvertiserLink", js.undefined)
  }
}
