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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionPurchasesDeferResponse] (val x: Self) extends AnyVal {
    
    inline def setNewExpiryTimeMillis(value: String): Self = StObject.set(x, "newExpiryTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setNewExpiryTimeMillisUndefined: Self = StObject.set(x, "newExpiryTimeMillis", js.undefined)
  }
}
