package typings.atMapboxMapboxDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatasetIdLimit extends js.Object {
  var datasetId: String
  var limit: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object Anon_DatasetIdLimit {
  @scala.inline
  def apply(datasetId: String, limit: Int | Double = null, start: String = null): Anon_DatasetIdLimit = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DatasetIdLimit]
  }
}

