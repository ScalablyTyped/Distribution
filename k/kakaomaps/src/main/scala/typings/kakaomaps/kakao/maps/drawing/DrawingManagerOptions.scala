package typings.kakaomaps.kakao.maps.drawing

import typings.kakaomaps.kakao.maps.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawingManagerOptions extends StObject {
  
  var arrowOptions: ArrowOptions
  
  var circleOptions: CircleOptions
  
  var drawingMode: js.Array[OverlayType]
  
  var ellipseOptions: EllipseOptions
  
  var guideTooltip: js.Array[String]
  
  var map: Map
  
  var markerOptions: MarkerOptions
  
  var polygonOptions: PolygonOptions
  
  var polylineOptions: PolylineOptions
  
  var rectangleOptions: RectangleOptions
}
object DrawingManagerOptions {
  
  inline def apply(
    arrowOptions: ArrowOptions,
    circleOptions: CircleOptions,
    drawingMode: js.Array[OverlayType],
    ellipseOptions: EllipseOptions,
    guideTooltip: js.Array[String],
    map: Map,
    markerOptions: MarkerOptions,
    polygonOptions: PolygonOptions,
    polylineOptions: PolylineOptions,
    rectangleOptions: RectangleOptions
  ): DrawingManagerOptions = {
    val __obj = js.Dynamic.literal(arrowOptions = arrowOptions.asInstanceOf[js.Any], circleOptions = circleOptions.asInstanceOf[js.Any], drawingMode = drawingMode.asInstanceOf[js.Any], ellipseOptions = ellipseOptions.asInstanceOf[js.Any], guideTooltip = guideTooltip.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], markerOptions = markerOptions.asInstanceOf[js.Any], polygonOptions = polygonOptions.asInstanceOf[js.Any], polylineOptions = polylineOptions.asInstanceOf[js.Any], rectangleOptions = rectangleOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawingManagerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawingManagerOptions] (val x: Self) extends AnyVal {
    
    inline def setArrowOptions(value: ArrowOptions): Self = StObject.set(x, "arrowOptions", value.asInstanceOf[js.Any])
    
    inline def setCircleOptions(value: CircleOptions): Self = StObject.set(x, "circleOptions", value.asInstanceOf[js.Any])
    
    inline def setDrawingMode(value: js.Array[OverlayType]): Self = StObject.set(x, "drawingMode", value.asInstanceOf[js.Any])
    
    inline def setDrawingModeVarargs(value: OverlayType*): Self = StObject.set(x, "drawingMode", js.Array(value*))
    
    inline def setEllipseOptions(value: EllipseOptions): Self = StObject.set(x, "ellipseOptions", value.asInstanceOf[js.Any])
    
    inline def setGuideTooltip(value: js.Array[String]): Self = StObject.set(x, "guideTooltip", value.asInstanceOf[js.Any])
    
    inline def setGuideTooltipVarargs(value: String*): Self = StObject.set(x, "guideTooltip", js.Array(value*))
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMarkerOptions(value: MarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
    
    inline def setPolygonOptions(value: PolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
    
    inline def setPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
    
    inline def setRectangleOptions(value: RectangleOptions): Self = StObject.set(x, "rectangleOptions", value.asInstanceOf[js.Any])
  }
}
