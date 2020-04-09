package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundPaint extends AnyPaint {
  var `background-color`: js.UndefOr[String | Expression] = js.undefined
  var `background-color-transition`: js.UndefOr[Transition] = js.undefined
  var `background-opacity`: js.UndefOr[Double | Expression] = js.undefined
  var `background-opacity-transition`: js.UndefOr[Transition] = js.undefined
  var `background-pattern`: js.UndefOr[String] = js.undefined
  var `background-pattern-transition`: js.UndefOr[Transition] = js.undefined
}

object BackgroundPaint {
  @scala.inline
  def apply(
    `background-color`: String | Expression = null,
    `background-color-transition`: Transition = null,
    `background-opacity`: Double | Expression = null,
    `background-opacity-transition`: Transition = null,
    `background-pattern`: String = null,
    `background-pattern-transition`: Transition = null
  ): BackgroundPaint = {
    val __obj = js.Dynamic.literal()
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`background-color-transition` != null) __obj.updateDynamic("background-color-transition")(`background-color-transition`.asInstanceOf[js.Any])
    if (`background-opacity` != null) __obj.updateDynamic("background-opacity")(`background-opacity`.asInstanceOf[js.Any])
    if (`background-opacity-transition` != null) __obj.updateDynamic("background-opacity-transition")(`background-opacity-transition`.asInstanceOf[js.Any])
    if (`background-pattern` != null) __obj.updateDynamic("background-pattern")(`background-pattern`.asInstanceOf[js.Any])
    if (`background-pattern-transition` != null) __obj.updateDynamic("background-pattern-transition")(`background-pattern-transition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundPaint]
  }
}

