package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionOfferTargeting extends StObject {
  
  /** Offer targeting rule for new user acquisition. */
  var acquisitionRule: js.UndefOr[AcquisitionTargetingRule] = js.undefined
  
  /** Offer targeting rule for upgrading users' existing plans. */
  var upgradeRule: js.UndefOr[UpgradeTargetingRule] = js.undefined
}
object SubscriptionOfferTargeting {
  
  inline def apply(): SubscriptionOfferTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionOfferTargeting]
  }
  
  extension [Self <: SubscriptionOfferTargeting](x: Self) {
    
    inline def setAcquisitionRule(value: AcquisitionTargetingRule): Self = StObject.set(x, "acquisitionRule", value.asInstanceOf[js.Any])
    
    inline def setAcquisitionRuleUndefined: Self = StObject.set(x, "acquisitionRule", js.undefined)
    
    inline def setUpgradeRule(value: UpgradeTargetingRule): Self = StObject.set(x, "upgradeRule", value.asInstanceOf[js.Any])
    
    inline def setUpgradeRuleUndefined: Self = StObject.set(x, "upgradeRule", js.undefined)
  }
}
