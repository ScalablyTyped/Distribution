package typings.ipfsCli

import typings.ipfsCli.anon.CtxKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dhtGetMod {
  
  @JSImport("ipfs-cli/dist/src/commands/dht/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/dht/get", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/dht/get", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/dht/get", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintKeyTimeout: CtxKey): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintKeyTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
