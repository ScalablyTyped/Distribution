package typings.hpagent

import typings.node.httpMod.Agent
import typings.node.httpMod.AgentOptions
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hpagent", "HttpProxyAgent")
  @js.native
  class HttpProxyAgent protected () extends Agent {
    def this(options: HttpProxyAgentOptions) = this()
  }
  
  @JSImport("hpagent", "HttpsProxyAgent")
  @js.native
  class HttpsProxyAgent protected ()
    extends typings.node.httpsMod.Agent {
    def this(options: HttpsProxyAgentOptions) = this()
  }
  
  @js.native
  trait HttpProxyAgentOptions extends AgentOptions {
    
    var proxy: String | URL_ = js.native
  }
  object HttpProxyAgentOptions {
    
    @scala.inline
    def apply(proxy: String | URL_): HttpProxyAgentOptions = {
      val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpProxyAgentOptions]
    }
    
    @scala.inline
    implicit class HttpProxyAgentOptionsMutableBuilder[Self <: HttpProxyAgentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HttpsProxyAgentOptions
    extends typings.node.httpsMod.AgentOptions {
    
    var proxy: String | URL_ = js.native
  }
  object HttpsProxyAgentOptions {
    
    @scala.inline
    def apply(proxy: String | URL_): HttpsProxyAgentOptions = {
      val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsProxyAgentOptions]
    }
    
    @scala.inline
    implicit class HttpsProxyAgentOptionsMutableBuilder[Self <: HttpsProxyAgentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    }
  }
}
