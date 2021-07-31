package typings.ipfsCli

import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.DefaultDesc
import typings.ipfsCli.anon.Desc
import typings.ipfsCli.anon.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsLsMod {
  
  @JSImport("ipfs-cli/dist/src/commands/ls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/ls", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/ls", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    @scala.inline
    def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/ls", "builder.r")
    @js.native
    def r: Desc = js.native
    @scala.inline
    def r_=(x: Desc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("r")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/ls", "builder.resolve-type")
    @js.native
    def resolveType: DefaultDesc = js.native
    
    @scala.inline
    def resolveType_=(x: DefaultDesc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolve-type")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/ls", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/ls", "builder.v")
    @js.native
    def v: Desc = js.native
    @scala.inline
    def v_=(x: Desc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/ls", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/ls", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintKeyRecursiveHeadersCidBaseTimeout: Headers): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintKeyRecursiveHeadersCidBaseTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
