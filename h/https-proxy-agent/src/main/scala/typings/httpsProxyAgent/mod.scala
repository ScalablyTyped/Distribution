package typings.httpsProxyAgent

import org.scalablytyped.runtime.Instantiable1
import typings.agentBase.mod.AgentOptions
import typings.httpsProxyAgent.agentMod.default
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(opts: String): default = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[default]
  @scala.inline
  def apply(opts: HttpsProxyAgentOptions): default = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[default]
  
  @JSImport("https-proxy-agent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("https-proxy-agent", "HttpsProxyAgent")
  @js.native
  val HttpsProxyAgent: Instantiable1[/* _opts */ String | HttpsProxyAgentOptions, default] = js.native
  type HttpsProxyAgent = default
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("https-proxy-agent", "HttpsProxyAgent")
  @js.native
  class HttpsProxyAgentCls protected () extends default {
    def this(_opts: String) = this()
    def this(_opts: HttpsProxyAgentOptions) = this()
  }
  
  trait BaseHttpsProxyAgentOptions extends StObject {
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var host: js.UndefOr[String | Null] = js.undefined
    
    var path: js.UndefOr[String | Null] = js.undefined
    
    var port: js.UndefOr[String | Double | Null] = js.undefined
    
    var secureProxy: js.UndefOr[Boolean] = js.undefined
  }
  object BaseHttpsProxyAgentOptions {
    
    @scala.inline
    def apply(): BaseHttpsProxyAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseHttpsProxyAgentOptions]
    }
    
    @scala.inline
    implicit class BaseHttpsProxyAgentOptionsMutableBuilder[Self <: BaseHttpsProxyAgentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
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
  - Dropped {[ P in keyof std.Omit<node.url.Url & node.net.NetConnectOpts & node.tls.ConnectionOptions, 'headers' | 'secureProxy' | 'host' | 'path' | 'port'> ]:? std.Omit<node.url.Url & node.net.NetConnectOpts & node.tls.ConnectionOptions, 'headers' | 'secureProxy' | 'host' | 'path' | 'port'>[P]} */ trait HttpsProxyAgentOptions
    extends StObject
       with AgentOptions
       with BaseHttpsProxyAgentOptions
  object HttpsProxyAgentOptions {
    
    @scala.inline
    def apply(): HttpsProxyAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpsProxyAgentOptions]
    }
  }
}
