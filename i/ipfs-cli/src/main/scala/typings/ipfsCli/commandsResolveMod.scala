package typings.ipfsCli

import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Default
import typings.ipfsCli.anon.NameRecursive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsResolveMod {
  
  @JSImport("ipfs-cli/dist/src/commands/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/resolve", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/resolve", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    @scala.inline
    def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/resolve", "builder.recursive")
    @js.native
    def recursive: Default = js.native
    @scala.inline
    def recursive_=(x: Default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recursive")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/resolve", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/resolve", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/resolve", "description")
  @js.native
  val description: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsNameRecursiveCidBaseTimeout: NameRecursive): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsNameRecursiveCidBaseTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
