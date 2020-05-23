package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Brspaces extends js.Object {
  var br_spaces: js.UndefOr[Double] = js.undefined
  var list_item_empty_lines: js.UndefOr[Boolean] = js.undefined
}

object Brspaces {
  @scala.inline
  def apply(
    br_spaces: js.UndefOr[Double] = js.undefined,
    list_item_empty_lines: js.UndefOr[Boolean] = js.undefined
  ): Brspaces = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(br_spaces)) __obj.updateDynamic("br_spaces")(br_spaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(list_item_empty_lines)) __obj.updateDynamic("list_item_empty_lines")(list_item_empty_lines.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brspaces]
  }
}

