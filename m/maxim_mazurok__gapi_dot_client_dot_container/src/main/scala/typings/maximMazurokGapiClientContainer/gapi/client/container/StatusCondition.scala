package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusCondition extends StObject {
  
  /** Canonical code of the condition. */
  var canonicalCode: js.UndefOr[String] = js.undefined
  
  /** Machine-friendly representation of the condition Deprecated. Use canonical_code instead. */
  var code: js.UndefOr[String] = js.undefined
  
  /** Human-friendly representation of the condition */
  var message: js.UndefOr[String] = js.undefined
}
object StatusCondition {
  
  inline def apply(): StatusCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusCondition]
  }
  
  extension [Self <: StatusCondition](x: Self) {
    
    inline def setCanonicalCode(value: String): Self = StObject.set(x, "canonicalCode", value.asInstanceOf[js.Any])
    
    inline def setCanonicalCodeUndefined: Self = StObject.set(x, "canonicalCode", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
