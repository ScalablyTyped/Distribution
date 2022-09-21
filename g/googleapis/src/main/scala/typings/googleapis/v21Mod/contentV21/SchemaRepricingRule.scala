package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepricingRule extends StObject {
  
  /**
    * The rule definition for TYPE_COGS_BASED. Required when the rule type is TYPE_COGS_BASED.
    */
  var cogsBasedRule: js.UndefOr[SchemaRepricingRuleCostOfGoodsSaleRule] = js.undefined
  
  /**
    * Required. Immutable. [CLDR country code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml) (e.g. "US").
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Time period when the rule should take effect.
    */
  var effectiveTimePeriod: js.UndefOr[SchemaRepricingRuleEffectiveTime] = js.undefined
  
  /**
    * Required. Match criteria for the eligible offers.
    */
  var eligibleOfferMatcher: js.UndefOr[SchemaRepricingRuleEligibleOfferMatcher] = js.undefined
  
  /**
    * Required. Immutable. The two-letter ISO 639-1 language code associated with the repricing rule.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. Merchant that owns the repricing rule.
    */
  var merchantId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents whether a rule is paused. A paused rule will behave like a non-paused rule within CRUD operations, with the major difference that a paused rule will not be evaluated and will have no effect on offers.
    */
  var paused: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Restriction of the rule appliance.
    */
  var restriction: js.UndefOr[SchemaRepricingRuleRestriction] = js.undefined
  
  /**
    * Output only. Immutable. The ID to uniquely identify each repricing rule.
    */
  var ruleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rule definition for TYPE_STATS_BASED. Required when the rule type is TYPE_STATS_BASED.
    */
  var statsBasedRule: js.UndefOr[SchemaRepricingRuleStatsBasedRule] = js.undefined
  
  /**
    * The title for the rule.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The type of the rule.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaRepricingRule {
  
  inline def apply(): SchemaRepricingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepricingRule]
  }
  
  extension [Self <: SchemaRepricingRule](x: Self) {
    
    inline def setCogsBasedRule(value: SchemaRepricingRuleCostOfGoodsSaleRule): Self = StObject.set(x, "cogsBasedRule", value.asInstanceOf[js.Any])
    
    inline def setCogsBasedRuleUndefined: Self = StObject.set(x, "cogsBasedRule", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setEffectiveTimePeriod(value: SchemaRepricingRuleEffectiveTime): Self = StObject.set(x, "effectiveTimePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTimePeriodUndefined: Self = StObject.set(x, "effectiveTimePeriod", js.undefined)
    
    inline def setEligibleOfferMatcher(value: SchemaRepricingRuleEligibleOfferMatcher): Self = StObject.set(x, "eligibleOfferMatcher", value.asInstanceOf[js.Any])
    
    inline def setEligibleOfferMatcherUndefined: Self = StObject.set(x, "eligibleOfferMatcher", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdNull: Self = StObject.set(x, "merchantId", null)
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPausedNull: Self = StObject.set(x, "paused", null)
    
    inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    inline def setRestriction(value: SchemaRepricingRuleRestriction): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    inline def setRestrictionUndefined: Self = StObject.set(x, "restriction", js.undefined)
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdNull: Self = StObject.set(x, "ruleId", null)
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
    
    inline def setStatsBasedRule(value: SchemaRepricingRuleStatsBasedRule): Self = StObject.set(x, "statsBasedRule", value.asInstanceOf[js.Any])
    
    inline def setStatsBasedRuleUndefined: Self = StObject.set(x, "statsBasedRule", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
