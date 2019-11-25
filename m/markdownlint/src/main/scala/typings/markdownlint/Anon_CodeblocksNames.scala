package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeblocksNames extends js.Object {
  var code_blocks: js.UndefOr[Boolean] = js.undefined
  var names: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object Anon_CodeblocksNames {
  @scala.inline
  def apply(code_blocks: js.UndefOr[Boolean] = js.undefined, names: js.Array[String] = null): Anon_CodeblocksNames = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code_blocks)) __obj.updateDynamic("code_blocks")(code_blocks.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CodeblocksNames]
  }
}

