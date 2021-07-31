package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionDeferralInfo extends StObject {
  
  /** The desired next expiry time to assign to the subscription, in milliseconds since the Epoch. The given time must be later/greater than the current expiry time for the subscription. */
  var desiredExpiryTimeMillis: js.UndefOr[String] = js.undefined
  
  /** The expected expiry time for the subscription. If the current expiry time for the subscription is not the value specified here, the deferral will not occur. */
  var expectedExpiryTimeMillis: js.UndefOr[String] = js.undefined
}
object SubscriptionDeferralInfo {
  
  @scala.inline
  def apply(): SubscriptionDeferralInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionDeferralInfo]
  }
  
  @scala.inline
  implicit class SubscriptionDeferralInfoMutableBuilder[Self <: SubscriptionDeferralInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredExpiryTimeMillis(value: String): Self = StObject.set(x, "desiredExpiryTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredExpiryTimeMillisUndefined: Self = StObject.set(x, "desiredExpiryTimeMillis", js.undefined)
    
    @scala.inline
    def setExpectedExpiryTimeMillis(value: String): Self = StObject.set(x, "expectedExpiryTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedExpiryTimeMillisUndefined: Self = StObject.set(x, "expectedExpiryTimeMillis", js.undefined)
  }
}
