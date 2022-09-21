package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildbotCommandDurations extends StObject {
  
  /**
    * The time spent to release the CAS blobs used by the task.
    */
  var casRelease: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time spent waiting for Container Manager to assign an asynchronous container for execution.
    */
  var cmWaitForAssignment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time spent preparing the command to be run in a Docker container (includes pulling the Docker image, if necessary).
    */
  var dockerPrep: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when docker preparation begins.
    */
  var dockerPrepStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time spent downloading the input files and constructing the working directory.
    */
  var download: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when downloading the input files begins.
    */
  var downloadStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when execution begins.
    */
  var execStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time spent executing the command (i.e., doing useful work).
    */
  var execution: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when preparation is done and bot starts downloading files.
    */
  var isoPrepDone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time spent completing the command, in total.
    */
  var overall: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time spent uploading the stdout logs.
    */
  var stdout: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time spent uploading the output files.
    */
  var upload: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when uploading the output files begins.
    */
  var uploadStartTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildbotCommandDurations {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildbotCommandDurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildbotCommandDurations]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildbotCommandDurations](x: Self) {
    
    inline def setCasRelease(value: String): Self = StObject.set(x, "casRelease", value.asInstanceOf[js.Any])
    
    inline def setCasReleaseNull: Self = StObject.set(x, "casRelease", null)
    
    inline def setCasReleaseUndefined: Self = StObject.set(x, "casRelease", js.undefined)
    
    inline def setCmWaitForAssignment(value: String): Self = StObject.set(x, "cmWaitForAssignment", value.asInstanceOf[js.Any])
    
    inline def setCmWaitForAssignmentNull: Self = StObject.set(x, "cmWaitForAssignment", null)
    
    inline def setCmWaitForAssignmentUndefined: Self = StObject.set(x, "cmWaitForAssignment", js.undefined)
    
    inline def setDockerPrep(value: String): Self = StObject.set(x, "dockerPrep", value.asInstanceOf[js.Any])
    
    inline def setDockerPrepNull: Self = StObject.set(x, "dockerPrep", null)
    
    inline def setDockerPrepStartTime(value: String): Self = StObject.set(x, "dockerPrepStartTime", value.asInstanceOf[js.Any])
    
    inline def setDockerPrepStartTimeNull: Self = StObject.set(x, "dockerPrepStartTime", null)
    
    inline def setDockerPrepStartTimeUndefined: Self = StObject.set(x, "dockerPrepStartTime", js.undefined)
    
    inline def setDockerPrepUndefined: Self = StObject.set(x, "dockerPrep", js.undefined)
    
    inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadNull: Self = StObject.set(x, "download", null)
    
    inline def setDownloadStartTime(value: String): Self = StObject.set(x, "downloadStartTime", value.asInstanceOf[js.Any])
    
    inline def setDownloadStartTimeNull: Self = StObject.set(x, "downloadStartTime", null)
    
    inline def setDownloadStartTimeUndefined: Self = StObject.set(x, "downloadStartTime", js.undefined)
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setExecStartTime(value: String): Self = StObject.set(x, "execStartTime", value.asInstanceOf[js.Any])
    
    inline def setExecStartTimeNull: Self = StObject.set(x, "execStartTime", null)
    
    inline def setExecStartTimeUndefined: Self = StObject.set(x, "execStartTime", js.undefined)
    
    inline def setExecution(value: String): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setExecutionNull: Self = StObject.set(x, "execution", null)
    
    inline def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
    
    inline def setIsoPrepDone(value: String): Self = StObject.set(x, "isoPrepDone", value.asInstanceOf[js.Any])
    
    inline def setIsoPrepDoneNull: Self = StObject.set(x, "isoPrepDone", null)
    
    inline def setIsoPrepDoneUndefined: Self = StObject.set(x, "isoPrepDone", js.undefined)
    
    inline def setOverall(value: String): Self = StObject.set(x, "overall", value.asInstanceOf[js.Any])
    
    inline def setOverallNull: Self = StObject.set(x, "overall", null)
    
    inline def setOverallUndefined: Self = StObject.set(x, "overall", js.undefined)
    
    inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStdoutNull: Self = StObject.set(x, "stdout", null)
    
    inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    
    inline def setUpload(value: String): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadNull: Self = StObject.set(x, "upload", null)
    
    inline def setUploadStartTime(value: String): Self = StObject.set(x, "uploadStartTime", value.asInstanceOf[js.Any])
    
    inline def setUploadStartTimeNull: Self = StObject.set(x, "uploadStartTime", null)
    
    inline def setUploadStartTimeUndefined: Self = StObject.set(x, "uploadStartTime", js.undefined)
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
