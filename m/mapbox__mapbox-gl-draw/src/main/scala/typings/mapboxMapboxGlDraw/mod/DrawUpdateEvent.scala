package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxGl.mod.Map
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotupdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawUpdateEvent
  extends StObject
     with DrawEvent {
  
  // Array of features that were updated
  var action: String
  
  var features: js.Array[Feature[Geometry, GeoJsonProperties]]
  
  // Name of the action that triggered the update
  @JSName("type")
  var type_DrawUpdateEvent: drawDotupdate
}
object DrawUpdateEvent {
  
  inline def apply(action: String, features: js.Array[Feature[Geometry, GeoJsonProperties]], target: Map): DrawUpdateEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw.update")
    __obj.asInstanceOf[DrawUpdateEvent]
  }
  
  extension [Self <: DrawUpdateEvent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: js.Array[Feature[Geometry, GeoJsonProperties]]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: (Feature[Geometry, GeoJsonProperties])*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setType(value: drawDotupdate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
