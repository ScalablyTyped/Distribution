package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.All
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bootstrapRmMod {
  
  @JSImport("ipfs-cli/dist/src/commands/bootstrap/rm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object all extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/bootstrap/rm", "builder.all._default")
      @js.native
      val default: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/bootstrap/rm", "builder.all.describe_1")
      @js.native
      val describe1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/bootstrap/rm", "builder.all.type")
      @js.native
      val `type`: String = js.native
      
      type _To = Boolean
      
      /* This means you don't have to write `default`, but can instead just say `all.foo` */
      override def _to: Boolean = default
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/bootstrap/rm", "builder.timeout.type_1")
      @js.native
      val type1: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/bootstrap/rm", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/bootstrap/rm", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintAllPeerTimeout: All): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintAllPeerTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
