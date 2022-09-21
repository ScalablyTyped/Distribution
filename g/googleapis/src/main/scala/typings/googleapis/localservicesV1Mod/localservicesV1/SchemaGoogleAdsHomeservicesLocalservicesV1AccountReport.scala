package typings.googleapis.localservicesV1Mod.localservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAdsHomeservicesLocalservicesV1AccountReport extends StObject {
  
  /**
    * Unique identifier of the GLS account.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Aggregator specific information related to the account.
    */
  var aggregatorInfo: js.UndefOr[SchemaGoogleAdsHomeservicesLocalservicesV1AggregatorInfo] = js.undefined
  
  /**
    * Average review rating score from 1-5 stars.
    */
  var averageFiveStarRating: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Average weekly budget in the currency code of the account.
    */
  var averageWeeklyBudget: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Business name of the account.
    */
  var businessName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Currency code of the account.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of charged leads the account received in current specified period.
    */
  var currentPeriodChargedLeads: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of connected phone calls (duration over 30s) in current specified period.
    */
  var currentPeriodConnectedPhoneCalls: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of phone calls in current specified period, including both connected and unconnected calls.
    */
  var currentPeriodPhoneCalls: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total cost of the account in current specified period in the account's specified currency.
    */
  var currentPeriodTotalCost: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of impressions that customers have had in the past 2 days.
    */
  var impressionsLastTwoDays: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Phone lead responsiveness of the account for the past 90 days from current date. This is computed by taking the total number of connected calls from charged phone leads and dividing by the total number of calls received.
    */
  var phoneLeadResponsiveness: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of charged leads the account received in previous specified period.
    */
  var previousPeriodChargedLeads: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of connected phone calls (duration over 30s) in previous specified period.
    */
  var previousPeriodConnectedPhoneCalls: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of phone calls in previous specified period, including both connected and unconnected calls.
    */
  var previousPeriodPhoneCalls: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total cost of the account in previous specified period in the account's specified currency.
    */
  var previousPeriodTotalCost: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Total number of reviews the account has up to current date.
    */
  var totalReview: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleAdsHomeservicesLocalservicesV1AccountReport {
  
  inline def apply(): SchemaGoogleAdsHomeservicesLocalservicesV1AccountReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAdsHomeservicesLocalservicesV1AccountReport]
  }
  
  extension [Self <: SchemaGoogleAdsHomeservicesLocalservicesV1AccountReport](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAggregatorInfo(value: SchemaGoogleAdsHomeservicesLocalservicesV1AggregatorInfo): Self = StObject.set(x, "aggregatorInfo", value.asInstanceOf[js.Any])
    
    inline def setAggregatorInfoUndefined: Self = StObject.set(x, "aggregatorInfo", js.undefined)
    
    inline def setAverageFiveStarRating(value: Double): Self = StObject.set(x, "averageFiveStarRating", value.asInstanceOf[js.Any])
    
    inline def setAverageFiveStarRatingNull: Self = StObject.set(x, "averageFiveStarRating", null)
    
    inline def setAverageFiveStarRatingUndefined: Self = StObject.set(x, "averageFiveStarRating", js.undefined)
    
    inline def setAverageWeeklyBudget(value: Double): Self = StObject.set(x, "averageWeeklyBudget", value.asInstanceOf[js.Any])
    
    inline def setAverageWeeklyBudgetNull: Self = StObject.set(x, "averageWeeklyBudget", null)
    
    inline def setAverageWeeklyBudgetUndefined: Self = StObject.set(x, "averageWeeklyBudget", js.undefined)
    
    inline def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
    
    inline def setBusinessNameNull: Self = StObject.set(x, "businessName", null)
    
    inline def setBusinessNameUndefined: Self = StObject.set(x, "businessName", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setCurrentPeriodChargedLeads(value: String): Self = StObject.set(x, "currentPeriodChargedLeads", value.asInstanceOf[js.Any])
    
    inline def setCurrentPeriodChargedLeadsNull: Self = StObject.set(x, "currentPeriodChargedLeads", null)
    
    inline def setCurrentPeriodChargedLeadsUndefined: Self = StObject.set(x, "currentPeriodChargedLeads", js.undefined)
    
    inline def setCurrentPeriodConnectedPhoneCalls(value: String): Self = StObject.set(x, "currentPeriodConnectedPhoneCalls", value.asInstanceOf[js.Any])
    
    inline def setCurrentPeriodConnectedPhoneCallsNull: Self = StObject.set(x, "currentPeriodConnectedPhoneCalls", null)
    
    inline def setCurrentPeriodConnectedPhoneCallsUndefined: Self = StObject.set(x, "currentPeriodConnectedPhoneCalls", js.undefined)
    
    inline def setCurrentPeriodPhoneCalls(value: String): Self = StObject.set(x, "currentPeriodPhoneCalls", value.asInstanceOf[js.Any])
    
    inline def setCurrentPeriodPhoneCallsNull: Self = StObject.set(x, "currentPeriodPhoneCalls", null)
    
    inline def setCurrentPeriodPhoneCallsUndefined: Self = StObject.set(x, "currentPeriodPhoneCalls", js.undefined)
    
    inline def setCurrentPeriodTotalCost(value: Double): Self = StObject.set(x, "currentPeriodTotalCost", value.asInstanceOf[js.Any])
    
    inline def setCurrentPeriodTotalCostNull: Self = StObject.set(x, "currentPeriodTotalCost", null)
    
    inline def setCurrentPeriodTotalCostUndefined: Self = StObject.set(x, "currentPeriodTotalCost", js.undefined)
    
    inline def setImpressionsLastTwoDays(value: String): Self = StObject.set(x, "impressionsLastTwoDays", value.asInstanceOf[js.Any])
    
    inline def setImpressionsLastTwoDaysNull: Self = StObject.set(x, "impressionsLastTwoDays", null)
    
    inline def setImpressionsLastTwoDaysUndefined: Self = StObject.set(x, "impressionsLastTwoDays", js.undefined)
    
    inline def setPhoneLeadResponsiveness(value: Double): Self = StObject.set(x, "phoneLeadResponsiveness", value.asInstanceOf[js.Any])
    
    inline def setPhoneLeadResponsivenessNull: Self = StObject.set(x, "phoneLeadResponsiveness", null)
    
    inline def setPhoneLeadResponsivenessUndefined: Self = StObject.set(x, "phoneLeadResponsiveness", js.undefined)
    
    inline def setPreviousPeriodChargedLeads(value: String): Self = StObject.set(x, "previousPeriodChargedLeads", value.asInstanceOf[js.Any])
    
    inline def setPreviousPeriodChargedLeadsNull: Self = StObject.set(x, "previousPeriodChargedLeads", null)
    
    inline def setPreviousPeriodChargedLeadsUndefined: Self = StObject.set(x, "previousPeriodChargedLeads", js.undefined)
    
    inline def setPreviousPeriodConnectedPhoneCalls(value: String): Self = StObject.set(x, "previousPeriodConnectedPhoneCalls", value.asInstanceOf[js.Any])
    
    inline def setPreviousPeriodConnectedPhoneCallsNull: Self = StObject.set(x, "previousPeriodConnectedPhoneCalls", null)
    
    inline def setPreviousPeriodConnectedPhoneCallsUndefined: Self = StObject.set(x, "previousPeriodConnectedPhoneCalls", js.undefined)
    
    inline def setPreviousPeriodPhoneCalls(value: String): Self = StObject.set(x, "previousPeriodPhoneCalls", value.asInstanceOf[js.Any])
    
    inline def setPreviousPeriodPhoneCallsNull: Self = StObject.set(x, "previousPeriodPhoneCalls", null)
    
    inline def setPreviousPeriodPhoneCallsUndefined: Self = StObject.set(x, "previousPeriodPhoneCalls", js.undefined)
    
    inline def setPreviousPeriodTotalCost(value: Double): Self = StObject.set(x, "previousPeriodTotalCost", value.asInstanceOf[js.Any])
    
    inline def setPreviousPeriodTotalCostNull: Self = StObject.set(x, "previousPeriodTotalCost", null)
    
    inline def setPreviousPeriodTotalCostUndefined: Self = StObject.set(x, "previousPeriodTotalCost", js.undefined)
    
    inline def setTotalReview(value: Double): Self = StObject.set(x, "totalReview", value.asInstanceOf[js.Any])
    
    inline def setTotalReviewNull: Self = StObject.set(x, "totalReview", null)
    
    inline def setTotalReviewUndefined: Self = StObject.set(x, "totalReview", js.undefined)
  }
}
