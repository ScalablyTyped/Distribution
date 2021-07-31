package typings.ipfsCli

import typings.ipfsCli.anon.AliasDescribe
import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Ctx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unwantMod {
  
  @JSImport("ipfs-cli/dist/src/commands/bitswap/unwant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/bitswap/unwant", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/bitswap/unwant", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    @scala.inline
    def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/bitswap/unwant", "builder.key")
    @js.native
    def key: AliasDescribe = js.native
    @scala.inline
    def key_=(x: AliasDescribe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/bitswap/unwant", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/bitswap/unwant", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/bitswap/unwant", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasCtxKeyCidBaseTimeout: Ctx): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasCtxKeyCidBaseTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
