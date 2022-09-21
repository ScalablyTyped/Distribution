package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest extends StObject {
  
  /**
    * Required. Specifies details of the extension. Currently, the duration of the extension must be exactly one billing cycle of the original subscription.
    */
  var `extension`: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1Extension] = js.undefined
  
  /**
    * Required. Restricted to 36 ASCII characters. A random UUID is recommended. The idempotency key for the request. The ID generation logic is controlled by the partner. request_id should be the same as on retries of the same request. A different request_id must be used for a extension of a different cycle. A random UUID is recommended.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionRequest](x: Self) {
    
    inline def setExtension(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1Extension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
