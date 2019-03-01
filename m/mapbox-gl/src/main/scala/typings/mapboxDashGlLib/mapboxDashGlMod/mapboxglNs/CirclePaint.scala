package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CirclePaint extends js.Object {
  var `circle-blur`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `circle-blur-transition`: js.UndefOr[Transition] = js.undefined
  var `circle-color`: js.UndefOr[java.lang.String | StyleFunction | Expression] = js.undefined
  var `circle-color-transition`: js.UndefOr[Transition] = js.undefined
  var `circle-opacity`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `circle-opacity-transition`: js.UndefOr[Transition] = js.undefined
  var `circle-pitch-alignment`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport
  ] = js.undefined
  var `circle-pitch-scale`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport
  ] = js.undefined
  var `circle-radius`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `circle-radius-transition`: js.UndefOr[Transition] = js.undefined
  var `circle-stroke-color`: js.UndefOr[java.lang.String | StyleFunction | Expression] = js.undefined
  var `circle-stroke-color-transition`: js.UndefOr[Transition] = js.undefined
  var `circle-stroke-opacity`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `circle-stroke-opacity-transition`: js.UndefOr[Transition] = js.undefined
  var `circle-stroke-width`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `circle-stroke-width-transition`: js.UndefOr[Transition] = js.undefined
  var `circle-translate`: js.UndefOr[js.Array[scala.Double] | Expression] = js.undefined
  var `circle-translate-anchor`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport
  ] = js.undefined
  var `circle-translate-transition`: js.UndefOr[Transition] = js.undefined
}

object CirclePaint {
  @scala.inline
  def apply(
    `circle-blur`: scala.Double | StyleFunction | Expression = null,
    `circle-blur-transition`: Transition = null,
    `circle-color`: java.lang.String | StyleFunction | Expression = null,
    `circle-color-transition`: Transition = null,
    `circle-opacity`: scala.Double | StyleFunction | Expression = null,
    `circle-opacity-transition`: Transition = null,
    `circle-pitch-alignment`: mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport = null,
    `circle-pitch-scale`: mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport = null,
    `circle-radius`: scala.Double | StyleFunction | Expression = null,
    `circle-radius-transition`: Transition = null,
    `circle-stroke-color`: java.lang.String | StyleFunction | Expression = null,
    `circle-stroke-color-transition`: Transition = null,
    `circle-stroke-opacity`: scala.Double | StyleFunction | Expression = null,
    `circle-stroke-opacity-transition`: Transition = null,
    `circle-stroke-width`: scala.Double | StyleFunction | Expression = null,
    `circle-stroke-width-transition`: Transition = null,
    `circle-translate`: js.Array[scala.Double] | Expression = null,
    `circle-translate-anchor`: mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport = null,
    `circle-translate-transition`: Transition = null
  ): CirclePaint = {
    val __obj = js.Dynamic.literal()
    if (`circle-blur` != null) __obj.updateDynamic("circle-blur")(`circle-blur`.asInstanceOf[js.Any])
    if (`circle-blur-transition` != null) __obj.updateDynamic("circle-blur-transition")(`circle-blur-transition`)
    if (`circle-color` != null) __obj.updateDynamic("circle-color")(`circle-color`.asInstanceOf[js.Any])
    if (`circle-color-transition` != null) __obj.updateDynamic("circle-color-transition")(`circle-color-transition`)
    if (`circle-opacity` != null) __obj.updateDynamic("circle-opacity")(`circle-opacity`.asInstanceOf[js.Any])
    if (`circle-opacity-transition` != null) __obj.updateDynamic("circle-opacity-transition")(`circle-opacity-transition`)
    if (`circle-pitch-alignment` != null) __obj.updateDynamic("circle-pitch-alignment")(`circle-pitch-alignment`.asInstanceOf[js.Any])
    if (`circle-pitch-scale` != null) __obj.updateDynamic("circle-pitch-scale")(`circle-pitch-scale`.asInstanceOf[js.Any])
    if (`circle-radius` != null) __obj.updateDynamic("circle-radius")(`circle-radius`.asInstanceOf[js.Any])
    if (`circle-radius-transition` != null) __obj.updateDynamic("circle-radius-transition")(`circle-radius-transition`)
    if (`circle-stroke-color` != null) __obj.updateDynamic("circle-stroke-color")(`circle-stroke-color`.asInstanceOf[js.Any])
    if (`circle-stroke-color-transition` != null) __obj.updateDynamic("circle-stroke-color-transition")(`circle-stroke-color-transition`)
    if (`circle-stroke-opacity` != null) __obj.updateDynamic("circle-stroke-opacity")(`circle-stroke-opacity`.asInstanceOf[js.Any])
    if (`circle-stroke-opacity-transition` != null) __obj.updateDynamic("circle-stroke-opacity-transition")(`circle-stroke-opacity-transition`)
    if (`circle-stroke-width` != null) __obj.updateDynamic("circle-stroke-width")(`circle-stroke-width`.asInstanceOf[js.Any])
    if (`circle-stroke-width-transition` != null) __obj.updateDynamic("circle-stroke-width-transition")(`circle-stroke-width-transition`)
    if (`circle-translate` != null) __obj.updateDynamic("circle-translate")(`circle-translate`.asInstanceOf[js.Any])
    if (`circle-translate-anchor` != null) __obj.updateDynamic("circle-translate-anchor")(`circle-translate-anchor`.asInstanceOf[js.Any])
    if (`circle-translate-transition` != null) __obj.updateDynamic("circle-translate-transition")(`circle-translate-transition`)
    __obj.asInstanceOf[CirclePaint]
  }
}

