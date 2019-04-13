package typings
package isotopeDashLayoutLib.isotopeDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Masonry extends js.Object {
  var columnWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fitWidth: js.UndefOr[scala.Boolean] = js.undefined
  var gutter: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Masonry {
  @scala.inline
  def apply(
    columnWidth: scala.Double | java.lang.String = null,
    fitWidth: js.UndefOr[scala.Boolean] = js.undefined,
    gutter: scala.Double | java.lang.String = null
  ): Masonry = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fitWidth)) __obj.updateDynamic("fitWidth")(fitWidth)
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Masonry]
  }
}

