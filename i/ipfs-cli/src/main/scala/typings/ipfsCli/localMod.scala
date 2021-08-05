package typings.ipfsCli

import typings.ipfsCli.anon.CtxIpfsIsDaemon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localMod {
  
  @JSImport("ipfs-cli/dist/src/commands/swarm/addrs/local", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/swarm/addrs/local", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/swarm/addrs/local", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/swarm/addrs/local", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasPrintIpfsIsDaemonTimeout: CtxIpfsIsDaemon): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasPrintIpfsIsDaemonTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
