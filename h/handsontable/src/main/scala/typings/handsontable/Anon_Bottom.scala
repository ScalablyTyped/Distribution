package typings.handsontable

import typings.handsontable.handsontableMod.Handsontable.customBorders.BorderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var bottom: js.UndefOr[BorderOptions | String] = js.undefined
  var left: js.UndefOr[BorderOptions | String] = js.undefined
  var right: js.UndefOr[BorderOptions | String] = js.undefined
  var top: js.UndefOr[BorderOptions | String] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: BorderOptions | String = null,
    left: BorderOptions | String = null,
    right: BorderOptions | String = null,
    top: BorderOptions | String = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

