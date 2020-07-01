package typings.itunesconnectanalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  var results: js.Array[AnalyticsResult]
  var size: Double
}

object QueryResult {
  @scala.inline
  def apply(results: js.Array[AnalyticsResult], size: Double): QueryResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
}

