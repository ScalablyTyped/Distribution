package typings.googleapis.localservicesV1Mod.localservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAdsHomeservicesLocalservicesV1DetailedLeadReport extends StObject {
  
  /**
    * Identifies account that received the lead.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Aggregator specific information related to the lead.
    */
  var aggregatorInfo: js.UndefOr[SchemaGoogleAdsHomeservicesLocalservicesV1AggregatorInfo] = js.undefined
  
  /**
    * More information associated to only booking leads.
    */
  var bookingLead: js.UndefOr[SchemaGoogleAdsHomeservicesLocalservicesV1BookingLead] = js.undefined
  
  /**
    * Business name associated to the account.
    */
  var businessName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the lead has been charged.
    */
  var chargeStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Currency code.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dispute status related to the lead.
    */
  var disputeStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Location of the associated account's home city.
    */
  var geo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Lead category (e.g. hvac, plumber)
    */
  var leadCategory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp of when the lead was created.
    */
  var leadCreationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier of a Detailed Lead Report.
    */
  var leadId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Price of the lead (available only after it has been charged).
    */
  var leadPrice: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Lead type.
    */
  var leadType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * More information associated to only message leads.
    */
  var messageLead: js.UndefOr[SchemaGoogleAdsHomeservicesLocalservicesV1MessageLead] = js.undefined
  
  /**
    * More information associated to only phone leads.
    */
  var phoneLead: js.UndefOr[SchemaGoogleAdsHomeservicesLocalservicesV1PhoneLead] = js.undefined
  
  /**
    * Timezone of the particular provider associated to a lead.
    */
  var timezone: js.UndefOr[SchemaGoogleTypeTimeZone] = js.undefined
}
object SchemaGoogleAdsHomeservicesLocalservicesV1DetailedLeadReport {
  
  inline def apply(): SchemaGoogleAdsHomeservicesLocalservicesV1DetailedLeadReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAdsHomeservicesLocalservicesV1DetailedLeadReport]
  }
  
  extension [Self <: SchemaGoogleAdsHomeservicesLocalservicesV1DetailedLeadReport](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAggregatorInfo(value: SchemaGoogleAdsHomeservicesLocalservicesV1AggregatorInfo): Self = StObject.set(x, "aggregatorInfo", value.asInstanceOf[js.Any])
    
    inline def setAggregatorInfoUndefined: Self = StObject.set(x, "aggregatorInfo", js.undefined)
    
    inline def setBookingLead(value: SchemaGoogleAdsHomeservicesLocalservicesV1BookingLead): Self = StObject.set(x, "bookingLead", value.asInstanceOf[js.Any])
    
    inline def setBookingLeadUndefined: Self = StObject.set(x, "bookingLead", js.undefined)
    
    inline def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
    
    inline def setBusinessNameNull: Self = StObject.set(x, "businessName", null)
    
    inline def setBusinessNameUndefined: Self = StObject.set(x, "businessName", js.undefined)
    
    inline def setChargeStatus(value: String): Self = StObject.set(x, "chargeStatus", value.asInstanceOf[js.Any])
    
    inline def setChargeStatusNull: Self = StObject.set(x, "chargeStatus", null)
    
    inline def setChargeStatusUndefined: Self = StObject.set(x, "chargeStatus", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setDisputeStatus(value: String): Self = StObject.set(x, "disputeStatus", value.asInstanceOf[js.Any])
    
    inline def setDisputeStatusNull: Self = StObject.set(x, "disputeStatus", null)
    
    inline def setDisputeStatusUndefined: Self = StObject.set(x, "disputeStatus", js.undefined)
    
    inline def setGeo(value: String): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    inline def setGeoNull: Self = StObject.set(x, "geo", null)
    
    inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
    
    inline def setLeadCategory(value: String): Self = StObject.set(x, "leadCategory", value.asInstanceOf[js.Any])
    
    inline def setLeadCategoryNull: Self = StObject.set(x, "leadCategory", null)
    
    inline def setLeadCategoryUndefined: Self = StObject.set(x, "leadCategory", js.undefined)
    
    inline def setLeadCreationTimestamp(value: String): Self = StObject.set(x, "leadCreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLeadCreationTimestampNull: Self = StObject.set(x, "leadCreationTimestamp", null)
    
    inline def setLeadCreationTimestampUndefined: Self = StObject.set(x, "leadCreationTimestamp", js.undefined)
    
    inline def setLeadId(value: String): Self = StObject.set(x, "leadId", value.asInstanceOf[js.Any])
    
    inline def setLeadIdNull: Self = StObject.set(x, "leadId", null)
    
    inline def setLeadIdUndefined: Self = StObject.set(x, "leadId", js.undefined)
    
    inline def setLeadPrice(value: Double): Self = StObject.set(x, "leadPrice", value.asInstanceOf[js.Any])
    
    inline def setLeadPriceNull: Self = StObject.set(x, "leadPrice", null)
    
    inline def setLeadPriceUndefined: Self = StObject.set(x, "leadPrice", js.undefined)
    
    inline def setLeadType(value: String): Self = StObject.set(x, "leadType", value.asInstanceOf[js.Any])
    
    inline def setLeadTypeNull: Self = StObject.set(x, "leadType", null)
    
    inline def setLeadTypeUndefined: Self = StObject.set(x, "leadType", js.undefined)
    
    inline def setMessageLead(value: SchemaGoogleAdsHomeservicesLocalservicesV1MessageLead): Self = StObject.set(x, "messageLead", value.asInstanceOf[js.Any])
    
    inline def setMessageLeadUndefined: Self = StObject.set(x, "messageLead", js.undefined)
    
    inline def setPhoneLead(value: SchemaGoogleAdsHomeservicesLocalservicesV1PhoneLead): Self = StObject.set(x, "phoneLead", value.asInstanceOf[js.Any])
    
    inline def setPhoneLeadUndefined: Self = StObject.set(x, "phoneLead", js.undefined)
    
    inline def setTimezone(value: SchemaGoogleTypeTimeZone): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
