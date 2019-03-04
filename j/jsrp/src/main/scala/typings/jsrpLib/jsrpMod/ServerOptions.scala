package typings
package jsrpLib.jsrpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var length: js.UndefOr[jsrpLib.jsrpLibNumbers.`2048` | jsrpLib.jsrpLibNumbers.`4096`] = js.undefined
  var salt: java.lang.String
  var verifier: java.lang.String
}

object ServerOptions {
  @scala.inline
  def apply(
    salt: java.lang.String,
    verifier: java.lang.String,
    length: jsrpLib.jsrpLibNumbers.`2048` | jsrpLib.jsrpLibNumbers.`4096` = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal(salt = salt, verifier = verifier)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

