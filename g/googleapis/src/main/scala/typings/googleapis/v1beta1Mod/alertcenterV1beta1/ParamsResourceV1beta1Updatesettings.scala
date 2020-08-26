package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceV1beta1Updatesettings extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. The unique identifier of the G Suite organization account of
    * the customer the alert settings are associated with. Inferred from the
    * caller identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSettings] = js.native
}

object ParamsResourceV1beta1Updatesettings {
  @scala.inline
  def apply(): ParamsResourceV1beta1Updatesettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1beta1Updatesettings]
  }
  @scala.inline
  implicit class ParamsResourceV1beta1UpdatesettingsOps[Self <: ParamsResourceV1beta1Updatesettings] (val x: Self) extends AnyVal {
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
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaSettings): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

