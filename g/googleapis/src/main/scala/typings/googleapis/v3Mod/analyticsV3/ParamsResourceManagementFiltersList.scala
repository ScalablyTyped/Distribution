package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceManagementFiltersList extends StandardParameters {
  /**
    * Account ID to retrieve filters for.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of filters to include in this response.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  /**
    * An index of the first entity to retrieve. Use this parameter as a
    * pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.native
}

object ParamsResourceManagementFiltersList {
  @scala.inline
  def apply(): ParamsResourceManagementFiltersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementFiltersList]
  }
  @scala.inline
  implicit class ParamsResourceManagementFiltersListOps[Self <: ParamsResourceManagementFiltersList] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def `setMax-results`(value: Double): Self = this.set("max-results", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-results`: Self = this.set("max-results", js.undefined)
    @scala.inline
    def `setStart-index`(value: Double): Self = this.set("start-index", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStart-index`: Self = this.set("start-index", js.undefined)
  }
  
}

