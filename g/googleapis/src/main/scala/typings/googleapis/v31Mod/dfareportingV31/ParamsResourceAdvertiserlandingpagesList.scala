package typings.googleapis.v31Mod.dfareportingV31

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAdvertiserlandingpagesList extends StandardParameters {
  /**
    * Select only landing pages that belong to these advertisers.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only archived landing pages. Don't set this field to select both
    * archived and non-archived landing pages.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only landing pages with these IDs.
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
    * Allows searching for landing pages by name or ID. Wildcards (*) are
    * allowed. For example, "landingpage*2017" will return landing pages with
    * names like "landingpage July 2017", "landingpage March 2017", or simply
    * "landingpage 2017". Most of the searches also add wildcards implicitly at
    * the start and the end of the search string. For example, a search string
    * of "landingpage" will match campaigns with name "my landingpage",
    * "landingpage 2015", or simply "landingpage".
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
    * Select only landing pages that belong to this subaccount.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object ParamsResourceAdvertiserlandingpagesList {
  @scala.inline
  def apply(): ParamsResourceAdvertiserlandingpagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertiserlandingpagesList]
  }
  @scala.inline
  implicit class ParamsResourceAdvertiserlandingpagesListOps[Self <: ParamsResourceAdvertiserlandingpagesList] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
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

