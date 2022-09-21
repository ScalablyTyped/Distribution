package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse extends StObject {
  
  /**
    * The param to be passed in the ToS link.
    */
  var accountTicketId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse](x: Self) {
    
    inline def setAccountTicketId(value: String): Self = StObject.set(x, "accountTicketId", value.asInstanceOf[js.Any])
    
    inline def setAccountTicketIdNull: Self = StObject.set(x, "accountTicketId", null)
    
    inline def setAccountTicketIdUndefined: Self = StObject.set(x, "accountTicketId", js.undefined)
  }
}
