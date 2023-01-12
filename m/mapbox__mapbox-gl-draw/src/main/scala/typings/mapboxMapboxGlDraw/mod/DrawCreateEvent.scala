package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxGl.mod.Map
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotcreate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawCreateEvent
  extends StObject
     with DrawEvent {
  
  // Array of GeoJSON objects representing the features that were created
  var features: js.Array[Feature[Geometry, GeoJsonProperties]]
  
  @JSName("type")
  var type_DrawCreateEvent: drawDotcreate
}
object DrawCreateEvent {
  
  inline def apply(features: js.Array[Feature[Geometry, GeoJsonProperties]], target: Map): DrawCreateEvent = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw.create")
    __obj.asInstanceOf[DrawCreateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawCreateEvent] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: js.Array[Feature[Geometry, GeoJsonProperties]]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: (Feature[Geometry, GeoJsonProperties])*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setType(value: drawDotcreate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
