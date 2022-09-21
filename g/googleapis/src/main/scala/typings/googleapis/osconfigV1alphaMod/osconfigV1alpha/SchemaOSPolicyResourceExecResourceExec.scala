package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourceExecResourceExec extends StObject {
  
  /**
    * Optional arguments to pass to the source during execution.
    */
  var args: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A remote or local file.
    */
  var file: js.UndefOr[SchemaOSPolicyResourceFile] = js.undefined
  
  /**
    * Required. The script interpreter to use.
    */
  var interpreter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only recorded for enforce Exec. Path to an output file (that is created by this Exec) whose content will be recorded in OSPolicyResourceCompliance after a successful run. Absence or failure to read this file will result in this ExecResource being non-compliant. Output file size is limited to 100K bytes.
    */
  var outputFilePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An inline script. The size of the script is limited to 1024 characters.
    */
  var script: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyResourceExecResourceExec {
  
  inline def apply(): SchemaOSPolicyResourceExecResourceExec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourceExecResourceExec]
  }
  
  extension [Self <: SchemaOSPolicyResourceExecResourceExec](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setFile(value: SchemaOSPolicyResourceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setInterpreter(value: String): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    inline def setInterpreterNull: Self = StObject.set(x, "interpreter", null)
    
    inline def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    inline def setOutputFilePath(value: String): Self = StObject.set(x, "outputFilePath", value.asInstanceOf[js.Any])
    
    inline def setOutputFilePathNull: Self = StObject.set(x, "outputFilePath", null)
    
    inline def setOutputFilePathUndefined: Self = StObject.set(x, "outputFilePath", js.undefined)
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptNull: Self = StObject.set(x, "script", null)
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
