package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeInitializationAction extends StObject {
  
  /** Required. Cloud Storage URI of executable file. */
  var executableFile: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Amount of time executable has to complete. Default is 10 minutes (see JSON representation of Duration
    * (https://developers.google.com/protocol-buffers/docs/proto3#json)).Cluster creation fails with an explanatory error message (the name of the executable that caused the error and the
    * exceeded timeout period) if the executable is not completed at end of the timeout period.
    */
  var executionTimeout: js.UndefOr[String] = js.undefined
}
object NodeInitializationAction {
  
  @scala.inline
  def apply(): NodeInitializationAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeInitializationAction]
  }
  
  @scala.inline
  implicit class NodeInitializationActionMutableBuilder[Self <: NodeInitializationAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutableFile(value: String): Self = StObject.set(x, "executableFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutableFileUndefined: Self = StObject.set(x, "executableFile", js.undefined)
    
    @scala.inline
    def setExecutionTimeout(value: String): Self = StObject.set(x, "executionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionTimeoutUndefined: Self = StObject.set(x, "executionTimeout", js.undefined)
  }
}
