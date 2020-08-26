package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceConversionGet extends StandardParameters {
  /**
    * Numeric ID of the ad group.
    */
  var adGroupId: js.UndefOr[String] = js.native
  /**
    * Numeric ID of the ad.
    */
  var adId: js.UndefOr[String] = js.native
  /**
    * Numeric ID of the advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Numeric ID of the agency.
    */
  var agencyId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Numeric ID of the campaign.
    */
  var campaignId: js.UndefOr[String] = js.native
  /**
    * Numeric ID of the criterion.
    */
  var criterionId: js.UndefOr[String] = js.native
  /**
    * Last date (inclusive) on which to retrieve conversions. Format is
    * yyyymmdd.
    */
  var endDate: js.UndefOr[Double] = js.native
  /**
    * Numeric ID of the engine account.
    */
  var engineAccountId: js.UndefOr[String] = js.native
  /**
    * The number of conversions to return per call.
    */
  var rowCount: js.UndefOr[Double] = js.native
  /**
    * First date (inclusive) on which to retrieve conversions. Format is
    * yyyymmdd.
    */
  var startDate: js.UndefOr[Double] = js.native
  /**
    * The 0-based starting index for retrieving conversions results.
    */
  var startRow: js.UndefOr[Double] = js.native
}

object ParamsResourceConversionGet {
  @scala.inline
  def apply(): ParamsResourceConversionGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceConversionGet]
  }
  @scala.inline
  implicit class ParamsResourceConversionGetOps[Self <: ParamsResourceConversionGet] (val x: Self) extends AnyVal {
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
    def setAdGroupId(value: String): Self = this.set("adGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdGroupId: Self = this.set("adGroupId", js.undefined)
    @scala.inline
    def setAdId(value: String): Self = this.set("adId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdId: Self = this.set("adId", js.undefined)
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    @scala.inline
    def setAgencyId(value: String): Self = this.set("agencyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgencyId: Self = this.set("agencyId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    @scala.inline
    def setCriterionId(value: String): Self = this.set("criterionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriterionId: Self = this.set("criterionId", js.undefined)
    @scala.inline
    def setEndDate(value: Double): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setEngineAccountId(value: String): Self = this.set("engineAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineAccountId: Self = this.set("engineAccountId", js.undefined)
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    @scala.inline
    def setStartDate(value: Double): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartRow: Self = this.set("startRow", js.undefined)
  }
  
}

