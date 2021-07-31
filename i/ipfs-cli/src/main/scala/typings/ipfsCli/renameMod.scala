package typings.ipfsCli

import typings.ipfsCli.anon.NewName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renameMod {
  
  @JSImport("ipfs-cli/dist/src/commands/key/rename", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/key/rename", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/key/rename", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/key/rename", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintNameNewNameTimeout: NewName): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintNameNewNameTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
