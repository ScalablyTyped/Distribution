package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the policy in case of function&#39;s execution failure. If empty,
  * then defaults to ignoring failures (i.e. not retrying them).
  */
@js.native
trait SchemaFailurePolicy extends StObject {
  
  /**
    * If specified, then the function will be retried in case of a failure.
    */
  var retry: js.UndefOr[SchemaRetry] = js.native
}
object SchemaFailurePolicy {
  
  @scala.inline
  def apply(): SchemaFailurePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailurePolicy]
  }
  
  @scala.inline
  implicit class SchemaFailurePolicyMutableBuilder[Self <: SchemaFailurePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetry(value: SchemaRetry): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
