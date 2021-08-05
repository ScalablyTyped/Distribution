package typings.ipfsCli

import typings.ipfsCli.anon.CtxKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @JSImport("ipfs-cli/dist/src/commands/object/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/object/data", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/object/data", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/object/data", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintKeyTimeout: CtxKey): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintKeyTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
