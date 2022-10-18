package typings.leafletEditable.leafletMod

import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to pass to L.Editable when instanciating.
  */
trait EditableOptions extends StObject {
  
  /**
    * Class to be used when creating a new Circle.
    */
  var circleClass: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Class to be used as Circle editor.
    */
  var circleEditorClass: js.UndefOr[js.Object] = js.undefined
  
  /**
    * CSS class to be added to the map container while drawing.
    */
  var drawingCSSClass: js.UndefOr[String] = js.undefined
  
  /**
    * Cursor mode set to the map while drawing.
    */
  var drawingCursor: js.UndefOr[String] = js.undefined
  
  /**
    * Layer used to store edit tools (vertex, line guide…).
    */
  var editLayer: js.UndefOr[LayerGroup_[Layer]] = js.undefined
  
  /**
    * Default layer used to store drawn features (marker, polyline…).
    */
  var featuresLayer: js.UndefOr[LayerGroup_[Polyline | Polygon | Marker]] = js.undefined
  
  /**
    * Options to be passed to the line guides.
    */
  var lineGuideOptions: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Class to be used when creating a new Marker.
    */
  var markerClass: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Class to be used as Marker editor.
    */
  var markerEditorClass: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Class to be used when creating a new Polygon.
    */
  var polygonClass: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Class to be used as Polygon editor.
    */
  var polygonEditorClass: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Class to be used when creating a new Polyline.
    */
  var polylineClass: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Class to be used as Polyline editor.
    */
  var polylineEditorClass: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Class to be used when creating a new Rectangle.
    */
  var rectangleClass: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Class to be used as Rectangle editor.
    */
  var rectangleEditorClass: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Set this to true if you don't want middle markers.
    */
  var skipMiddleMarkers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default zIndex of the editing tools.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object EditableOptions {
  
  inline def apply(): EditableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditableOptions]
  }
  
  extension [Self <: EditableOptions](x: Self) {
    
    inline def setCircleClass(value: js.Object): Self = StObject.set(x, "circleClass", value.asInstanceOf[js.Any])
    
    inline def setCircleClassUndefined: Self = StObject.set(x, "circleClass", js.undefined)
    
    inline def setCircleEditorClass(value: js.Object): Self = StObject.set(x, "circleEditorClass", value.asInstanceOf[js.Any])
    
    inline def setCircleEditorClassUndefined: Self = StObject.set(x, "circleEditorClass", js.undefined)
    
    inline def setDrawingCSSClass(value: String): Self = StObject.set(x, "drawingCSSClass", value.asInstanceOf[js.Any])
    
    inline def setDrawingCSSClassUndefined: Self = StObject.set(x, "drawingCSSClass", js.undefined)
    
    inline def setDrawingCursor(value: String): Self = StObject.set(x, "drawingCursor", value.asInstanceOf[js.Any])
    
    inline def setDrawingCursorUndefined: Self = StObject.set(x, "drawingCursor", js.undefined)
    
    inline def setEditLayer(value: LayerGroup_[Layer]): Self = StObject.set(x, "editLayer", value.asInstanceOf[js.Any])
    
    inline def setEditLayerUndefined: Self = StObject.set(x, "editLayer", js.undefined)
    
    inline def setFeaturesLayer(value: LayerGroup_[Polyline | Polygon | Marker]): Self = StObject.set(x, "featuresLayer", value.asInstanceOf[js.Any])
    
    inline def setFeaturesLayerUndefined: Self = StObject.set(x, "featuresLayer", js.undefined)
    
    inline def setLineGuideOptions(value: js.Object): Self = StObject.set(x, "lineGuideOptions", value.asInstanceOf[js.Any])
    
    inline def setLineGuideOptionsUndefined: Self = StObject.set(x, "lineGuideOptions", js.undefined)
    
    inline def setMarkerClass(value: js.Object): Self = StObject.set(x, "markerClass", value.asInstanceOf[js.Any])
    
    inline def setMarkerClassUndefined: Self = StObject.set(x, "markerClass", js.undefined)
    
    inline def setMarkerEditorClass(value: js.Object): Self = StObject.set(x, "markerEditorClass", value.asInstanceOf[js.Any])
    
    inline def setMarkerEditorClassUndefined: Self = StObject.set(x, "markerEditorClass", js.undefined)
    
    inline def setPolygonClass(value: js.Object): Self = StObject.set(x, "polygonClass", value.asInstanceOf[js.Any])
    
    inline def setPolygonClassUndefined: Self = StObject.set(x, "polygonClass", js.undefined)
    
    inline def setPolygonEditorClass(value: js.Object): Self = StObject.set(x, "polygonEditorClass", value.asInstanceOf[js.Any])
    
    inline def setPolygonEditorClassUndefined: Self = StObject.set(x, "polygonEditorClass", js.undefined)
    
    inline def setPolylineClass(value: js.Object): Self = StObject.set(x, "polylineClass", value.asInstanceOf[js.Any])
    
    inline def setPolylineClassUndefined: Self = StObject.set(x, "polylineClass", js.undefined)
    
    inline def setPolylineEditorClass(value: js.Object): Self = StObject.set(x, "polylineEditorClass", value.asInstanceOf[js.Any])
    
    inline def setPolylineEditorClassUndefined: Self = StObject.set(x, "polylineEditorClass", js.undefined)
    
    inline def setRectangleClass(value: js.Object): Self = StObject.set(x, "rectangleClass", value.asInstanceOf[js.Any])
    
    inline def setRectangleClassUndefined: Self = StObject.set(x, "rectangleClass", js.undefined)
    
    inline def setRectangleEditorClass(value: js.Object): Self = StObject.set(x, "rectangleEditorClass", value.asInstanceOf[js.Any])
    
    inline def setRectangleEditorClassUndefined: Self = StObject.set(x, "rectangleEditorClass", js.undefined)
    
    inline def setSkipMiddleMarkers(value: Boolean): Self = StObject.set(x, "skipMiddleMarkers", value.asInstanceOf[js.Any])
    
    inline def setSkipMiddleMarkersUndefined: Self = StObject.set(x, "skipMiddleMarkers", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
