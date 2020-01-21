package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.datasetsMod.DataSetsFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatasetIdFeature extends js.Object {
  var datasetId: String
  var feature: DataSetsFeature
  var featureId: String
}

object AnonDatasetIdFeature {
  @scala.inline
  def apply(datasetId: String, feature: DataSetsFeature, featureId: String): AnonDatasetIdFeature = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], featureId = featureId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDatasetIdFeature]
  }
}

