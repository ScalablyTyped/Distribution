package typings
package mailgunDashJsLib.mailgunDashJsMod.validationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptionsPublic extends js.Object {
  var api_key: js.UndefOr[java.lang.String] = js.undefined
  var mailbox_verification: js.UndefOr[
    scala.Boolean | mailgunDashJsLib.mailgunDashJsLibStrings.`true` | mailgunDashJsLib.mailgunDashJsLibStrings.`false`
  ] = js.undefined
}

object ValidationOptionsPublic {
  @scala.inline
  def apply(
    api_key: java.lang.String = null,
    mailbox_verification: scala.Boolean | mailgunDashJsLib.mailgunDashJsLibStrings.`true` | mailgunDashJsLib.mailgunDashJsLibStrings.`false` = null
  ): ValidationOptionsPublic = {
    val __obj = js.Dynamic.literal()
    if (api_key != null) __obj.updateDynamic("api_key")(api_key)
    if (mailbox_verification != null) __obj.updateDynamic("mailbox_verification")(mailbox_verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptionsPublic]
  }
}

