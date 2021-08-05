package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `MarkerOptions` object used to define the properties that can be set on a
  * {@link Marker}.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerOptions Maps JavaScript API}
  */
trait MarkerOptions extends StObject {
  
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
  var map: js.UndefOr[Map[Element] | StreetViewPanorama] = js.undefined
  
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
  
  inline def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  
  extension [Self <: MarkerOptions](x: Self) {
    
    inline def setAnchorPoint(value: Point): Self = StObject.set(x, "anchorPoint", value.asInstanceOf[js.Any])
    
    inline def setAnchorPointUndefined: Self = StObject.set(x, "anchorPoint", js.undefined)
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setCrossOnDrag(value: Boolean): Self = StObject.set(x, "crossOnDrag", value.asInstanceOf[js.Any])
    
    inline def setCrossOnDragUndefined: Self = StObject.set(x, "crossOnDrag", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setIcon(value: String | Icon | Symbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String | MarkerLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMap(value: Map[Element] | StreetViewPanorama): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOptimized(value: Boolean): Self = StObject.set(x, "optimized", value.asInstanceOf[js.Any])
    
    inline def setOptimizedUndefined: Self = StObject.set(x, "optimized", js.undefined)
    
    inline def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
