package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.map
import typings.mapboxDashGl.mapboxDashGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolPaint extends js.Object {
  var `icon-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  var `icon-color-transition`: js.UndefOr[Transition] = js.undefined
  var `icon-halo-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `icon-halo-blur-transition`: js.UndefOr[Transition] = js.undefined
  var `icon-halo-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  var `icon-halo-color-transition`: js.UndefOr[Transition] = js.undefined
  var `icon-halo-width`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `icon-halo-width-transition`: js.UndefOr[Transition] = js.undefined
  var `icon-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `icon-opacity-transition`: js.UndefOr[Transition] = js.undefined
  var `icon-translate`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  var `icon-translate-anchor`: js.UndefOr[map | viewport] = js.undefined
  var `icon-translate-transition`: js.UndefOr[Transition] = js.undefined
  var `text-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  var `text-color-transition`: js.UndefOr[Transition] = js.undefined
  var `text-halo-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `text-halo-blur-transition`: js.UndefOr[Transition] = js.undefined
  var `text-halo-color`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  var `text-halo-color-transition`: js.UndefOr[Transition] = js.undefined
  var `text-halo-width`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `text-halo-width-transition`: js.UndefOr[Transition] = js.undefined
  var `text-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  var `text-opacity-transition`: js.UndefOr[Transition] = js.undefined
  var `text-translate`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  var `text-translate-anchor`: js.UndefOr[map | viewport] = js.undefined
  var `text-translate-transition`: js.UndefOr[Transition] = js.undefined
}

object SymbolPaint {
  @scala.inline
  def apply(
    `icon-color`: String | StyleFunction | Expression = null,
    `icon-color-transition`: Transition = null,
    `icon-halo-blur`: Double | StyleFunction | Expression = null,
    `icon-halo-blur-transition`: Transition = null,
    `icon-halo-color`: String | StyleFunction | Expression = null,
    `icon-halo-color-transition`: Transition = null,
    `icon-halo-width`: Double | StyleFunction | Expression = null,
    `icon-halo-width-transition`: Transition = null,
    `icon-opacity`: Double | StyleFunction | Expression = null,
    `icon-opacity-transition`: Transition = null,
    `icon-translate`: js.Array[Double] | Expression = null,
    `icon-translate-anchor`: map | viewport = null,
    `icon-translate-transition`: Transition = null,
    `text-color`: String | StyleFunction | Expression = null,
    `text-color-transition`: Transition = null,
    `text-halo-blur`: Double | StyleFunction | Expression = null,
    `text-halo-blur-transition`: Transition = null,
    `text-halo-color`: String | StyleFunction | Expression = null,
    `text-halo-color-transition`: Transition = null,
    `text-halo-width`: Double | StyleFunction | Expression = null,
    `text-halo-width-transition`: Transition = null,
    `text-opacity`: Double | StyleFunction | Expression = null,
    `text-opacity-transition`: Transition = null,
    `text-translate`: js.Array[Double] | Expression = null,
    `text-translate-anchor`: map | viewport = null,
    `text-translate-transition`: Transition = null
  ): SymbolPaint = {
    val __obj = js.Dynamic.literal()
    if (`icon-color` != null) __obj.updateDynamic("icon-color")(`icon-color`.asInstanceOf[js.Any])
    if (`icon-color-transition` != null) __obj.updateDynamic("icon-color-transition")(`icon-color-transition`)
    if (`icon-halo-blur` != null) __obj.updateDynamic("icon-halo-blur")(`icon-halo-blur`.asInstanceOf[js.Any])
    if (`icon-halo-blur-transition` != null) __obj.updateDynamic("icon-halo-blur-transition")(`icon-halo-blur-transition`)
    if (`icon-halo-color` != null) __obj.updateDynamic("icon-halo-color")(`icon-halo-color`.asInstanceOf[js.Any])
    if (`icon-halo-color-transition` != null) __obj.updateDynamic("icon-halo-color-transition")(`icon-halo-color-transition`)
    if (`icon-halo-width` != null) __obj.updateDynamic("icon-halo-width")(`icon-halo-width`.asInstanceOf[js.Any])
    if (`icon-halo-width-transition` != null) __obj.updateDynamic("icon-halo-width-transition")(`icon-halo-width-transition`)
    if (`icon-opacity` != null) __obj.updateDynamic("icon-opacity")(`icon-opacity`.asInstanceOf[js.Any])
    if (`icon-opacity-transition` != null) __obj.updateDynamic("icon-opacity-transition")(`icon-opacity-transition`)
    if (`icon-translate` != null) __obj.updateDynamic("icon-translate")(`icon-translate`.asInstanceOf[js.Any])
    if (`icon-translate-anchor` != null) __obj.updateDynamic("icon-translate-anchor")(`icon-translate-anchor`.asInstanceOf[js.Any])
    if (`icon-translate-transition` != null) __obj.updateDynamic("icon-translate-transition")(`icon-translate-transition`)
    if (`text-color` != null) __obj.updateDynamic("text-color")(`text-color`.asInstanceOf[js.Any])
    if (`text-color-transition` != null) __obj.updateDynamic("text-color-transition")(`text-color-transition`)
    if (`text-halo-blur` != null) __obj.updateDynamic("text-halo-blur")(`text-halo-blur`.asInstanceOf[js.Any])
    if (`text-halo-blur-transition` != null) __obj.updateDynamic("text-halo-blur-transition")(`text-halo-blur-transition`)
    if (`text-halo-color` != null) __obj.updateDynamic("text-halo-color")(`text-halo-color`.asInstanceOf[js.Any])
    if (`text-halo-color-transition` != null) __obj.updateDynamic("text-halo-color-transition")(`text-halo-color-transition`)
    if (`text-halo-width` != null) __obj.updateDynamic("text-halo-width")(`text-halo-width`.asInstanceOf[js.Any])
    if (`text-halo-width-transition` != null) __obj.updateDynamic("text-halo-width-transition")(`text-halo-width-transition`)
    if (`text-opacity` != null) __obj.updateDynamic("text-opacity")(`text-opacity`.asInstanceOf[js.Any])
    if (`text-opacity-transition` != null) __obj.updateDynamic("text-opacity-transition")(`text-opacity-transition`)
    if (`text-translate` != null) __obj.updateDynamic("text-translate")(`text-translate`.asInstanceOf[js.Any])
    if (`text-translate-anchor` != null) __obj.updateDynamic("text-translate-anchor")(`text-translate-anchor`.asInstanceOf[js.Any])
    if (`text-translate-transition` != null) __obj.updateDynamic("text-translate-transition")(`text-translate-transition`)
    __obj.asInstanceOf[SymbolPaint]
  }
}

