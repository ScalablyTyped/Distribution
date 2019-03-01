package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleEffect extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var origin: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var percent: js.UndefOr[scala.Double] = js.undefined
  var scale: js.UndefOr[java.lang.String] = js.undefined
}

object ScaleEffect {
  @scala.inline
  def apply(
    direction: java.lang.String = null,
    origin: js.Array[java.lang.String] = null,
    percent: scala.Int | scala.Double = null,
    scale: java.lang.String = null
  ): ScaleEffect = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    __obj.asInstanceOf[ScaleEffect]
  }
}

