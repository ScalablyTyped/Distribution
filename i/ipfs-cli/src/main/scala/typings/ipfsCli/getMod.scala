package typings.ipfsCli

import typings.ipfsCli.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMod {
  
  @JSImport("ipfs-cli/dist/src/commands/block/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/block/get", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/block/get", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/block/get", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasCtxKeyTimeout: Key): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasCtxKeyTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
