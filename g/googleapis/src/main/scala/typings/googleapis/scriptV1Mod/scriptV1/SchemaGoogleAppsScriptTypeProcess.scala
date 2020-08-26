package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a single script process execution that was started from
  * the script editor, a trigger, an application, or using the Apps Script API.
  * This is distinct from the `Operation` resource, which only represents
  * executions started via the Apps Script API.
  */
@js.native
trait SchemaGoogleAppsScriptTypeProcess extends js.Object {
  /**
    * Duration the execution spent executing.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Name of the function the started the execution.
    */
  var functionName: js.UndefOr[String] = js.native
  /**
    * The executions status.
    */
  var processStatus: js.UndefOr[String] = js.native
  /**
    * The executions type.
    */
  var processType: js.UndefOr[String] = js.native
  /**
    * Name of the script being executed.
    */
  var projectName: js.UndefOr[String] = js.native
  /**
    * Time the execution started.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The executing users access level to the script.
    */
  var userAccessLevel: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeProcess {
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeProcess]
  }
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeProcessOps[Self <: SchemaGoogleAppsScriptTypeProcess] (val x: Self) extends AnyVal {
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    @scala.inline
    def setProcessStatus(value: String): Self = this.set("processStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessStatus: Self = this.set("processStatus", js.undefined)
    @scala.inline
    def setProcessType(value: String): Self = this.set("processType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessType: Self = this.set("processType", js.undefined)
    @scala.inline
    def setProjectName(value: String): Self = this.set("projectName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectName: Self = this.set("projectName", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setUserAccessLevel(value: String): Self = this.set("userAccessLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAccessLevel: Self = this.set("userAccessLevel", js.undefined)
  }
  
}

