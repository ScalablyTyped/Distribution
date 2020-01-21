package typings.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for group by findings.
  */
@js.native
trait SchemaGroupFindingsResponse extends js.Object {
  /**
    * Group results. There exists an element for each existing unique
    * combination of property/values. The element contains a count for the
    * number of times those specific property/values appear.
    */
  var groupByResults: js.UndefOr[js.Array[SchemaGroupResult]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Time used for executing the groupBy request.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * The total number of results matching the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object SchemaGroupFindingsResponse {
  @scala.inline
  def apply(
    groupByResults: js.Array[SchemaGroupResult] = null,
    nextPageToken: String = null,
    readTime: String = null,
    totalSize: Int | Double = null
  ): SchemaGroupFindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (groupByResults != null) __obj.updateDynamic("groupByResults")(groupByResults.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroupFindingsResponse]
  }
}

