package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarAnimation extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object ProgressBarAnimation {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined): ProgressBarAnimation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarAnimation]
  }
}

