package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.datasetsMod.DataSetsFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feature extends js.Object {
  
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
  implicit class FeatureOps[Self <: Feature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeature(value: DataSetsFeature): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureId(value: String): Self = this.set("featureId", value.asInstanceOf[js.Any])
  }
}
