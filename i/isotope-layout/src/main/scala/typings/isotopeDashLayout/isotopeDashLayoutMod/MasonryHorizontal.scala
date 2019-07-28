package typings.isotopeDashLayout.isotopeDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryHorizontal extends js.Object {
  var gutter: js.UndefOr[Double | String] = js.undefined
  var rowHeight: js.UndefOr[Double | String] = js.undefined
}

object MasonryHorizontal {
  @scala.inline
  def apply(gutter: Double | String = null, rowHeight: Double | String = null): MasonryHorizontal = {
    val __obj = js.Dynamic.literal()
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryHorizontal]
  }
}

