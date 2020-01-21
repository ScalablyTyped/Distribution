package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends InteractiveLayerOptions {
  /** Text for the `alt` attribute of the icon image (useful for accessibility). */
  var alt: js.UndefOr[String] = js.undefined
  /** Whether to pan the map when dragging this marker near its edge or not. */
  var autoPan: js.UndefOr[Boolean] = js.undefined
  /** Distance (in pixels to the left/right and to the top/bottom) of the map edge to start panning the map. */
  var autoPanPadding: js.UndefOr[PointExpression] = js.undefined
  /** Number of pixels the map should pan by. */
  var autoPanSpeed: js.UndefOr[Double] = js.undefined
  /** Whether the marker is draggable with mouse/touch or not. */
  var draggable: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
  /** Whether the marker can be tabbed to with a keyboard and clicked by pressing enter. */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  /** The opacity of the marker. */
  var opacity: js.UndefOr[Double] = js.undefined
  /** The z-index offset used for the `riseOnHover` feature. */
  var riseOffset: js.UndefOr[Double] = js.undefined
  /** If `true`, the marker will get on top of others when you hover the mouse over it. */
  var riseOnHover: js.UndefOr[Boolean] = js.undefined
  /** `Map pane` where the markers shadow will be added. */
  var shadowPane: js.UndefOr[String] = js.undefined
  /** Text for the browser tooltip that appear on marker hover (no tooltip by default). */
  var title: js.UndefOr[String] = js.undefined
  /** Option for putting the marker on top of all others (or below). */
  var zIndexOffset: js.UndefOr[Double] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    alt: String = null,
    attribution: String = null,
    autoPan: js.UndefOr[Boolean] = js.undefined,
    autoPanPadding: PointExpression = null,
    autoPanSpeed: Int | Double = null,
    bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    icon: Icon_[IconOptions] | DivIcon_ = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    pane: String = null,
    riseOffset: Int | Double = null,
    riseOnHover: js.UndefOr[Boolean] = js.undefined,
    shadowPane: String = null,
    title: String = null,
    zIndexOffset: Int | Double = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPan)) __obj.updateDynamic("autoPan")(autoPan.asInstanceOf[js.Any])
    if (autoPanPadding != null) __obj.updateDynamic("autoPanPadding")(autoPanPadding.asInstanceOf[js.Any])
    if (autoPanSpeed != null) __obj.updateDynamic("autoPanSpeed")(autoPanSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(bubblingMouseEvents)) __obj.updateDynamic("bubblingMouseEvents")(bubblingMouseEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (riseOffset != null) __obj.updateDynamic("riseOffset")(riseOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(riseOnHover)) __obj.updateDynamic("riseOnHover")(riseOnHover.asInstanceOf[js.Any])
    if (shadowPane != null) __obj.updateDynamic("shadowPane")(shadowPane.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (zIndexOffset != null) __obj.updateDynamic("zIndexOffset")(zIndexOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

