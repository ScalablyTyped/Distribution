package typings.ipfsCli

import typings.ipfsCli.anon.CtxIpfsAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shutdownMod {
  
  @JSImport("ipfs-cli/dist/src/commands/shutdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/shutdown", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/shutdown", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/shutdown", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsTimeout: CtxIpfsAny): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
