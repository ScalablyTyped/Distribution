package typings.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureId extends StObject {
  
  var datasetId: String
  
  var featureId: String
}
object FeatureId {
  
  inline def apply(datasetId: String, featureId: String): FeatureId = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any], featureId = featureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureId]
  }
  
  extension [Self <: FeatureId](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setFeatureId(value: String): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
  }
}
