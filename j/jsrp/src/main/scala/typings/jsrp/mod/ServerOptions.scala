package typings.jsrp.mod

import typings.jsrp.jsrpNumbers.`2048`
import typings.jsrp.jsrpNumbers.`4096`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var length: js.UndefOr[`2048` | `4096`] = js.undefined
  var salt: String
  var verifier: String
}

object ServerOptions {
  @scala.inline
  def apply(salt: String, verifier: String, length: `2048` | `4096` = null): ServerOptions = {
    val __obj = js.Dynamic.literal(salt = salt.asInstanceOf[js.Any], verifier = verifier.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

