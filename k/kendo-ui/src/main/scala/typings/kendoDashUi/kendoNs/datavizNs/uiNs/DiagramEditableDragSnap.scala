package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEditableDragSnap extends js.Object {
  var size: js.UndefOr[Double] = js.undefined
}

object DiagramEditableDragSnap {
  @scala.inline
  def apply(size: Int | Double = null): DiagramEditableDragSnap = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramEditableDragSnap]
  }
}

