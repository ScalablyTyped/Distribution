package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.servicesDatasetsMod.DataSetsFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  var datasetId: String
  
  var feature: DataSetsFeature
  
  var featureId: String
}
object Feature {
  
  inline def apply(datasetId: String, feature: DataSetsFeature, featureId: String): Feature = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], featureId = featureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  extension [Self <: Feature](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setFeature(value: DataSetsFeature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureId(value: String): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
  }
}
