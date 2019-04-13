package typings
package isotopeDashLayoutLib.isotopeDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryHorizontal extends js.Object {
  var gutter: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var rowHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object MasonryHorizontal {
  @scala.inline
  def apply(gutter: scala.Double | java.lang.String = null, rowHeight: scala.Double | java.lang.String = null): MasonryHorizontal = {
    val __obj = js.Dynamic.literal()
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryHorizontal]
  }
}

