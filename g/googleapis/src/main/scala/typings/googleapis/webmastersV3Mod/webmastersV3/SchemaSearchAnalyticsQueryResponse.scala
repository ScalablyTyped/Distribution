package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of rows, one per result, grouped by key. Metrics in each row are
  * aggregated for all data grouped by that key either by page or property, as
  * specified by the aggregation type parameter.
  */
@js.native
trait SchemaSearchAnalyticsQueryResponse extends js.Object {
  /**
    * How the results were aggregated.
    */
  var responseAggregationType: js.UndefOr[String] = js.native
  /**
    * A list of rows grouped by the key values in the order given in the query.
    */
  var rows: js.UndefOr[js.Array[SchemaApiDataRow]] = js.native
}

object SchemaSearchAnalyticsQueryResponse {
  @scala.inline
  def apply(responseAggregationType: String = null, rows: js.Array[SchemaApiDataRow] = null): SchemaSearchAnalyticsQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (responseAggregationType != null) __obj.updateDynamic("responseAggregationType")(responseAggregationType.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchAnalyticsQueryResponse]
  }
}

