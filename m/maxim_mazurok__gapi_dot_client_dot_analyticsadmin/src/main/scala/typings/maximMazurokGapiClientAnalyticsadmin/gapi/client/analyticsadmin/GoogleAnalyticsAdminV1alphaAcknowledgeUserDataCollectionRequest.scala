package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest extends StObject {
  
  /**
    * Required. An acknowledgement that the caller of this method understands the terms of user data collection. This field must contain the exact value: "I acknowledge that I have the
    * necessary privacy disclosures and rights from my end users for the collection and processing of their data, including the association of such data with the visitation information
    * Google Analytics collects from my site and/or app property."
    */
  var acknowledgement: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest](x: Self) {
    
    inline def setAcknowledgement(value: String): Self = StObject.set(x, "acknowledgement", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgementUndefined: Self = StObject.set(x, "acknowledgement", js.undefined)
  }
}
