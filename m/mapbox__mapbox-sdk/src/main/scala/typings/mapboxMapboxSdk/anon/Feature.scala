package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.datasetsMod.DataSetsFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feature extends StObject {
  
  var datasetId: String = js.native
  
  var feature: DataSetsFeature = js.native
  
  var featureId: String = js.native
}
object Feature {
  
  @scala.inline
  def apply(datasetId: String, feature: DataSetsFeature, featureId: String): Feature = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], featureId = featureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit class FeatureMutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeature(value: DataSetsFeature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureId(value: String): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
  }
}
