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
  def apply(): SchemaTaskRunnerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskRunnerSettings]
  }
  @scala.inline
  implicit class SchemaTaskRunnerSettingsOps[Self <: SchemaTaskRunnerSettings] (val x: Self) extends AnyVal {
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
    def setAlsologtostderr(value: Boolean): Self = this.set("alsologtostderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlsologtostderr: Self = this.set("alsologtostderr", js.undefined)
    @scala.inline
    def setBaseTaskDir(value: String): Self = this.set("baseTaskDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseTaskDir: Self = this.set("baseTaskDir", js.undefined)
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setCommandlinesFileName(value: String): Self = this.set("commandlinesFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandlinesFileName: Self = this.set("commandlinesFileName", js.undefined)
    @scala.inline
    def setContinueOnException(value: Boolean): Self = this.set("continueOnException", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinueOnException: Self = this.set("continueOnException", js.undefined)
    @scala.inline
    def setDataflowApiVersion(value: String): Self = this.set("dataflowApiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataflowApiVersion: Self = this.set("dataflowApiVersion", js.undefined)
    @scala.inline
    def setHarnessCommand(value: String): Self = this.set("harnessCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHarnessCommand: Self = this.set("harnessCommand", js.undefined)
    @scala.inline
    def setLanguageHint(value: String): Self = this.set("languageHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageHint: Self = this.set("languageHint", js.undefined)
    @scala.inline
    def setLogDir(value: String): Self = this.set("logDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogDir: Self = this.set("logDir", js.undefined)
    @scala.inline
    def setLogToSerialconsole(value: Boolean): Self = this.set("logToSerialconsole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogToSerialconsole: Self = this.set("logToSerialconsole", js.undefined)
    @scala.inline
    def setLogUploadLocation(value: String): Self = this.set("logUploadLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogUploadLocation: Self = this.set("logUploadLocation", js.undefined)
    @scala.inline
    def setOauthScopesVarargs(value: String*): Self = this.set("oauthScopes", js.Array(value :_*))
    @scala.inline
    def setOauthScopes(value: js.Array[String]): Self = this.set("oauthScopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauthScopes: Self = this.set("oauthScopes", js.undefined)
    @scala.inline
    def setParallelWorkerSettings(value: SchemaWorkerSettings): Self = this.set("parallelWorkerSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallelWorkerSettings: Self = this.set("parallelWorkerSettings", js.undefined)
    @scala.inline
    def setStreamingWorkerMainClass(value: String): Self = this.set("streamingWorkerMainClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamingWorkerMainClass: Self = this.set("streamingWorkerMainClass", js.undefined)
    @scala.inline
    def setTaskGroup(value: String): Self = this.set("taskGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskGroup: Self = this.set("taskGroup", js.undefined)
    @scala.inline
    def setTaskUser(value: String): Self = this.set("taskUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskUser: Self = this.set("taskUser", js.undefined)
    @scala.inline
    def setTempStoragePrefix(value: String): Self = this.set("tempStoragePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTempStoragePrefix: Self = this.set("tempStoragePrefix", js.undefined)
    @scala.inline
    def setVmId(value: String): Self = this.set("vmId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVmId: Self = this.set("vmId", js.undefined)
    @scala.inline
    def setWorkflowFileName(value: String): Self = this.set("workflowFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkflowFileName: Self = this.set("workflowFileName", js.undefined)
  }
  
}

