package typings
package jsonfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EOL extends js.Object {
  var EOL: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var flag: js.UndefOr[java.lang.String] = js.undefined
  var fs: js.UndefOr[jsonfileLib.jsonfileMod.FS] = js.undefined
  var mode: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var replacer: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]] = js.undefined
  var spaces: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Anon_EOL {
  @scala.inline
  def apply(
    EOL: java.lang.String = null,
    encoding: java.lang.String = null,
    flag: java.lang.String = null,
    fs: jsonfileLib.jsonfileMod.FS = null,
    mode: java.lang.String | scala.Double = null,
    replacer: (/* key */ java.lang.String, /* value */ js.Any) => _ = null,
    spaces: java.lang.String | scala.Double = null
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

