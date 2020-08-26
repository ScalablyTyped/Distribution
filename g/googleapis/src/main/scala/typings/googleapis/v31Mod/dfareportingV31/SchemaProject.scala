package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Planning project.
  */
@js.native
trait SchemaProject extends js.Object {
  /**
    * Account ID of this project.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this project.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Audience age group of this project.
    */
  var audienceAgeGroup: js.UndefOr[String] = js.native
  /**
    * Audience gender of this project.
    */
  var audienceGender: js.UndefOr[String] = js.native
  /**
    * Budget of this project in the currency specified by the current account.
    * The value stored in this field represents only the non-fractional amount.
    * For example, for USD, the smallest value that can be represented by this
    * field is 1 US dollar.
    */
  var budget: js.UndefOr[String] = js.native
  /**
    * Client billing code of this project.
    */
  var clientBillingCode: js.UndefOr[String] = js.native
  /**
    * Name of the project client.
    */
  var clientName: js.UndefOr[String] = js.native
  /**
    * End date of the project.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * ID of this project. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#project&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information about the most recent modification of this project.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Name of this project.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Overview of this project.
    */
  var overview: js.UndefOr[String] = js.native
  /**
    * Start date of the project.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this project.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Number of clicks that the advertiser is targeting.
    */
  var targetClicks: js.UndefOr[String] = js.native
  /**
    * Number of conversions that the advertiser is targeting.
    */
  var targetConversions: js.UndefOr[String] = js.native
  /**
    * CPA that the advertiser is targeting.
    */
  var targetCpaNanos: js.UndefOr[String] = js.native
  /**
    * CPC that the advertiser is targeting.
    */
  var targetCpcNanos: js.UndefOr[String] = js.native
  /**
    * vCPM from Active View that the advertiser is targeting.
    */
  var targetCpmActiveViewNanos: js.UndefOr[String] = js.native
  /**
    * CPM that the advertiser is targeting.
    */
  var targetCpmNanos: js.UndefOr[String] = js.native
  /**
    * Number of impressions that the advertiser is targeting.
    */
  var targetImpressions: js.UndefOr[String] = js.native
}

object SchemaProject {
  @scala.inline
  def apply(): SchemaProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProject]
  }
  @scala.inline
  implicit class SchemaProjectOps[Self <: SchemaProject] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    @scala.inline
    def setAudienceAgeGroup(value: String): Self = this.set("audienceAgeGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudienceAgeGroup: Self = this.set("audienceAgeGroup", js.undefined)
    @scala.inline
    def setAudienceGender(value: String): Self = this.set("audienceGender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudienceGender: Self = this.set("audienceGender", js.undefined)
    @scala.inline
    def setBudget(value: String): Self = this.set("budget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBudget: Self = this.set("budget", js.undefined)
    @scala.inline
    def setClientBillingCode(value: String): Self = this.set("clientBillingCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientBillingCode: Self = this.set("clientBillingCode", js.undefined)
    @scala.inline
    def setClientName(value: String): Self = this.set("clientName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientName: Self = this.set("clientName", js.undefined)
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOverview(value: String): Self = this.set("overview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    @scala.inline
    def setTargetClicks(value: String): Self = this.set("targetClicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetClicks: Self = this.set("targetClicks", js.undefined)
    @scala.inline
    def setTargetConversions(value: String): Self = this.set("targetConversions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetConversions: Self = this.set("targetConversions", js.undefined)
    @scala.inline
    def setTargetCpaNanos(value: String): Self = this.set("targetCpaNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCpaNanos: Self = this.set("targetCpaNanos", js.undefined)
    @scala.inline
    def setTargetCpcNanos(value: String): Self = this.set("targetCpcNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCpcNanos: Self = this.set("targetCpcNanos", js.undefined)
    @scala.inline
    def setTargetCpmActiveViewNanos(value: String): Self = this.set("targetCpmActiveViewNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCpmActiveViewNanos: Self = this.set("targetCpmActiveViewNanos", js.undefined)
    @scala.inline
    def setTargetCpmNanos(value: String): Self = this.set("targetCpmNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCpmNanos: Self = this.set("targetCpmNanos", js.undefined)
    @scala.inline
    def setTargetImpressions(value: String): Self = this.set("targetImpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetImpressions: Self = this.set("targetImpressions", js.undefined)
  }
  
}

