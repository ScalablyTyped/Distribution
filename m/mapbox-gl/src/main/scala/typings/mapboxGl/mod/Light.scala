package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Light extends js.Object {
  var anchor: js.UndefOr[map | viewport] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var `color-transition`: js.UndefOr[Transition] = js.undefined
  var intensity: js.UndefOr[Double] = js.undefined
  var `intensity-transition`: js.UndefOr[Transition] = js.undefined
  var position: js.UndefOr[js.Array[Double]] = js.undefined
  var `position-transition`: js.UndefOr[Transition] = js.undefined
}

object Light {
  @scala.inline
  def apply(
    anchor: map | viewport = null,
    color: String = null,
    `color-transition`: Transition = null,
    intensity: js.UndefOr[Double] = js.undefined,
    `intensity-transition`: Transition = null,
    position: js.Array[Double] = null,
    `position-transition`: Transition = null
  ): Light = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`color-transition` != null) __obj.updateDynamic("color-transition")(`color-transition`.asInstanceOf[js.Any])
    if (!js.isUndefined(intensity)) __obj.updateDynamic("intensity")(intensity.get.asInstanceOf[js.Any])
    if (`intensity-transition` != null) __obj.updateDynamic("intensity-transition")(`intensity-transition`.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`position-transition` != null) __obj.updateDynamic("position-transition")(`position-transition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Light]
  }
}

