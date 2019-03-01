package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillPaint extends js.Object {
  var `fill-antialias`: js.UndefOr[scala.Boolean | Expression] = js.undefined
  var `fill-color`: js.UndefOr[java.lang.String | StyleFunction | Expression] = js.undefined
  var `fill-color-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-opacity`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `fill-opacity-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-outline-color`: js.UndefOr[java.lang.String | StyleFunction | Expression] = js.undefined
  var `fill-outline-color-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-pattern`: js.UndefOr[java.lang.String | Expression] = js.undefined
  var `fill-pattern-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-translate`: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var `fill-translate-anchor`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport
  ] = js.undefined
  var `fill-translate-transition`: js.UndefOr[Transition] = js.undefined
}

object FillPaint {
  @scala.inline
  def apply(
    `fill-antialias`: scala.Boolean | Expression = null,
    `fill-color`: java.lang.String | StyleFunction | Expression = null,
    `fill-color-transition`: Transition = null,
    `fill-opacity`: scala.Double | StyleFunction | Expression = null,
    `fill-opacity-transition`: Transition = null,
    `fill-outline-color`: java.lang.String | StyleFunction | Expression = null,
    `fill-outline-color-transition`: Transition = null,
    `fill-pattern`: java.lang.String | Expression = null,
    `fill-pattern-transition`: Transition = null,
    `fill-translate`: js.Array[scala.Double] = null,
    `fill-translate-anchor`: mapboxDashGlLib.mapboxDashGlLibStrings.map | mapboxDashGlLib.mapboxDashGlLibStrings.viewport = null,
    `fill-translate-transition`: Transition = null
  ): FillPaint = {
    val __obj = js.Dynamic.literal()
    if (`fill-antialias` != null) __obj.updateDynamic("fill-antialias")(`fill-antialias`.asInstanceOf[js.Any])
    if (`fill-color` != null) __obj.updateDynamic("fill-color")(`fill-color`.asInstanceOf[js.Any])
    if (`fill-color-transition` != null) __obj.updateDynamic("fill-color-transition")(`fill-color-transition`)
    if (`fill-opacity` != null) __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    if (`fill-opacity-transition` != null) __obj.updateDynamic("fill-opacity-transition")(`fill-opacity-transition`)
    if (`fill-outline-color` != null) __obj.updateDynamic("fill-outline-color")(`fill-outline-color`.asInstanceOf[js.Any])
    if (`fill-outline-color-transition` != null) __obj.updateDynamic("fill-outline-color-transition")(`fill-outline-color-transition`)
    if (`fill-pattern` != null) __obj.updateDynamic("fill-pattern")(`fill-pattern`.asInstanceOf[js.Any])
    if (`fill-pattern-transition` != null) __obj.updateDynamic("fill-pattern-transition")(`fill-pattern-transition`)
    if (`fill-translate` != null) __obj.updateDynamic("fill-translate")(`fill-translate`)
    if (`fill-translate-anchor` != null) __obj.updateDynamic("fill-translate-anchor")(`fill-translate-anchor`.asInstanceOf[js.Any])
    if (`fill-translate-transition` != null) __obj.updateDynamic("fill-translate-transition")(`fill-translate-transition`)
    __obj.asInstanceOf[FillPaint]
  }
}

