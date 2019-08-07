package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `MarkerOptions` object used to define the properties that can be set on a
  * {@link Marker}.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions Maps JavaScript API}
  */
trait MarkerOptions extends js.Object {
  /**
    * The offset from the marker's position to the tip of an InfoWindow that
    * has been opened with the marker as anchor.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.anchorPoint Maps JavaScript API}
    */
  var anchorPoint: js.UndefOr[Point] = js.undefined
  /**
    * Which animation to play when marker is added to a map.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.animation Maps JavaScript API}
    */
  var animation: js.UndefOr[Animation] = js.undefined
  /**
    * If `true`, the marker receives mouse and touch events.
    * @default true
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.clickable Maps JavaScript API}
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  /**
    * If `false`, disables cross that appears beneath the marker when dragging.
    * @default true
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.crossOnDrag Maps JavaScript API}
    */
  var crossOnDrag: js.UndefOr[Boolean] = js.undefined
  /**
    * Mouse cursor to show on hover.
    * @default 'pointer'
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.cursor Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#cursor}
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the marker can be dragged.
    * @default false
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.draggable Maps JavaScript API}
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * Icon for the foreground. If a `string` is provided, it is treated as
    * though it were an {@link Icon} with the `string` as {@link Icon#url url}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.icon Maps JavaScript API}
    */
  // tslint:disable-next-line:no-unnecessary-qualifier
  var icon: js.UndefOr[String | Icon | Symbol] = js.undefined
  /**
    * Adds a label to the marker. The label can either be a `string`, or a
    * {@link MarkerLabel} object.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.label Maps JavaScript API}
    */
  var label: js.UndefOr[String | MarkerLabel] = js.undefined
  /**
    * Map on which to display Marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.map Maps JavaScript API}
    */
  var map: js.UndefOr[Map | StreetViewPanorama] = js.undefined
  /**
    * The marker's opacity between 0.0 and 1.0.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.opacity Maps JavaScript API}
    * @default 1.0
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Optimization renders many markers as a single static element. Optimized
    * rendering is enabled by default. Disable optimized rendering for animated
    * GIFs or PNGs, or when each marker must be rendered as a separate DOM
    * element (advanced usage only).
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.optimized Maps JavaScript API}
    */
  var optimized: js.UndefOr[Boolean] = js.undefined
  /**
    * Marker position.
    * **Note that the `position` must be set for the marker to display.**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.position Maps JavaScript API}
    */
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  /**
    * Image map region definition used for drag/click.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.shape Maps JavaScript API}
    */
  var shape: js.UndefOr[MarkerShape] = js.undefined
  /**
    * Rollover text.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.title Maps JavaScript API}
    * @see {@link HTMLElement#title}
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the marker is visible.
    * @default true
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.visible Maps JavaScript API}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * All markers are displayed on the map in order of their `zIndex`, with
    * higher values displaying in front of markers with lower values. By
    * default, markers are displayed according to their vertical position on
    * screen, with lower markers appearing in front of markers further up the
    * screen.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.zIndex Maps JavaScript API}
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    anchorPoint: Point = null,
    animation: Animation = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    crossOnDrag: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    icon: String | Icon | Symbol = null,
    label: String | MarkerLabel = null,
    map: Map | StreetViewPanorama = null,
    opacity: Int | Double = null,
    optimized: js.UndefOr[Boolean] = js.undefined,
    position: LatLng | LatLngLiteral = null,
    shape: MarkerShape = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (anchorPoint != null) __obj.updateDynamic("anchorPoint")(anchorPoint)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (!js.isUndefined(crossOnDrag)) __obj.updateDynamic("crossOnDrag")(crossOnDrag)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(optimized)) __obj.updateDynamic("optimized")(optimized)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

