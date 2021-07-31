package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Project extends StObject {
  
  /** Account ID of this project. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Advertiser ID of this project. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Audience age group of this project. */
  var audienceAgeGroup: js.UndefOr[String] = js.undefined
  
  /** Audience gender of this project. */
  var audienceGender: js.UndefOr[String] = js.undefined
  
  /**
    * Budget of this project in the currency specified by the current account. The value stored in this field represents only the non-fractional amount. For example, for USD, the smallest
    * value that can be represented by this field is 1 US dollar.
    */
  var budget: js.UndefOr[String] = js.undefined
  
  /** Client billing code of this project. */
  var clientBillingCode: js.UndefOr[String] = js.undefined
  
  /** Name of the project client. */
  var clientName: js.UndefOr[String] = js.undefined
  
  var endDate: js.UndefOr[String] = js.undefined
  
  /** ID of this project. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#project". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Information about the most recent modification of this project. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  
  /** Name of this project. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Overview of this project. */
  var overview: js.UndefOr[String] = js.undefined
  
  var startDate: js.UndefOr[String] = js.undefined
  
  /** Subaccount ID of this project. */
  var subaccountId: js.UndefOr[String] = js.undefined
  
  /** Number of clicks that the advertiser is targeting. */
  var targetClicks: js.UndefOr[String] = js.undefined
  
  /** Number of conversions that the advertiser is targeting. */
  var targetConversions: js.UndefOr[String] = js.undefined
  
  /** CPA that the advertiser is targeting. */
  var targetCpaNanos: js.UndefOr[String] = js.undefined
  
  /** CPC that the advertiser is targeting. */
  var targetCpcNanos: js.UndefOr[String] = js.undefined
  
  /** vCPM from Active View that the advertiser is targeting. */
  var targetCpmActiveViewNanos: js.UndefOr[String] = js.undefined
  
  /** CPM that the advertiser is targeting. */
  var targetCpmNanos: js.UndefOr[String] = js.undefined
  
  /** Number of impressions that the advertiser is targeting. */
  var targetImpressions: js.UndefOr[String] = js.undefined
}
object Project {
  
  @scala.inline
  def apply(): Project = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Project]
  }
  
  @scala.inline
  implicit class ProjectMutableBuilder[Self <: Project] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setAudienceAgeGroup(value: String): Self = StObject.set(x, "audienceAgeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceAgeGroupUndefined: Self = StObject.set(x, "audienceAgeGroup", js.undefined)
    
    @scala.inline
    def setAudienceGender(value: String): Self = StObject.set(x, "audienceGender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceGenderUndefined: Self = StObject.set(x, "audienceGender", js.undefined)
    
    @scala.inline
    def setBudget(value: String): Self = StObject.set(x, "budget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetUndefined: Self = StObject.set(x, "budget", js.undefined)
    
    @scala.inline
    def setClientBillingCode(value: String): Self = StObject.set(x, "clientBillingCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientBillingCodeUndefined: Self = StObject.set(x, "clientBillingCode", js.undefined)
    
    @scala.inline
    def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: LastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedInfoUndefined: Self = StObject.set(x, "lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    @scala.inline
    def setTargetClicks(value: String): Self = StObject.set(x, "targetClicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetClicksUndefined: Self = StObject.set(x, "targetClicks", js.undefined)
    
    @scala.inline
    def setTargetConversions(value: String): Self = StObject.set(x, "targetConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetConversionsUndefined: Self = StObject.set(x, "targetConversions", js.undefined)
    
    @scala.inline
    def setTargetCpaNanos(value: String): Self = StObject.set(x, "targetCpaNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCpaNanosUndefined: Self = StObject.set(x, "targetCpaNanos", js.undefined)
    
    @scala.inline
    def setTargetCpcNanos(value: String): Self = StObject.set(x, "targetCpcNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCpcNanosUndefined: Self = StObject.set(x, "targetCpcNanos", js.undefined)
    
    @scala.inline
    def setTargetCpmActiveViewNanos(value: String): Self = StObject.set(x, "targetCpmActiveViewNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCpmActiveViewNanosUndefined: Self = StObject.set(x, "targetCpmActiveViewNanos", js.undefined)
    
    @scala.inline
    def setTargetCpmNanos(value: String): Self = StObject.set(x, "targetCpmNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCpmNanosUndefined: Self = StObject.set(x, "targetCpmNanos", js.undefined)
    
    @scala.inline
    def setTargetImpressions(value: String): Self = StObject.set(x, "targetImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetImpressionsUndefined: Self = StObject.set(x, "targetImpressions", js.undefined)
  }
}
