package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListSessionsResponse extends js.Object {
  /**
    * If includeDeleted is set to true in the request, this list will contain
    * sessions deleted with original end times that are within the startTime
    * and endTime frame.
    */
  var deletedSession: js.UndefOr[js.Array[SchemaSession]] = js.native
  /**
    * Flag to indicate server has more data to transfer
    */
  var hasMoreData: js.UndefOr[Boolean] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Sessions with an end time that is between startTime and endTime of the
    * request.
    */
  var session: js.UndefOr[js.Array[SchemaSession]] = js.native
}

object SchemaListSessionsResponse {
  @scala.inline
  def apply(
    deletedSession: js.Array[SchemaSession] = null,
    hasMoreData: js.UndefOr[Boolean] = js.undefined,
    nextPageToken: String = null,
    session: js.Array[SchemaSession] = null
  ): SchemaListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    if (deletedSession != null) __obj.updateDynamic("deletedSession")(deletedSession.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMoreData)) __obj.updateDynamic("hasMoreData")(hasMoreData.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListSessionsResponse]
  }
}

