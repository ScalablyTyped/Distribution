package typings.jws.jwsMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  var encoding: js.UndefOr[String | Buffer | Readable] = js.undefined
  var header: Header
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var key: js.UndefOr[js.Any] = js.undefined
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var payload: js.UndefOr[js.Any] = js.undefined
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var privateKey: js.UndefOr[js.Any] = js.undefined
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var secret: js.UndefOr[js.Any] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    header: Header,
    encoding: String | Buffer | Readable = null,
    key: js.Any = null,
    payload: js.Any = null,
    privateKey: js.Any = null,
    secret: js.Any = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptions]
  }
}

