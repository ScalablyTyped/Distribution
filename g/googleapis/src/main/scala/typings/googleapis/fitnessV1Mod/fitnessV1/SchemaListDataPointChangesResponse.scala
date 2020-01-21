package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListDataPointChangesResponse extends js.Object {
  /**
    * The data stream ID of the data source with data point changes.
    */
  var dataSourceId: js.UndefOr[String] = js.native
  /**
    * Deleted data points for the user. Note, for modifications this should be
    * parsed before handling insertions.
    */
  var deletedDataPoint: js.UndefOr[js.Array[SchemaDataPoint]] = js.native
  /**
    * Inserted data points for the user.
    */
  var insertedDataPoint: js.UndefOr[js.Array[SchemaDataPoint]] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDataPointChangesResponse {
  @scala.inline
  def apply(
    dataSourceId: String = null,
    deletedDataPoint: js.Array[SchemaDataPoint] = null,
    insertedDataPoint: js.Array[SchemaDataPoint] = null,
    nextPageToken: String = null
  ): SchemaListDataPointChangesResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSourceId != null) __obj.updateDynamic("dataSourceId")(dataSourceId.asInstanceOf[js.Any])
    if (deletedDataPoint != null) __obj.updateDynamic("deletedDataPoint")(deletedDataPoint.asInstanceOf[js.Any])
    if (insertedDataPoint != null) __obj.updateDynamic("insertedDataPoint")(insertedDataPoint.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDataPointChangesResponse]
  }
}

