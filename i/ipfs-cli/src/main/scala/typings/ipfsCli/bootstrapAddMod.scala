package typings.ipfsCli

import typings.ipfsCli.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bootstrapAddMod {
  
  @JSImport("ipfs-cli/dist/src/commands/bootstrap/add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object default {
      
      @JSImport("ipfs-cli/dist/src/commands/bootstrap/add", "builder._default._default_1")
      @js.native
      val default1: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/bootstrap/add", "builder._default.describe_1")
      @js.native
      val describe1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/bootstrap/add", "builder._default.type")
      @js.native
      val `type`: String = js.native
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/bootstrap/add", "builder.timeout.type_1")
      @js.native
      val type1: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/bootstrap/add", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/bootstrap/add", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintPeerDefaultPeersTimeout: Timeout): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintPeerDefaultPeersTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
