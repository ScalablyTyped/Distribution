package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingRuleScope extends StObject {
  
  /** The scope of the current targeting rule is the subscription with the specified subscription ID. Must be a subscription within the same parent app. */
  var specificSubscriptionInApp: js.UndefOr[String] = js.undefined
}
object TargetingRuleScope {
  
  inline def apply(): TargetingRuleScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingRuleScope]
  }
  
  extension [Self <: TargetingRuleScope](x: Self) {
    
    inline def setSpecificSubscriptionInApp(value: String): Self = StObject.set(x, "specificSubscriptionInApp", value.asInstanceOf[js.Any])
    
    inline def setSpecificSubscriptionInAppUndefined: Self = StObject.set(x, "specificSubscriptionInApp", js.undefined)
  }
}
