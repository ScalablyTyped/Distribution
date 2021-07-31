package typings.ipfsCli

import typings.ipfsCli.anon.AliasCoerce
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Long
import typings.ipfsCli.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesLsMod {
  
  @JSImport("ipfs-cli/dist/src/commands/files/ls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/files/ls", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/files/ls", "builder.cid-base")
    @js.native
    def cidBase: `1` = js.native
    
    @scala.inline
    def cidBase_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/ls", "builder.long")
    @js.native
    def long: AliasCoerce = js.native
    @scala.inline
    def long_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("long")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/ls", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/files/ls", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/files/ls", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintPathLongCidBaseTimeout: Long): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintPathLongCidBaseTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
