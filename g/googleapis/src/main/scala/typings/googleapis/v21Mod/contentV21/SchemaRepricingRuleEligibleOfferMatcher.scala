package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepricingRuleEligibleOfferMatcher extends StObject {
  
  /**
    * Filter by the brand.
    */
  var brandMatcher: js.UndefOr[SchemaRepricingRuleEligibleOfferMatcherStringMatcher] = js.undefined
  
  /**
    * Filter by the item group id.
    */
  var itemGroupIdMatcher: js.UndefOr[SchemaRepricingRuleEligibleOfferMatcherStringMatcher] = js.undefined
  
  /**
    * Determines whether to use the custom matchers or the product feed attribute "repricing_rule_id" to specify offer-rule mapping.
    */
  var matcherOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Filter by the offer id.
    */
  var offerIdMatcher: js.UndefOr[SchemaRepricingRuleEligibleOfferMatcherStringMatcher] = js.undefined
  
  /**
    * When true, the rule won't be applied to offers with active promotions.
    */
  var skipWhenOnPromotion: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRepricingRuleEligibleOfferMatcher {
  
  inline def apply(): SchemaRepricingRuleEligibleOfferMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepricingRuleEligibleOfferMatcher]
  }
  
  extension [Self <: SchemaRepricingRuleEligibleOfferMatcher](x: Self) {
    
    inline def setBrandMatcher(value: SchemaRepricingRuleEligibleOfferMatcherStringMatcher): Self = StObject.set(x, "brandMatcher", value.asInstanceOf[js.Any])
    
    inline def setBrandMatcherUndefined: Self = StObject.set(x, "brandMatcher", js.undefined)
    
    inline def setItemGroupIdMatcher(value: SchemaRepricingRuleEligibleOfferMatcherStringMatcher): Self = StObject.set(x, "itemGroupIdMatcher", value.asInstanceOf[js.Any])
    
    inline def setItemGroupIdMatcherUndefined: Self = StObject.set(x, "itemGroupIdMatcher", js.undefined)
    
    inline def setMatcherOption(value: String): Self = StObject.set(x, "matcherOption", value.asInstanceOf[js.Any])
    
    inline def setMatcherOptionNull: Self = StObject.set(x, "matcherOption", null)
    
    inline def setMatcherOptionUndefined: Self = StObject.set(x, "matcherOption", js.undefined)
    
    inline def setOfferIdMatcher(value: SchemaRepricingRuleEligibleOfferMatcherStringMatcher): Self = StObject.set(x, "offerIdMatcher", value.asInstanceOf[js.Any])
    
    inline def setOfferIdMatcherUndefined: Self = StObject.set(x, "offerIdMatcher", js.undefined)
    
    inline def setSkipWhenOnPromotion(value: Boolean): Self = StObject.set(x, "skipWhenOnPromotion", value.asInstanceOf[js.Any])
    
    inline def setSkipWhenOnPromotionNull: Self = StObject.set(x, "skipWhenOnPromotion", null)
    
    inline def setSkipWhenOnPromotionUndefined: Self = StObject.set(x, "skipWhenOnPromotion", js.undefined)
  }
}
