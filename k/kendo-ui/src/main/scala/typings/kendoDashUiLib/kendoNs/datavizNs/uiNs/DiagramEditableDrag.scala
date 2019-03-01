package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEditableDrag extends js.Object {
  var snap: js.UndefOr[scala.Boolean | DiagramEditableDragSnap] = js.undefined
}

object DiagramEditableDrag {
  @scala.inline
  def apply(snap: scala.Boolean | DiagramEditableDragSnap = null): DiagramEditableDrag = {
    val __obj = js.Dynamic.literal()
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramEditableDrag]
  }
}

