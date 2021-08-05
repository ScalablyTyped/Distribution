package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionPurchasesAcknowledgeRequest extends StObject {
  
  /** Payload to attach to the purchase. */
  var developerPayload: js.UndefOr[String] = js.undefined
}
object SubscriptionPurchasesAcknowledgeRequest {
  
  inline def apply(): SubscriptionPurchasesAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPurchasesAcknowledgeRequest]
  }
  
  extension [Self <: SubscriptionPurchasesAcknowledgeRequest](x: Self) {
    
    inline def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    inline def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
  }
}
