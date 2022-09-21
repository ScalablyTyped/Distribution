package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsApprove
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the DisplayVideo360AdvertiserLinkProposal to approve. Example format: properties/1234/displayVideo360AdvertiserLinkProposals/5678
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[
    SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalRequest
  ] = js.undefined
}
object ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsApprove {
  
  inline def apply(): ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsApprove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsApprove]
  }
  
  extension [Self <: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsApprove](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
