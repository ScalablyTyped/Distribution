package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends InteractiveLayerOptions {
  /** Text for the `alt` attribute of the icon image (useful for accessibility). */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to pan the map when dragging this marker near its edge or not. */
  var autoPan: js.UndefOr[scala.Boolean] = js.undefined
  /** Distance (in pixels to the left/right and to the top/bottom) of the map edge to start panning the map. */
  var autoPanPadding: js.UndefOr[PointExpression] = js.undefined
  /** Number of pixels the map should pan by. */
  var autoPanSpeed: js.UndefOr[scala.Double] = js.undefined
  /** Whether the marker is draggable with mouse/touch or not. */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[Icon[IconOptions] | DivIcon] = js.undefined
  /** Whether the marker can be tabbed to with a keyboard and clicked by pressing enter. */
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  /** The opacity of the marker. */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** The z-index offset used for the `riseOnHover` feature. */
  var riseOffset: js.UndefOr[scala.Double] = js.undefined
  /** If `true`, the marker will get on top of others when you hover the mouse over it. */
  var riseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /** `Map pane` where the markers shadow will be added. */
  var shadowPane: js.UndefOr[java.lang.String] = js.undefined
  /** Text for the browser tooltip that appear on marker hover (no tooltip by default). */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Option for putting the marker on top of all others (or below). */
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
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    icon: Icon[IconOptions] | DivIcon = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    riseOffset: scala.Int | scala.Double = null,
    riseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    shadowPane: java.lang.String = null,
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
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (riseOffset != null) __obj.updateDynamic("riseOffset")(riseOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(riseOnHover)) __obj.updateDynamic("riseOnHover")(riseOnHover)
    if (shadowPane != null) __obj.updateDynamic("shadowPane")(shadowPane)
    if (title != null) __obj.updateDynamic("title")(title)
    if (zIndexOffset != null) __obj.updateDynamic("zIndexOffset")(zIndexOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

