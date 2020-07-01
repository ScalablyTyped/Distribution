package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Taskrunner configuration settings.
  */
@js.native
trait SchemaTaskRunnerSettings extends js.Object {
  /**
    * Whether to also send taskrunner log info to stderr.
    */
  var alsologtostderr: js.UndefOr[Boolean] = js.native
  /**
    * The location on the worker for task-specific subdirectories.
    */
  var baseTaskDir: js.UndefOr[String] = js.native
  /**
    * The base URL for the taskrunner to use when accessing Google Cloud APIs.
    * When workers access Google Cloud APIs, they logically do so via relative
    * URLs.  If this field is specified, it supplies the base URL to use for
    * resolving these relative URLs.  The normative algorithm used is defined
    * by RFC 1808, &quot;Relative Uniform Resource Locators&quot;.  If not
    * specified, the default value is &quot;http://www.googleapis.com/&quot;
    */
  var baseUrl: js.UndefOr[String] = js.native
  /**
    * The file to store preprocessing commands in.
    */
  var commandlinesFileName: js.UndefOr[String] = js.native
  /**
    * Whether to continue taskrunner if an exception is hit.
    */
  var continueOnException: js.UndefOr[Boolean] = js.native
  /**
    * The API version of endpoint, e.g. &quot;v1b3&quot;
    */
  var dataflowApiVersion: js.UndefOr[String] = js.native
  /**
    * The command to launch the worker harness.
    */
  var harnessCommand: js.UndefOr[String] = js.native
  /**
    * The suggested backend language.
    */
  var languageHint: js.UndefOr[String] = js.native
  /**
    * The directory on the VM to store logs.
    */
  var logDir: js.UndefOr[String] = js.native
  /**
    * Whether to send taskrunner log info to Google Compute Engine VM serial
    * console.
    */
  var logToSerialconsole: js.UndefOr[Boolean] = js.native
  /**
    * Indicates where to put logs.  If this is not specified, the logs will not
    * be uploaded.  The supported resource type is:  Google Cloud Storage:
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var logUploadLocation: js.UndefOr[String] = js.native
  /**
    * The OAuth2 scopes to be requested by the taskrunner in order to access
    * the Cloud Dataflow API.
    */
  var oauthScopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The settings to pass to the parallel worker harness.
    */
  var parallelWorkerSettings: js.UndefOr[SchemaWorkerSettings] = js.native
  /**
    * The streaming worker main class name.
    */
  var streamingWorkerMainClass: js.UndefOr[String] = js.native
  /**
    * The UNIX group ID on the worker VM to use for tasks launched by
    * taskrunner; e.g. &quot;wheel&quot;.
    */
  var taskGroup: js.UndefOr[String] = js.native
  /**
    * The UNIX user ID on the worker VM to use for tasks launched by
    * taskrunner; e.g. &quot;root&quot;.
    */
  var taskUser: js.UndefOr[String] = js.native
  /**
    * The prefix of the resources the taskrunner should use for temporary
    * storage.  The supported resource type is:  Google Cloud Storage:
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[String] = js.native
  /**
    * The ID string of the VM.
    */
  var vmId: js.UndefOr[String] = js.native
  /**
    * The file to store the workflow in.
    */
  var workflowFileName: js.UndefOr[String] = js.native
}

object SchemaTaskRunnerSettings {
  @scala.inline
  def apply(
    alsologtostderr: js.UndefOr[Boolean] = js.undefined,
    baseTaskDir: String = null,
    baseUrl: String = null,
    commandlinesFileName: String = null,
    continueOnException: js.UndefOr[Boolean] = js.undefined,
    dataflowApiVersion: String = null,
    harnessCommand: String = null,
    languageHint: String = null,
    logDir: String = null,
    logToSerialconsole: js.UndefOr[Boolean] = js.undefined,
    logUploadLocation: String = null,
    oauthScopes: js.Array[String] = null,
    parallelWorkerSettings: SchemaWorkerSettings = null,
    streamingWorkerMainClass: String = null,
    taskGroup: String = null,
    taskUser: String = null,
    tempStoragePrefix: String = null,
    vmId: String = null,
    workflowFileName: String = null
  ): SchemaTaskRunnerSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alsologtostderr)) __obj.updateDynamic("alsologtostderr")(alsologtostderr.get.asInstanceOf[js.Any])
    if (baseTaskDir != null) __obj.updateDynamic("baseTaskDir")(baseTaskDir.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (commandlinesFileName != null) __obj.updateDynamic("commandlinesFileName")(commandlinesFileName.asInstanceOf[js.Any])
    if (!js.isUndefined(continueOnException)) __obj.updateDynamic("continueOnException")(continueOnException.get.asInstanceOf[js.Any])
    if (dataflowApiVersion != null) __obj.updateDynamic("dataflowApiVersion")(dataflowApiVersion.asInstanceOf[js.Any])
    if (harnessCommand != null) __obj.updateDynamic("harnessCommand")(harnessCommand.asInstanceOf[js.Any])
    if (languageHint != null) __obj.updateDynamic("languageHint")(languageHint.asInstanceOf[js.Any])
    if (logDir != null) __obj.updateDynamic("logDir")(logDir.asInstanceOf[js.Any])
    if (!js.isUndefined(logToSerialconsole)) __obj.updateDynamic("logToSerialconsole")(logToSerialconsole.get.asInstanceOf[js.Any])
    if (logUploadLocation != null) __obj.updateDynamic("logUploadLocation")(logUploadLocation.asInstanceOf[js.Any])
    if (oauthScopes != null) __obj.updateDynamic("oauthScopes")(oauthScopes.asInstanceOf[js.Any])
    if (parallelWorkerSettings != null) __obj.updateDynamic("parallelWorkerSettings")(parallelWorkerSettings.asInstanceOf[js.Any])
    if (streamingWorkerMainClass != null) __obj.updateDynamic("streamingWorkerMainClass")(streamingWorkerMainClass.asInstanceOf[js.Any])
    if (taskGroup != null) __obj.updateDynamic("taskGroup")(taskGroup.asInstanceOf[js.Any])
    if (taskUser != null) __obj.updateDynamic("taskUser")(taskUser.asInstanceOf[js.Any])
    if (tempStoragePrefix != null) __obj.updateDynamic("tempStoragePrefix")(tempStoragePrefix.asInstanceOf[js.Any])
    if (vmId != null) __obj.updateDynamic("vmId")(vmId.asInstanceOf[js.Any])
    if (workflowFileName != null) __obj.updateDynamic("workflowFileName")(workflowFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTaskRunnerSettings]
  }
}

