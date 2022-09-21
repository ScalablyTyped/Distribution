package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProject extends StObject {
  
  /**
    * Account ID of this project.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Advertiser ID of this project.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Audience age group of this project.
    */
  var audienceAgeGroup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Audience gender of this project.
    */
  var audienceGender: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Budget of this project in the currency specified by the current account. The value stored in this field represents only the non-fractional amount. For example, for USD, the smallest value that can be represented by this field is 1 US dollar.
    */
  var budget: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Client billing code of this project.
    */
  var clientBillingCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the project client.
    */
  var clientName: js.UndefOr[String | Null] = js.undefined
  
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this project. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#project".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about the most recent modification of this project.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * Name of this project.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Overview of this project.
    */
  var overview: js.UndefOr[String | Null] = js.undefined
  
  var startDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subaccount ID of this project.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of clicks that the advertiser is targeting.
    */
  var targetClicks: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of conversions that the advertiser is targeting.
    */
  var targetConversions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * CPA that the advertiser is targeting.
    */
  var targetCpaNanos: js.UndefOr[String | Null] = js.undefined
  
  /**
    * CPC that the advertiser is targeting.
    */
  var targetCpcNanos: js.UndefOr[String | Null] = js.undefined
  
  /**
    * vCPM from Active View that the advertiser is targeting.
    */
  var targetCpmActiveViewNanos: js.UndefOr[String | Null] = js.undefined
  
  /**
    * CPM that the advertiser is targeting.
    */
  var targetCpmNanos: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of impressions that the advertiser is targeting.
    */
  var targetImpressions: js.UndefOr[String | Null] = js.undefined
}
object SchemaProject {
  
  inline def apply(): SchemaProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProject]
  }
  
  extension [Self <: SchemaProject](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAudienceAgeGroup(value: String): Self = StObject.set(x, "audienceAgeGroup", value.asInstanceOf[js.Any])
    
    inline def setAudienceAgeGroupNull: Self = StObject.set(x, "audienceAgeGroup", null)
    
    inline def setAudienceAgeGroupUndefined: Self = StObject.set(x, "audienceAgeGroup", js.undefined)
    
    inline def setAudienceGender(value: String): Self = StObject.set(x, "audienceGender", value.asInstanceOf[js.Any])
    
    inline def setAudienceGenderNull: Self = StObject.set(x, "audienceGender", null)
    
    inline def setAudienceGenderUndefined: Self = StObject.set(x, "audienceGender", js.undefined)
    
    inline def setBudget(value: String): Self = StObject.set(x, "budget", value.asInstanceOf[js.Any])
    
    inline def setBudgetNull: Self = StObject.set(x, "budget", null)
    
    inline def setBudgetUndefined: Self = StObject.set(x, "budget", js.undefined)
    
    inline def setClientBillingCode(value: String): Self = StObject.set(x, "clientBillingCode", value.asInstanceOf[js.Any])
    
    inline def setClientBillingCodeNull: Self = StObject.set(x, "clientBillingCode", null)
    
    inline def setClientBillingCodeUndefined: Self = StObject.set(x, "clientBillingCode", js.undefined)
    
    inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    inline def setClientNameNull: Self = StObject.set(x, "clientName", null)
    
    inline def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedInfoUndefined: Self = StObject.set(x, "lastModifiedInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewNull: Self = StObject.set(x, "overview", null)
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setTargetClicks(value: String): Self = StObject.set(x, "targetClicks", value.asInstanceOf[js.Any])
    
    inline def setTargetClicksNull: Self = StObject.set(x, "targetClicks", null)
    
    inline def setTargetClicksUndefined: Self = StObject.set(x, "targetClicks", js.undefined)
    
    inline def setTargetConversions(value: String): Self = StObject.set(x, "targetConversions", value.asInstanceOf[js.Any])
    
    inline def setTargetConversionsNull: Self = StObject.set(x, "targetConversions", null)
    
    inline def setTargetConversionsUndefined: Self = StObject.set(x, "targetConversions", js.undefined)
    
    inline def setTargetCpaNanos(value: String): Self = StObject.set(x, "targetCpaNanos", value.asInstanceOf[js.Any])
    
    inline def setTargetCpaNanosNull: Self = StObject.set(x, "targetCpaNanos", null)
    
    inline def setTargetCpaNanosUndefined: Self = StObject.set(x, "targetCpaNanos", js.undefined)
    
    inline def setTargetCpcNanos(value: String): Self = StObject.set(x, "targetCpcNanos", value.asInstanceOf[js.Any])
    
    inline def setTargetCpcNanosNull: Self = StObject.set(x, "targetCpcNanos", null)
    
    inline def setTargetCpcNanosUndefined: Self = StObject.set(x, "targetCpcNanos", js.undefined)
    
    inline def setTargetCpmActiveViewNanos(value: String): Self = StObject.set(x, "targetCpmActiveViewNanos", value.asInstanceOf[js.Any])
    
    inline def setTargetCpmActiveViewNanosNull: Self = StObject.set(x, "targetCpmActiveViewNanos", null)
    
    inline def setTargetCpmActiveViewNanosUndefined: Self = StObject.set(x, "targetCpmActiveViewNanos", js.undefined)
    
    inline def setTargetCpmNanos(value: String): Self = StObject.set(x, "targetCpmNanos", value.asInstanceOf[js.Any])
    
    inline def setTargetCpmNanosNull: Self = StObject.set(x, "targetCpmNanos", null)
    
    inline def setTargetCpmNanosUndefined: Self = StObject.set(x, "targetCpmNanos", js.undefined)
    
    inline def setTargetImpressions(value: String): Self = StObject.set(x, "targetImpressions", value.asInstanceOf[js.Any])
    
    inline def setTargetImpressionsNull: Self = StObject.set(x, "targetImpressions", null)
    
    inline def setTargetImpressionsUndefined: Self = StObject.set(x, "targetImpressions", js.undefined)
  }
}
