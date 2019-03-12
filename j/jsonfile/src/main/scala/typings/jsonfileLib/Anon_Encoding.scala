package typings
package jsonfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var flag: js.UndefOr[java.lang.String] = js.undefined
  var fs: js.UndefOr[jsonfileLib.jsonfileMod.FS] = js.undefined
  var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, _]] = js.undefined
  var throws: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    flag: java.lang.String = null,
    fs: jsonfileLib.jsonfileMod.FS = null,
    reviver: (/* key */ js.Any, /* value */ js.Any) => _ = null,
    throws: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (reviver != null) __obj.updateDynamic("reviver")(js.Any.fromFunction2(reviver))
    if (!js.isUndefined(throws)) __obj.updateDynamic("throws")(throws)
    __obj.asInstanceOf[Anon_Encoding]
  }
}

