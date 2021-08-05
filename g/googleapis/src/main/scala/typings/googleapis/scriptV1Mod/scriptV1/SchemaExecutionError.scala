package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that provides information about the nature of an error resulting
  * from an attempted execution of a script function using the Apps Script API.
  * If a run call succeeds but the script function (or Apps Script itself)
  * throws an exception, the response body&#39;s error field contains a Status
  * object. The `Status` object&#39;s `details` field contains an array with a
  * single one of these `ExecutionError` objects.
  */
trait SchemaExecutionError extends StObject {
  
  /**
    * The error message thrown by Apps Script, usually localized into the
    * user&#39;s language.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The error type, for example `TypeError` or `ReferenceError`. If the error
    * type is unavailable, this field is not included.
    */
  var errorType: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that provide a stack trace through the script to show
    * where the execution failed, with the deepest call first.
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
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setScriptStackTraceElements(value: js.Array[SchemaScriptStackTraceElement]): Self = StObject.set(x, "scriptStackTraceElements", value.asInstanceOf[js.Any])
    
    inline def setScriptStackTraceElementsUndefined: Self = StObject.set(x, "scriptStackTraceElements", js.undefined)
    
    inline def setScriptStackTraceElementsVarargs(value: SchemaScriptStackTraceElement*): Self = StObject.set(x, "scriptStackTraceElements", js.Array(value :_*))
  }
}
