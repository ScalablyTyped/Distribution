package typings.googleapis.firestoreV1Mod.firestoreV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDatabasesCollectiongroupsIndexesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The filter to apply to list results.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A page token, returned from a previous call to
    * FirestoreAdmin.ListIndexes, that may be used to get the next page of
    * results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * A parent name of the form
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}`
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsDatabasesCollectiongroupsIndexesList {
  @scala.inline
  def apply(): ParamsResourceProjectsDatabasesCollectiongroupsIndexesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesCollectiongroupsIndexesList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsDatabasesCollectiongroupsIndexesListOps[Self <: ParamsResourceProjectsDatabasesCollectiongroupsIndexesList] (val x: Self) extends AnyVal {
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

