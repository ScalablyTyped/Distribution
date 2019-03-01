package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Light extends js.Object {
  var anchor: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport
  ] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var `color-transition`: js.UndefOr[Transition] = js.undefined
  var intensity: js.UndefOr[scala.Double] = js.undefined
  var `intensity-transition`: js.UndefOr[Transition] = js.undefined
  var position: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var `position-transition`: js.UndefOr[Transition] = js.undefined
}

object Light {
  @scala.inline
  def apply(
    anchor: mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport = null,
    color: java.lang.String = null,
    `color-transition`: Transition = null,
    intensity: scala.Int | scala.Double = null,
    `intensity-transition`: Transition = null,
    position: js.Array[scala.Double] = null,
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

