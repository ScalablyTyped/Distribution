package typings.ipfsBitswap

import typings.interfaceBlockstore.mod.Blockstore
import typings.ipfsBitswap.anon.Block
import typings.ipfsBitswap.anon.RequiredDecisionEngineOpt
import typings.ipfsBitswap.distSrcDecisionEngineLedgerMod.Ledger
import typings.ipfsBitswap.distSrcDecisionEngineReqQueueMod.RequestQueue
import typings.ipfsBitswap.distSrcMessageEntryMod.BitswapMessageEntry
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist.WantType
import typings.ipfsBitswap.distSrcMessageMod.BitswapMessage
import typings.ipfsBitswap.distSrcNetworkMod.Network
import typings.ipfsBitswap.distSrcStatsMod.Stats
import typings.ipfsBitswap.distSrcWantlistEntryMod.WantListEntry
import typings.libp2pInterfaceLibp2p.mod.Libp2p
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDecisionEngineMod {
  
  @JSImport("ipfs-bitswap/dist/src/decision-engine", "DecisionEngine")
  @js.native
  open class DecisionEngine protected () extends StObject {
    def this(
      peerId: PeerId,
      blockstore: Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object],
      network: Network,
      stats: Stats,
      libp2p: Libp2p[Record[String, Any]]
    ) = this()
    def this(
      peerId: PeerId,
      blockstore: Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object],
      network: Network,
      stats: Stats,
      libp2p: Libp2p[Record[String, Any]],
      opts: DecisionEngineOptions
    ) = this()
    
    def _addWants(peerId: PeerId, wants: js.Array[BitswapMessageEntry]): js.Promise[Unit] = js.native
    
    def _cancelWants(peerId: PeerId, cids: js.Array[CID[Any, Double, Double, Version]]): Unit = js.native
    
    def _findOrCreate(peerId: PeerId): Ledger = js.native
    
    def _getBlockSizes(cids: js.Array[CID[Any, Double, Double, Version]]): js.Promise[Map[String, Double]] = js.native
    
    def _getBlocks(cids: js.Array[CID[Any, Double, Double, Version]]): js.Promise[Map[String, js.typedarray.Uint8Array]] = js.native
    
    /* private */ val _log: Any = js.native
    
    /* private */ val _opts: Any = js.native
    
    def _processOpts(opts: DecisionEngineOptions): RequiredDecisionEngineOpt = js.native
    
    /**
      * Pull tasks off the request queue and send a message to the corresponding
      * peer
      */
    def _processTasks(): js.Promise[Unit] = js.native
    
    var _requestQueue: RequestQueue = js.native
    
    /* private */ var _running: Any = js.native
    
    def _scheduleProcessTasks(): Unit = js.native
    
    def _sendAsBlock(wantType: WantType, blockSize: Double): Boolean = js.native
    
    /* private */ val _stats: Any = js.native
    
    def _updateBlockAccounting(blocksMap: Map[String, js.typedarray.Uint8Array], ledger: Ledger): Unit = js.native
    
    var blockstore: Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object] = js.native
    
    def ledgerForPeer(peerId: PeerId): js.UndefOr[PeerLedger] = js.native
    
    var ledgerMap: Map[String, Ledger] = js.native
    
    /**
      * Handle incoming messages
      */
    def messageReceived(peerId: PeerId, msg: BitswapMessage): js.Promise[Unit] = js.native
    
    /**
      * Clear up all accounting things after message was sent
      */
    def messageSent(peerId: PeerId, cid: CID[Any, Double, Double, Version], block: js.typedarray.Uint8Array): Unit = js.native
    
    var network: Network = js.native
    
    def numBytesReceivedFrom(peerId: PeerId): Double = js.native
    
    def numBytesSentTo(peerId: PeerId): Double = js.native
    
    def peerDisconnected(peerId: PeerId): Unit = js.native
    
    def peers(): js.Array[PeerId] = js.native
    
    /**
      * Receive blocks either from an incoming message from the network, or from
      * blocks being added by the client on the localhost (eg IPFS add)
      */
    def receivedBlocks(blocks: js.Array[Block]): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def wantlistForPeer(peerId: PeerId): Map[String, WantListEntry] = js.native
  }
  
  trait DecisionEngineOptions extends StObject {
    
    var maxSizeReplaceHasWithBlock: js.UndefOr[Double] = js.undefined
    
    var targetMessageSize: js.UndefOr[Double] = js.undefined
  }
  object DecisionEngineOptions {
    
    inline def apply(): DecisionEngineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecisionEngineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecisionEngineOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxSizeReplaceHasWithBlock(value: Double): Self = StObject.set(x, "maxSizeReplaceHasWithBlock", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeReplaceHasWithBlockUndefined: Self = StObject.set(x, "maxSizeReplaceHasWithBlock", js.undefined)
      
      inline def setTargetMessageSize(value: Double): Self = StObject.set(x, "targetMessageSize", value.asInstanceOf[js.Any])
      
      inline def setTargetMessageSizeUndefined: Self = StObject.set(x, "targetMessageSize", js.undefined)
    }
  }
  
  trait PeerLedger extends StObject {
    
    var exchanged: Double
    
    var peer: PeerId
    
    var recv: Double
    
    var sent: Double
    
    var value: Double
  }
  object PeerLedger {
    
    inline def apply(exchanged: Double, peer: PeerId, recv: Double, sent: Double, value: Double): PeerLedger = {
      val __obj = js.Dynamic.literal(exchanged = exchanged.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], recv = recv.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerLedger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerLedger] (val x: Self) extends AnyVal {
      
      inline def setExchanged(value: Double): Self = StObject.set(x, "exchanged", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setRecv(value: Double): Self = StObject.set(x, "recv", value.asInstanceOf[js.Any])
      
      inline def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Task extends StObject {
    
    var data: TaskData
    
    /**
      * Priority for the Task (tasks are ordered by priority per peer).
      */
    var priority: Double
    
    /**
      * The size of the task, e.g. the number of bytes in a block.
      */
    var size: Double
    
    /**
      * A name for the Task (like an id but not necessarily unique)
      */
    var topic: String
  }
  object Task {
    
    inline def apply(data: TaskData, priority: Double, size: Double, topic: String): Task = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
      
      inline def setData(value: TaskData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskData extends StObject {
    
    /**
      * The size of the block, if known (if we don't have the block this is zero)
      */
    var blockSize: Double
    
    /**
      * Indicates if we have the block.
      */
    var haveBlock: Boolean
    
    /**
      * Indicates if the request is for a block or for a HAVE.
      */
    var isWantBlock: Boolean
    
    /**
      * Indicates whether to send a DONT_HAVE response if we don't have the block.
      * If this is `false` and we don't have the block, we just ignore the
      * want-block request (useful for discovery where we query lots of peers but
      * don't want a response unless the peer has the block).
      */
    var sendDontHave: Boolean
  }
  object TaskData {
    
    inline def apply(blockSize: Double, haveBlock: Boolean, isWantBlock: Boolean, sendDontHave: Boolean): TaskData = {
      val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], haveBlock = haveBlock.asInstanceOf[js.Any], isWantBlock = isWantBlock.asInstanceOf[js.Any], sendDontHave = sendDontHave.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskData] (val x: Self) extends AnyVal {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setHaveBlock(value: Boolean): Self = StObject.set(x, "haveBlock", value.asInstanceOf[js.Any])
      
      inline def setIsWantBlock(value: Boolean): Self = StObject.set(x, "isWantBlock", value.asInstanceOf[js.Any])
      
      inline def setSendDontHave(value: Boolean): Self = StObject.set(x, "sendDontHave", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskMerger extends StObject {
    
    /**
      * Given the existing tasks with the same topic, does the task add some new
      * information? Used to decide whether to merge the task or ignore it.
      */
    def hasNewInfo(task: Task, tasksWithTopic: js.Array[Task]): Boolean
    
    /**
      * Merge the information from the task into the existing pending task.
      */
    def merge(newTask: Task, existingTask: Task): Unit
  }
  object TaskMerger {
    
    inline def apply(hasNewInfo: (Task, js.Array[Task]) => Boolean, merge: (Task, Task) => Unit): TaskMerger = {
      val __obj = js.Dynamic.literal(hasNewInfo = js.Any.fromFunction2(hasNewInfo), merge = js.Any.fromFunction2(merge))
      __obj.asInstanceOf[TaskMerger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskMerger] (val x: Self) extends AnyVal {
      
      inline def setHasNewInfo(value: (Task, js.Array[Task]) => Boolean): Self = StObject.set(x, "hasNewInfo", js.Any.fromFunction2(value))
      
      inline def setMerge(value: (Task, Task) => Unit): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
    }
  }
}
