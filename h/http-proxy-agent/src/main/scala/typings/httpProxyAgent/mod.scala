package typings.httpProxyAgent

import typings.agentBase.mod.Agent
import typings.agentBase.mod.AgentConnectOpts
import typings.httpProxyAgent.anon.Data
import typings.httpProxyAgent.anon.OmitConnectionOptionshost
import typings.httpProxyAgent.anon.OmitTcpNetConnectOptshost
import typings.httpProxyAgent.httpProxyAgentStrings.http
import typings.httpProxyAgent.httpProxyAgentStrings.https
import typings.node.httpMod.AgentOptions
import typings.node.httpMod.ClientRequest
import typings.node.netMod.Socket
import typings.node.netMod.TcpNetConnectOpts
import typings.node.tlsMod.ConnectionOptions
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-proxy-agent", "HttpProxyAgent")
  @js.native
  open class HttpProxyAgent[Uri /* <: String */] protected () extends Agent {
    def this(proxy: Uri) = this()
    def this(proxy: URL) = this()
    def this(proxy: Uri, opts: HttpProxyAgentOptions[Uri]) = this()
    def this(proxy: URL, opts: HttpProxyAgentOptions[Uri]) = this()
    
    def connect(req: HttpProxyAgentClientRequest, opts: AgentConnectOpts): js.Promise[Socket] = js.native
    
    var connectOpts: TcpNetConnectOpts & ConnectionOptions = js.native
    
    val proxy: URL = js.native
    
    def secureProxy: Boolean = js.native
  }
  /* static members */
  object HttpProxyAgent {
    
    @JSImport("http-proxy-agent", "HttpProxyAgent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("http-proxy-agent", "HttpProxyAgent.protocols")
    @js.native
    def protocols: js.Tuple2[http, https] = js.native
    inline def protocols_=(x: js.Tuple2[http, https]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocols")(x.asInstanceOf[js.Any])
  }
  
  type ConnectOpts[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof http-proxy-agent.http-proxy-agent.ConnectOptsMap ]: http-proxy-agent.http-proxy-agent.Protocol<T> extends P? http-proxy-agent.http-proxy-agent.ConnectOptsMap[P] : never}[keyof http-proxy-agent.http-proxy-agent.ConnectOptsMap] */ js.Any
  
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
  
  @js.native
  trait HttpProxyAgentClientRequest extends ClientRequest {
    
    var _header: js.UndefOr[String | Null] = js.native
    
    def _implicitHeader(): Unit = js.native
    
    var outputData: js.UndefOr[js.Array[Data]] = js.native
  }
  
  type HttpProxyAgentOptions[T] = ConnectOpts[T] & AgentOptions
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends / * template literal string: ${inferProtocol}:${infer_} * / string ? http-proxy-agent.http-proxy-agent.Protocol</ * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any> : never
    }}}
    */
  @js.native
  trait Protocol[T] extends StObject
}
