package typings.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyParameters extends BasicParameters {
  var x5c: js.UndefOr[js.Array[String]] = js.undefined
  var x5t: js.UndefOr[String] = js.undefined
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.undefined
}

object KeyParameters {
  @scala.inline
  def apply(
    alg: String = null,
    key_ops: js.Array[keyOperation] = null,
    kid: String = null,
    use: use = null,
    x5c: js.Array[String] = null,
    x5t: String = null,
    x5tNumbersignS256: String = null
  ): KeyParameters = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops.asInstanceOf[js.Any])
    if (kid != null) __obj.updateDynamic("kid")(kid.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    if (x5c != null) __obj.updateDynamic("x5c")(x5c.asInstanceOf[js.Any])
    if (x5t != null) __obj.updateDynamic("x5t")(x5t.asInstanceOf[js.Any])
    if (x5tNumbersignS256 != null) __obj.updateDynamic("x5t#S256")(x5tNumbersignS256.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyParameters]
  }
}

