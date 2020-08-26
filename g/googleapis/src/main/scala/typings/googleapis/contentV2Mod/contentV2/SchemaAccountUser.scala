package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountUser extends js.Object {
  /**
    * Whether user is an admin.
    */
  var admin: js.UndefOr[Boolean] = js.native
  /**
    * User&#39;s email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Whether user is an order manager.
    */
  var orderManager: js.UndefOr[Boolean] = js.native
  /**
    * Whether user can access payment statements.
    */
  var paymentsAnalyst: js.UndefOr[Boolean] = js.native
  /**
    * Whether user can manage payment settings.
    */
  var paymentsManager: js.UndefOr[Boolean] = js.native
}

object SchemaAccountUser {
  @scala.inline
  def apply(): SchemaAccountUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountUser]
  }
  @scala.inline
  implicit class SchemaAccountUserOps[Self <: SchemaAccountUser] (val x: Self) extends AnyVal {
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
    def setAdmin(value: Boolean): Self = this.set("admin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdmin: Self = this.set("admin", js.undefined)
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setOrderManager(value: Boolean): Self = this.set("orderManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderManager: Self = this.set("orderManager", js.undefined)
    @scala.inline
    def setPaymentsAnalyst(value: Boolean): Self = this.set("paymentsAnalyst", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentsAnalyst: Self = this.set("paymentsAnalyst", js.undefined)
    @scala.inline
    def setPaymentsManager(value: Boolean): Self = this.set("paymentsManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentsManager: Self = this.set("paymentsManager", js.undefined)
  }
  
}

