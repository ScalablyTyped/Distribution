package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleEffect extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[js.Array[String]] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[String] = js.undefined
}

object ScaleEffect {
  @scala.inline
  def apply(
    direction: String = null,
    origin: js.Array[String] = null,
    percent: Int | Double = null,
    scale: String = null
  ): ScaleEffect = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleEffect]
  }
}

