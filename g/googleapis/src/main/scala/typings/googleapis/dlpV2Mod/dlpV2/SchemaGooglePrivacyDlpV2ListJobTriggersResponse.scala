package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListJobTriggers.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListJobTriggersResponse extends js.Object {
  /**
    * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
    */
  var jobTriggers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2JobTrigger]] = js.native
  /**
    * If the next page is available then the next page token to be used in
    * following ListJobTriggers request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2ListJobTriggersResponse {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ListJobTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListJobTriggersResponse]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ListJobTriggersResponseOps[Self <: SchemaGooglePrivacyDlpV2ListJobTriggersResponse] (val x: Self) extends AnyVal {
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
    def setJobTriggersVarargs(value: SchemaGooglePrivacyDlpV2JobTrigger*): Self = this.set("jobTriggers", js.Array(value :_*))
    @scala.inline
    def setJobTriggers(value: js.Array[SchemaGooglePrivacyDlpV2JobTrigger]): Self = this.set("jobTriggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobTriggers: Self = this.set("jobTriggers", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

