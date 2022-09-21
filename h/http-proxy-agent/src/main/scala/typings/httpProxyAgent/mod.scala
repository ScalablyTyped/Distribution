package typings.httpProxyAgent

import org.scalablytyped.runtime.Instantiable1
import typings.agentBase.mod.AgentOptions
import typings.httpProxyAgent.agentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: String): default = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[default]
  inline def apply(opts: HttpProxyAgentOptions): default = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[default]
  
  @JSImport("http-proxy-agent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("http-proxy-agent", "HttpProxyAgent")
  @js.native
  val HttpProxyAgent: Instantiable1[/* _opts */ String | HttpProxyAgentOptions, default] = js.native
  type HttpProxyAgent = default
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("http-proxy-agent", "HttpProxyAgent")
  @js.native
  open class HttpProxyAgentCls protected () extends default {
    def this(_opts: String) = this()
    def this(_opts: HttpProxyAgentOptions) = this()
  }
  
  trait BaseHttpProxyAgentOptions extends StObject {
    
    var host: js.UndefOr[String | Null] = js.undefined
    
    var path: js.UndefOr[String | Null] = js.undefined
    
    var port: js.UndefOr[String | Double | Null] = js.undefined
    
    var secureProxy: js.UndefOr[Boolean] = js.undefined
  }
  object BaseHttpProxyAgentOptions {
    
    inline def apply(): BaseHttpProxyAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseHttpProxyAgentOptions]
    }
    
    extension [Self <: BaseHttpProxyAgentOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSecureProxy(value: Boolean): Self = StObject.set(x, "secureProxy", value.asInstanceOf[js.Any])
      
      inline def setSecureProxyUndefined: Self = StObject.set(x, "secureProxy", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Omit<node.url.Url & node.net.NetConnectOpts & node.tls.ConnectionOptions, 'secureProxy' | 'host' | 'path' | 'port'> ]:? std.Omit<node.url.Url & node.net.NetConnectOpts & node.tls.ConnectionOptions, 'secureProxy' | 'host' | 'path' | 'port'>[P]} */ trait HttpProxyAgentOptions
    extends StObject
       with AgentOptions
       with BaseHttpProxyAgentOptions
  object HttpProxyAgentOptions {
    
    inline def apply(): HttpProxyAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpProxyAgentOptions]
    }
  }
}
