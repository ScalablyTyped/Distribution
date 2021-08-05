package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineOptions extends StObject {
  
  /**
    * Indicates whether this Polyline handles mouse events. Defaults to true.
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, the user can drag this shape over the map.
    * The geodesic property defines the mode of dragging. Defaults to false.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, the user can edit this shape by dragging the control
    * points shown at the vertices and on each segment. Defaults to false.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, edges of the polygon are interpreted as geodesic and will
    * follow the curvature of the Earth. When false, edges of the polygon are
    * rendered as straight lines in screen space. Note that the shape of a
    * geodesic polygon may appear to change when dragged, as the dimensions are
    * maintained relative to the surface of the earth. Defaults to false.
    */
  var geodesic: js.UndefOr[Boolean] = js.undefined
  
  /** The icons to be rendered along the polyline. */
  var icons: js.UndefOr[js.Array[IconSequence]] = js.undefined
  
  /** Map on which to display Polyline. */
  var map: js.UndefOr[Map[Element]] = js.undefined
  
  /**
    * The ordered sequence of coordinates of the Polyline.
    * This path may be specified using either a simple array of LatLngs, or an
    * MVCArray of LatLngs. Note that if you pass a simple array, it will be
    * converted to an MVCArray Inserting or removing LatLngs in the MVCArray
    * will automatically update the polyline on the map.
    */
  var path: js.UndefOr[MVCArray[LatLng] | (js.Array[LatLng | LatLngLiteral])] = js.undefined
  
  /**
    * The stroke color. All CSS3 colors are supported except for extended
    * named colors.
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  
  /** The stroke opacity between 0.0 and 1.0. */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  /** The stroke width in pixels. */
  var strokeWeight: js.UndefOr[Double] = js.undefined
  
  /** Whether this polyline is visible on the map. Defaults to true. */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /** The zIndex compared to other polys. */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object PolylineOptions {
  
  inline def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  
  extension [Self <: PolylineOptions](x: Self) {
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
    
    inline def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
    
    inline def setIcons(value: js.Array[IconSequence]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIconsVarargs(value: IconSequence*): Self = StObject.set(x, "icons", js.Array(value :_*))
    
    inline def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPath(value: MVCArray[LatLng] | (js.Array[LatLng | LatLngLiteral])): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: (LatLng | LatLngLiteral)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
