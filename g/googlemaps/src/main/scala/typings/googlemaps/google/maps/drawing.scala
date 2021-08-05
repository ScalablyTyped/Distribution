package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  @js.native
  sealed trait OverlayType extends StObject
  /**
    * The types of overlay that may be created by the DrawingManager. Specify
    * these by value, or by using the constant's name. For example, 'polygon'
    * or google.maps.drawing.OverlayType.POLYGON.
    */
  @JSGlobal("google.maps.drawing.OverlayType")
  @js.native
  object OverlayType extends StObject {
    
    /**
      * Specifies that the DrawingManager creates circles, and that the overlay
      * given in the overlaycomplete event is a circle.
      */
    @js.native
    sealed trait CIRCLE
      extends StObject
         with OverlayType
    
    /**
      * Specifies that the DrawingManager creates markers, and that the overlay
      * given in the overlaycomplete event is a marker.
      */
    @js.native
    sealed trait MARKER
      extends StObject
         with OverlayType
    
    /**
      * Specifies that the DrawingManager creates polygons, and that the
      * overlay given in the overlaycomplete event is a polygon.
      */
    @js.native
    sealed trait POLYGON
      extends StObject
         with OverlayType
    
    /**
      * Specifies that the DrawingManager creates polylines, and that the
      * overlay given in the overlaycomplete event is a polyline.
      */
    @js.native
    sealed trait POLYLINE
      extends StObject
         with OverlayType
    
    /**
      * Specifies that the DrawingManager creates rectangles, and that the
      * overlay given in the overlaycomplete event is a rectangle.
      */
    @js.native
    sealed trait RECTANGLE
      extends StObject
         with OverlayType
  }
  
  trait DrawingControlOptions extends StObject {
    
    var drawingModes: js.UndefOr[js.Array[OverlayType]] = js.undefined
    
    var position: js.UndefOr[ControlPosition] = js.undefined
  }
  object DrawingControlOptions {
    
    inline def apply(): DrawingControlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawingControlOptions]
    }
    
    extension [Self <: DrawingControlOptions](x: Self) {
      
      inline def setDrawingModes(value: js.Array[OverlayType]): Self = StObject.set(x, "drawingModes", value.asInstanceOf[js.Any])
      
      inline def setDrawingModesUndefined: Self = StObject.set(x, "drawingModes", js.undefined)
      
      inline def setDrawingModesVarargs(value: OverlayType*): Self = StObject.set(x, "drawingModes", js.Array(value :_*))
      
      inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  @js.native
  trait DrawingManager
    extends StObject
       with MVCObject {
    
    def getDrawingMode(): OverlayType = js.native
    
    def getMap(): Map[Element] = js.native
    
    def setDrawingMode(): Unit = js.native
    def setDrawingMode(drawingMode: OverlayType): Unit = js.native
    
    def setMap(): Unit = js.native
    def setMap(map: Map[Element]): Unit = js.native
    
    def setOptions(options: DrawingManagerOptions): Unit = js.native
  }
  
  /** Options for the drawing manager. */
  trait DrawingManagerOptions extends StObject {
    
    /**
      * Options to apply to any new circles created with this DrawingManager.
      * The center and radius properties are ignored, and the map property of a
      * new circle is always set to the DrawingManager's map.
      */
    var circleOptions: js.UndefOr[CircleOptions] = js.undefined
    
    /**
      * The enabled/disabled state of the drawing control. Defaults to true.
      */
    var drawingControl: js.UndefOr[Boolean] = js.undefined
    
    /** The display options for the drawing control. */
    var drawingControlOptions: js.UndefOr[DrawingControlOptions] = js.undefined
    
    /**
      * The DrawingManager's drawing mode, which defines the type of overlay to
      * be added on the map. Accepted values are 'marker', 'polygon',
      * 'polyline', 'rectangle', 'circle', or null. A drawing mode of null
      * means that the user can interact with the map as normal, and clicks do
      * not draw anything.
      */
    var drawingMode: js.UndefOr[OverlayType | Null] = js.undefined
    
    /**
      * The Map to which the DrawingManager is attached, which is the Map on
      * which the overlays created will be placed.
      */
    var map: js.UndefOr[Map[Element]] = js.undefined
    
    /**
      * Options to apply to any new markers created with this DrawingManager.
      * The position property is ignored, and the map property of a new marker
      * is always set to the DrawingManager's map.
      */
    var markerOptions: js.UndefOr[MarkerOptions] = js.undefined
    
    /**
      * Options to apply to any new polygons created with this DrawingManager.
      * The paths property is ignored, and the map property of a new polygon is
      * always set to the DrawingManager's map.
      */
    var polygonOptions: js.UndefOr[PolygonOptions] = js.undefined
    
    /**
      * Options to apply to any new polylines created with this DrawingManager.
      * The path property is ignored, and the map property of a new polyline is
      * always set to the DrawingManager's map.
      */
    var polylineOptions: js.UndefOr[PolylineOptions] = js.undefined
    
    /**
      * Options to apply to any new rectangles created with this
      * DrawingManager. The bounds property is ignored, and the map property of
      * a new rectangle is always set to the DrawingManager's map.
      */
    var rectangleOptions: js.UndefOr[RectangleOptions] = js.undefined
  }
  object DrawingManagerOptions {
    
    inline def apply(): DrawingManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawingManagerOptions]
    }
    
    extension [Self <: DrawingManagerOptions](x: Self) {
      
      inline def setCircleOptions(value: CircleOptions): Self = StObject.set(x, "circleOptions", value.asInstanceOf[js.Any])
      
      inline def setCircleOptionsUndefined: Self = StObject.set(x, "circleOptions", js.undefined)
      
      inline def setDrawingControl(value: Boolean): Self = StObject.set(x, "drawingControl", value.asInstanceOf[js.Any])
      
      inline def setDrawingControlOptions(value: DrawingControlOptions): Self = StObject.set(x, "drawingControlOptions", value.asInstanceOf[js.Any])
      
      inline def setDrawingControlOptionsUndefined: Self = StObject.set(x, "drawingControlOptions", js.undefined)
      
      inline def setDrawingControlUndefined: Self = StObject.set(x, "drawingControl", js.undefined)
      
      inline def setDrawingMode(value: OverlayType): Self = StObject.set(x, "drawingMode", value.asInstanceOf[js.Any])
      
      inline def setDrawingModeNull: Self = StObject.set(x, "drawingMode", null)
      
      inline def setDrawingModeUndefined: Self = StObject.set(x, "drawingMode", js.undefined)
      
      inline def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMarkerOptions(value: MarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
      
      inline def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
      
      inline def setPolygonOptions(value: PolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
      
      inline def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
      
      inline def setPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
      
      inline def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
      
      inline def setRectangleOptions(value: RectangleOptions): Self = StObject.set(x, "rectangleOptions", value.asInstanceOf[js.Any])
      
      inline def setRectangleOptionsUndefined: Self = StObject.set(x, "rectangleOptions", js.undefined)
    }
  }
  
  /** The properties of an overlaycomplete event on a DrawingManager.. */
  trait OverlayCompleteEvent extends StObject {
    
    /** The completed overlay. */
    var overlay: Marker | Polygon | Polyline | Rectangle | Circle
    
    /** The completed overlay's type. */
    var `type`: OverlayType
  }
  object OverlayCompleteEvent {
    
    inline def apply(overlay: Marker | Polygon | Polyline | Rectangle | Circle, `type`: OverlayType): OverlayCompleteEvent = {
      val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayCompleteEvent]
    }
    
    extension [Self <: OverlayCompleteEvent](x: Self) {
      
      inline def setOverlay(value: Marker | Polygon | Polyline | Rectangle | Circle): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setType(value: OverlayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
