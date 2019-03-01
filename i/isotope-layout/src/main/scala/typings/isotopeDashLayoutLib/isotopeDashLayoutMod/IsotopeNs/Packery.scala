package typings
package isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packery extends js.Object {
  var columnWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var gutter: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
}

object Packery {
  @scala.inline
  def apply(
    columnWidth: scala.Double | java.lang.String = null,
    gutter: scala.Double | java.lang.String = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    rowHeight: scala.Int | scala.Double = null
  ): Packery = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packery]
  }
}

