package typings.ipfsCli

import typings.ipfsCli.anon.Topic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subMod {
  
  @JSImport("ipfs-cli/dist/src/commands/pubsub/sub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/pubsub/sub", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/pubsub/sub", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/pubsub/sub", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintTopicTimeout: Topic): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintTopicTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
