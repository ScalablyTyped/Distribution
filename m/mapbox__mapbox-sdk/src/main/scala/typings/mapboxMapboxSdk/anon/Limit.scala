package typings.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  var datasetId: String
  var limit: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object Limit {
  @scala.inline
  def apply(datasetId: String, limit: js.UndefOr[Double] = js.undefined, start: String = null): Limit = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
}

