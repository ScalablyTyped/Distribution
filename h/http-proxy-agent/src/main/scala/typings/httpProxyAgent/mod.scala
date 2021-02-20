package typings.httpProxyAgent

import org.scalablytyped.runtime.Instantiable1
import typings.agentBase.mod.AgentOptions
import typings.httpProxyAgent.agentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-proxy-agent", JSImport.Namespace)
  @js.native
  def apply(opts: String): default = js.native
  @JSImport("http-proxy-agent", JSImport.Namespace)
  @js.native
  def apply(opts: HttpProxyAgentOptions): default = js.native
  
  @JSImport("http-proxy-agent", "HttpProxyAgent")
  @js.native
  val HttpProxyAgent: Instantiable1[/* _opts */ String | HttpProxyAgentOptions, default] = js.native
  type HttpProxyAgent = default
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("http-proxy-agent", "HttpProxyAgent")
  @js.native
  class HttpProxyAgentCls protected () extends default {
    def this(_opts: String) = this()
    def this(_opts: HttpProxyAgentOptions) = this()
  }
  
  @js.native
  trait BaseHttpProxyAgentOptions extends StObject {
    
    var host: js.UndefOr[String | Null] = js.native
    
    var path: js.UndefOr[String | Null] = js.native
    
    var port: js.UndefOr[String | Double | Null] = js.native
    
    var secureProxy: js.UndefOr[Boolean] = js.native
  }
  object BaseHttpProxyAgentOptions {
    
    @scala.inline
    def apply(): BaseHttpProxyAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseHttpProxyAgentOptions]
    }
    
    @scala.inline
    implicit class BaseHttpProxyAgentOptionsMutableBuilder[Self <: BaseHttpProxyAgentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSecureProxy(value: Boolean): Self = StObject.set(x, "secureProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProxyUndefined: Self = StObject.set(x, "secureProxy", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Omit<node.url.Url & node.net.NetConnectOpts & node.tls.ConnectionOptions, 'secureProxy' | 'host' | 'path' | 'port'> ]:? std.Omit<node.url.Url & node.net.NetConnectOpts & node.tls.ConnectionOptions, 'secureProxy' | 'host' | 'path' | 'port'>[P]} */ @js.native
  trait HttpProxyAgentOptions
    extends AgentOptions
       with BaseHttpProxyAgentOptions
  object HttpProxyAgentOptions {
    
    @scala.inline
    def apply(): HttpProxyAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpProxyAgentOptions]
    }
  }
}
