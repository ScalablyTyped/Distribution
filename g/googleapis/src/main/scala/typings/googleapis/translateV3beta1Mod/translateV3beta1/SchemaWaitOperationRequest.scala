package typings.googleapis.translateV3beta1Mod.translateV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWaitOperationRequest extends StObject {
  
  /**
    * The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used.
    */
  var timeout: js.UndefOr[String | Null] = js.undefined
}
object SchemaWaitOperationRequest {
  
  inline def apply(): SchemaWaitOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaitOperationRequest]
  }
  
  extension [Self <: SchemaWaitOperationRequest](x: Self) {
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
