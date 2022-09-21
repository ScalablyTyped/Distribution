package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRuntimeError extends StObject {
  
  /**
    * The enumerated Lighthouse Error code.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A human readable message explaining the error code.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaRuntimeError {
  
  inline def apply(): SchemaRuntimeError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeError]
  }
  
  extension [Self <: SchemaRuntimeError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
