package typings.httpsProxyAgent

import typings.agentBase.mod.Agent
import typings.httpsProxyAgent.mod.HttpsProxyAgentOptions
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https-proxy-agent/dist/agent", JSImport.Namespace)
@js.native
object agentMod extends js.Object {
  @js.native
  trait HttpsProxyAgent extends Agent {
    var proxy: js.Any = js.native
    var secureProxy: js.Any = js.native
    /**
      * Called when the node-core HTTP client library is creating a
      * new HTTP request.
      *
      * @api protected
      */
    def callback(
      req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientRequest */ js.Any,
      opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestOptions */ js.Any
    ): js.Promise[Socket] = js.native
  }
  
  @js.native
  class default protected () extends HttpsProxyAgent {
    def this(_opts: String) = this()
    def this(_opts: HttpsProxyAgentOptions) = this()
  }
  
}

