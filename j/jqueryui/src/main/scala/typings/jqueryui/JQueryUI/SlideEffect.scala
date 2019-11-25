package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideEffect extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
}

object SlideEffect {
  @scala.inline
  def apply(direction: String = null, distance: Int | Double = null): SlideEffect = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideEffect]
  }
}

