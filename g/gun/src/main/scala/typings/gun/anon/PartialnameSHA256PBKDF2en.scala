package typings.gun.anon

import typings.gun.gunStrings.PBKDF2
import typings.gun.gunStrings.`SHA-256`
import typings.gun.gunStrings.base16
import typings.gun.gunStrings.base32
import typings.gun.gunStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  name  :'SHA-256' | 'PBKDF2',   encode  :'base64' | 'base32' | 'base16',   iterations  :number,   salt  :any,   hash  :string,   length  :any}> */
trait PartialnameSHA256PBKDF2en extends js.Object {
  var encode: js.UndefOr[base64 | base32 | base16] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
  var length: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[`SHA-256` | PBKDF2] = js.undefined
  var salt: js.UndefOr[js.Any] = js.undefined
}

object PartialnameSHA256PBKDF2en {
  @scala.inline
  def apply(
    encode: base64 | base32 | base16 = null,
    hash: String = null,
    iterations: js.UndefOr[Double] = js.undefined,
    length: js.Any = null,
    name: `SHA-256` | PBKDF2 = null,
    salt: js.Any = null
  ): PartialnameSHA256PBKDF2en = {
    val __obj = js.Dynamic.literal()
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialnameSHA256PBKDF2en]
  }
}

