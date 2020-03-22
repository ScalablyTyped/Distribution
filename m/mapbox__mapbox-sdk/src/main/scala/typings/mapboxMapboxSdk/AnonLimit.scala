package typings.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimit extends js.Object {
  var datasetId: String
  var limit: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object AnonLimit {
  @scala.inline
  def apply(datasetId: String, limit: Int | Double = null, start: String = null): AnonLimit = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLimit]
  }
}

