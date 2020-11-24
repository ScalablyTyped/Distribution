package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingRuleEligibleOfferMatcher extends js.Object {
  
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
  implicit class RepricingRuleEligibleOfferMatcherOps[Self <: RepricingRuleEligibleOfferMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrandMatcher(value: RepricingRuleEligibleOfferMatcherStringMatcher): Self = this.set("brandMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandMatcher: Self = this.set("brandMatcher", js.undefined)
    
    @scala.inline
    def setItemGroupIdMatcher(value: RepricingRuleEligibleOfferMatcherStringMatcher): Self = this.set("itemGroupIdMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemGroupIdMatcher: Self = this.set("itemGroupIdMatcher", js.undefined)
    
    @scala.inline
    def setMatcherOption(value: String): Self = this.set("matcherOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatcherOption: Self = this.set("matcherOption", js.undefined)
    
    @scala.inline
    def setOfferIdMatcher(value: RepricingRuleEligibleOfferMatcherStringMatcher): Self = this.set("offerIdMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferIdMatcher: Self = this.set("offerIdMatcher", js.undefined)
  }
}
