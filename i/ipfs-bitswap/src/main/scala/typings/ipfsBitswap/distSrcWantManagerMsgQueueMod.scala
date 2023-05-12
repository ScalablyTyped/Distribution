package typings.ipfsBitswap

import typings.ipfsBitswap.anon.Cid
import typings.ipfsBitswap.distSrcMessageMod.BitswapMessage
import typings.ipfsBitswap.distSrcNetworkMod.BitswapNetworkWantProgressEvents
import typings.ipfsBitswap.distSrcNetworkMod.Network
import typings.ipfsBitswap.mod.BitswapWantBlockProgressEvents
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.progressEvents.mod.ProgressOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWantManagerMsgQueueMod {
  
  @JSImport("ipfs-bitswap/dist/src/want-manager/msg-queue", "MsgQueue")
  @js.native
  open class MsgQueue protected () extends StObject {
    def this(selfPeerId: PeerId, otherPeerId: PeerId, network: Network) = this()
    
    /* private */ var _entries: Any = js.native
    
    /* private */ val _log: Any = js.native
    
    def addEntries(entries: js.Array[Cid]): Unit = js.native
    def addEntries(entries: js.Array[Cid], options: ProgressOptions[BitswapWantBlockProgressEvents]): Unit = js.native
    
    def addMessage(msg: BitswapMessage): Unit = js.native
    def addMessage(msg: BitswapMessage, options: ProgressOptions[BitswapNetworkWantProgressEvents]): Unit = js.native
    
    /* private */ val network: Any = js.native
    
    var peerId: PeerId = js.native
    
    var refcnt: Double = js.native
    
    def send(msg: BitswapMessage): js.Promise[Unit] = js.native
    def send(msg: BitswapMessage, options: ProgressOptions[BitswapNetworkWantProgressEvents]): js.Promise[Unit] = js.native
    
    def sendEntries(): Unit = js.native
    def sendEntries(options: ProgressOptions[BitswapWantBlockProgressEvents]): Unit = js.native
  }
}
