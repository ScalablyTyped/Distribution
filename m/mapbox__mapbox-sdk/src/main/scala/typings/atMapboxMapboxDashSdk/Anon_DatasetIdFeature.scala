package typings.atMapboxMapboxDashSdk

import typings.atMapboxMapboxDashSdk.servicesDatasetsMod.DataSetsFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatasetIdFeature extends js.Object {
  var datasetId: String
  var feature: DataSetsFeature
  var featureId: String
}

object Anon_DatasetIdFeature {
  @scala.inline
  def apply(datasetId: String, feature: DataSetsFeature, featureId: String): Anon_DatasetIdFeature = {
    val __obj = js.Dynamic.literal(datasetId = datasetId, feature = feature.asInstanceOf[js.Any], featureId = featureId)
  
    __obj.asInstanceOf[Anon_DatasetIdFeature]
  }
}

