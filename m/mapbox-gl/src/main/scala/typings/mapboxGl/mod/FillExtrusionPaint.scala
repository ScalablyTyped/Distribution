package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillExtrusionPaint extends js.Object {
  var `fill-extrusion-base`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `fill-extrusion-base-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-extrusion-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  var `fill-extrusion-color-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-extrusion-height`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `fill-extrusion-height-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-extrusion-opacity`: js.UndefOr[Double | Expression] = js.undefined
  var `fill-extrusion-opacity-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-extrusion-pattern`: js.UndefOr[String | Expression] = js.undefined
  var `fill-extrusion-pattern-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-extrusion-translate`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  var `fill-extrusion-translate-anchor`: js.UndefOr[map | viewport] = js.undefined
  var `fill-extrusion-translate-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-extrusion-vertical-gradient`: js.UndefOr[Boolean] = js.undefined
}

object FillExtrusionPaint {
  @scala.inline
  def apply(
    `fill-extrusion-base`: Double | StyleFunction | Expression = null,
    `fill-extrusion-base-transition`: Transition = null,
    `fill-extrusion-color`: String | StyleFunction | Expression = null,
    `fill-extrusion-color-transition`: Transition = null,
    `fill-extrusion-height`: Double | StyleFunction | Expression = null,
    `fill-extrusion-height-transition`: Transition = null,
    `fill-extrusion-opacity`: Double | Expression = null,
    `fill-extrusion-opacity-transition`: Transition = null,
    `fill-extrusion-pattern`: String | Expression = null,
    `fill-extrusion-pattern-transition`: Transition = null,
    `fill-extrusion-translate`: js.Array[Double] | Expression = null,
    `fill-extrusion-translate-anchor`: map | viewport = null,
    `fill-extrusion-translate-transition`: Transition = null,
    `fill-extrusion-vertical-gradient`: js.UndefOr[Boolean] = js.undefined
  ): FillExtrusionPaint = {
    val __obj = js.Dynamic.literal()
    if (`fill-extrusion-base` != null) __obj.updateDynamic("fill-extrusion-base")(`fill-extrusion-base`.asInstanceOf[js.Any])
    if (`fill-extrusion-base-transition` != null) __obj.updateDynamic("fill-extrusion-base-transition")(`fill-extrusion-base-transition`.asInstanceOf[js.Any])
    if (`fill-extrusion-color` != null) __obj.updateDynamic("fill-extrusion-color")(`fill-extrusion-color`.asInstanceOf[js.Any])
    if (`fill-extrusion-color-transition` != null) __obj.updateDynamic("fill-extrusion-color-transition")(`fill-extrusion-color-transition`.asInstanceOf[js.Any])
    if (`fill-extrusion-height` != null) __obj.updateDynamic("fill-extrusion-height")(`fill-extrusion-height`.asInstanceOf[js.Any])
    if (`fill-extrusion-height-transition` != null) __obj.updateDynamic("fill-extrusion-height-transition")(`fill-extrusion-height-transition`.asInstanceOf[js.Any])
    if (`fill-extrusion-opacity` != null) __obj.updateDynamic("fill-extrusion-opacity")(`fill-extrusion-opacity`.asInstanceOf[js.Any])
    if (`fill-extrusion-opacity-transition` != null) __obj.updateDynamic("fill-extrusion-opacity-transition")(`fill-extrusion-opacity-transition`.asInstanceOf[js.Any])
    if (`fill-extrusion-pattern` != null) __obj.updateDynamic("fill-extrusion-pattern")(`fill-extrusion-pattern`.asInstanceOf[js.Any])
    if (`fill-extrusion-pattern-transition` != null) __obj.updateDynamic("fill-extrusion-pattern-transition")(`fill-extrusion-pattern-transition`.asInstanceOf[js.Any])
    if (`fill-extrusion-translate` != null) __obj.updateDynamic("fill-extrusion-translate")(`fill-extrusion-translate`.asInstanceOf[js.Any])
    if (`fill-extrusion-translate-anchor` != null) __obj.updateDynamic("fill-extrusion-translate-anchor")(`fill-extrusion-translate-anchor`.asInstanceOf[js.Any])
    if (`fill-extrusion-translate-transition` != null) __obj.updateDynamic("fill-extrusion-translate-transition")(`fill-extrusion-translate-transition`.asInstanceOf[js.Any])
    if (!js.isUndefined(`fill-extrusion-vertical-gradient`)) __obj.updateDynamic("fill-extrusion-vertical-gradient")(`fill-extrusion-vertical-gradient`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillExtrusionPaint]
  }
}

