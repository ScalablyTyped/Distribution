package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendServiceCdnPolicyNegativeCachingPolicy extends StObject {
  
  /**
    * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308, 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify
    * a status code more than once.
    */
  var code: js.UndefOr[Double] = js.undefined
  
  /**
    * The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may
    * be evicted from the cache before the defined TTL.
    */
  var ttl: js.UndefOr[Double] = js.undefined
}
object BackendServiceCdnPolicyNegativeCachingPolicy {
  
  inline def apply(): BackendServiceCdnPolicyNegativeCachingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceCdnPolicyNegativeCachingPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackendServiceCdnPolicyNegativeCachingPolicy] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
