package typings.httpsProxyAgent.mod

import typings.agentBase.mod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Omit<node.url.Url & node.net.NetConnectOpts & node.tls.ConnectionOptions, 'headers' | 'secureProxy' | 'host' | 'path' | 'port'> ]:? std.Omit<node.url.Url & node.net.NetConnectOpts & node.tls.ConnectionOptions, 'headers' | 'secureProxy' | 'host' | 'path' | 'port'>[P]} */ @js.native
trait HttpsProxyAgentOptions
  extends AgentOptions
     with BaseHttpsProxyAgentOptions
object HttpsProxyAgentOptions {
  
  @scala.inline
  def apply(): HttpsProxyAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpsProxyAgentOptions]
  }
}
