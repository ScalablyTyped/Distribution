package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest extends StObject {
  
  /**
    * Required. An acknowledgement that the caller of this method understands the terms of user data collection. This field must contain the exact value: "I acknowledge that I have the necessary privacy disclosures and rights from my end users for the collection and processing of their data, including the association of such data with the visitation information Google Analytics collects from my site and/or app property."
    */
  var acknowledgement: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest](x: Self) {
    
    inline def setAcknowledgement(value: String): Self = StObject.set(x, "acknowledgement", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgementNull: Self = StObject.set(x, "acknowledgement", null)
    
    inline def setAcknowledgementUndefined: Self = StObject.set(x, "acknowledgement", js.undefined)
  }
}
