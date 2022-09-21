package typings.maplibreGl.anon

import typings.maplibreGl.mod.GeoJSONFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  var feature: GeoJSONFeature
  
  var featureIndex: Double
}
object Feature {
  
  inline def apply(feature: GeoJSONFeature, featureIndex: Double): Feature = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], featureIndex = featureIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  extension [Self <: Feature](x: Self) {
    
    inline def setFeature(value: GeoJSONFeature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureIndex(value: Double): Self = StObject.set(x, "featureIndex", value.asInstanceOf[js.Any])
  }
}
