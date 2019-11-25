package typings.mailgunDashJs.mailgunDashJsMod.validation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptionsPublic extends js.Object {
  var api_key: js.UndefOr[String] = js.undefined
  var mailbox_verification: js.UndefOr[Boolean] = js.undefined
}

object ValidationOptionsPublic {
  @scala.inline
  def apply(api_key: String = null, mailbox_verification: js.UndefOr[Boolean] = js.undefined): ValidationOptionsPublic = {
    val __obj = js.Dynamic.literal()
    if (api_key != null) __obj.updateDynamic("api_key")(api_key.asInstanceOf[js.Any])
    if (!js.isUndefined(mailbox_verification)) __obj.updateDynamic("mailbox_verification")(mailbox_verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptionsPublic]
  }
}

