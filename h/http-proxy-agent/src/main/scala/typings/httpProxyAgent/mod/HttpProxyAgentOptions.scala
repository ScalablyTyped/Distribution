package typings.httpProxyAgent.mod

import typings.agentBase.mod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
