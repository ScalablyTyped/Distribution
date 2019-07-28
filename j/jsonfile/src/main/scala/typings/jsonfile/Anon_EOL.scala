package typings.jsonfile

import typings.jsonfile.jsonfileMod.FS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EOL extends js.Object {
  var EOL: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String | Null] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
  var fs: js.UndefOr[FS] = js.undefined
  var mode: js.UndefOr[String | Double] = js.undefined
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.undefined
  var spaces: js.UndefOr[String | Double] = js.undefined
}

object Anon_EOL {
  @scala.inline
  def apply(
    EOL: String = null,
    encoding: String = null,
    flag: String = null,
    fs: FS = null,
    mode: String | Double = null,
    replacer: (/* key */ String, /* value */ js.Any) => _ = null,
    spaces: String | Double = null
  ): Anon_EOL = {
    val __obj = js.Dynamic.literal()
    if (EOL != null) __obj.updateDynamic("EOL")(EOL)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(js.Any.fromFunction2(replacer))
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EOL]
  }
}

