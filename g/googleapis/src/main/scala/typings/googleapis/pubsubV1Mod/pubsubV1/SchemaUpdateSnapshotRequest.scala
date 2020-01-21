package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the UpdateSnapshot method.
  */
@js.native
trait SchemaUpdateSnapshotRequest extends js.Object {
  /**
    * The updated snapshot object.
    */
  var snapshot: js.UndefOr[SchemaSnapshot] = js.native
  /**
    * Indicates which fields in the provided snapshot to update. Must be
    * specified and non-empty.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaUpdateSnapshotRequest {
  @scala.inline
  def apply(snapshot: SchemaSnapshot = null, updateMask: String = null): SchemaUpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateSnapshotRequest]
  }
}

