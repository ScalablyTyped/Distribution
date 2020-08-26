package typings.googleapis.iamV1Mod.iamV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsServiceaccountsKeysList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Filters the types of keys the user wants to include in the list response.
    * Duplicate key types are not allowed. If no key type is provided, all keys
    * are returned.
    */
  var keyTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The resource name of the service account in the following format:
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.  Using `-` as a
    * wildcard for the `PROJECT_ID`, will infer the project from the account.
    * The `ACCOUNT` value can be the `email` address or the `unique_id` of the
    * service account.
    */
  var name: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsServiceaccountsKeysList {
  @scala.inline
  def apply(): ParamsResourceProjectsServiceaccountsKeysList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsServiceaccountsKeysList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsServiceaccountsKeysListOps[Self <: ParamsResourceProjectsServiceaccountsKeysList] (val x: Self) extends AnyVal {
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
    def setKeyTypesVarargs(value: String*): Self = this.set("keyTypes", js.Array(value :_*))
    @scala.inline
    def setKeyTypes(value: js.Array[String]): Self = this.set("keyTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyTypes: Self = this.set("keyTypes", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

