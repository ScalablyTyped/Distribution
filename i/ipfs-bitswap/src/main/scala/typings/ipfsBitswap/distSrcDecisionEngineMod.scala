package typings.ipfsBitswap

import typings.interfaceBlockstore.mod.Blockstore
import typings.ipfsBitswap.anon.Cid
import typings.ipfsBitswap.anon.DebuggererrorDebugger
import typings.ipfsBitswap.anon.Exchanged
import typings.ipfsBitswap.anon.MaxSizeReplaceHasWithBlock
import typings.ipfsBitswap.anon.TargetMessageSize
import typings.ipfsBitswap.distSrcDecisionEngineLedgerMod.Ledger
import typings.ipfsBitswap.distSrcDecisionEngineReqQueueMod.RequestQueue
import typings.ipfsBitswap.distSrcMessageMod.BitswapMessage
import typings.ipfsBitswap.distSrcNetworkMod.Network
import typings.ipfsBitswap.distSrcStatsMod.Stats
import typings.ipfsBitswap.distSrcWantlistEntryMod.WantListEntry
import typings.libp2p.mod.Libp2p
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDecisionEngineMod {
  
  @JSImport("ipfs-bitswap/dist/src/decision-engine", "DecisionEngine")
  @js.native
  open class DecisionEngine protected () extends StObject {
    /**
      * @param {PeerId} peerId
      * @param {import('interface-blockstore').Blockstore} blockstore
      * @param {import('../network').Network} network
      * @param {import('../stats').Stats} stats
      * @param {import('libp2p').Libp2p} libp2p
      * @param {object} [opts]
      * @param {number} [opts.targetMessageSize]
      * @param {number} [opts.maxSizeReplaceHasWithBlock]
      */
    def this(peerId: PeerId, blockstore: Blockstore, network: Network, stats: Stats, libp2p: Libp2p) = this()
    def this(
      peerId: PeerId,
      blockstore: Blockstore,
      network: Network,
      stats: Stats,
      libp2p: Libp2p,
      opts: MaxSizeReplaceHasWithBlock
    ) = this()
    
    /**
      * @private
      * @param {PeerId} peerId
      * @param {BitswapMessageEntry[]} wants
      * @returns {Promise<void>}
      */
    /* private */ var _addWants: Any = js.native
    
    /**
      * @private
      * @param {PeerId} peerId
      * @param {CID[]} cids
      * @returns {void}
      */
    /* private */ var _cancelWants: Any = js.native
    
    /**
      * @private
      * @param {PeerId} peerId
      * @returns {Ledger}
      */
    /* private */ var _findOrCreate: Any = js.native
    
    /**
      * @private
      * @param {CID[]} cids
      * @returns {Promise<Map<string, number>>}
      */
    /* private */ var _getBlockSizes: Any = js.native
    
    /**
      * @private
      * @param {CID[]} cids
      * @returns {Promise<Map<string, Uint8Array>>}
      */
    /* private */ var _getBlocks: Any = js.native
    
    def _log(formatter: Any, args: Any*): Unit = js.native
    @JSName("_log")
    var _log_Original: DebuggererrorDebugger = js.native
    
    var _opts: TargetMessageSize = js.native
    
    /**
      * @template {object} Opts
      * @param {Opts} opts
      * @returns {Opts & {maxSizeReplaceHasWithBlock:number, targetMessageSize:number}}
      * @private
      */
    /* private */ var _processOpts: Any = js.native
    
    /**
      * Pull tasks off the request queue and send a message to the corresponding
      * peer
      */
    def _processTasks(): js.Promise[Unit] = js.native
    
    var _requestQueue: RequestQueue = js.native
    
    var _running: Boolean = js.native
    
    def _scheduleProcessTasks(): Unit = js.native
    
    /**
      * @private
      * @param {import('../message/message').Message.Wantlist.WantType} wantType
      * @param {number} blockSize
      */
    /* private */ var _sendAsBlock: Any = js.native
    
    var _stats: Stats = js.native
    
    /**
      * @private
      * @param {Map<string, Uint8Array>} blocksMap
      * @param {Ledger} ledger
      */
    /* private */ var _updateBlockAccounting: Any = js.native
    
    var blockstore: Blockstore = js.native
    
    /**
      * @param {PeerId} peerId
      */
    def ledgerForPeer(peerId: PeerId): Exchanged | Null = js.native
    
    /** @type {Map<string, Ledger>} */
    var ledgerMap: Map[String, Ledger] = js.native
    
    /**
      * Handle incoming messages
      *
      * @param {PeerId} peerId
      * @param {Message} msg
      * @returns {Promise<void>}
      */
    def messageReceived(peerId: PeerId, msg: BitswapMessage): js.Promise[Unit] = js.native
    
    /**
      * Clear up all accounting things after message was sent
      *
      * @param {PeerId} peerId
      * @param {CID} cid
      * @param {Uint8Array} block
      */
    def messageSent(peerId: PeerId, cid: CID[Any, Double, Double, Version], block: js.typedarray.Uint8Array): Unit = js.native
    
    var network: Network = js.native
    
    /**
      * @param {PeerId} peerId
      * @returns {number}
      */
    def numBytesReceivedFrom(peerId: PeerId): Double = js.native
    
    /**
      * @param {PeerId} peerId
      * @returns {number}
      */
    def numBytesSentTo(peerId: PeerId): Double = js.native
    
    /**
      *
      * @param {PeerId} peerId
      */
    def peerDisconnected(peerId: PeerId): Unit = js.native
    
    /**
      * @returns {PeerId[]}
      */
    def peers(): js.Array[PeerId] = js.native
    
    /**
      * Receive blocks either from an incoming message from the network, or from
      * blocks being added by the client on the localhost (eg IPFS add)
      *
      * @param {{ cid: CID, data: Uint8Array }[]} blocks
      */
    def receivedBlocks(blocks: js.Array[Cid]): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    /**
      * @param {PeerId} peerId
      * @returns {Map<string, import('../wantlist/entry').WantListEntry>}
      */
    def wantlistForPeer(peerId: PeerId): Map[String, WantListEntry] = js.native
  }
  
  type BitswapMessageEntry = typings.ipfsBitswap.distSrcMessageEntryMod.BitswapMessageEntry
  
  type PeerId = typings.libp2pInterfacePeerId.mod.PeerId
}
