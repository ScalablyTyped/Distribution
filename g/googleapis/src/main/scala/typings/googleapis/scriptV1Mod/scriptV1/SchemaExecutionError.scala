package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecutionError extends StObject {
  
  /**
    * The error message thrown by Apps Script, usually localized into the user's language.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The error type, for example `TypeError` or `ReferenceError`. If the error type is unavailable, this field is not included.
    */
  var errorType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An array of objects that provide a stack trace through the script to show where the execution failed, with the deepest call first.
    */
  var scriptStackTraceElements: js.UndefOr[js.Array[SchemaScriptStackTraceElement]] = js.undefined
}
object SchemaExecutionError {
  
  inline def apply(): SchemaExecutionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionError]
  }
  
  extension [Self <: SchemaExecutionError](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeNull: Self = StObject.set(x, "errorType", null)
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setScriptStackTraceElements(value: js.Array[SchemaScriptStackTraceElement]): Self = StObject.set(x, "scriptStackTraceElements", value.asInstanceOf[js.Any])
    
    inline def setScriptStackTraceElementsUndefined: Self = StObject.set(x, "scriptStackTraceElements", js.undefined)
    
    inline def setScriptStackTraceElementsVarargs(value: SchemaScriptStackTraceElement*): Self = StObject.set(x, "scriptStackTraceElements", js.Array(value*))
  }
}
