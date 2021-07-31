package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleOptions extends StObject {
  
  /** The center */
  var center: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  
  /** Indicates whether this Circle handles mouse events. Defaults to true. */
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, the user can drag this circle over the map. Defaults to
    * false.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, the user can edit this circle by dragging the control
    * points shown at the center and around the circumference of the circle.
    * Defaults to false.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The fill color. All CSS3 colors are supported except for extended named
    * colors.
    */
  var fillColor: js.UndefOr[String] = js.undefined
  
  /** The fill opacity between 0.0 and 1.0 */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /** Map on which to display Circle. */
  var map: js.UndefOr[Map[Element]] = js.undefined
  
  /** The radius in meters on the Earth's surface */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * The stroke color. All CSS3 colors are supported except for extended
    * named colors.
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  
  /** The stroke opacity between 0.0 and 1.0 */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The stroke position. Defaults to CENTER. This property is not supported
    * on Internet Explorer 8 and earlier.
    */
  var strokePosition: js.UndefOr[StrokePosition] = js.undefined
  
  /** The stroke width in pixels. */
  var strokeWeight: js.UndefOr[Double] = js.undefined
  
  /** Whether this circle is visible on the map. Defaults to true. */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /** The zIndex compared to other polys. */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object CircleOptions {
  
  @scala.inline
  def apply(): CircleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleOptions]
  }
  
  @scala.inline
  implicit class CircleOptionsMutableBuilder[Self <: CircleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: LatLng | LatLngLiteral): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokePosition(value: StrokePosition): Self = StObject.set(x, "strokePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokePositionUndefined: Self = StObject.set(x, "strokePosition", js.undefined)
    
    @scala.inline
    def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
