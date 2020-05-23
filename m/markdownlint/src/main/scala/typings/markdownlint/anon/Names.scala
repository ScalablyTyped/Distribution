package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Names extends js.Object {
  var code_blocks: js.UndefOr[Boolean] = js.undefined
  var names: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object Names {
  @scala.inline
  def apply(
    code_blocks: js.UndefOr[Boolean] = js.undefined,
    names: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): Names = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code_blocks)) __obj.updateDynamic("code_blocks")(code_blocks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(names)) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Names]
  }
}

