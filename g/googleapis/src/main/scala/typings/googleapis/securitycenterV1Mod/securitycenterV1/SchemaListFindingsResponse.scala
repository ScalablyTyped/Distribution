package typings.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing findings.
  */
@js.native
trait SchemaListFindingsResponse extends js.Object {
  /**
    * Findings matching the list request.
    */
  var listFindingsResults: js.UndefOr[js.Array[SchemaListFindingsResult]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Time used for executing the list request.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * The total number of findings matching the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object SchemaListFindingsResponse {
  @scala.inline
  def apply(
    listFindingsResults: js.Array[SchemaListFindingsResult] = null,
    nextPageToken: String = null,
    readTime: String = null,
    totalSize: js.UndefOr[Double] = js.undefined
  ): SchemaListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (listFindingsResults != null) __obj.updateDynamic("listFindingsResults")(listFindingsResults.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListFindingsResponse]
  }
}

