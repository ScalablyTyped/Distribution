package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.geojson.mod.Point
import typings.mapboxGl.mod.Map
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotselectionchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawSelectionChangeEvent
  extends StObject
     with DrawEvent {
  
  var features: js.Array[Feature[Geometry, GeoJsonProperties]]
  
  // Array of features that are selected after the change
  var points: js.Array[Feature[Point, GeoJsonProperties]]
  
  @JSName("type")
  var type_DrawSelectionChangeEvent: drawDotselectionchange
}
object DrawSelectionChangeEvent {
  
  inline def apply(
    features: js.Array[Feature[Geometry, GeoJsonProperties]],
    points: js.Array[Feature[Point, GeoJsonProperties]],
    target: Map
  ): DrawSelectionChangeEvent = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw.selectionchange")
    __obj.asInstanceOf[DrawSelectionChangeEvent]
  }
  
  extension [Self <: DrawSelectionChangeEvent](x: Self) {
    
    inline def setFeatures(value: js.Array[Feature[Geometry, GeoJsonProperties]]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: (Feature[Geometry, GeoJsonProperties])*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setPoints(value: js.Array[Feature[Point, GeoJsonProperties]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: (Feature[Point, GeoJsonProperties])*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setType(value: drawDotselectionchange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
