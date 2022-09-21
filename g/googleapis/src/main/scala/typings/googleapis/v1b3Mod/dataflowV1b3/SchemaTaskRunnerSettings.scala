package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTaskRunnerSettings extends StObject {
  
  /**
    * Whether to also send taskrunner log info to stderr.
    */
  var alsologtostderr: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The location on the worker for task-specific subdirectories.
    */
  var baseTaskDir: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The base URL for the taskrunner to use when accessing Google Cloud APIs. When workers access Google Cloud APIs, they logically do so via relative URLs. If this field is specified, it supplies the base URL to use for resolving these relative URLs. The normative algorithm used is defined by RFC 1808, "Relative Uniform Resource Locators". If not specified, the default value is "http://www.googleapis.com/"
    */
  var baseUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The file to store preprocessing commands in.
    */
  var commandlinesFileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to continue taskrunner if an exception is hit.
    */
  var continueOnException: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The API version of endpoint, e.g. "v1b3"
    */
  var dataflowApiVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The command to launch the worker harness.
    */
  var harnessCommand: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The suggested backend language.
    */
  var languageHint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The directory on the VM to store logs.
    */
  var logDir: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to send taskrunner log info to Google Compute Engine VM serial console.
    */
  var logToSerialconsole: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates where to put logs. If this is not specified, the logs will not be uploaded. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket\}/{object\} bucket.storage.googleapis.com/{object\}
    */
  var logUploadLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The OAuth2 scopes to be requested by the taskrunner in order to access the Cloud Dataflow API.
    */
  var oauthScopes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The settings to pass to the parallel worker harness.
    */
  var parallelWorkerSettings: js.UndefOr[SchemaWorkerSettings] = js.undefined
  
  /**
    * The streaming worker main class name.
    */
  var streamingWorkerMainClass: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The UNIX group ID on the worker VM to use for tasks launched by taskrunner; e.g. "wheel".
    */
  var taskGroup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The UNIX user ID on the worker VM to use for tasks launched by taskrunner; e.g. "root".
    */
  var taskUser: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The prefix of the resources the taskrunner should use for temporary storage. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket\}/{object\} bucket.storage.googleapis.com/{object\}
    */
  var tempStoragePrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID string of the VM.
    */
  var vmId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The file to store the workflow in.
    */
  var workflowFileName: js.UndefOr[String | Null] = js.undefined
}
object SchemaTaskRunnerSettings {
  
