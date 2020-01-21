package typings.jsonfile

import typings.jsonfile.mod.FS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncoding extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
  var fs: js.UndefOr[FS] = js.undefined
  var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, _]] = js.undefined
  var throws: js.UndefOr[Boolean] = js.undefined
}

object AnonEncoding {
  @scala.inline
  def apply(
    encoding: String = null,
    flag: String = null,
    fs: FS = null,
    reviver: (/* key */ js.Any, /* value */ js.Any) => _ = null,
    throws: js.UndefOr[Boolean] = js.undefined
  ): AnonEncoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (reviver != null) __obj.updateDynamic("reviver")(js.Any.fromFunction2(reviver))
    if (!js.isUndefined(throws)) __obj.updateDynamic("throws")(throws.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncoding]
  }
}

