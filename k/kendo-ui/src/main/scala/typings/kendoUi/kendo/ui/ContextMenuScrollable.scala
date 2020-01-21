package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuScrollable extends js.Object {
  var distance: js.UndefOr[Double] = js.undefined
}

object ContextMenuScrollable {
  @scala.inline
  def apply(distance: Int | Double = null): ContextMenuScrollable = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuScrollable]
  }
}

