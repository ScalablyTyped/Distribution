package typings.maplibreGl.anon

import typings.maplibreGl.mod.GeoJSONFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureIndex extends StObject {
  
  var feature: GeoJSONFeature
  
  var featureIndex: Double
  
  var intersectionZ: js.UndefOr[Boolean | Double] = js.undefined
}
object FeatureIndex {
  
  inline def apply(feature: GeoJSONFeature, featureIndex: Double): FeatureIndex = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], featureIndex = featureIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureIndex] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: GeoJSONFeature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureIndex(value: Double): Self = StObject.set(x, "featureIndex", value.asInstanceOf[js.Any])
    
    inline def setIntersectionZ(value: Boolean | Double): Self = StObject.set(x, "intersectionZ", value.asInstanceOf[js.Any])
    
    inline def setIntersectionZUndefined: Self = StObject.set(x, "intersectionZ", js.undefined)
  }
}
