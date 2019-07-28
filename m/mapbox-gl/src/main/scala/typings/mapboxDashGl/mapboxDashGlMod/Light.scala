package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.map
import typings.mapboxDashGl.mapboxDashGlStrings.viewport
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
    intensity: Int | Double = null,
    `intensity-transition`: Transition = null,
    position: js.Array[Double] = null,
    `position-transition`: Transition = null
  ): Light = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (`color-transition` != null) __obj.updateDynamic("color-transition")(`color-transition`)
    if (intensity != null) __obj.updateDynamic("intensity")(intensity.asInstanceOf[js.Any])
    if (`intensity-transition` != null) __obj.updateDynamic("intensity-transition")(`intensity-transition`)
    if (position != null) __obj.updateDynamic("position")(position)
    if (`position-transition` != null) __obj.updateDynamic("position-transition")(`position-transition`)
    __obj.asInstanceOf[Light]
  }
}

