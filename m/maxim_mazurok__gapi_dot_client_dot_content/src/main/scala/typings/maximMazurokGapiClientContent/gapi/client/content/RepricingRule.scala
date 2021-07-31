package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepricingRule extends StObject {
  
  /** Required. Immutable. CLDR country code (e.g. "US"). */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /** Required. Time period when the rule should take effect. */
  var effectiveTimePeriod: js.UndefOr[RepricingRuleEffectiveTime] = js.undefined
  
  /** Required. Match criteria for the eligible offers. */
  var eligibleOfferMatcher: js.UndefOr[RepricingRuleEligibleOfferMatcher] = js.undefined
  
  /** Required. Immutable. The two-letter ISO 639-1 language code associated with the repricing rule. */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Output only. Immutable. Merchant that owns the repricing rule. */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Represents whether a rule is paused. A paused rule will behave like a non-paused rule within CRUD operations, with the major difference that a paused rule will not be evaluated and
    * will have no effect on offers.
    */
  var paused: js.UndefOr[Boolean] = js.undefined
  
  /** Required. Restriction of the rule appliance. */
  var restriction: js.UndefOr[RepricingRuleRestriction] = js.undefined
  
  /** Output only. Immutable. The ID to uniquely identify each repricing rule. */
  var ruleId: js.UndefOr[String] = js.undefined
  
  /** The title for the rule. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. The type of the rule. */
  var `type`: js.UndefOr[String] = js.undefined
}
object RepricingRule {
  
  @scala.inline
  def apply(): RepricingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepricingRule]
  }
  
  @scala.inline
  implicit class RepricingRuleMutableBuilder[Self <: RepricingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setEffectiveTimePeriod(value: RepricingRuleEffectiveTime): Self = StObject.set(x, "effectiveTimePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveTimePeriodUndefined: Self = StObject.set(x, "effectiveTimePeriod", js.undefined)
    
    @scala.inline
    def setEligibleOfferMatcher(value: RepricingRuleEligibleOfferMatcher): Self = StObject.set(x, "eligibleOfferMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligibleOfferMatcherUndefined: Self = StObject.set(x, "eligibleOfferMatcher", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    @scala.inline
    def setRestriction(value: RepricingRuleRestriction): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionUndefined: Self = StObject.set(x, "restriction", js.undefined)
    
    @scala.inline
    def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
