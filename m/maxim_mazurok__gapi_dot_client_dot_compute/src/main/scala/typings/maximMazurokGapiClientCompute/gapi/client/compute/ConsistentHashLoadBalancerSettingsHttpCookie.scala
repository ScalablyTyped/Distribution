package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsistentHashLoadBalancerSettingsHttpCookie extends StObject {
  
  /** Name of the cookie. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Path to set for the cookie. */
  var path: js.UndefOr[String] = js.undefined
  
  /** Lifetime of the cookie. */
  var ttl: js.UndefOr[Duration] = js.undefined
}
object ConsistentHashLoadBalancerSettingsHttpCookie {
  
  inline def apply(): ConsistentHashLoadBalancerSettingsHttpCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsistentHashLoadBalancerSettingsHttpCookie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsistentHashLoadBalancerSettingsHttpCookie] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTtl(value: Duration): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
