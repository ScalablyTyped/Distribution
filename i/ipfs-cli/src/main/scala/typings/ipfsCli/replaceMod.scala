package typings.ipfsCli

import typings.ipfsCli.anon.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaceMod {
  
  @JSImport("ipfs-cli/dist/src/commands/config/replace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/config/replace", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/config/replace", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/config/replace", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsIsDaemonFileTimeout: File): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsIsDaemonFileTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
