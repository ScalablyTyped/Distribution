package typings.grayMatter.mod

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
    val __obj = js.Dynamic.literal(delims = delims.asInstanceOf[js.Any])
    if (!js.isUndefined(eval)) __obj.updateDynamic("eval")(eval.get.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrayMatterOption]
  }
}

