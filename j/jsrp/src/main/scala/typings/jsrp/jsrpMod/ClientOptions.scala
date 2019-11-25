package typings.jsrp.jsrpMod

import typings.jsrp.jsrpNumbers.`2048`
import typings.jsrp.jsrpNumbers.`4096`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var length: js.UndefOr[`2048` | `4096`] = js.undefined
  var password: String
  var username: String
}

object ClientOptions {
  @scala.inline
  def apply(password: String, username: String, length: `2048` | `4096` = null): ClientOptions = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

