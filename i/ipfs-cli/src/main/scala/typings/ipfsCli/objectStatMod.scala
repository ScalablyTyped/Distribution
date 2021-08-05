package typings.ipfsCli

import typings.ipfsCli.anon.CtxKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectStatMod {
  
  @JSImport("ipfs-cli/dist/src/commands/object/stat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/object/stat", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/object/stat", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/object/stat", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintKeyTimeout: CtxKey): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintKeyTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
