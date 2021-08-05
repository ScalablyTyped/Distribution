package typings.ipfsCli

import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.CidBase_
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statMod {
  
  @JSImport("ipfs-cli/dist/src/commands/bitswap/stat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/bitswap/stat", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/bitswap/stat", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    inline def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/bitswap/stat", "builder.human")
    @js.native
    def human: Type = js.native
    inline def human_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("human")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/bitswap/stat", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    inline def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/bitswap/stat", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/bitswap/stat", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasCtxCidBaseHumanTimeout: CidBase_): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasCtxCidBaseHumanTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
