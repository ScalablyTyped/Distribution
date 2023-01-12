package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminConfig extends StObject {
  
  var retry: js.UndefOr[RetryOptions] = js.undefined
}
object AdminConfig {
  
  inline def apply(): AdminConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminConfig] (val x: Self) extends AnyVal {
    
    inline def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
