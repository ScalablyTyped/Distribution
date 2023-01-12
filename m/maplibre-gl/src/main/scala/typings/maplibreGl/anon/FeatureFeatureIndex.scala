package typings.maplibreGl.anon

import typings.maplibreGl.mod.MapGeoJSONFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureFeatureIndex extends StObject {
  
  var feature: MapGeoJSONFeature
  
  var featureIndex: Double
}
object FeatureFeatureIndex {
  
  inline def apply(feature: MapGeoJSONFeature, featureIndex: Double): FeatureFeatureIndex = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], featureIndex = featureIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFeatureIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureFeatureIndex] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: MapGeoJSONFeature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureIndex(value: Double): Self = StObject.set(x, "featureIndex", value.asInstanceOf[js.Any])
  }
}
