package typings
package grayDashMatterLib.grayDashMatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrayMatterOption extends js.Object {
  var delims: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var eval: js.UndefOr[scala.Boolean] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var parser: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object GrayMatterOption {
  @scala.inline
  def apply(
    delims: java.lang.String | js.Array[java.lang.String] = null,
    eval: js.UndefOr[scala.Boolean] = js.undefined,
    lang: java.lang.String = null,
    parser: () => scala.Unit = null
  ): GrayMatterOption = {
    val __obj = js.Dynamic.literal()
    if (delims != null) __obj.updateDynamic("delims")(delims.asInstanceOf[js.Any])
    if (!js.isUndefined(eval)) __obj.updateDynamic("eval")(eval)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction0(parser))
    __obj.asInstanceOf[GrayMatterOption]
  }
}

