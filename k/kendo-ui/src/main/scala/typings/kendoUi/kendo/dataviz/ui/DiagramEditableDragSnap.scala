package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEditableDragSnap extends js.Object {
  var size: js.UndefOr[Double] = js.undefined
}

object DiagramEditableDragSnap {
  @scala.inline
  def apply(size: js.UndefOr[Double] = js.undefined): DiagramEditableDragSnap = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramEditableDragSnap]
  }
}

