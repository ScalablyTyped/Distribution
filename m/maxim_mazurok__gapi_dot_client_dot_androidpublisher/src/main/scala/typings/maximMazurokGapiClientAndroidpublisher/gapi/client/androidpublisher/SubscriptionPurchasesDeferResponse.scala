package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionPurchasesDeferResponse extends StObject {
  
  /** The new expiry time for the subscription in milliseconds since the Epoch. */
  var newExpiryTimeMillis: js.UndefOr[String] = js.undefined
}
object SubscriptionPurchasesDeferResponse {
  
  inline def apply(): SubscriptionPurchasesDeferResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPurchasesDeferResponse]
  }
  
  extension [Self <: SubscriptionPurchasesDeferResponse](x: Self) {
    
    inline def setNewExpiryTimeMillis(value: String): Self = StObject.set(x, "newExpiryTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setNewExpiryTimeMillisUndefined: Self = StObject.set(x, "newExpiryTimeMillis", js.undefined)
  }
}
