package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionOffer extends StObject {
  
  /** Required. Immutable. The ID of the base plan to which this offer is an extension. */
  var basePlanId: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. Unique ID of this subscription offer. Must be unique within the base plan. */
  var offerId: js.UndefOr[String] = js.undefined
  
  /** List of up to 20 custom tags specified for this offer, and returned to the app through the billing library. */
  var offerTags: js.UndefOr[js.Array[OfferTag]] = js.undefined
  
  /** The configuration for any new locations Play may launch in the future. */
  var otherRegionsConfig: js.UndefOr[OtherRegionsSubscriptionOfferConfig] = js.undefined
  
  /** Required. Immutable. The package name of the app the parent subscription belongs to. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The phases of this subscription offer. Must contain at least one entry, and may contain at most five. Users will always receive all these phases in the specified order.
    * Phases may not be added, removed, or reordered after initial creation.
    */
  var phases: js.UndefOr[js.Array[SubscriptionOfferPhase]] = js.undefined
  
  /** Required. Immutable. The ID of the parent subscription this offer belongs to. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** Required. The region-specific configuration of this offer. Must contain at least one entry. */
  var regionalConfigs: js.UndefOr[js.Array[RegionalSubscriptionOfferConfig]] = js.undefined
  
  /**
    * Output only. The current state of this offer. Can be changed using Activate and Deactivate actions. NB: the base plan state supersedes this state, so an active offer may not be
    * available if the base plan is not active.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * The requirements that users need to fulfil to be eligible for this offer. Represents the requirements that Play will evaluate to decide whether an offer should be returned.
    * Developers may further filter these offers themselves.
    */
  var targeting: js.UndefOr[SubscriptionOfferTargeting] = js.undefined
}
object SubscriptionOffer {
  
  inline def apply(): SubscriptionOffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionOffer]
  }
  
  extension [Self <: SubscriptionOffer](x: Self) {
    
    inline def setBasePlanId(value: String): Self = StObject.set(x, "basePlanId", value.asInstanceOf[js.Any])
    
    inline def setBasePlanIdUndefined: Self = StObject.set(x, "basePlanId", js.undefined)
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setOfferTags(value: js.Array[OfferTag]): Self = StObject.set(x, "offerTags", value.asInstanceOf[js.Any])
    
    inline def setOfferTagsUndefined: Self = StObject.set(x, "offerTags", js.undefined)
    
    inline def setOfferTagsVarargs(value: OfferTag*): Self = StObject.set(x, "offerTags", js.Array(value*))
    
    inline def setOtherRegionsConfig(value: OtherRegionsSubscriptionOfferConfig): Self = StObject.set(x, "otherRegionsConfig", value.asInstanceOf[js.Any])
    
    inline def setOtherRegionsConfigUndefined: Self = StObject.set(x, "otherRegionsConfig", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPhases(value: js.Array[SubscriptionOfferPhase]): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    inline def setPhasesUndefined: Self = StObject.set(x, "phases", js.undefined)
    
    inline def setPhasesVarargs(value: SubscriptionOfferPhase*): Self = StObject.set(x, "phases", js.Array(value*))
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setRegionalConfigs(value: js.Array[RegionalSubscriptionOfferConfig]): Self = StObject.set(x, "regionalConfigs", value.asInstanceOf[js.Any])
    
    inline def setRegionalConfigsUndefined: Self = StObject.set(x, "regionalConfigs", js.undefined)
    
    inline def setRegionalConfigsVarargs(value: RegionalSubscriptionOfferConfig*): Self = StObject.set(x, "regionalConfigs", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTargeting(value: SubscriptionOfferTargeting): Self = StObject.set(x, "targeting", value.asInstanceOf[js.Any])
    
    inline def setTargetingUndefined: Self = StObject.set(x, "targeting", js.undefined)
  }
}
