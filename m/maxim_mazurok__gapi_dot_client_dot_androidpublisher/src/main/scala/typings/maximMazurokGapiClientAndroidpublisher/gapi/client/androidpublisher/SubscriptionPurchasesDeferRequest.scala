package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionPurchasesDeferRequest extends StObject {
  
  /** The information about the new desired expiry time for the subscription. */
  var deferralInfo: js.UndefOr[SubscriptionDeferralInfo] = js.undefined
}
object SubscriptionPurchasesDeferRequest {
  
  @scala.inline
  def apply(): SubscriptionPurchasesDeferRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPurchasesDeferRequest]
  }
  
  @scala.inline
  implicit class SubscriptionPurchasesDeferRequestMutableBuilder[Self <: SubscriptionPurchasesDeferRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferralInfo(value: SubscriptionDeferralInfo): Self = StObject.set(x, "deferralInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferralInfoUndefined: Self = StObject.set(x, "deferralInfo", js.undefined)
  }
}
