package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripScrollable extends js.Object {
  var distance: js.UndefOr[Double] = js.undefined
}

object TabStripScrollable {
  @scala.inline
  def apply(distance: Int | Double = null): TabStripScrollable = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStripScrollable]
  }
}

