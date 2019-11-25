package typings.isotopeDashLayout.isotopeDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Masonry extends js.Object {
  var columnWidth: js.UndefOr[Double | String] = js.undefined
  var fitWidth: js.UndefOr[Boolean] = js.undefined
  var gutter: js.UndefOr[Double | String] = js.undefined
}

object Masonry {
  @scala.inline
  def apply(
    columnWidth: Double | String = null,
    fitWidth: js.UndefOr[Boolean] = js.undefined,
    gutter: Double | String = null
  ): Masonry = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fitWidth)) __obj.updateDynamic("fitWidth")(fitWidth.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Masonry]
  }
}

