package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuScrollable extends js.Object {
  var distance: js.UndefOr[Double] = js.undefined
}

object MenuScrollable {
  @scala.inline
  def apply(distance: js.UndefOr[Double] = js.undefined): MenuScrollable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuScrollable]
  }
}

