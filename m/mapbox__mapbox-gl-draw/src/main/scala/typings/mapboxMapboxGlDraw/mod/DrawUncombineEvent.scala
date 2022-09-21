package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxGl.mod.Map
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotuncombine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawUncombineEvent
  extends StObject
     with DrawEvent {
  
  // Array of deleted multifeatures (split into features)
  var createdFeatures: js.Array[Feature[Geometry, GeoJsonProperties]]
  
  var deletedFeatures: js.Array[Feature[Geometry, GeoJsonProperties]]
  
  // Array of created features
  @JSName("type")
  var type_DrawUncombineEvent: drawDotuncombine
}
object DrawUncombineEvent {
  
  inline def apply(
    createdFeatures: js.Array[Feature[Geometry, GeoJsonProperties]],
    deletedFeatures: js.Array[Feature[Geometry, GeoJsonProperties]],
    target: Map
  ): DrawUncombineEvent = {
    val __obj = js.Dynamic.literal(createdFeatures = createdFeatures.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw.uncombine")
    __obj.asInstanceOf[DrawUncombineEvent]
  }
  
  extension [Self <: DrawUncombineEvent](x: Self) {
    
    inline def setCreatedFeatures(value: js.Array[Feature[Geometry, GeoJsonProperties]]): Self = StObject.set(x, "createdFeatures", value.asInstanceOf[js.Any])
    
    inline def setCreatedFeaturesVarargs(value: (Feature[Geometry, GeoJsonProperties])*): Self = StObject.set(x, "createdFeatures", js.Array(value*))
    
    inline def setDeletedFeatures(value: js.Array[Feature[Geometry, GeoJsonProperties]]): Self = StObject.set(x, "deletedFeatures", value.asInstanceOf[js.Any])
    
    inline def setDeletedFeaturesVarargs(value: (Feature[Geometry, GeoJsonProperties])*): Self = StObject.set(x, "deletedFeatures", js.Array(value*))
    
    inline def setType(value: drawDotuncombine): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
