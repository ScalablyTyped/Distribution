package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsResult extends js.Object {
  var adamId: String
  var data: js.Array[AnalyticsDataPoint]
  var group: AnalyticsGroup | Null
  var meetsThreshold: Boolean
  var totals: AnalyticsTotals
}

object AnalyticsResult {
  @scala.inline
  def apply(
    adamId: String,
    data: js.Array[AnalyticsDataPoint],
    meetsThreshold: Boolean,
    totals: AnalyticsTotals,
    group: AnalyticsGroup = null
  ): AnalyticsResult = {
    val __obj = js.Dynamic.literal(adamId = adamId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], meetsThreshold = meetsThreshold.asInstanceOf[js.Any], totals = totals.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsResult]
  }
}

