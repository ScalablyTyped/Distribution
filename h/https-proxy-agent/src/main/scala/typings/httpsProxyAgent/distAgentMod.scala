package typings.httpsProxyAgent

import typings.agentBase.mod.Agent
import typings.httpsProxyAgent.mod.HttpsProxyAgentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgentMod {
  
  @JSImport("https-proxy-agent/dist/agent", JSImport.Default)
  @js.native
  open class default protected () extends HttpsProxyAgent {
    def this(_opts: String) = this()
    def this(_opts: HttpsProxyAgentOptions) = this()
  }
  
  @js.native
  trait HttpsProxyAgent extends Agent {
    
    /* private */ var proxy: Any = js.native
    
    /* private */ var secureProxy: Any = js.native
  }
}
