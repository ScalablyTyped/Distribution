package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailurePolicy extends StObject {
  
  /** If specified, then the function will be retried in case of a failure. */
  var retry: js.UndefOr[js.Any] = js.undefined
}
object FailurePolicy {
  
  inline def apply(): FailurePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailurePolicy]
  }
  
  extension [Self <: FailurePolicy](x: Self) {
    
    inline def setRetry(value: js.Any): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
