package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Measures the progress of a particular metric.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1Progress extends js.Object {
  /**
    * The amount of work that has been completed. Note that this may be greater
    * than work_estimated.
    */
  var workCompleted: js.UndefOr[String] = js.native
  /**
    * An estimate of how much work needs to be performed. May be zero if the
    * work estimate is unavailable.
    */
  var workEstimated: js.UndefOr[String] = js.native
}

object SchemaGoogleDatastoreAdminV1Progress {
  @scala.inline
  def apply(workCompleted: String = null, workEstimated: String = null): SchemaGoogleDatastoreAdminV1Progress = {
    val __obj = js.Dynamic.literal()
    if (workCompleted != null) __obj.updateDynamic("workCompleted")(workCompleted.asInstanceOf[js.Any])
    if (workEstimated != null) __obj.updateDynamic("workEstimated")(workEstimated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1Progress]
  }
}

