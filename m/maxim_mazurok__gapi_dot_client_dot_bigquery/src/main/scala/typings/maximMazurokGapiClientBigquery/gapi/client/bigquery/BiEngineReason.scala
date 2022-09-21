package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiEngineReason extends StObject {
  
  /** [Output-only] High-level BI Engine reason for partial or disabled acceleration. */
  var code: js.UndefOr[String] = js.undefined
  
  /** [Output-only] Free form human-readable reason for partial or disabled acceleration. */
  var message: js.UndefOr[String] = js.undefined
}
object BiEngineReason {
  
  inline def apply(): BiEngineReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiEngineReason]
  }
  
  extension [Self <: BiEngineReason](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
