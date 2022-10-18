package typings.ipfsBitswap

import typings.events.mod.EventEmitter
import typings.ipfsBitswap.anon.DebuggererrorDebugger
import typings.ipfsBitswap.anon.Signal
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
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
      *
      * @param {PeerId} peerId
      */
    def this(peerId: PeerId) = this()
    
    def _log(formatter: Any, args: Any*): Unit = js.native
    @JSName("_log")
    var _log_Original: DebuggererrorDebugger = js.native
    
    /**
      * Signal the system that we received `block`.
      *
      * @param {CID} cid
      * @param {Uint8Array} block
      * @returns {void}
      */
    def hasBlock(cid: CID, block: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Signal that the block is not wanted anymore.
      *
      * @param {CID} cid - the CID of the block that is not wanted anymore.
      * @returns {void}
      */
    def unwantBlock(cid: CID): Unit = js.native
    
    /**
      * Signal the system that we are waiting to receive the
      * block associated with the given `cid`.
      * Returns a Promise that resolves to the block when it is received,
      * or undefined when the block is unwanted.
      *
      * @param {CID} cid
      * @param {object} [options]
      * @param {AbortSignal} [options.signal]
      * @returns {Promise<Uint8Array>}
      */
    def wantBlock(cid: CID): js.Promise[js.typedarray.Uint8Array] = js.native
    def wantBlock(cid: CID, options: Signal): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  type CID = typings.multiformats.mod.CID[Any, Double, Double, Version]
  
  type PeerId = typings.libp2pInterfacePeerId.mod.PeerId
}
