package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.datasetsMod.DataSetsFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var datasetId: String
  var feature: DataSetsFeature
  var featureId: String
}

object Feature {
  @scala.inline
  def apply(datasetId: String, feature: DataSetsFeature, featureId: String): Feature = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], featureId = featureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
}

