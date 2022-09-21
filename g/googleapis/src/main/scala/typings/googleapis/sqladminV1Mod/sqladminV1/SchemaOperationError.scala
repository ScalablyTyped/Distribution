package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperationError extends StObject {
  
  /**
    * Identifies the specific error that occurred.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always `sql#operationError`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional information about the error encountered.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaOperationError {
  
  inline def apply(): SchemaOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationError]
  }
  
  extension [Self <: SchemaOperationError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
