package typings.ipfsCli

import typings.ipfsCli.anon.CtxName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyRmMod {
  
  @JSImport("ipfs-cli/dist/src/commands/key/rm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/key/rm", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/key/rm", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/key/rm", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintNameTimeout: CtxName): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintNameTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
