package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeTargetingRule extends StObject {
  
  /**
    * The specific billing period duration, specified in ISO 8601 format, that a user must be currently subscribed to to be eligible for this rule. If not specified, users subscribed to
    * any billing period are matched.
    */
  var billingPeriodDuration: js.UndefOr[String] = js.undefined
  
  /** Limit this offer to only once per user. If set to true, a user can never be eligible for this offer again if they ever subscribed to this offer. */
  var oncePerUser: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The scope of subscriptions this rule considers. Only allows "this subscription" and "specific subscription in app". */
  var scope: js.UndefOr[TargetingRuleScope] = js.undefined
}
object UpgradeTargetingRule {
  
  inline def apply(): UpgradeTargetingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeTargetingRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpgradeTargetingRule] (val x: Self) extends AnyVal {
    
    inline def setBillingPeriodDuration(value: String): Self = StObject.set(x, "billingPeriodDuration", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodDurationUndefined: Self = StObject.set(x, "billingPeriodDuration", js.undefined)
    
    inline def setOncePerUser(value: Boolean): Self = StObject.set(x, "oncePerUser", value.asInstanceOf[js.Any])
    
    inline def setOncePerUserUndefined: Self = StObject.set(x, "oncePerUser", js.undefined)
    
    inline def setScope(value: TargetingRuleScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
