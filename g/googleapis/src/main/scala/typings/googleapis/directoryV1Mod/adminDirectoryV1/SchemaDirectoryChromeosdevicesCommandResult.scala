package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDirectoryChromeosdevicesCommandResult extends StObject {
  
  /**
    * The error message with a short explanation as to why the command failed. Only present if the command failed.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the command was executed or failed to execute.
    */
  var executeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The result of the command.
    */
  var result: js.UndefOr[String | Null] = js.undefined
}
object SchemaDirectoryChromeosdevicesCommandResult {
  
  inline def apply(): SchemaDirectoryChromeosdevicesCommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectoryChromeosdevicesCommandResult]
  }
  
  extension [Self <: SchemaDirectoryChromeosdevicesCommandResult](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setExecuteTime(value: String): Self = StObject.set(x, "executeTime", value.asInstanceOf[js.Any])
    
    inline def setExecuteTimeNull: Self = StObject.set(x, "executeTime", null)
    
    inline def setExecuteTimeUndefined: Self = StObject.set(x, "executeTime", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultNull: Self = StObject.set(x, "result", null)
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
