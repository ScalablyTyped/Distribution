package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCancel
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the DisplayVideo360AdvertiserLinkProposal to cancel. Example format: properties/1234/displayVideo360AdvertiserLinkProposals/5678
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[
    SchemaGoogleAnalyticsAdminV1alphaCancelDisplayVideo360AdvertiserLinkProposalRequest
  ] = js.undefined
}
object ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCancel {
  
  inline def apply(): ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCancel]
  }
  
  extension [Self <: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCancel](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaCancelDisplayVideo360AdvertiserLinkProposalRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
