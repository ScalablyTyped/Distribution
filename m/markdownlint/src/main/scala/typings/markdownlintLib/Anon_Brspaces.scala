package typings
package markdownlintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brspaces extends js.Object {
  var br_spaces: js.UndefOr[scala.Double] = js.undefined
  var list_item_empty_lines: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Brspaces {
  @scala.inline
  def apply(
    br_spaces: scala.Int | scala.Double = null,
    list_item_empty_lines: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Brspaces = {
    val __obj = js.Dynamic.literal()
    if (br_spaces != null) __obj.updateDynamic("br_spaces")(br_spaces.asInstanceOf[js.Any])
    if (!js.isUndefined(list_item_empty_lines)) __obj.updateDynamic("list_item_empty_lines")(list_item_empty_lines)
    __obj.asInstanceOf[Anon_Brspaces]
  }
}

