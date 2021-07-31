package typings.ipfsCli

import typings.ipfsCli.anon.CtxIpfsIsDaemon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swarmPeersMod {
  
  @JSImport("ipfs-cli/dist/src/commands/swarm/peers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/swarm/peers", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/swarm/peers", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/swarm/peers", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasPrintIpfsIsDaemonTimeout: CtxIpfsIsDaemon): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasPrintIpfsIsDaemonTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
