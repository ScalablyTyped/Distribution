package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `MarkerOptions` object used to define the properties that can be set on a
  * {@link Marker}.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions Maps JavaScript API}
  */
@js.native
trait MarkerOptions extends js.Object {
  /**
    * The offset from the marker's position to the tip of an InfoWindow that
    * has been opened with the marker as anchor.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.anchorPoint Maps JavaScript API}
    */
  var anchorPoint: js.UndefOr[Point] = js.native
  /**
    * Which animation to play when marker is added to a map.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.animation Maps JavaScript API}
    */
  var animation: js.UndefOr[Animation] = js.native
  /**
    * If `true`, the marker receives mouse and touch events.
    * @default true
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.clickable Maps JavaScript API}
    */
  var clickable: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, disables cross that appears beneath the marker when dragging.
    * @default true
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.crossOnDrag Maps JavaScript API}
    */
  var crossOnDrag: js.UndefOr[Boolean] = js.native
  /**
    * Mouse cursor to show on hover.
    * @default 'pointer'
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.cursor Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#cursor}
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * If `true`, the marker can be dragged.
    * @default false
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.draggable Maps JavaScript API}
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * Icon for the foreground. If a `string` is provided, it is treated as
    * though it were an {@link Icon} with the `string` as {@link Icon#url url}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.icon Maps JavaScript API}
    */
  // tslint:disable-next-line:no-unnecessary-qualifier
  var icon: js.UndefOr[String | Icon | Symbol] = js.native
  /**
    * Adds a label to the marker. The label can either be a `string`, or a
    * {@link MarkerLabel} object.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.label Maps JavaScript API}
    */
  var label: js.UndefOr[String | MarkerLabel] = js.native
  /**
    * Map on which to display Marker.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.map Maps JavaScript API}
    */
  var map: js.UndefOr[Map[Element] | StreetViewPanorama] = js.native
  /**
    * The marker's opacity between 0.0 and 1.0.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.opacity Maps JavaScript API}
    * @default 1.0
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Optimization renders many markers as a single static element. Optimized
    * rendering is enabled by default. Disable optimized rendering for animated
    * GIFs or PNGs, or when each marker must be rendered as a separate DOM
    * element (advanced usage only).
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.optimized Maps JavaScript API}
    */
  var optimized: js.UndefOr[Boolean] = js.native
  /**
    * Marker position.
    * **Note that the `position` must be set for the marker to display.**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.position Maps JavaScript API}
    */
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.native
  /**
    * Image map region definition used for drag/click.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.shape Maps JavaScript API}
    */
  var shape: js.UndefOr[MarkerShape] = js.native
  /**
    * Rollover text.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.title Maps JavaScript API}
    * @see {@link HTMLElement#title}
    */
  var title: js.UndefOr[String] = js.native
  /**
    * If `true`, the marker is visible.
    * @default true
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.visible Maps JavaScript API}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * All markers are displayed on the map in order of their `zIndex`, with
    * higher values displaying in front of markers with lower values. By
    * default, markers are displayed according to their vertical position on
    * screen, with lower markers appearing in front of markers further up the
    * screen.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions.zIndex Maps JavaScript API}
    */
  var zIndex: js.UndefOr[Double] = js.native
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
    def setAnchorPoint(value: Point): Self = this.set("anchorPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorPoint: Self = this.set("anchorPoint", js.undefined)
    @scala.inline
    def setAnimation(value: Animation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setCrossOnDrag(value: Boolean): Self = this.set("crossOnDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOnDrag: Self = this.set("crossOnDrag", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setIcon(value: String | Icon | Symbol): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLabel(value: String | MarkerLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMap(value: Map[Element] | StreetViewPanorama): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOptimized(value: Boolean): Self = this.set("optimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimized: Self = this.set("optimized", js.undefined)
    @scala.inline
    def setPosition(value: LatLng | LatLngLiteral): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShape(value: MarkerShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

