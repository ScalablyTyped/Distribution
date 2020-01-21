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
  def apply(
    duration: String = null,
    functionName: String = null,
    processStatus: String = null,
    processType: String = null,
    projectName: String = null,
    startTime: String = null,
    userAccessLevel: String = null
  ): SchemaGoogleAppsScriptTypeProcess = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (processStatus != null) __obj.updateDynamic("processStatus")(processStatus.asInstanceOf[js.Any])
    if (processType != null) __obj.updateDynamic("processType")(processType.asInstanceOf[js.Any])
    if (projectName != null) __obj.updateDynamic("projectName")(projectName.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (userAccessLevel != null) __obj.updateDynamic("userAccessLevel")(userAccessLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeProcess]
  }
}

