package typings
package jwsLib.jwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  var encoding: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable] = js.undefined
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
    encoding: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable = null,
    key: js.Any = null,
    payload: js.Any = null,
    privateKey: js.Any = null,
    secret: js.Any = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("header")(header)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[SignOptions]
  }
}

