package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use BatchDeleteJobsRequest instead.  Input only.  Filter for
  * jobs to be deleted.
  */
@js.native
trait SchemaFilter extends js.Object {
  /**
    * Required.  The requisition ID (or posting ID) assigned by the client to
    * identify a job. This is intended for client identification and tracking
    * of listings. name takes precedence over this field The maximum number of
    * allowed characters is 225.
    */
  var requisitionId: js.UndefOr[String] = js.native
}

object SchemaFilter {
  @scala.inline
  def apply(requisitionId: String = null): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    if (requisitionId != null) __obj.updateDynamic("requisitionId")(requisitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilter]
  }
}

