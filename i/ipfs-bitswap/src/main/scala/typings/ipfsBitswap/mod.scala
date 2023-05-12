package typings.ipfsBitswap

import typings.interfaceBlockstore.mod.Blockstore
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist.WantType
import typings.ipfsBitswap.distSrcNetworkMod.BitswapNetworkNotifyProgressEvents
import typings.ipfsBitswap.distSrcNetworkMod.BitswapNetworkWantProgressEvents
import typings.ipfsBitswap.ipfsBitswapStrings.`bitswapColonwant-blockColonblock`
import typings.ipfsBitswap.ipfsBitswapStrings.`bitswapColonwant-blockColonunwant`
import typings.libp2pInterfaceLibp2p.mod.Libp2p
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.progressEvents.mod.ProgressEvent
import typings.progressEvents.mod.ProgressOptions
import typings.std.IterableIterator
import typings.std.Map
import typings.std.Record
import typings.vascosantosMovingAverage.mod.IMovingAverage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-bitswap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBitswap(
    libp2p: Libp2p[Record[String, Any]],
    blockstore: Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object]
  ): Bitswap = (^.asInstanceOf[js.Dynamic].applyDynamic("createBitswap")(libp2p.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[Bitswap]
  inline def createBitswap(
    libp2p: Libp2p[Record[String, Any]],
    blockstore: Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object],
    options: BitswapOptions
  ): Bitswap = (^.asInstanceOf[js.Dynamic].applyDynamic("createBitswap")(libp2p.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Bitswap]
  
  @js.native
  trait Bitswap
    extends StObject
       with Startable {
    
    def cancelWants(cids: js.Array[CID[Any, Double, Double, Version]]): Unit = js.native
    def cancelWants(cids: CID[Any, Double, Double, Version]): Unit = js.native
    
    def getWantlist(): IterableIterator[js.Tuple2[String, WantListEntry]] = js.native
    
    def ledgerForPeer(peerId: PeerId): js.UndefOr[Ledger] = js.native
    
    /**
      * Notify bitswap that a new block is available
      */
    def notify(cid: CID[Any, Double, Double, Version], block: js.typedarray.Uint8Array): Unit = js.native
    def notify(
      cid: CID[Any, Double, Double, Version],
      block: js.typedarray.Uint8Array,
      options: ProgressOptions[BitswapNotifyProgressEvents]
    ): Unit = js.native
    
    /**
      * The peers that we are tracking a ledger for
      */
    var peers: js.Array[PeerId] = js.native
    
    /**
      * Bitswap statistics
      */
    var stats: Stats = js.native
    
    def unwant(cids: js.Array[CID[Any, Double, Double, Version]]): Unit = js.native
    def unwant(cids: CID[Any, Double, Double, Version]): Unit = js.native
    
    /**
      * Retrieve a block from the network
      */
    def want(cid: CID[Any, Double, Double, Version]): js.Promise[js.typedarray.Uint8Array] = js.native
    def want(
      cid: CID[Any, Double, Double, Version],
      options: AbortOptions & ProgressOptions[BitswapWantProgressEvents]
    ): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def wantlistForPeer(peerId: PeerId): Map[String, WantListEntry] = js.native
  }
  
  type BitswapNotifyProgressEvents = BitswapNetworkNotifyProgressEvents
  
  trait BitswapOptions extends StObject {
    
    /**
      * Enables loading esoteric hash functions
      */
    var hashLoader: js.UndefOr[MultihashHasherLoader] = js.undefined
    
    /**
      * Default: 30000
      */
    var incomingStreamTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Default: 32
      */
    var maxInboundStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * Default: 128
      */
    var maxOutboundStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * Default: 1000
      */
    var statsComputeThrottleMaxQueueSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Default: 1000
      */
    var statsComputeThrottleTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether stats are enabled. Default: false
      */
    var statsEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object BitswapOptions {
    
    inline def apply(): BitswapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BitswapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitswapOptions] (val x: Self) extends AnyVal {
      
      inline def setHashLoader(value: MultihashHasherLoader): Self = StObject.set(x, "hashLoader", value.asInstanceOf[js.Any])
      
      inline def setHashLoaderUndefined: Self = StObject.set(x, "hashLoader", js.undefined)
      
      inline def setIncomingStreamTimeout(value: Double): Self = StObject.set(x, "incomingStreamTimeout", value.asInstanceOf[js.Any])
      
      inline def setIncomingStreamTimeoutUndefined: Self = StObject.set(x, "incomingStreamTimeout", js.undefined)
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
      
      inline def setStatsComputeThrottleMaxQueueSize(value: Double): Self = StObject.set(x, "statsComputeThrottleMaxQueueSize", value.asInstanceOf[js.Any])
      
      inline def setStatsComputeThrottleMaxQueueSizeUndefined: Self = StObject.set(x, "statsComputeThrottleMaxQueueSize", js.undefined)
      
      inline def setStatsComputeThrottleTimeout(value: Double): Self = StObject.set(x, "statsComputeThrottleTimeout", value.asInstanceOf[js.Any])
      
      inline def setStatsComputeThrottleTimeoutUndefined: Self = StObject.set(x, "statsComputeThrottleTimeout", js.undefined)
      
      inline def setStatsEnabled(value: Boolean): Self = StObject.set(x, "statsEnabled", value.asInstanceOf[js.Any])
      
      inline def setStatsEnabledUndefined: Self = StObject.set(x, "statsEnabled", js.undefined)
    }
  }
  
  type BitswapWantBlockProgressEvents = (ProgressEvent[
    `bitswapColonwant-blockColonunwant` | `bitswapColonwant-blockColonblock`, 
    CID[Any, Double, Double, Version]
  ]) | BitswapNetworkWantProgressEvents
  
  type BitswapWantProgressEvents = BitswapWantBlockProgressEvents
  
  trait Ledger extends StObject {
    
    var exchanged: Double
    
    var peer: PeerId
    
    var recv: Double
    
    var sent: Double
    
    var value: Double
  }
  object Ledger {
    
    inline def apply(exchanged: Double, peer: PeerId, recv: Double, sent: Double, value: Double): Ledger = {
      val __obj = js.Dynamic.literal(exchanged = exchanged.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], recv = recv.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ledger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ledger] (val x: Self) extends AnyVal {
      
      inline def setExchanged(value: Double): Self = StObject.set(x, "exchanged", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setRecv(value: Double): Self = StObject.set(x, "recv", value.asInstanceOf[js.Any])
      
      inline def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultihashHasherLoader extends StObject {
    
    def getHasher(codeOrName: String): js.Promise[MultihashHasher[Double]] = js.native
    def getHasher(codeOrName: Double): js.Promise[MultihashHasher[Double]] = js.native
  }
  
  trait Stat extends StObject {
    
    def disable(): Unit
    
    def enable(): Unit
    
    var movingAverages: Record[String, Record[Double, IMovingAverage]]
    
    def push(counter: String, inc: Double): Unit
    
    var snapshot: Record[String, js.BigInt]
    
    def stop(): Unit
  }
  object Stat {
    
    inline def apply(
      disable: () => Unit,
      enable: () => Unit,
      movingAverages: Record[String, Record[Double, IMovingAverage]],
      push: (String, Double) => Unit,
      snapshot: Record[String, js.BigInt],
      stop: () => Unit
    ): Stat = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), movingAverages = movingAverages.asInstanceOf[js.Any], push = js.Any.fromFunction2(push), snapshot = snapshot.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Stat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stat] (val x: Self) extends AnyVal {
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setMovingAverages(value: Record[String, Record[Double, IMovingAverage]]): Self = StObject.set(x, "movingAverages", value.asInstanceOf[js.Any])
      
      inline def setPush(value: (String, Double) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
      
      inline def setSnapshot(value: Record[String, js.BigInt]): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Stats extends StObject {
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def forPeer(peerId: String): js.UndefOr[Stat] = js.native
    def forPeer(peerId: PeerId): js.UndefOr[Stat] = js.native
    
    var movingAverages: Record[String, Record[Double, IMovingAverage]] = js.native
    
    def push(peer: String, counter: String, inc: Double): Unit = js.native
    
    var snapshot: Record[String, js.BigInt] = js.native
    
    def stop(): Unit = js.native
  }
  
  trait WantListEntry extends StObject {
    
    var cid: CID[Any, Double, Double, Version]
    
    def dec(): Unit
    
    def hasRefs(): Boolean
    
    def inc(): Unit
    
    var priority: Double
    
    var wantType: WantType
  }
  object WantListEntry {
    
    inline def apply(
      cid: CID[Any, Double, Double, Version],
      dec: () => Unit,
      hasRefs: () => Boolean,
      inc: () => Unit,
      priority: Double,
      wantType: WantType
    ): WantListEntry = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], dec = js.Any.fromFunction0(dec), hasRefs = js.Any.fromFunction0(hasRefs), inc = js.Any.fromFunction0(inc), priority = priority.asInstanceOf[js.Any], wantType = wantType.asInstanceOf[js.Any])
      __obj.asInstanceOf[WantListEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WantListEntry] (val x: Self) extends AnyVal {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setDec(value: () => Unit): Self = StObject.set(x, "dec", js.Any.fromFunction0(value))
      
      inline def setHasRefs(value: () => Boolean): Self = StObject.set(x, "hasRefs", js.Any.fromFunction0(value))
      
      inline def setInc(value: () => Unit): Self = StObject.set(x, "inc", js.Any.fromFunction0(value))
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setWantType(value: WantType): Self = StObject.set(x, "wantType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Wantlist extends StObject {
    
    def add(cid: CID[Any, Double, Double, Version], priority: Double, wantType: WantType): Unit
    
    def contains(cid: CID[Any, Double, Double, Version]): Boolean
    
    def forEach(fn: js.Function2[/* entry */ WantListEntry, /* key */ String, Unit]): Unit
    
    def get(cid: CID[Any, Double, Double, Version]): WantListEntry
    
    var length: Double
    
    def remove(cid: CID[Any, Double, Double, Version]): Unit
    
    def removeForce(cid: String): Unit
    
    def sortedEntries(): Map[String, WantListEntry]
  }
  object Wantlist {
    
    inline def apply(
      add: (CID[Any, Double, Double, Version], Double, WantType) => Unit,
      contains: CID[Any, Double, Double, Version] => Boolean,
      forEach: js.Function2[/* entry */ WantListEntry, /* key */ String, Unit] => Unit,
      get: CID[Any, Double, Double, Version] => WantListEntry,
      length: Double,
      remove: CID[Any, Double, Double, Version] => Unit,
      removeForce: String => Unit,
      sortedEntries: () => Map[String, WantListEntry]
    ): Wantlist = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), contains = js.Any.fromFunction1(contains), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), removeForce = js.Any.fromFunction1(removeForce), sortedEntries = js.Any.fromFunction0(sortedEntries))
      __obj.asInstanceOf[Wantlist]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Wantlist] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: (CID[Any, Double, Double, Version], Double, WantType) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
      
      inline def setContains(value: CID[Any, Double, Double, Version] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function2[/* entry */ WantListEntry, /* key */ String, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setGet(value: CID[Any, Double, Double, Version] => WantListEntry): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: CID[Any, Double, Double, Version] => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveForce(value: String => Unit): Self = StObject.set(x, "removeForce", js.Any.fromFunction1(value))
      
      inline def setSortedEntries(value: () => Map[String, WantListEntry]): Self = StObject.set(x, "sortedEntries", js.Any.fromFunction0(value))
    }
  }
}
