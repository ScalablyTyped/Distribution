package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListTopicSnapshots` method.
  */
@js.native
trait SchemaListTopicSnapshotsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more snapshots that match the
    * request; this value should be passed in a new `ListTopicSnapshotsRequest`
    * to get more snapshots.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The names of the snapshots that match the request.
    */
  var snapshots: js.UndefOr[js.Array[String]] = js.native
}

object SchemaListTopicSnapshotsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, snapshots: js.Array[String] = null): SchemaListTopicSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (snapshots != null) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTopicSnapshotsResponse]
  }
}

