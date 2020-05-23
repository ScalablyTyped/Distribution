package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Codeblocks extends js.Object {
  var code_blocks: js.UndefOr[Boolean] = js.undefined
}

object Codeblocks {
  @scala.inline
  def apply(code_blocks: js.UndefOr[Boolean] = js.undefined): Codeblocks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code_blocks)) __obj.updateDynamic("code_blocks")(code_blocks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codeblocks]
  }
}

