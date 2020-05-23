package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuScrollable extends js.Object {
  var distance: js.UndefOr[Double] = js.undefined
}

object ContextMenuScrollable {
  @scala.inline
  def apply(distance: js.UndefOr[Double] = js.undefined): ContextMenuScrollable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuScrollable]
  }
}

