package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepricingRule extends js.Object {
  
  /** Required. Immutable. CLDR country code (e.g. "US"). */
  var countryCode: js.UndefOr[String] = js.native
  
  /** Required. Time period when the rule should take effect. */
  var effectiveTimePeriod: js.UndefOr[RepricingRuleEffectiveTime] = js.native
  
  /** Required. Match criteria for the eligible offers. */
  var eligibleOfferMatcher: js.UndefOr[RepricingRuleEligibleOfferMatcher] = js.native
  
  /** Required. Immutable. The two-letter ISO 639-1 language code associated with the repricing rule. */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Output only. Immutable. Merchant that owns the repricing rule. */
  var merchantId: js.UndefOr[String] = js.native
  
  /**
    * Represents whether a rule is paused. A paused rule will behave like a non-paused rule within CRUD operations, with the major difference that a paused rule will not be evaluated and
    * will have no effect on offers.
    */
  var paused: js.UndefOr[Boolean] = js.native
  
  /** Required. Restriction of the rule appliance. */
  var restriction: js.UndefOr[RepricingRuleRestriction] = js.native
  
  /** Output only. Immutable. The ID to uniquely identify each repricing rule. */
  var ruleId: js.UndefOr[String] = js.native
  
  /** The title for the rule. */
  var title: js.UndefOr[String] = js.native
  
  /** Required. Immutable. The type of the rule. */
  var `type`: js.UndefOr[String] = js.native
}
object RepricingRule {
  
  @scala.inline
  def apply(): RepricingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRule]
  }
  
  @scala.inline
  implicit class RepricingRuleOps[Self <: RepricingRule] (val x: Self) extends AnyVal {
    
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setEffectiveTimePeriod(value: RepricingRuleEffectiveTime): Self = this.set("effectiveTimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveTimePeriod: Self = this.set("effectiveTimePeriod", js.undefined)
    
    @scala.inline
    def setEligibleOfferMatcher(value: RepricingRuleEligibleOfferMatcher): Self = this.set("eligibleOfferMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEligibleOfferMatcher: Self = this.set("eligibleOfferMatcher", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    
    @scala.inline
    def setRestriction(value: RepricingRuleRestriction): Self = this.set("restriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestriction: Self = this.set("restriction", js.undefined)
    
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleId: Self = this.set("ruleId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
