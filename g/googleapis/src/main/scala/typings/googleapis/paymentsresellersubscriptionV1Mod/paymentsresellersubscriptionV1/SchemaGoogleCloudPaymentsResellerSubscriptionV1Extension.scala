package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1Extension extends StObject {
  
  /**
    * Specifies the period of access the subscription should grant.
    */
  var duration: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1Duration] = js.undefined
  
  /**
    * Required. Identifier of the end-user in partner’s system.
    */
  var partnerUserToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1Extension {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1Extension]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1Extension](x: Self) {
    
    inline def setDuration(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setPartnerUserToken(value: String): Self = StObject.set(x, "partnerUserToken", value.asInstanceOf[js.Any])
    
    inline def setPartnerUserTokenNull: Self = StObject.set(x, "partnerUserToken", null)
    
    inline def setPartnerUserTokenUndefined: Self = StObject.set(x, "partnerUserToken", js.undefined)
  }
}
