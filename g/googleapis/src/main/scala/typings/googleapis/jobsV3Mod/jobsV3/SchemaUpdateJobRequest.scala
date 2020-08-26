package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Update job request.
  */
@js.native
trait SchemaUpdateJobRequest extends js.Object {
  /**
    * Required.  The Job to be updated.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  /**
    * Optional but strongly recommended to be provided for the best service
    * experience.  If update_mask is provided, only the specified fields in job
    * are updated. Otherwise all the fields are updated.  A field mask to
    * restrict the fields that are updated. Only top level fields of Job are
    * supported.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaUpdateJobRequest {
  @scala.inline
  def apply(): SchemaUpdateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateJobRequest]
  }
  @scala.inline
  implicit class SchemaUpdateJobRequestOps[Self <: SchemaUpdateJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJob(value: SchemaJob): Self = this.set("job", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJob: Self = this.set("job", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

