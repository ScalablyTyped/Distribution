package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeInitializationAction extends StObject {
  
  /**
    * Required. Cloud Storage URI of executable file.
    */
  var executableFile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Amount of time executable has to complete. Default is 10 minutes (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).Cluster creation fails with an explanatory error message (the name of the executable that caused the error and the exceeded timeout period) if the executable is not completed at end of the timeout period.
    */
  var executionTimeout: js.UndefOr[String | Null] = js.undefined
}
object SchemaNodeInitializationAction {
  
  inline def apply(): SchemaNodeInitializationAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeInitializationAction]
  }
  
  extension [Self <: SchemaNodeInitializationAction](x: Self) {
    
    inline def setExecutableFile(value: String): Self = StObject.set(x, "executableFile", value.asInstanceOf[js.Any])
    
    inline def setExecutableFileNull: Self = StObject.set(x, "executableFile", null)
    
    inline def setExecutableFileUndefined: Self = StObject.set(x, "executableFile", js.undefined)
    
    inline def setExecutionTimeout(value: String): Self = StObject.set(x, "executionTimeout", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeoutNull: Self = StObject.set(x, "executionTimeout", null)
    
    inline def setExecutionTimeoutUndefined: Self = StObject.set(x, "executionTimeout", js.undefined)
  }
}
