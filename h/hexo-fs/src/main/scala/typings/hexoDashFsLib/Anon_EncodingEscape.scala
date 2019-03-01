package typings
package hexoDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingEscape extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var escape: js.UndefOr[scala.Boolean] = js.undefined
  var flag: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EncodingEscape {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    escape: js.UndefOr[scala.Boolean] = js.undefined,
    flag: java.lang.String = null
  ): Anon_EncodingEscape = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(escape)) __obj.updateDynamic("escape")(escape)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    __obj.asInstanceOf[Anon_EncodingEscape]
  }
}

