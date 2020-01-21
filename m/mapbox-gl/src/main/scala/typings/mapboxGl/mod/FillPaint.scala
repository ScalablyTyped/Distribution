package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillPaint extends js.Object {
  var `fill-antialias`: js.UndefOr[Boolean | Expression] = js.undefined
  var `fill-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  var `fill-color-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `fill-opacity-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-outline-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  var `fill-outline-color-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-pattern`: js.UndefOr[String | Expression] = js.undefined
  var `fill-pattern-transition`: js.UndefOr[Transition] = js.undefined
  var `fill-translate`: js.UndefOr[js.Array[Double]] = js.undefined
  var `fill-translate-anchor`: js.UndefOr[map | viewport] = js.undefined
  var `fill-translate-transition`: js.UndefOr[Transition] = js.undefined
}

object FillPaint {
  @scala.inline
  def apply(
    `fill-antialias`: Boolean | Expression = null,
    `fill-color`: String | StyleFunction | Expression = null,
    `fill-color-transition`: Transition = null,
    `fill-opacity`: Double | StyleFunction | Expression = null,
    `fill-opacity-transition`: Transition = null,
    `fill-outline-color`: String | StyleFunction | Expression = null,
    `fill-outline-color-transition`: Transition = null,
    `fill-pattern`: String | Expression = null,
    `fill-pattern-transition`: Transition = null,
    `fill-translate`: js.Array[Double] = null,
    `fill-translate-anchor`: map | viewport = null,
    `fill-translate-transition`: Transition = null
  ): FillPaint = {
    val __obj = js.Dynamic.literal()
    if (`fill-antialias` != null) __obj.updateDynamic("fill-antialias")(`fill-antialias`.asInstanceOf[js.Any])
    if (`fill-color` != null) __obj.updateDynamic("fill-color")(`fill-color`.asInstanceOf[js.Any])
    if (`fill-color-transition` != null) __obj.updateDynamic("fill-color-transition")(`fill-color-transition`.asInstanceOf[js.Any])
    if (`fill-opacity` != null) __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    if (`fill-opacity-transition` != null) __obj.updateDynamic("fill-opacity-transition")(`fill-opacity-transition`.asInstanceOf[js.Any])
    if (`fill-outline-color` != null) __obj.updateDynamic("fill-outline-color")(`fill-outline-color`.asInstanceOf[js.Any])
    if (`fill-outline-color-transition` != null) __obj.updateDynamic("fill-outline-color-transition")(`fill-outline-color-transition`.asInstanceOf[js.Any])
    if (`fill-pattern` != null) __obj.updateDynamic("fill-pattern")(`fill-pattern`.asInstanceOf[js.Any])
    if (`fill-pattern-transition` != null) __obj.updateDynamic("fill-pattern-transition")(`fill-pattern-transition`.asInstanceOf[js.Any])
    if (`fill-translate` != null) __obj.updateDynamic("fill-translate")(`fill-translate`.asInstanceOf[js.Any])
    if (`fill-translate-anchor` != null) __obj.updateDynamic("fill-translate-anchor")(`fill-translate-anchor`.asInstanceOf[js.Any])
    if (`fill-translate-transition` != null) __obj.updateDynamic("fill-translate-transition")(`fill-translate-transition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillPaint]
  }
}

