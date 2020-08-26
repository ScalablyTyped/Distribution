package typings.mapboxGl.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerOptions extends js.Object {
  /** A string indicating the part of the Marker that should be positioned closest to the coordinate set via Marker.setLngLat.
    * Options are `'center'`, `'top'`, `'bottom'`, `'left'`, `'right'`, `'top-left'`, `'top-right'`, `'bottom-left'`, and `'bottom-right'`.
    * The default value os `'center'`
    */
  var anchor: js.UndefOr[Anchor] = js.native
  /** The color to use for the default marker if options.element is not provided. The default is light blue (#3FB1CE). */
  var color: js.UndefOr[String] = js.native
  /** A boolean indicating whether or not a marker is able to be dragged to a new position on the map. The default value is false */
  var draggable: js.UndefOr[Boolean] = js.native
  /** DOM element to use as a marker. The default is a light blue, droplet-shaped SVG marker */
  var element: js.UndefOr[HTMLElement] = js.native
  /** The offset in pixels as a PointLike object to apply relative to the element's center. Negatives indicate left and up. */
  var offset: js.UndefOr[PointLike] = js.native
  /** `map` aligns the `Marker` to the plane of the map.
    * `viewport` aligns the `Marker` to the plane of the viewport.
    * `auto` automatically matches the value of `rotationAlignment`.
    * The default value is `auto`.
    */
  var pitchAlignment: js.UndefOr[Alignment] = js.native
  /** The rotation angle of the marker in degrees, relative to its `rotationAlignment` setting. A positive value will rotate the marker clockwise.
    * The default value is 0.
    */
  var rotation: js.UndefOr[Double] = js.native
  /** `map` aligns the `Marker`'s rotation relative to the map, maintaining a bearing as the map rotates.
    * `viewport` aligns the `Marker`'s rotation relative to the viewport, agnostic to map rotations.
    * `auto` is equivalent to `viewport`.
    * The default value is `auto`
    */
  var rotationAlignment: js.UndefOr[Alignment] = js.native
  /** The scale to use for the default marker if options.element is not provided.
    * The default scale (1) corresponds to a height of `41px` and a width of `27px`.
    */
  var scale: js.UndefOr[Double] = js.native
}

object MarkerOptions {
  @scala.inline
  def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  @scala.inline
  implicit class MarkerOptionsOps[Self <: MarkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchor(value: Anchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setOffset(value: PointLike): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPitchAlignment(value: Alignment): Self = this.set("pitchAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitchAlignment: Self = this.set("pitchAlignment", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setRotationAlignment(value: Alignment): Self = this.set("rotationAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationAlignment: Self = this.set("rotationAlignment", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

