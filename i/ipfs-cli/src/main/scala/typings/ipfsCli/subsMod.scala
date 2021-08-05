package typings.ipfsCli

import typings.ipfsCli.anon.CtxTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subsMod {
  
  @JSImport("ipfs-cli/dist/src/commands/name/pubsub/subs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/name/pubsub/subs", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/name/pubsub/subs", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/name/pubsub/subs", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintTimeout: CtxTimeout): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
