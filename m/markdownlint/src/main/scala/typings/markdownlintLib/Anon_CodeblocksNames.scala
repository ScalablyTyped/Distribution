package typings
package markdownlintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeblocksNames extends js.Object {
  var code_blocks: js.UndefOr[scala.Boolean] = js.undefined
  var names: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
}

object Anon_CodeblocksNames {
  @scala.inline
  def apply(code_blocks: js.UndefOr[scala.Boolean] = js.undefined, names: js.Array[java.lang.String] = null): Anon_CodeblocksNames = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code_blocks)) __obj.updateDynamic("code_blocks")(code_blocks)
    if (names != null) __obj.updateDynamic("names")(names)
    __obj.asInstanceOf[Anon_CodeblocksNames]
  }
}

