package typings.ipfsCli

import typings.ipfsCli.anon.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveMod {
  
  @JSImport("ipfs-cli/dist/src/commands/dag/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object ref {
      
      @JSImport("ipfs-cli/dist/src/commands/dag/resolve", "builder.ref.type")
      @js.native
      val `type`: String = js.native
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/dag/resolve", "builder.timeout.type_1")
      @js.native
      val type1: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/dag/resolve", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/dag/resolve", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintRefTimeout: Ref): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintRefTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
