package typings.googleapis.v32Mod.dfareportingV32

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCampaignsList extends StandardParameters {
  /**
    * Select only campaigns whose advertisers belong to these advertiser
    * groups.
    */
  var advertiserGroupIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only campaigns that belong to these advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only archived campaigns. Don't set this field to select both
    * archived and non-archived campaigns.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Select only campaigns that have at least one optimization activity.
    */
  var atLeastOneOptimizationActivity: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Exclude campaigns with these IDs.
    */
  var excludedIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only campaigns with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Select only campaigns that have overridden this event tag ID.
    */
  var overriddenEventTagId: js.UndefOr[String] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Allows searching for campaigns by name or ID. Wildcards (*) are allowed.
    * For example, "campaign*2015" will return campaigns with names like
    * "campaign June 2015", "campaign April 2015", or simply "campaign 2015".
    * Most of the searches also add wildcards implicitly at the start and the
    * end of the search string. For example, a search string of "campaign" will
    * match campaigns with name "my campaign", "campaign 2015", or simply
    * "campaign".
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * Select only campaigns that belong to this subaccount.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object ParamsResourceCampaignsList {
  @scala.inline
  def apply(): ParamsResourceCampaignsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCampaignsList]
  }
  @scala.inline
  implicit class ParamsResourceCampaignsListOps[Self <: ParamsResourceCampaignsList] (val x: Self) extends AnyVal {
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
    def setAdvertiserGroupIdsVarargs(value: String*): Self = this.set("advertiserGroupIds", js.Array(value :_*))
    @scala.inline
    def setAdvertiserGroupIds(value: js.Array[String]): Self = this.set("advertiserGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserGroupIds: Self = this.set("advertiserGroupIds", js.undefined)
    @scala.inline
    def setAdvertiserIdsVarargs(value: String*): Self = this.set("advertiserIds", js.Array(value :_*))
    @scala.inline
    def setAdvertiserIds(value: js.Array[String]): Self = this.set("advertiserIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserIds: Self = this.set("advertiserIds", js.undefined)
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    @scala.inline
    def setAtLeastOneOptimizationActivity(value: Boolean): Self = this.set("atLeastOneOptimizationActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAtLeastOneOptimizationActivity: Self = this.set("atLeastOneOptimizationActivity", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setExcludedIdsVarargs(value: String*): Self = this.set("excludedIds", js.Array(value :_*))
    @scala.inline
    def setExcludedIds(value: js.Array[String]): Self = this.set("excludedIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedIds: Self = this.set("excludedIds", js.undefined)
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOverriddenEventTagId(value: String): Self = this.set("overriddenEventTagId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverriddenEventTagId: Self = this.set("overriddenEventTagId", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
  }
  
}

