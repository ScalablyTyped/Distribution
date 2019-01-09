package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateResponse extends js.Object {
  var address: java.lang.String
  var did_you_mean: java.lang.String | scala.Null
  var is_disposable_address: scala.Boolean
  var is_role_address: scala.Boolean
  var is_valid: scala.Boolean
  var mailbox_verification: mailgunDashJsLib.mailgunDashJsLibStrings.`true` | mailgunDashJsLib.mailgunDashJsLibStrings.`false` | mailgunDashJsLib.mailgunDashJsLibStrings.unknown | scala.Null
  var parts: mailgunDashJsLib.Anon_Displayname
}

