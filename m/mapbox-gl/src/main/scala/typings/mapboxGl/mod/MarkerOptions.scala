package typings.mapboxGl.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  /** A string indicating the part of the Marker that should be positioned closest to the coordinate set via Marker.setLngLat.
    * Options are `'center'`, `'top'`, `'bottom'`, `'left'`, `'right'`, `'top-left'`, `'top-right'`, `'bottom-left'`, and `'bottom-right'`.
    * The default value os `'center'`
    */
  var anchor: js.UndefOr[Anchor] = js.undefined
  /** The color to use for the default marker if options.element is not provided. The default is light blue (#3FB1CE). */
  var color: js.UndefOr[String] = js.undefined
  /** A boolean indicating whether or not a marker is able to be dragged to a new position on the map. The default value is false */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /** DOM element to use as a marker. The default is a light blue, droplet-shaped SVG marker */
  var element: js.UndefOr[HTMLElement] = js.undefined
  /** The offset in pixels as a PointLike object to apply relative to the element's center. Negatives indicate left and up. */
  var offset: js.UndefOr[PointLike] = js.undefined
  /** `map` aligns the `Marker` to the plane of the map.
    * `viewport` aligns the `Marker` to the plane of the viewport.
    * `auto` automatically matches the value of `rotationAlignment`.
    * The default value is `auto`.
    */
  var pitchAlignment: js.UndefOr[Alignment] = js.undefined
  /** The rotation angle of the marker in degrees, relative to its `rotationAlignment` setting. A positive value will rotate the marker clockwise.
    * The default value is 0.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /** `map` aligns the `Marker`'s rotation relative to the map, maintaining a bearing as the map rotates.
    * `viewport` aligns the `Marker`'s rotation relative to the viewport, agnostic to map rotations.
    * `auto` is equivalent to `viewport`.
    * The default value is `auto`
    */
  var rotationAlignment: js.UndefOr[Alignment] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    anchor: Anchor = null,
    color: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    element: HTMLElement = null,
    offset: PointLike = null,
    pitchAlignment: Alignment = null,
    rotation: js.UndefOr[Double] = js.undefined,
    rotationAlignment: Alignment = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (pitchAlignment != null) __obj.updateDynamic("pitchAlignment")(pitchAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (rotationAlignment != null) __obj.updateDynamic("rotationAlignment")(rotationAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

