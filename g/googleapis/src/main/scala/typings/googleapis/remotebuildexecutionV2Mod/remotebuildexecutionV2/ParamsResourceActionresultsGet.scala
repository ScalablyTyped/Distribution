package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceActionresultsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64 characters long.
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * A hint to the server to inline the contents of the listed output files. Each path needs to exactly match one file path in either `output_paths` or `output_files` (DEPRECATED since v2.1) in the Command message.
    */
  var inlineOutputFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A hint to the server to request inlining stderr in the ActionResult message.
    */
  var inlineStderr: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A hint to the server to request inlining stdout in the ActionResult message.
    */
  var inlineStdout: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    */
  var instanceName: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the blob, in bytes.
    */
  var sizeBytes: js.UndefOr[String] = js.undefined
}
object ParamsResourceActionresultsGet {
  
  inline def apply(): ParamsResourceActionresultsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceActionresultsGet]
  }
  
  extension [Self <: ParamsResourceActionresultsGet](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setInlineOutputFiles(value: js.Array[String]): Self = StObject.set(x, "inlineOutputFiles", value.asInstanceOf[js.Any])
    
    inline def setInlineOutputFilesUndefined: Self = StObject.set(x, "inlineOutputFiles", js.undefined)
    
    inline def setInlineOutputFilesVarargs(value: String*): Self = StObject.set(x, "inlineOutputFiles", js.Array(value*))
    
    inline def setInlineStderr(value: Boolean): Self = StObject.set(x, "inlineStderr", value.asInstanceOf[js.Any])
    
    inline def setInlineStderrUndefined: Self = StObject.set(x, "inlineStderr", js.undefined)
    
    inline def setInlineStdout(value: Boolean): Self = StObject.set(x, "inlineStdout", value.asInstanceOf[js.Any])
    
    inline def setInlineStdoutUndefined: Self = StObject.set(x, "inlineStdout", js.undefined)
    
    inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
