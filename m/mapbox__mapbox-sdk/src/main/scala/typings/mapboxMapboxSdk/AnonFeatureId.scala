package typings.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFeatureId extends js.Object {
  var datasetId: String
  var featureId: String
}

object AnonFeatureId {
  @scala.inline
  def apply(datasetId: String, featureId: String): AnonFeatureId = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any], featureId = featureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeatureId]
  }
}

