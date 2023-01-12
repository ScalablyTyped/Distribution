package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionOfferPhase extends StObject {
  
  /** Required. The duration of a single recurrence of this phase. Specified in ISO 8601 format. */
  var duration: js.UndefOr[String] = js.undefined
  
  /** Pricing information for any new locations Play may launch in. */
  var otherRegionsConfig: js.UndefOr[OtherRegionsSubscriptionOfferPhaseConfig] = js.undefined
  
  /** Required. The number of times this phase repeats. If this offer phase is not free, each recurrence charges the user the price of this offer phase. */
  var recurrenceCount: js.UndefOr[Double] = js.undefined
  
  /** Required. The region-specific configuration of this offer phase. This list must contain exactly one entry for each region for which the subscription offer has a regional config. */
  var regionalConfigs: js.UndefOr[js.Array[RegionalSubscriptionOfferPhaseConfig]] = js.undefined
}
object SubscriptionOfferPhase {
  
  inline def apply(): SubscriptionOfferPhase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionOfferPhase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionOfferPhase] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setOtherRegionsConfig(value: OtherRegionsSubscriptionOfferPhaseConfig): Self = StObject.set(x, "otherRegionsConfig", value.asInstanceOf[js.Any])
    
    inline def setOtherRegionsConfigUndefined: Self = StObject.set(x, "otherRegionsConfig", js.undefined)
    
    inline def setRecurrenceCount(value: Double): Self = StObject.set(x, "recurrenceCount", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceCountUndefined: Self = StObject.set(x, "recurrenceCount", js.undefined)
    
    inline def setRegionalConfigs(value: js.Array[RegionalSubscriptionOfferPhaseConfig]): Self = StObject.set(x, "regionalConfigs", value.asInstanceOf[js.Any])
    
    inline def setRegionalConfigsUndefined: Self = StObject.set(x, "regionalConfigs", js.undefined)
    
    inline def setRegionalConfigsVarargs(value: RegionalSubscriptionOfferPhaseConfig*): Self = StObject.set(x, "regionalConfigs", js.Array(value*))
  }
}
