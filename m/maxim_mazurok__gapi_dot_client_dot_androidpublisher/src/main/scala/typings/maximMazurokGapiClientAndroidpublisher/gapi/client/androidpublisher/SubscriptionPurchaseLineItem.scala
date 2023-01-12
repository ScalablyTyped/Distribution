package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionPurchaseLineItem extends StObject {
  
  /** The item is auto renewing. */
  var autoRenewingPlan: js.UndefOr[AutoRenewingPlan] = js.undefined
  
  /** Time at which the subscription expired or will expire unless the access is extended (ex. renews). */
  var expiryTime: js.UndefOr[String] = js.undefined
  
  /** The item is prepaid. */
  var prepaidPlan: js.UndefOr[PrepaidPlan] = js.undefined
  
  /** The purchased product ID (for example, 'monthly001'). */
  var productId: js.UndefOr[String] = js.undefined
}
object SubscriptionPurchaseLineItem {
  
  inline def apply(): SubscriptionPurchaseLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPurchaseLineItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionPurchaseLineItem] (val x: Self) extends AnyVal {
    
    inline def setAutoRenewingPlan(value: AutoRenewingPlan): Self = StObject.set(x, "autoRenewingPlan", value.asInstanceOf[js.Any])
    
    inline def setAutoRenewingPlanUndefined: Self = StObject.set(x, "autoRenewingPlan", js.undefined)
    
    inline def setExpiryTime(value: String): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimeUndefined: Self = StObject.set(x, "expiryTime", js.undefined)
    
    inline def setPrepaidPlan(value: PrepaidPlan): Self = StObject.set(x, "prepaidPlan", value.asInstanceOf[js.Any])
    
    inline def setPrepaidPlanUndefined: Self = StObject.set(x, "prepaidPlan", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
