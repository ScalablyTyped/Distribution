package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideEffect extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
}

object SlideEffect {
  @scala.inline
  def apply(direction: java.lang.String = null, distance: scala.Int | scala.Double = null): SlideEffect = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideEffect]
  }
}

