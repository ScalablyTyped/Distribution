package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CommandDuration contains the various duration metrics tracked when a bot
  * performs a command.
  */
trait SchemaGoogleDevtoolsRemotebuildbotCommandDurations extends StObject {
  
  /**
    * The time spent preparing the command to be run in a Docker container
    * (includes pulling the Docker image, if necessary).
    */
  var dockerPrep: js.UndefOr[String] = js.undefined
  
  /**
    * The time spent downloading the input files and constructing the working
    * directory.
    */
  var download: js.UndefOr[String] = js.undefined
  
  /**
    * The time spent executing the command (i.e., doing useful work).
    */
  var execution: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when preparation is done and bot starts downloading files.
    */
  var isoPrepDone: js.UndefOr[String] = js.undefined
  
  /**
    * The time spent completing the command, in total.
    */
  var overall: js.UndefOr[String] = js.undefined
  
  /**
    * The time spent uploading the stdout logs.
    */
  var stdout: js.UndefOr[String] = js.undefined
  
  /**
    * The time spent uploading the output files.
    */
  var upload: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildbotCommandDurations {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildbotCommandDurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildbotCommandDurations]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildbotCommandDurationsMutableBuilder[Self <: SchemaGoogleDevtoolsRemotebuildbotCommandDurations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDockerPrep(value: String): Self = StObject.set(x, "dockerPrep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerPrepUndefined: Self = StObject.set(x, "dockerPrep", js.undefined)
    
    @scala.inline
    def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setExecution(value: String): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
    
    @scala.inline
    def setIsoPrepDone(value: String): Self = StObject.set(x, "isoPrepDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoPrepDoneUndefined: Self = StObject.set(x, "isoPrepDone", js.undefined)
    
    @scala.inline
    def setOverall(value: String): Self = StObject.set(x, "overall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallUndefined: Self = StObject.set(x, "overall", js.undefined)
    
    @scala.inline
    def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    
    @scala.inline
    def setUpload(value: String): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
