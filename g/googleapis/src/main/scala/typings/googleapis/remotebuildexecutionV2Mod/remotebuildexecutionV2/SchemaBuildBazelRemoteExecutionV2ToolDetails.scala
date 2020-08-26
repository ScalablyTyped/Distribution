package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details for the tool used to call the API.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ToolDetails extends js.Object {
  /**
    * Name of the tool, e.g. bazel.
    */
  var toolName: js.UndefOr[String] = js.native
  /**
    * Version of the tool used for the request, e.g. 5.0.3.
    */
  var toolVersion: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2ToolDetails {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ToolDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ToolDetails]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ToolDetailsOps[Self <: SchemaBuildBazelRemoteExecutionV2ToolDetails] (val x: Self) extends AnyVal {
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
    def setToolName(value: String): Self = this.set("toolName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolName: Self = this.set("toolName", js.undefined)
    @scala.inline
    def setToolVersion(value: String): Self = this.set("toolVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolVersion: Self = this.set("toolVersion", js.undefined)
  }
  
}

