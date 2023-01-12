package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepricingRuleEligibleOfferMatcher extends StObject {
  
  /** Filter by the brand. */
  var brandMatcher: js.UndefOr[RepricingRuleEligibleOfferMatcherStringMatcher] = js.undefined
  
  /** Filter by the item group id. */
  var itemGroupIdMatcher: js.UndefOr[RepricingRuleEligibleOfferMatcherStringMatcher] = js.undefined
  
  /** Determines whether to use the custom matchers or the product feed attribute "repricing_rule_id" to specify offer-rule mapping. */
  var matcherOption: js.UndefOr[String] = js.undefined
  
  /** Filter by the offer id. */
  var offerIdMatcher: js.UndefOr[RepricingRuleEligibleOfferMatcherStringMatcher] = js.undefined
  
  /** When true, the rule won't be applied to offers with active promotions. */
  var skipWhenOnPromotion: js.UndefOr[Boolean] = js.undefined
}
object RepricingRuleEligibleOfferMatcher {
  
  inline def apply(): RepricingRuleEligibleOfferMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleEligibleOfferMatcher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepricingRuleEligibleOfferMatcher] (val x: Self) extends AnyVal {
    
    inline def setBrandMatcher(value: RepricingRuleEligibleOfferMatcherStringMatcher): Self = StObject.set(x, "brandMatcher", value.asInstanceOf[js.Any])
    
    inline def setBrandMatcherUndefined: Self = StObject.set(x, "brandMatcher", js.undefined)
    
    inline def setItemGroupIdMatcher(value: RepricingRuleEligibleOfferMatcherStringMatcher): Self = StObject.set(x, "itemGroupIdMatcher", value.asInstanceOf[js.Any])
    
    inline def setItemGroupIdMatcherUndefined: Self = StObject.set(x, "itemGroupIdMatcher", js.undefined)
    
    inline def setMatcherOption(value: String): Self = StObject.set(x, "matcherOption", value.asInstanceOf[js.Any])
    
    inline def setMatcherOptionUndefined: Self = StObject.set(x, "matcherOption", js.undefined)
    
    inline def setOfferIdMatcher(value: RepricingRuleEligibleOfferMatcherStringMatcher): Self = StObject.set(x, "offerIdMatcher", value.asInstanceOf[js.Any])
    
    inline def setOfferIdMatcherUndefined: Self = StObject.set(x, "offerIdMatcher", js.undefined)
    
    inline def setSkipWhenOnPromotion(value: Boolean): Self = StObject.set(x, "skipWhenOnPromotion", value.asInstanceOf[js.Any])
    
    inline def setSkipWhenOnPromotionUndefined: Self = StObject.set(x, "skipWhenOnPromotion", js.undefined)
  }
}
