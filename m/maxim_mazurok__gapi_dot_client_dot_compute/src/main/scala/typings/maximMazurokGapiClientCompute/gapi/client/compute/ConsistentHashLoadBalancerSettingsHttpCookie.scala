package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsistentHashLoadBalancerSettingsHttpCookie extends StObject {
  
  /** Name of the cookie. */
  var name: js.UndefOr[String] = js.native
  
  /** Path to set for the cookie. */
  var path: js.UndefOr[String] = js.native
  
  /** Lifetime of the cookie. */
  var ttl: js.UndefOr[Duration] = js.native
}
object ConsistentHashLoadBalancerSettingsHttpCookie {
  
  @scala.inline
  def apply(): ConsistentHashLoadBalancerSettingsHttpCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsistentHashLoadBalancerSettingsHttpCookie]
  }
  
  @scala.inline
  implicit class ConsistentHashLoadBalancerSettingsHttpCookieMutableBuilder[Self <: ConsistentHashLoadBalancerSettingsHttpCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTtl(value: Duration): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
