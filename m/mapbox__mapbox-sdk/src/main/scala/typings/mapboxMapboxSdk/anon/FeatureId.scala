package typings.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureId extends js.Object {
  var datasetId: String
  var featureId: String
}

object FeatureId {
  @scala.inline
  def apply(datasetId: String, featureId: String): FeatureId = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any], featureId = featureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureId]
  }
}

