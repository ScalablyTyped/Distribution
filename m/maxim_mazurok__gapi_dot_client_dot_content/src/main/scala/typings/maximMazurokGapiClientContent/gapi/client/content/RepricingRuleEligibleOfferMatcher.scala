package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingRuleEligibleOfferMatcher extends StObject {
  
  /** Filter by the brand. */
  var brandMatcher: js.UndefOr[RepricingRuleEligibleOfferMatcherStringMatcher] = js.native
  
  /** Filter by the item group id. */
  var itemGroupIdMatcher: js.UndefOr[RepricingRuleEligibleOfferMatcherStringMatcher] = js.native
  
  /** Determines whether to use the custom matchers or the product feed attribute "repricing_rule_id" to specify offer-rule mapping. */
  var matcherOption: js.UndefOr[String] = js.native
  
  /** Filter by the offer id. */
  var offerIdMatcher: js.UndefOr[RepricingRuleEligibleOfferMatcherStringMatcher] = js.native
}
object RepricingRuleEligibleOfferMatcher {
  
  @scala.inline
  def apply(): RepricingRuleEligibleOfferMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRuleEligibleOfferMatcher]
  }
  
  @scala.inline
  implicit class RepricingRuleEligibleOfferMatcherMutableBuilder[Self <: RepricingRuleEligibleOfferMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrandMatcher(value: RepricingRuleEligibleOfferMatcherStringMatcher): Self = StObject.set(x, "brandMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandMatcherUndefined: Self = StObject.set(x, "brandMatcher", js.undefined)
    
    @scala.inline
    def setItemGroupIdMatcher(value: RepricingRuleEligibleOfferMatcherStringMatcher): Self = StObject.set(x, "itemGroupIdMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemGroupIdMatcherUndefined: Self = StObject.set(x, "itemGroupIdMatcher", js.undefined)
    
    @scala.inline
    def setMatcherOption(value: String): Self = StObject.set(x, "matcherOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatcherOptionUndefined: Self = StObject.set(x, "matcherOption", js.undefined)
    
    @scala.inline
    def setOfferIdMatcher(value: RepricingRuleEligibleOfferMatcherStringMatcher): Self = StObject.set(x, "offerIdMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferIdMatcherUndefined: Self = StObject.set(x, "offerIdMatcher", js.undefined)
  }
}
