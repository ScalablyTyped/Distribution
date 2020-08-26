package typings.googleapis.vaultV1Mod.vaultV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMattersSavedqueriesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The matter id of the parent matter for which the saved queries are to be
    * retrieved.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * The maximum number of saved queries to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The pagination token as returned in the previous response. An empty token
    * means start from the beginning.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceMattersSavedqueriesList {
  @scala.inline
  def apply(): ParamsResourceMattersSavedqueriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersSavedqueriesList]
  }
  @scala.inline
  implicit class ParamsResourceMattersSavedqueriesListOps[Self <: ParamsResourceMattersSavedqueriesList] (val x: Self) extends AnyVal {
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
    def setMatterId(value: String): Self = this.set("matterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatterId: Self = this.set("matterId", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