  inline def apply(): SchemaTaskRunnerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskRunnerSettings]
  }
  
  extension [Self <: SchemaTaskRunnerSettings](x: Self) {
    
    inline def setAlsologtostderr(value: Boolean): Self = StObject.set(x, "alsologtostderr", value.asInstanceOf[js.Any])
    
    inline def setAlsologtostderrNull: Self = StObject.set(x, "alsologtostderr", null)
    
    inline def setAlsologtostderrUndefined: Self = StObject.set(x, "alsologtostderr", js.undefined)
    
    inline def setBaseTaskDir(value: String): Self = StObject.set(x, "baseTaskDir", value.asInstanceOf[js.Any])
    
    inline def setBaseTaskDirNull: Self = StObject.set(x, "baseTaskDir", null)
    
    inline def setBaseTaskDirUndefined: Self = StObject.set(x, "baseTaskDir", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlNull: Self = StObject.set(x, "baseUrl", null)
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setCommandlinesFileName(value: String): Self = StObject.set(x, "commandlinesFileName", value.asInstanceOf[js.Any])
    
    inline def setCommandlinesFileNameNull: Self = StObject.set(x, "commandlinesFileName", null)
    
    inline def setCommandlinesFileNameUndefined: Self = StObject.set(x, "commandlinesFileName", js.undefined)
    
    inline def setContinueOnException(value: Boolean): Self = StObject.set(x, "continueOnException", value.asInstanceOf[js.Any])
    
    inline def setContinueOnExceptionNull: Self = StObject.set(x, "continueOnException", null)
    
    inline def setContinueOnExceptionUndefined: Self = StObject.set(x, "continueOnException", js.undefined)
    
    inline def setDataflowApiVersion(value: String): Self = StObject.set(x, "dataflowApiVersion", value.asInstanceOf[js.Any])
    
    inline def setDataflowApiVersionNull: Self = StObject.set(x, "dataflowApiVersion", null)
    
    inline def setDataflowApiVersionUndefined: Self = StObject.set(x, "dataflowApiVersion", js.undefined)
    
    inline def setHarnessCommand(value: String): Self = StObject.set(x, "harnessCommand", value.asInstanceOf[js.Any])
    
    inline def setHarnessCommandNull: Self = StObject.set(x, "harnessCommand", null)
    
    inline def setHarnessCommandUndefined: Self = StObject.set(x, "harnessCommand", js.undefined)
    
    inline def setLanguageHint(value: String): Self = StObject.set(x, "languageHint", value.asInstanceOf[js.Any])
    
    inline def setLanguageHintNull: Self = StObject.set(x, "languageHint", null)
    
    inline def setLanguageHintUndefined: Self = StObject.set(x, "languageHint", js.undefined)
    
    inline def setLogDir(value: String): Self = StObject.set(x, "logDir", value.asInstanceOf[js.Any])
    
    inline def setLogDirNull: Self = StObject.set(x, "logDir", null)
    
    inline def setLogDirUndefined: Self = StObject.set(x, "logDir", js.undefined)
    
    inline def setLogToSerialconsole(value: Boolean): Self = StObject.set(x, "logToSerialconsole", value.asInstanceOf[js.Any])
    
    inline def setLogToSerialconsoleNull: Self = StObject.set(x, "logToSerialconsole", null)
    
    inline def setLogToSerialconsoleUndefined: Self = StObject.set(x, "logToSerialconsole", js.undefined)
    
    inline def setLogUploadLocation(value: String): Self = StObject.set(x, "logUploadLocation", value.asInstanceOf[js.Any])
    
    inline def setLogUploadLocationNull: Self = StObject.set(x, "logUploadLocation", null)
    
    inline def setLogUploadLocationUndefined: Self = StObject.set(x, "logUploadLocation", js.undefined)
    
    inline def setOauthScopes(value: js.Array[String]): Self = StObject.set(x, "oauthScopes", value.asInstanceOf[js.Any])
    
    inline def setOauthScopesNull: Self = StObject.set(x, "oauthScopes", null)
    
    inline def setOauthScopesUndefined: Self = StObject.set(x, "oauthScopes", js.undefined)
    
    inline def setOauthScopesVarargs(value: String*): Self = StObject.set(x, "oauthScopes", js.Array(value*))
    
    inline def setParallelWorkerSettings(value: SchemaWorkerSettings): Self = StObject.set(x, "parallelWorkerSettings", value.asInstanceOf[js.Any])
    
    inline def setParallelWorkerSettingsUndefined: Self = StObject.set(x, "parallelWorkerSettings", js.undefined)
    
    inline def setStreamingWorkerMainClass(value: String): Self = StObject.set(x, "streamingWorkerMainClass", value.asInstanceOf[js.Any])
    
    inline def setStreamingWorkerMainClassNull: Self = StObject.set(x, "streamingWorkerMainClass", null)
    
    inline def setStreamingWorkerMainClassUndefined: Self = StObject.set(x, "streamingWorkerMainClass", js.undefined)
    
    inline def setTaskGroup(value: String): Self = StObject.set(x, "taskGroup", value.asInstanceOf[js.Any])
    
    inline def setTaskGroupNull: Self = StObject.set(x, "taskGroup", null)
    
    inline def setTaskGroupUndefined: Self = StObject.set(x, "taskGroup", js.undefined)
    
    inline def setTaskUser(value: String): Self = StObject.set(x, "taskUser", value.asInstanceOf[js.Any])
    
    inline def setTaskUserNull: Self = StObject.set(x, "taskUser", null)
    
    inline def setTaskUserUndefined: Self = StObject.set(x, "taskUser", js.undefined)
    
    inline def setTempStoragePrefix(value: String): Self = StObject.set(x, "tempStoragePrefix", value.asInstanceOf[js.Any])
    
    inline def setTempStoragePrefixNull: Self = StObject.set(x, "tempStoragePrefix", null)
    
    inline def setTempStoragePrefixUndefined: Self = StObject.set(x, "tempStoragePrefix", js.undefined)
    
    inline def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdNull: Self = StObject.set(x, "vmId", null)
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
    
    inline def setWorkflowFileName(value: String): Self = StObject.set(x, "workflowFileName", value.asInstanceOf[js.Any])
    
    inline def setWorkflowFileNameNull: Self = StObject.set(x, "workflowFileName", null)
    
    inline def setWorkflowFileNameUndefined: Self = StObject.set(x, "workflowFileName", js.undefined)
  }
}
