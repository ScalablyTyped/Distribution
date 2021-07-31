package typings.ipfsCli

import typings.ipfsCli.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disconnectMod {
  
  @JSImport("ipfs-cli/dist/src/commands/swarm/disconnect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/swarm/disconnect", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/swarm/disconnect", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/swarm/disconnect", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasPrintIpfsIsDaemonAddressTimeout: Address): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasPrintIpfsIsDaemonAddressTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
