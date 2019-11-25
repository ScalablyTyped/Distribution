package typings.mailgunDashJs.mailgunDashJsMod.validation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptionsPrivate extends js.Object {
  var mailbox_verification: js.UndefOr[Boolean] = js.undefined
}

object ValidationOptionsPrivate {
  @scala.inline
  def apply(mailbox_verification: js.UndefOr[Boolean] = js.undefined): ValidationOptionsPrivate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mailbox_verification)) __obj.updateDynamic("mailbox_verification")(mailbox_verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptionsPrivate]
  }
}

