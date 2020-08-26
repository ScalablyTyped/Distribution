package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * GTM BuiltInVariable's API relative path. Example:
    * accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/built_in_variables
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The types of built-in variables to delete.
    */
  var `type`: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete {
  @scala.inline
  def apply(): ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete]
  }
  @scala.inline
  implicit class ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDeleteOps[Self <: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

