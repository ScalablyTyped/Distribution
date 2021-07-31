package typings.ipfsCli

import typings.ipfsCli.anon.CtxData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubMod {
  
  @JSImport("ipfs-cli/dist/src/commands/pubsub/pub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/pubsub/pub", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/pubsub/pub", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/pubsub/pub", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsTopicDataTimeout: CtxData): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsTopicDataTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
