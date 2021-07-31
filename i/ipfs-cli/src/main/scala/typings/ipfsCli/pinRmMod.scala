package typings.ipfsCli

import typings.ipfsCli.anon.AliasString
import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.CtxIpfsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinRmMod {
  
  @JSImport("ipfs-cli/dist/src/commands/pin/rm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/pin/rm", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/pin/rm", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    @scala.inline
    def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/pin/rm", "builder.recursive")
    @js.native
    def recursive: AliasString = js.native
    @scala.inline
    def recursive_=(x: AliasString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recursive")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/pin/rm", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/pin/rm", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/pin/rm", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasCtxIpfsPathTimeoutRecursiveCidBase: CtxIpfsPath): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasCtxIpfsPathTimeoutRecursiveCidBase.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
