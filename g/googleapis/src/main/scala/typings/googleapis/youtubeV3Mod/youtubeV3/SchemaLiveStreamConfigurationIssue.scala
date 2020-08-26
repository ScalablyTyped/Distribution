package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveStreamConfigurationIssue extends js.Object {
  /**
    * The long-form description of the issue and how to resolve it.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The short-form reason for this issue.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * How severe this issue is to the stream.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * The kind of error happening.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaLiveStreamConfigurationIssue {
  @scala.inline
  def apply(): SchemaLiveStreamConfigurationIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStreamConfigurationIssue]
  }
  @scala.inline
  implicit class SchemaLiveStreamConfigurationIssueOps[Self <: SchemaLiveStreamConfigurationIssue] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

