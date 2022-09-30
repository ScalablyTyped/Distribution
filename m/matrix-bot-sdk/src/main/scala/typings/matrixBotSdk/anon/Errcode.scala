package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errcode extends StObject {
  
  var errcode: String
  
  var error: String
  
  var retry_after_ms: js.UndefOr[Double] = js.undefined
}
object Errcode {
  
  inline def apply(errcode: String, error: String): Errcode = {
    val __obj = js.Dynamic.literal(errcode = errcode.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errcode]
  }
  
  extension [Self <: Errcode](x: Self) {
    
    inline def setErrcode(value: String): Self = StObject.set(x, "errcode", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setRetry_after_ms(value: Double): Self = StObject.set(x, "retry_after_ms", value.asInstanceOf[js.Any])
    
    inline def setRetry_after_msUndefined: Self = StObject.set(x, "retry_after_ms", js.undefined)
  }
}
