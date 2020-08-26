package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to the request to launch a template.
  */
@js.native
trait SchemaLaunchTemplateResponse extends js.Object {
  /**
    * The job that was launched, if the request was not a dry run and the job
    * was successfully launched.
    */
  var job: js.UndefOr[SchemaJob] = js.native
}

object SchemaLaunchTemplateResponse {
  @scala.inline
  def apply(): SchemaLaunchTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLaunchTemplateResponse]
  }
  @scala.inline
  implicit class SchemaLaunchTemplateResponseOps[Self <: SchemaLaunchTemplateResponse] (val x: Self) extends AnyVal {
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
  }
  
}

