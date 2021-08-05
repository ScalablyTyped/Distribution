package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details for the tool used to call the API.
  */
trait SchemaBuildBazelRemoteExecutionV2ToolDetails extends StObject {
  
  /**
    * Name of the tool, e.g. bazel.
    */
  var toolName: js.UndefOr[String] = js.undefined
  
  /**
    * Version of the tool used for the request, e.g. 5.0.3.
    */
  var toolVersion: js.UndefOr[String] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2ToolDetails {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2ToolDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ToolDetails]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2ToolDetails](x: Self) {
    
    inline def setToolName(value: String): Self = StObject.set(x, "toolName", value.asInstanceOf[js.Any])
    
    inline def setToolNameUndefined: Self = StObject.set(x, "toolName", js.undefined)
    
    inline def setToolVersion(value: String): Self = StObject.set(x, "toolVersion", value.asInstanceOf[js.Any])
    
    inline def setToolVersionUndefined: Self = StObject.set(x, "toolVersion", js.undefined)
  }
}
