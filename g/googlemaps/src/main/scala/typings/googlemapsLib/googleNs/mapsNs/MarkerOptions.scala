package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  /**
    * The offset from the marker's position to the tip of an InfoWindow
    * that has been opened with the marker as anchor.
    */
  var anchorPoint: js.UndefOr[Point] = js.undefined
  /** Which animation to play when marker is added to a map. */
  var animation: js.UndefOr[Animation] = js.undefined
  /**
    * If true, the marker receives mouse and touch events.
    * @default true
    */
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  /** Mouse cursor to show on hover. */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, the marker can be dragged.
    * @default false
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Icon for the foreground.
    * If a string is provided, it is treated as though it were an Icon with the
    * string as url.
    * @type {(string|Icon|Symbol)}
    */
  var icon: js.UndefOr[java.lang.String | Icon | Symbol] = js.undefined
  /**
    * Adds a label to the marker. The label can either be a string, or a
    * MarkerLabel object. Only the first character of the string will be
    * displayed.
    * @type {(string|MarkerLabel)}
    */
  var label: js.UndefOr[java.lang.String | MarkerLabel] = js.undefined
  /**
    * Map on which to display Marker.
    * @type {(Map|StreetViewPanorama)}
    *
    */
  var map: js.UndefOr[Map | StreetViewPanorama] = js.undefined
  /** The marker's opacity between 0.0 and 1.0. */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optimization renders many markers as a single static element.
    * Optimized rendering is enabled by default.
    * Disable optimized rendering for animated GIFs or PNGs, or when each
    * marker must be rendered as a separate DOM element (advanced usage
    * only).
    */
  var optimized: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Place information, used to identify and describe the place
    * associated with this Marker. In this context, 'place' means a
    * business, point of interest or geographic location. To allow a user
    * to save this place, open an info window anchored on this marker.
    * The info window will contain information about the place and an
    * option for the user to save it. Only one of position or place can
    * be specified.
    */
  var place: js.UndefOr[Place] = js.undefined
  /**
    * Marker position. Required.
    */
  var position: LatLng | LatLngLiteral
  /** Image map region definition used for drag/click. */
  var shape: js.UndefOr[MarkerShape] = js.undefined
  /** Rollover text. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** If true, the marker is visible. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * All markers are displayed on the map in order of their zIndex,
    * with higher values displaying in front of markers with lower values.
    * By default, markers are displayed according to their vertical position on
    * screen, with lower markers appearing in front of markers further up the
    * screen.
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    position: LatLng | LatLngLiteral,
    anchorPoint: Point = null,
    animation: Animation = null,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    cursor: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String | Icon | Symbol = null,
    label: java.lang.String | MarkerLabel = null,
    map: Map | StreetViewPanorama = null,
    opacity: scala.Int | scala.Double = null,
    optimized: js.UndefOr[scala.Boolean] = js.undefined,
    place: Place = null,
    shape: MarkerShape = null,
    title: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (anchorPoint != null) __obj.updateDynamic("anchorPoint")(anchorPoint)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(optimized)) __obj.updateDynamic("optimized")(optimized)
    if (place != null) __obj.updateDynamic("place")(place)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

