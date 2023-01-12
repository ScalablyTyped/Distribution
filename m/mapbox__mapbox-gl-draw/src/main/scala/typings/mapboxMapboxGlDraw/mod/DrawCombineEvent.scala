package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxGl.mod.Map
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotcombine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawCombineEvent
  extends StObject
     with DrawEvent {
  
  // Array of deleted features (those incorporated into new multifeatures)
  var createdFeatures: js.Array[Feature[Geometry, GeoJsonProperties]]
  
  var deletedFeatures: js.Array[Feature[Geometry, GeoJsonProperties]]
  
  // Array of created multifeatures
  @JSName("type")
  var type_DrawCombineEvent: drawDotcombine
}
object DrawCombineEvent {
  
  inline def apply(
    createdFeatures: js.Array[Feature[Geometry, GeoJsonProperties]],
    deletedFeatures: js.Array[Feature[Geometry, GeoJsonProperties]],
    target: Map
  ): DrawCombineEvent = {
    val __obj = js.Dynamic.literal(createdFeatures = createdFeatures.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw.combine")
    __obj.asInstanceOf[DrawCombineEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawCombineEvent] (val x: Self) extends AnyVal {
    
    inline def setCreatedFeatures(value: js.Array[Feature[Geometry, GeoJsonProperties]]): Self = StObject.set(x, "createdFeatures", value.asInstanceOf[js.Any])
    
    inline def setCreatedFeaturesVarargs(value: (Feature[Geometry, GeoJsonProperties])*): Self = StObject.set(x, "createdFeatures", js.Array(value*))
    
    inline def setDeletedFeatures(value: js.Array[Feature[Geometry, GeoJsonProperties]]): Self = StObject.set(x, "deletedFeatures", value.asInstanceOf[js.Any])
    
    inline def setDeletedFeaturesVarargs(value: (Feature[Geometry, GeoJsonProperties])*): Self = StObject.set(x, "deletedFeatures", js.Array(value*))
    
    inline def setType(value: drawDotcombine): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
