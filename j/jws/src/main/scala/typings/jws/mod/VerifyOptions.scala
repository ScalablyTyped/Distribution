package typings.jws.mod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  var algorithm: js.UndefOr[Algorithm | Buffer | Readable] = js.undefined
  var encoding: js.UndefOr[String | Buffer | Readable] = js.undefined
  var key: js.UndefOr[String | Readable | Buffer] = js.undefined
  var publicKey: js.UndefOr[String | Readable | Buffer] = js.undefined
  var secret: js.UndefOr[String | Readable | Buffer] = js.undefined
  var signature: js.UndefOr[String | Buffer | Readable] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply(
    algorithm: Algorithm | Buffer | Readable = null,
    encoding: String | Buffer | Readable = null,
    key: String | Readable | Buffer = null,
    publicKey: String | Readable | Buffer = null,
    secret: String | Readable | Buffer = null,
    signature: String | Buffer | Readable = null
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

