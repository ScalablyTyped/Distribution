package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxGl.mod.Map
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.drawDotdelete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawDeleteEvent
  extends StObject
     with DrawEvent {
  
  // Array of GeoJSON objects representing the features that were deleted
  var features: js.Array[Feature[Geometry, GeoJsonProperties]]
  
  @JSName("type")
  var type_DrawDeleteEvent: drawDotdelete
}
object DrawDeleteEvent {
  
  inline def apply(features: js.Array[Feature[Geometry, GeoJsonProperties]], target: Map): DrawDeleteEvent = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("draw.delete")
    __obj.asInstanceOf[DrawDeleteEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawDeleteEvent] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: js.Array[Feature[Geometry, GeoJsonProperties]]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: (Feature[Geometry, GeoJsonProperties])*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setType(value: drawDotdelete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
