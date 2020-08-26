package typings.googleapis.mirrorV1Mod.mirrorV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTimelineList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If provided, only items with the given bundleId will be returned.
    */
  var bundleId: js.UndefOr[String] = js.native
  /**
    * If true, tombstone records for deleted items will be returned.
    */
  var includeDeleted: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of items to include in the response, used for paging.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Controls the order in which timeline items are returned.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Token for the page of results to return.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * If true, only pinned items will be returned.
    */
  var pinnedOnly: js.UndefOr[Boolean] = js.native
  /**
    * If provided, only items with the given sourceItemId will be returned.
    */
  var sourceItemId: js.UndefOr[String] = js.native
}

object ParamsResourceTimelineList {
  @scala.inline
  def apply(): ParamsResourceTimelineList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTimelineList]
  }
  @scala.inline
  implicit class ParamsResourceTimelineListOps[Self <: ParamsResourceTimelineList] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    @scala.inline
    def setIncludeDeleted(value: Boolean): Self = this.set("includeDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDeleted: Self = this.set("includeDeleted", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPinnedOnly(value: Boolean): Self = this.set("pinnedOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinnedOnly: Self = this.set("pinnedOnly", js.undefined)
    @scala.inline
    def setSourceItemId(value: String): Self = this.set("sourceItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceItemId: Self = this.set("sourceItemId", js.undefined)
  }
  
}

