package typings.hpagent

import typings.node.httpMod.Agent
import typings.node.httpMod.AgentOptions
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hpagent", "HttpProxyAgent")
  @js.native
  open class HttpProxyAgent protected () extends Agent {
    def this(options: HttpProxyAgentOptions) = this()
  }
  
  @JSImport("hpagent", "HttpsProxyAgent")
  @js.native
  open class HttpsProxyAgent protected ()
    extends typings.node.httpsMod.Agent {
    def this(options: HttpsProxyAgentOptions) = this()
  }
  
  trait HttpProxyAgentOptions
    extends StObject
       with AgentOptions {
    
    var proxy: String | URL_
    
    var proxyRequestOptions: js.UndefOr[ProxyAgentRequestOptions] = js.undefined
  }
  object HttpProxyAgentOptions {
    
    inline def apply(proxy: String | URL_): HttpProxyAgentOptions = {
      val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpProxyAgentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpProxyAgentOptions] (val x: Self) extends AnyVal {
      
      inline def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyRequestOptions(value: ProxyAgentRequestOptions): Self = StObject.set(x, "proxyRequestOptions", value.asInstanceOf[js.Any])
      
      inline def setProxyRequestOptionsUndefined: Self = StObject.set(x, "proxyRequestOptions", js.undefined)
    }
  }
  
  trait HttpsProxyAgentOptions
    extends StObject
       with typings.node.httpsMod.AgentOptions {
    
    var proxy: String | URL_
    
    var proxyRequestOptions: js.UndefOr[ProxyAgentRequestOptions] = js.undefined
  }
  object HttpsProxyAgentOptions {
    
    inline def apply(proxy: String | URL_): HttpsProxyAgentOptions = {
      val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsProxyAgentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpsProxyAgentOptions] (val x: Self) extends AnyVal {
      
      inline def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyRequestOptions(value: ProxyAgentRequestOptions): Self = StObject.set(x, "proxyRequestOptions", value.asInstanceOf[js.Any])
      
      inline def setProxyRequestOptionsUndefined: Self = StObject.set(x, "proxyRequestOptions", js.undefined)
    }
  }
  
  trait ProxyAgentRequestOptions extends StObject {
    
    var ca: js.UndefOr[js.Array[String]] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  }
  object ProxyAgentRequestOptions {
    
    inline def apply(): ProxyAgentRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyAgentRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProxyAgentRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setCa(value: js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
}
