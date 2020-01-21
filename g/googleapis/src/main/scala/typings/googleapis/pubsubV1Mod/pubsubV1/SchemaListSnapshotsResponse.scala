package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListSnapshots` method.
  */
@js.native
trait SchemaListSnapshotsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more snapshot that match the
    * request; this value should be passed in a new `ListSnapshotsRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The resulting snapshots.
    */
  var snapshots: js.UndefOr[js.Array[SchemaSnapshot]] = js.native
}

object SchemaListSnapshotsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, snapshots: js.Array[SchemaSnapshot] = null): SchemaListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (snapshots != null) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListSnapshotsResponse]
  }
}

