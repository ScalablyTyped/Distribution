package typings.googleapis.v31Mod.dfareportingV31

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCreativesList extends StandardParameters {
  /**
    * Select only active creatives. Leave blank to select active and inactive
    * creatives.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Select only creatives with this advertiser ID.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Select only archived creatives. Leave blank to select archived and
    * unarchived creatives.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only creatives with this campaign ID.
    */
  var campaignId: js.UndefOr[String] = js.native
  /**
    * Select only in-stream video creatives with these companion IDs.
    */
  var companionCreativeIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only creatives with these creative field IDs.
    */
  var creativeFieldIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only creatives with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Select only creatives with these rendering IDs.
    */
  var renderingIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allows searching for objects by name or ID. Wildcards (*) are allowed.
    * For example, "creative*2015" will return objects with names like
    * "creative June 2015", "creative April 2015", or simply "creative 2015".
    * Most of the searches also add wildcards implicitly at the start and the
    * end of the search string. For example, a search string of "creative" will
    * match objects with name "my creative", "creative 2015", or simply
    * "creative".
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Select only creatives with these size IDs.
    */
  var sizeIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.native
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * Select only creatives corresponding to this Studio creative ID.
    */
  var studioCreativeId: js.UndefOr[String] = js.native
  /**
    * Select only creatives with these creative types.
    */
  var types: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceCreativesList {
  @scala.inline
  def apply(): ParamsResourceCreativesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativesList]
  }
  @scala.inline
  implicit class ParamsResourceCreativesListOps[Self <: ParamsResourceCreativesList] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    @scala.inline
    def setCompanionCreativeIdsVarargs(value: String*): Self = this.set("companionCreativeIds", js.Array(value :_*))
    @scala.inline
    def setCompanionCreativeIds(value: js.Array[String]): Self = this.set("companionCreativeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanionCreativeIds: Self = this.set("companionCreativeIds", js.undefined)
    @scala.inline
    def setCreativeFieldIdsVarargs(value: String*): Self = this.set("creativeFieldIds", js.Array(value :_*))
    @scala.inline
    def setCreativeFieldIds(value: js.Array[String]): Self = this.set("creativeFieldIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeFieldIds: Self = this.set("creativeFieldIds", js.undefined)
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
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setRenderingIdsVarargs(value: String*): Self = this.set("renderingIds", js.Array(value :_*))
    @scala.inline
    def setRenderingIds(value: js.Array[String]): Self = this.set("renderingIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderingIds: Self = this.set("renderingIds", js.undefined)
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    @scala.inline
    def setSizeIdsVarargs(value: String*): Self = this.set("sizeIds", js.Array(value :_*))
    @scala.inline
    def setSizeIds(value: js.Array[String]): Self = this.set("sizeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeIds: Self = this.set("sizeIds", js.undefined)
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setStudioCreativeId(value: String): Self = this.set("studioCreativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStudioCreativeId: Self = this.set("studioCreativeId", js.undefined)
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

