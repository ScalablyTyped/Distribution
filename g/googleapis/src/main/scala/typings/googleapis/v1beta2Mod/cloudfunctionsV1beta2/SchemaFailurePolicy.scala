package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the policy in case of function&#39;s execution failure. If empty,
  * then defaults to ignoring failures (i.e. not retrying them).
  */
trait SchemaFailurePolicy extends StObject {
  
  /**
    * If specified, then the function will be retried in case of a failure.
    */
  var retry: js.UndefOr[SchemaRetry] = js.undefined
}
object SchemaFailurePolicy {
  
  inline def apply(): SchemaFailurePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailurePolicy]
  }
  
  extension [Self <: SchemaFailurePolicy](x: Self) {
    
    inline def setRetry(value: SchemaRetry): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
