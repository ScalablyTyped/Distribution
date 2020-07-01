package typings.googleapis.v21Mod.contentV21

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
  def apply(
    admin: js.UndefOr[Boolean] = js.undefined,
    emailAddress: String = null,
    orderManager: js.UndefOr[Boolean] = js.undefined,
    paymentsAnalyst: js.UndefOr[Boolean] = js.undefined,
    paymentsManager: js.UndefOr[Boolean] = js.undefined
  ): SchemaAccountUser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(admin)) __obj.updateDynamic("admin")(admin.get.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(orderManager)) __obj.updateDynamic("orderManager")(orderManager.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paymentsAnalyst)) __obj.updateDynamic("paymentsAnalyst")(paymentsAnalyst.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paymentsManager)) __obj.updateDynamic("paymentsManager")(paymentsManager.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountUser]
  }
}

