package typings.grayDashMatter.grayDashMatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrayMatterOption extends js.Object {
  var delims: String
  var eval: js.UndefOr[Boolean] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var parser: js.UndefOr[js.Function] = js.undefined
}

object GrayMatterOption {
  @scala.inline
  def apply(
    delims: String,
    eval: js.UndefOr[Boolean] = js.undefined,
    lang: String = null,
    parser: js.Function = null
  ): GrayMatterOption = {
    val __obj = js.Dynamic.literal(delims = delims)
    if (!js.isUndefined(eval)) __obj.updateDynamic("eval")(eval)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    __obj.asInstanceOf[GrayMatterOption]
  }
}

