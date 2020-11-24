package typings.httpsProxyAgent

import typings.agentBase.mod.Agent
import typings.httpsProxyAgent.mod.HttpsProxyAgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("https-proxy-agent/dist/agent", JSImport.Namespace)
@js.native
object agentMod extends js.Object {
  
  @js.native
  trait HttpsProxyAgent extends Agent {
    
    var proxy: js.Any = js.native
    
    var secureProxy: js.Any = js.native
  }
  
  @js.native
  class default protected () extends HttpsProxyAgent {
    def this(_opts: String) = this()
    def this(_opts: HttpsProxyAgentOptions) = this()
  }
}
