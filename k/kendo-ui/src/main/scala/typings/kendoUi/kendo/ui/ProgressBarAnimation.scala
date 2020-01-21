package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarAnimation extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object ProgressBarAnimation {
  @scala.inline
  def apply(duration: Int | Double = null): ProgressBarAnimation = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarAnimation]
  }
}

