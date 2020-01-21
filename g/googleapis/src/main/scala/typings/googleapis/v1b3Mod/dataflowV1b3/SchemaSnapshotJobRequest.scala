package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create a snapshot of a job.
  */
@js.native
trait SchemaSnapshotJobRequest extends js.Object {
  /**
    * The location that contains this job.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * TTL for the snapshot.
    */
  var ttl: js.UndefOr[String] = js.native
}

object SchemaSnapshotJobRequest {
  @scala.inline
  def apply(location: String = null, ttl: String = null): SchemaSnapshotJobRequest = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSnapshotJobRequest]
  }
}

