package typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaError extends StObject {
  
  /**
    * Human-readable stack trace string.
    */
  var context: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Error message and data returned represented as a JSON string.
    */
  var payload: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Stack trace with detailed information of where error was generated.
    */
  var stackTrace: js.UndefOr[SchemaStackTrace] = js.undefined
}
object SchemaError {
  
  inline def apply(): SchemaError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaError]
  }
  
  extension [Self <: SchemaError](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setStackTrace(value: SchemaStackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
  }
}
