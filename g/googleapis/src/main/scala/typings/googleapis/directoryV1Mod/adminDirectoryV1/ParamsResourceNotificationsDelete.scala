package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceNotificationsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The unique ID for the customer's G Suite account. The customerId is also
    * returned as part of the Users resource.
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * The unique ID of the notification.
    */
  var notificationId: js.UndefOr[String] = js.native
}

object ParamsResourceNotificationsDelete {
  @scala.inline
  def apply(): ParamsResourceNotificationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNotificationsDelete]
  }
  @scala.inline
  implicit class ParamsResourceNotificationsDeleteOps[Self <: ParamsResourceNotificationsDelete] (val x: Self) extends AnyVal {
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
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    @scala.inline
    def setNotificationId(value: String): Self = this.set("notificationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationId: Self = this.set("notificationId", js.undefined)
  }
  
}

