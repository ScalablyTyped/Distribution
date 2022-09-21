package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResetRuntimeRequest extends StObject {
  
  /**
    * Idempotent request UUID.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaResetRuntimeRequest {
  
  inline def apply(): SchemaResetRuntimeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResetRuntimeRequest]
  }
  
  extension [Self <: SchemaResetRuntimeRequest](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
