package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTlsRouteRouteMatch extends StObject {
  
  /**
    * Optional. ALPN (Application-Layer Protocol Negotiation) to match against. Examples: "http/1.1", "h2". At least one of sni_host and alpn is required. Up to 5 alpns across all matches can be set.
    */
  var alpn: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. SNI (server name indicator) to match against. SNI will be matched against all wildcard domains, i.e. www.example.com will be first matched against www.example.com, then *.example.com, then *.com. Partial wildcards are not supported, and values like *w.example.com are invalid. At least one of sni_host and alpn is required. Up to 5 sni hosts across all matches can be set.
    */
  var sniHost: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaTlsRouteRouteMatch {
  
  inline def apply(): SchemaTlsRouteRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsRouteRouteMatch]
  }
  
  extension [Self <: SchemaTlsRouteRouteMatch](x: Self) {
    
    inline def setAlpn(value: js.Array[String]): Self = StObject.set(x, "alpn", value.asInstanceOf[js.Any])
    
    inline def setAlpnNull: Self = StObject.set(x, "alpn", null)
    
    inline def setAlpnUndefined: Self = StObject.set(x, "alpn", js.undefined)
    
    inline def setAlpnVarargs(value: String*): Self = StObject.set(x, "alpn", js.Array(value*))
    
    inline def setSniHost(value: js.Array[String]): Self = StObject.set(x, "sniHost", value.asInstanceOf[js.Any])
    
    inline def setSniHostNull: Self = StObject.set(x, "sniHost", null)
    
    inline def setSniHostUndefined: Self = StObject.set(x, "sniHost", js.undefined)
    
    inline def setSniHostVarargs(value: String*): Self = StObject.set(x, "sniHost", js.Array(value*))
  }
}
