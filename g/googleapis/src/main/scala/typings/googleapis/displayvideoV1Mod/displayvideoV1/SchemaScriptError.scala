package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScriptError extends StObject {
  
  /**
    * The column number in the script where the error was thrown.
    */
  var column: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of error.
    */
  var errorCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The detailed error message.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The line number in the script where the error was thrown.
    */
  var line: js.UndefOr[String | Null] = js.undefined
}
object SchemaScriptError {
  
  inline def apply(): SchemaScriptError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScriptError]
  }
  
  extension [Self <: SchemaScriptError](x: Self) {
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnNull: Self = StObject.set(x, "column", null)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
