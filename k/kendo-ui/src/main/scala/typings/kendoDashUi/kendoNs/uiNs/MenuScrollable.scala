package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuScrollable extends js.Object {
  var distance: js.UndefOr[Double] = js.undefined
}

object MenuScrollable {
  @scala.inline
  def apply(distance: Int | Double = null): MenuScrollable = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuScrollable]
  }
}

