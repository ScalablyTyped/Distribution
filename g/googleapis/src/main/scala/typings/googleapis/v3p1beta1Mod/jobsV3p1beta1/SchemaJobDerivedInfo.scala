package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Derived details about the job posting.
  */
@js.native
trait SchemaJobDerivedInfo extends js.Object {
  /**
    * Job categories derived from Job.title and Job.description.
    */
  var jobCategories: js.UndefOr[js.Array[String]] = js.native
  /**
    * Structured locations of the job, resolved from Job.addresses.  locations
    * are exactly matched to Job.addresses in the same order.
    */
  var locations: js.UndefOr[js.Array[SchemaLocation]] = js.native
}

object SchemaJobDerivedInfo {
  @scala.inline
  def apply(jobCategories: js.Array[String] = null, locations: js.Array[SchemaLocation] = null): SchemaJobDerivedInfo = {
    val __obj = js.Dynamic.literal()
    if (jobCategories != null) __obj.updateDynamic("jobCategories")(jobCategories.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobDerivedInfo]
  }
}

