package typings.httpsProxyAgent

import typings.agentBase.mod.Agent
import typings.httpsProxyAgent.anon.Headers
import typings.httpsProxyAgent.anon.OmitConnectionOptionshost
import typings.httpsProxyAgent.anon.OmitTcpNetConnectOptshost
import typings.httpsProxyAgent.httpsProxyAgentStrings.http
import typings.httpsProxyAgent.httpsProxyAgentStrings.https
import typings.node.httpMod.AgentOptions
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.TcpNetConnectOpts
import typings.node.tlsMod.ConnectionOptions
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("https-proxy-agent", "HttpsProxyAgent")
  @js.native
  open class HttpsProxyAgent[Uri /* <: String */] protected () extends Agent {
    def this(proxy: Uri) = this()
    def this(proxy: URL) = this()
    def this(proxy: Uri, opts: HttpsProxyAgentOptions[Uri]) = this()
    def this(proxy: URL, opts: HttpsProxyAgentOptions[Uri]) = this()
    
    var connectOpts: TcpNetConnectOpts & ConnectionOptions = js.native
    
    val proxy: URL = js.native
    
    var proxyHeaders: OutgoingHttpHeaders = js.native
    
    def secureProxy: Boolean = js.native
  }
  /* static members */
  object HttpsProxyAgent {
    
    @JSImport("https-proxy-agent", "HttpsProxyAgent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("https-proxy-agent", "HttpsProxyAgent.protocols")
    @js.native
    def protocols: js.Tuple2[http, https] = js.native
    inline def protocols_=(x: js.Tuple2[http, https]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocols")(x.asInstanceOf[js.Any])
  }
  
  type ConnectOpts[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof https-proxy-agent.https-proxy-agent.ConnectOptsMap ]: https-proxy-agent.https-proxy-agent.Protocol<T> extends P? https-proxy-agent.https-proxy-agent.ConnectOptsMap[P] : never}[keyof https-proxy-agent.https-proxy-agent.ConnectOptsMap] */ js.Any
  
  trait ConnectOptsMap extends StObject {
    
    var http: OmitTcpNetConnectOptshost
    
    var https: OmitConnectionOptionshost
  }
  object ConnectOptsMap {
    
    inline def apply(http: OmitTcpNetConnectOptshost, https: OmitConnectionOptionshost): ConnectOptsMap = {
      val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectOptsMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectOptsMap] (val x: Self) extends AnyVal {
      
      inline def setHttp(value: OmitTcpNetConnectOptshost): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttps(value: OmitConnectionOptionshost): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    }
  }
  
  type HttpsProxyAgentOptions[T] = ConnectOpts[T] & AgentOptions & Headers
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends / * template literal string: ${inferProtocol}:${infer_} * / string ? https-proxy-agent.https-proxy-agent.Protocol</ * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any> : never
    }}}
    */
  @js.native
  trait Protocol[T] extends StObject
}
