package typings
package jsrpLib.jsrpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var length: js.UndefOr[jsrpLib.jsrpLibNumbers.`2048` | jsrpLib.jsrpLibNumbers.`4096`] = js.undefined
  var password: java.lang.String
  var username: java.lang.String
}

object ClientOptions {
  @scala.inline
  def apply(
    password: java.lang.String,
    username: java.lang.String,
    length: jsrpLib.jsrpLibNumbers.`2048` | jsrpLib.jsrpLibNumbers.`4096` = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("username")(username)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

