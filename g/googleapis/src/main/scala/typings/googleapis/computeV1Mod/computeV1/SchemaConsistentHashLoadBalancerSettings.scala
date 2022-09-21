package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConsistentHashLoadBalancerSettings extends StObject {
  
  /**
    * Hash is based on HTTP Cookie. This field describes a HTTP cookie that will be used as the hash key for the consistent hash load balancer. If the cookie is not present, it will be generated. This field is applicable if the sessionAffinity is set to HTTP_COOKIE. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var httpCookie: js.UndefOr[SchemaConsistentHashLoadBalancerSettingsHttpCookie] = js.undefined
  
  /**
    * The hash based on the value of the specified header field. This field is applicable if the sessionAffinity is set to HEADER_FIELD.
    */
  var httpHeaderName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimum number of virtual nodes to use for the hash ring. Defaults to 1024. Larger ring sizes result in more granular load distributions. If the number of hosts in the load balancing pool is larger than the ring size, each host will be assigned a single virtual node.
    */
  var minimumRingSize: js.UndefOr[String | Null] = js.undefined
}
object SchemaConsistentHashLoadBalancerSettings {
  
  inline def apply(): SchemaConsistentHashLoadBalancerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsistentHashLoadBalancerSettings]
  }
  
  extension [Self <: SchemaConsistentHashLoadBalancerSettings](x: Self) {
    
    inline def setHttpCookie(value: SchemaConsistentHashLoadBalancerSettingsHttpCookie): Self = StObject.set(x, "httpCookie", value.asInstanceOf[js.Any])
    
    inline def setHttpCookieUndefined: Self = StObject.set(x, "httpCookie", js.undefined)
    
    inline def setHttpHeaderName(value: String): Self = StObject.set(x, "httpHeaderName", value.asInstanceOf[js.Any])
    
    inline def setHttpHeaderNameNull: Self = StObject.set(x, "httpHeaderName", null)
    
    inline def setHttpHeaderNameUndefined: Self = StObject.set(x, "httpHeaderName", js.undefined)
    
    inline def setMinimumRingSize(value: String): Self = StObject.set(x, "minimumRingSize", value.asInstanceOf[js.Any])
    
    inline def setMinimumRingSizeNull: Self = StObject.set(x, "minimumRingSize", null)
    
    inline def setMinimumRingSizeUndefined: Self = StObject.set(x, "minimumRingSize", js.undefined)
  }
}
