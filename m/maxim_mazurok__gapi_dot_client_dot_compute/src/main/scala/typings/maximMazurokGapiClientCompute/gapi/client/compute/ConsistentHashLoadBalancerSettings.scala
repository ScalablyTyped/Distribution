package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsistentHashLoadBalancerSettings extends StObject {
  
  /**
    * Hash is based on HTTP Cookie. This field describes a HTTP cookie that will be used as the hash key for the consistent hash load balancer. If the cookie is not present, it will be
    * generated. This field is applicable if the sessionAffinity is set to HTTP_COOKIE.
    */
  var httpCookie: js.UndefOr[ConsistentHashLoadBalancerSettingsHttpCookie] = js.undefined
  
  /** The hash based on the value of the specified header field. This field is applicable if the sessionAffinity is set to HEADER_FIELD. */
  var httpHeaderName: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum number of virtual nodes to use for the hash ring. Defaults to 1024. Larger ring sizes result in more granular load distributions. If the number of hosts in the load
    * balancing pool is larger than the ring size, each host will be assigned a single virtual node.
    */
  var minimumRingSize: js.UndefOr[String] = js.undefined
}
object ConsistentHashLoadBalancerSettings {
  
  @scala.inline
  def apply(): ConsistentHashLoadBalancerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsistentHashLoadBalancerSettings]
  }
  
  @scala.inline
  implicit class ConsistentHashLoadBalancerSettingsMutableBuilder[Self <: ConsistentHashLoadBalancerSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpCookie(value: ConsistentHashLoadBalancerSettingsHttpCookie): Self = StObject.set(x, "httpCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpCookieUndefined: Self = StObject.set(x, "httpCookie", js.undefined)
    
    @scala.inline
    def setHttpHeaderName(value: String): Self = StObject.set(x, "httpHeaderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHeaderNameUndefined: Self = StObject.set(x, "httpHeaderName", js.undefined)
    
    @scala.inline
    def setMinimumRingSize(value: String): Self = StObject.set(x, "minimumRingSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumRingSizeUndefined: Self = StObject.set(x, "minimumRingSize", js.undefined)
  }
}
