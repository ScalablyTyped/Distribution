package typings.kendoDashUi.kendo.dataviz.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerTooltipAnimationClose extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var effects: js.UndefOr[String] = js.undefined
}

object MarkerTooltipAnimationClose {
  @scala.inline
  def apply(duration: Int | Double = null, effects: String = null): MarkerTooltipAnimationClose = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects)
    __obj.asInstanceOf[MarkerTooltipAnimationClose]
  }
}

