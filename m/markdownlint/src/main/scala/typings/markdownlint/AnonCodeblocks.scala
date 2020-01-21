package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeblocks extends js.Object {
  var code_blocks: js.UndefOr[Boolean] = js.undefined
}

object AnonCodeblocks {
  @scala.inline
  def apply(code_blocks: js.UndefOr[Boolean] = js.undefined): AnonCodeblocks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code_blocks)) __obj.updateDynamic("code_blocks")(code_blocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodeblocks]
  }
}

