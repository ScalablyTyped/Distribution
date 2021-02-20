package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataOptions extends StObject {
  
  /* Signal that the call is cacheable. GRPC is free to use GET verb.
    * Defaults to false */
  var cacheableRequest: js.UndefOr[Boolean] = js.native
  
  /* Signal that the initial metadata should be corked. Defaults to false. */
  var corked: js.UndefOr[Boolean] = js.native
  
  /* Signal that the request is idempotent. Defaults to false */
  var idempotentRequest: js.UndefOr[Boolean] = js.native
  
  /* Signal that the call should not return UNAVAILABLE before it has
    * started. Defaults to true. */
  var waitForReady: js.UndefOr[Boolean] = js.native
}
object MetadataOptions {
  
  @scala.inline
  def apply(): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataOptions]
  }
  
  @scala.inline
  implicit class MetadataOptionsMutableBuilder[Self <: MetadataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheableRequest(value: Boolean): Self = StObject.set(x, "cacheableRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheableRequestUndefined: Self = StObject.set(x, "cacheableRequest", js.undefined)
    
    @scala.inline
    def setCorked(value: Boolean): Self = StObject.set(x, "corked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorkedUndefined: Self = StObject.set(x, "corked", js.undefined)
    
    @scala.inline
    def setIdempotentRequest(value: Boolean): Self = StObject.set(x, "idempotentRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotentRequestUndefined: Self = StObject.set(x, "idempotentRequest", js.undefined)
    
    @scala.inline
    def setWaitForReady(value: Boolean): Self = StObject.set(x, "waitForReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForReadyUndefined: Self = StObject.set(x, "waitForReady", js.undefined)
  }
}
