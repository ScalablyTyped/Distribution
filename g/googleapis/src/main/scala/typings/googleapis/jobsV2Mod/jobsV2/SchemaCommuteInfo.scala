package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Commute details related to this job.
  */
@js.native
trait SchemaCommuteInfo extends js.Object {
  /**
    * Location used as the destination in the commute calculation.
    */
  var jobLocation: js.UndefOr[SchemaJobLocation] = js.native
  /**
    * The number of seconds required to travel to the job location from the
    * query location. A duration of 0 seconds indicates that the job is not
    * reachable within the requested duration, but was returned as part of an
    * expanded query.
    */
  var travelDuration: js.UndefOr[String] = js.native
}

object SchemaCommuteInfo {
  @scala.inline
  def apply(jobLocation: SchemaJobLocation = null, travelDuration: String = null): SchemaCommuteInfo = {
    val __obj = js.Dynamic.literal()
    if (jobLocation != null) __obj.updateDynamic("jobLocation")(jobLocation.asInstanceOf[js.Any])
    if (travelDuration != null) __obj.updateDynamic("travelDuration")(travelDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommuteInfo]
  }
}

