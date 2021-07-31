package typings.ipfsCli

import typings.ipfsCli.anon.AliasDescribe
import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Peer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wantlistMod {
  
  @JSImport("ipfs-cli/dist/src/commands/bitswap/wantlist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/bitswap/wantlist", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/bitswap/wantlist", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    @scala.inline
    def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/bitswap/wantlist", "builder.peer")
    @js.native
    def peer: AliasDescribe = js.native
    @scala.inline
    def peer_=(x: AliasDescribe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peer")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/bitswap/wantlist", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/bitswap/wantlist", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/bitswap/wantlist", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasCtxPeerCidBaseTimeout: Peer): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasCtxPeerCidBaseTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
