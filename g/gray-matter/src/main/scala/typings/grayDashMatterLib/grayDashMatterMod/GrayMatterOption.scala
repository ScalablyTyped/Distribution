package typings
package grayDashMatterLib.grayDashMatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrayMatterOption extends js.Object {
  var delims: java.lang.String
  var eval: js.UndefOr[scala.Boolean] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var parser: js.UndefOr[js.Function] = js.undefined
}

object GrayMatterOption {
  @scala.inline
  def apply(
    delims: java.lang.String,
    eval: js.UndefOr[scala.Boolean] = js.undefined,
    lang: java.lang.String = null,
    parser: js.Function = null
  ): GrayMatterOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delims")(delims)
    if (!js.isUndefined(eval)) __obj.updateDynamic("eval")(eval)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    __obj.asInstanceOf[GrayMatterOption]
  }
}

