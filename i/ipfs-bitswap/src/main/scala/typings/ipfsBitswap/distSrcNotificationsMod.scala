package typings.ipfsBitswap

import typings.events.mod.EventEmitter
import typings.ipfsBitswap.mod.BitswapWantBlockProgressEvents
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.progressEvents.mod.ProgressOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNotificationsMod {
  
  @JSImport("ipfs-bitswap/dist/src/notifications", "Notifications")
  @js.native
  open class Notifications protected () extends EventEmitter {
    /**
      * Internal module used to track events about incoming blocks,
      * wants and unwants.
      */
    def this(peerId: PeerId) = this()
    
    /* private */ val _log: Any = js.native
    
    /**
      * Signal the system that we received `block`.
      */
    def hasBlock(cid: CID[Any, Double, Double, Version], block: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Signal that the block is not wanted anymore
      */
    def unwantBlock(cid: CID[Any, Double, Double, Version]): Unit = js.native
    
    /**
      * Signal the system that we are waiting to receive the
      * block associated with the given `cid`.
      * Returns a Promise that resolves to the block when it is received,
      * or undefined when the block is unwanted.
      */
    def wantBlock(cid: CID[Any, Double, Double, Version]): js.Promise[js.typedarray.Uint8Array] = js.native
    def wantBlock(
      cid: CID[Any, Double, Double, Version],
      options: AbortOptions & ProgressOptions[BitswapWantBlockProgressEvents]
    ): js.Promise[js.typedarray.Uint8Array] = js.native
  }
}
