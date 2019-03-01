package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptionsPrivate extends js.Object {
  var mailbox_verification: js.UndefOr[
    scala.Boolean | mailgunDashJsLib.mailgunDashJsLibStrings.`true` | mailgunDashJsLib.mailgunDashJsLibStrings.`false`
  ] = js.undefined
}

object ValidationOptionsPrivate {
  @scala.inline
  def apply(
    mailbox_verification: scala.Boolean | mailgunDashJsLib.mailgunDashJsLibStrings.`true` | mailgunDashJsLib.mailgunDashJsLibStrings.`false` = null
  ): ValidationOptionsPrivate = {
    val __obj = js.Dynamic.literal()
    if (mailbox_verification != null) __obj.updateDynamic("mailbox_verification")(mailbox_verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptionsPrivate]
  }
}

