package typings
package markdownlintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Codeblocks extends js.Object {
  var code_blocks: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Codeblocks {
  @scala.inline
  def apply(code_blocks: js.UndefOr[scala.Boolean] = js.undefined): Anon_Codeblocks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code_blocks)) __obj.updateDynamic("code_blocks")(code_blocks)
    __obj.asInstanceOf[Anon_Codeblocks]
  }
}

