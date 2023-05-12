package typings.ipfsBitswap

import typings.ipfsBitswap.distSrcNetworkMod.Network
import typings.ipfsBitswap.distSrcStatsMod.Stats
import typings.ipfsBitswap.distSrcWantManagerMsgQueueMod.MsgQueue
import typings.ipfsBitswap.distSrcWantlistMod.Wantlist
import typings.ipfsBitswap.mod.BitswapWantBlockProgressEvents
import typings.libp2pInterfaceLibp2p.mod.Libp2p
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformatsMultiaddr.mod.AbortOptions
import typings.progressEvents.mod.ProgressOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWantManagerMod {
  
  @JSImport("ipfs-bitswap/dist/src/want-manager", "WantManager")
  @js.native
  open class WantManager protected () extends StObject {
    def this(peerId: PeerId, network: Network, stats: Stats, libp2p: Libp2p[Record[String, Any]]) = this()
    
    def _addEntries(cids: js.Array[CID[Any, Double, Double, Version]], cancel: Boolean): Unit = js.native
    def _addEntries(cids: js.Array[CID[Any, Double, Double, Version]], cancel: Boolean, force: Boolean): Unit = js.native
    def _addEntries(
      cids: js.Array[CID[Any, Double, Double, Version]],
      cancel: Boolean,
      force: Boolean,
      options: ProgressOptions[BitswapWantBlockProgressEvents]
    ): Unit = js.native
    def _addEntries(
      cids: js.Array[CID[Any, Double, Double, Version]],
      cancel: Boolean,
      force: Unit,
      options: ProgressOptions[BitswapWantBlockProgressEvents]
    ): Unit = js.native
    
    /* private */ val _log: Any = js.native
    
    /* private */ val _peerId: Any = js.native
    
    def _startPeerHandler(peerId: PeerId): js.UndefOr[MsgQueue] = js.native
    
    def _stopPeerHandler(peerId: PeerId): Unit = js.native
    
    /**
      * Cancel wanting all of the given keys
      */
    def cancelWants(cids: js.Array[CID[Any, Double, Double, Version]]): Unit = js.native
    
    def connected(peerId: PeerId): Unit = js.native
    
    /**
      * Returns a list of all currently connected peers
      */
    def connectedPeers(): js.Array[String] = js.native
    
    def disconnected(peerId: PeerId): Unit = js.native
    
    var network: Network = js.native
    
    /* private */ val peers: Any = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    /**
      * Remove blocks of all the given keys without respecting refcounts
      */
    def unwantBlocks(cids: js.Array[CID[Any, Double, Double, Version]]): Unit = js.native
    
    /**
      * add all the cids to the wantlist
      */
    def wantBlocks(cids: js.Array[CID[Any, Double, Double, Version]]): Unit = js.native
    def wantBlocks(
      cids: js.Array[CID[Any, Double, Double, Version]],
      options: AbortOptions & ProgressOptions[BitswapWantBlockProgressEvents]
    ): Unit = js.native
    
    var wantlist: Wantlist = js.native
  }
}
