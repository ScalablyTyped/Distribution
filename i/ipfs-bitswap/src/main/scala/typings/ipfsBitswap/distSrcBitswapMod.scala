package typings.ipfsBitswap

import typings.interfaceBlockstore.mod.Blockstore
import typings.interfaceBlockstore.mod.Pair
import typings.interfaceStore.mod.AwaitIterable
import typings.ipfsBitswap.distSrcDecisionEngineMod.DecisionEngine
import typings.ipfsBitswap.distSrcMessageMod.BitswapMessage
import typings.ipfsBitswap.distSrcNetworkMod.Network
import typings.ipfsBitswap.distSrcNotificationsMod.Notifications
import typings.ipfsBitswap.distSrcStatsMod.Stats
import typings.ipfsBitswap.distSrcWantManagerMod.WantManager
import typings.ipfsBitswap.mod.Bitswap
import typings.ipfsBitswap.mod.BitswapOptions
import typings.ipfsBitswap.mod.BitswapWantProgressEvents
import typings.ipfsBitswap.mod.WantListEntry
import typings.libp2pInterfaceLibp2p.mod.Libp2p
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformatsMultiaddr.mod.AbortOptions
import typings.progressEvents.mod.ProgressOptions
import typings.std.AsyncIterable
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBitswapMod {
  
  @JSImport("ipfs-bitswap/dist/src/bitswap", "DefaultBitswap")
  @js.native
  open class DefaultBitswap protected ()
    extends StObject
       with Bitswap {
    def this(
      libp2p: Libp2p[Record[String, Any]],
      blockstore: Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object]
    ) = this()
    def this(
      libp2p: Libp2p[Record[String, Any]],
      blockstore: Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object],
      options: BitswapOptions
    ) = this()
    
    def _handleReceivedBlock(
      peerId: PeerId,
      cid: CID[Any, Double, Double, Version],
      data: js.typedarray.Uint8Array,
      wasWanted: Boolean
    ): js.Promise[Unit] = js.native
    
    /* private */ val _libp2p: Any = js.native
    
    /* private */ val _log: Any = js.native
    
    /**
      * handle new peers
      */
    def _onPeerConnected(peerId: PeerId): Unit = js.native
    
    /**
      * handle peers being disconnected
      */
    def _onPeerDisconnected(peerId: PeerId): Unit = js.native
    
    /**
      * handle errors on the receiving channel
      */
    def _receiveError(err: js.Error): Unit = js.native
    
    /**
      * handle messages received through the network
      */
    def _receiveMessage(peerId: PeerId, incoming: BitswapMessage): js.Promise[Unit] = js.native
    
    def _updateReceiveCounters(
      peerIdStr: String,
      cid: CID[Any, Double, Double, Version],
      data: js.typedarray.Uint8Array,
      exists: Boolean
    ): Unit = js.native
    
    var blockstore: Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object] = js.native
    
    def disableStats(): Unit = js.native
    
    def enableStats(): Unit = js.native
    
    var engine: DecisionEngine = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    var network: Network = js.native
    
    var notifications: Notifications = js.native
    
    def peerId: PeerId = js.native
    
    /**
      * Get the current list of partners
      */
    @JSName("peers")
    def peers_MDefaultBitswap: js.Array[PeerId] = js.native
    
    /**
      * Put the given block to the underlying blockstore and
      * send it to nodes that have it in their wantlist.
      */
    def put(cid: CID[Any, Double, Double, Version], block: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def put(cid: CID[Any, Double, Double, Version], block: js.typedarray.Uint8Array, _options: Any): js.Promise[Unit] = js.native
    
    /**
      * Put the given blocks to the underlying blockstore and
      * send it to nodes that have it them their wantlist.
      */
    def putMany(source: js.Iterable[Pair]): AwaitIterable[CID[Any, Double, Double, Version]] = js.native
    def putMany(source: js.Iterable[Pair], options: AbortOptions): AwaitIterable[CID[Any, Double, Double, Version]] = js.native
    def putMany(source: AsyncIterable[Pair]): AwaitIterable[CID[Any, Double, Double, Version]] = js.native
    def putMany(source: AsyncIterable[Pair], options: AbortOptions): AwaitIterable[CID[Any, Double, Double, Version]] = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    @JSName("stats")
    val stats_DefaultBitswap: Stats = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
    def want(
      cid: CID[Any, Double, Double, Version],
      options: AbortOptions & ProgressOptions[BitswapWantProgressEvents]
    ): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def wantlistForPeer(peerId: PeerId, _options: Any): Map[String, WantListEntry] = js.native
    
    var wm: WantManager = js.native
  }
}
