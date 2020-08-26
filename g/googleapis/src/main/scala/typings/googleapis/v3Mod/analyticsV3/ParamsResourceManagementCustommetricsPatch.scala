package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceManagementCustommetricsPatch extends StandardParameters {
  /**
    * Account ID for the custom metric to update.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Custom metric ID for the custom metric to update.
    */
  var customMetricId: js.UndefOr[String] = js.native
  /**
    * Force the update and ignore any warnings related to the custom metric
    * being linked to a custom data source / data set.
    */
  var ignoreCustomDataSourceLinks: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCustomMetric] = js.native
  /**
    * Web property ID for the custom metric to update.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object ParamsResourceManagementCustommetricsPatch {
  @scala.inline
  def apply(): ParamsResourceManagementCustommetricsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementCustommetricsPatch]
  }
  @scala.inline
  implicit class ParamsResourceManagementCustommetricsPatchOps[Self <: ParamsResourceManagementCustommetricsPatch] (val x: Self) extends AnyVal {
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
    def setCustomMetricId(value: String): Self = this.set("customMetricId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMetricId: Self = this.set("customMetricId", js.undefined)
    @scala.inline
    def setIgnoreCustomDataSourceLinks(value: Boolean): Self = this.set("ignoreCustomDataSourceLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCustomDataSourceLinks: Self = this.set("ignoreCustomDataSourceLinks", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaCustomMetric): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
  
}

