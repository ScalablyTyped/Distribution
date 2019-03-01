package typings
package levelDashCodecLib.levelDashCodecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodecOptions extends js.Object {
  var keyEncoding: js.UndefOr[java.lang.String | CodecEncoder] = js.undefined
  var valueEncoding: js.UndefOr[java.lang.String | CodecEncoder] = js.undefined
}

object CodecOptions {
  @scala.inline
  def apply(
    keyEncoding: java.lang.String | CodecEncoder = null,
    valueEncoding: java.lang.String | CodecEncoder = null
  ): CodecOptions = {
    val __obj = js.Dynamic.literal()
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (valueEncoding != null) __obj.updateDynamic("valueEncoding")(valueEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodecOptions]
  }
}

