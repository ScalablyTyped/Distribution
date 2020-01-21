package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEditableDrag extends js.Object {
  var snap: js.UndefOr[Boolean | DiagramEditableDragSnap] = js.undefined
}

object DiagramEditableDrag {
  @scala.inline
  def apply(snap: Boolean | DiagramEditableDragSnap = null): DiagramEditableDrag = {
    val __obj = js.Dynamic.literal()
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramEditableDrag]
  }
}

