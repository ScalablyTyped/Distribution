package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends InteractiveLayerOptions {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var autoPan: js.UndefOr[scala.Boolean] = js.undefined
  var autoPanPadding: js.UndefOr[PointExpression] = js.undefined
  var autoPanSpeed: js.UndefOr[scala.Double] = js.undefined
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[Icon[IconOptions] | DivIcon] = js.undefined
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var riseOffset: js.UndefOr[scala.Double] = js.undefined
  var riseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var zIndexOffset: js.UndefOr[scala.Double] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    attribution: java.lang.String = null,
    autoPan: js.UndefOr[scala.Boolean] = js.undefined,
    autoPanPadding: PointExpression = null,
    autoPanSpeed: scala.Int | scala.Double = null,
    bubblingMouseEvents: js.UndefOr[scala.Boolean] = js.undefined,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    icon: Icon[IconOptions] | DivIcon = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    riseOffset: scala.Int | scala.Double = null,
    riseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    zIndexOffset: scala.Int | scala.Double = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan)
    if (autoPanPadding != null) __obj.updateDynamic("autoPanPadding")(autoPanPadding.asInstanceOf[js.Any])
    if (autoPanSpeed != null) __obj.updateDynamic("autoPanSpeed")(autoPanSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (riseOffset != null) __obj.updateDynamic("riseOffset")(riseOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(riseOnHover)) __obj.updateDynamic("riseOnHover")(riseOnHover)
    if (title != null) __obj.updateDynamic("title")(title)
    if (zIndexOffset != null) __obj.updateDynamic("zIndexOffset")(zIndexOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

