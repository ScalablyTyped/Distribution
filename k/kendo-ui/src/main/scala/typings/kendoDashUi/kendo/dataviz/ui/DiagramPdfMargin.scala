package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramPdfMargin extends js.Object {
  var bottom: js.UndefOr[Double | String] = js.undefined
  var left: js.UndefOr[Double | String] = js.undefined
  var right: js.UndefOr[Double | String] = js.undefined
  var top: js.UndefOr[Double | String] = js.undefined
}

object DiagramPdfMargin {
  @scala.inline
  def apply(
    bottom: Double | String = null,
    left: Double | String = null,
    right: Double | String = null,
    top: Double | String = null
  ): DiagramPdfMargin = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramPdfMargin]
  }
}

