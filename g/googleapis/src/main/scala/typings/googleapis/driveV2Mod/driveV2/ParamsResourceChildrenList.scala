package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceChildrenList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the folder.
    */
  var folderId: js.UndefOr[String] = js.native
  /**
    * Maximum number of children to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * A comma-separated list of sort keys. Valid keys are 'createdDate',
    * 'folder', 'lastViewedByMeDate', 'modifiedByMeDate', 'modifiedDate',
    * 'quotaBytesUsed', 'recency', 'sharedWithMeDate', 'starred', and 'title'.
    * Each key sorts ascending by default, but may be reversed with the 'desc'
    * modifier. Example usage: ?orderBy=folder,modifiedDate desc,title. Please
    * note that there is a current limitation for users with approximately one
    * million files in which the requested sort order is ignored.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Page token for children.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Query string for searching children.
    */
  var q: js.UndefOr[String] = js.native
}

object ParamsResourceChildrenList {
  @scala.inline
  def apply(): ParamsResourceChildrenList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChildrenList]
  }
  @scala.inline
  implicit class ParamsResourceChildrenListOps[Self <: ParamsResourceChildrenList] (val x: Self) extends AnyVal {
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
    def setFolderId(value: String): Self = this.set("folderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolderId: Self = this.set("folderId", js.undefined)
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
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
  }
  
}

