package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryGroup extends js.Object {
  var dimension: typings.itunesconnectanalytics.mod.dimension
  var limit: js.UndefOr[Double] = js.undefined
  var metric: js.UndefOr[measures] = js.undefined
  var rank: js.UndefOr[String] = js.undefined
}

object QueryGroup {
  @scala.inline
  def apply(
    dimension: dimension,
    limit: js.UndefOr[Double] = js.undefined,
    metric: measures = null,
    rank: String = null
  ): QueryGroup = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryGroup]
  }
}

