package typings.mapboxMapboxGlDraw.anon

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var featureId: String
  
  var from: (Feature[typings.geojson.mod.Point, GeoJsonProperties]) | typings.geojson.mod.Point | js.Array[Double]
}
object From {
  
  inline def apply(
    featureId: String,
    from: (Feature[typings.geojson.mod.Point, GeoJsonProperties]) | typings.geojson.mod.Point | js.Array[Double]
  ): From = {
    val __obj = js.Dynamic.literal(featureId = featureId.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def setFeatureId(value: String): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
    
    inline def setFrom(
      value: (Feature[typings.geojson.mod.Point, GeoJsonProperties]) | typings.geojson.mod.Point | js.Array[Double]
    ): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromVarargs(value: Double*): Self = StObject.set(x, "from", js.Array(value*))
  }
}
