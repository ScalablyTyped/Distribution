package typings
package jwsLib.jwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  var algorithm: js.UndefOr[Algorithm | nodeLib.Buffer | nodeLib.streamMod.Readable] = js.undefined
  var encoding: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable] = js.undefined
  var key: js.UndefOr[java.lang.String | nodeLib.streamMod.Readable | nodeLib.Buffer] = js.undefined
  var publicKey: js.UndefOr[java.lang.String | nodeLib.streamMod.Readable | nodeLib.Buffer] = js.undefined
  var secret: js.UndefOr[java.lang.String | nodeLib.streamMod.Readable | nodeLib.Buffer] = js.undefined
  var signature: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply(
    algorithm: Algorithm | nodeLib.Buffer | nodeLib.streamMod.Readable = null,
    encoding: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable = null,
    key: java.lang.String | nodeLib.streamMod.Readable | nodeLib.Buffer = null,
    publicKey: java.lang.String | nodeLib.streamMod.Readable | nodeLib.Buffer = null,
    secret: java.lang.String | nodeLib.streamMod.Readable | nodeLib.Buffer = null,
    signature: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable = null
  ): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions]
  }
}

