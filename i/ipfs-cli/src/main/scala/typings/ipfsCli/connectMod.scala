package typings.ipfsCli

import typings.ipfsCli.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectMod {
  
  @JSImport("ipfs-cli/dist/src/commands/swarm/connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/swarm/connect", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/swarm/connect", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/swarm/connect", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasPrintIpfsIsDaemonAddressTimeout: Address): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasPrintIpfsIsDaemonAddressTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
