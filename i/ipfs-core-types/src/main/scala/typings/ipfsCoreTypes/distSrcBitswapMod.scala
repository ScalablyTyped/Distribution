package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBitswapMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    /**
      * Show diagnostic information on the bitswap agent.
      * Note: `bitswap.stat` and `stats.bitswap` can be used interchangeably.
      *
      * @example
      * ```js
      * const stats = await ipfs.bitswap.stat()
      * console.log(stats)
      * ```
      */
    def stat(): js.Promise[Stats] = js.native
    def stat(options: AbortOptions & OptionExtension): js.Promise[Stats] = js.native
    
    def unwant(cids: js.Array[CID[Any, Double, Double, Version]]): js.Promise[Unit] = js.native
    def unwant(cids: js.Array[CID[Any, Double, Double, Version]], options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
    /**
      * Removes one or more CIDs from the wantlist
      *
      * @example
      * ```JavaScript
      * let list = await ipfs.bitswap.wantlist()
      * console.log(list)
      * // [ CID('QmHash') ]
      *
      * await ipfs.bitswap.unwant(cid)
      *
      * list = await ipfs.bitswap.wantlist()
      * console.log(list)
      * // []
      * ```
      */
    def unwant(cids: CID[Any, Double, Double, Version]): js.Promise[Unit] = js.native
    def unwant(cids: CID[Any, Double, Double, Version], options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
    
    /**
      * Returns the wantlist for your node
      *
      * @example
      * ```js
      * const list = await ipfs.bitswap.wantlist()
      * console.log(list)
      * // [ CID('QmHash') ]
      * ```
      */
    def wantlist(): js.Promise[js.Array[CID[Any, Double, Double, Version]]] = js.native
    def wantlist(options: AbortOptions & OptionExtension): js.Promise[js.Array[CID[Any, Double, Double, Version]]] = js.native
    
    /**
      * Returns the wantlist for a connected peer
      *
      * @example
      * ```js
      * const list = await ipfs.bitswap.wantlistForPeer(peerId)
      * console.log(list)
      * // [ CID('QmHash') ]
      * ```
      */
    def wantlistForPeer(peerId: PeerId): js.Promise[js.Array[CID[Any, Double, Double, Version]]] = js.native
    def wantlistForPeer(peerId: PeerId, options: AbortOptions & OptionExtension): js.Promise[js.Array[CID[Any, Double, Double, Version]]] = js.native
  }
  
  trait Stats extends StObject {
    
    var blocksReceived: js.BigInt
    
    var blocksSent: js.BigInt
    
    var dataReceived: js.BigInt
    
    var dataSent: js.BigInt
    
    var dupBlksReceived: js.BigInt
    
    var dupDataReceived: js.BigInt
    
    var peers: js.Array[PeerId]
    
    var provideBufLen: Double
    
    var wantlist: js.Array[CID[Any, Double, Double, Version]]
  }
  object Stats {
    
    inline def apply(
      blocksReceived: js.BigInt,
      blocksSent: js.BigInt,
      dataReceived: js.BigInt,
      dataSent: js.BigInt,
      dupBlksReceived: js.BigInt,
      dupDataReceived: js.BigInt,
      peers: js.Array[PeerId],
      provideBufLen: Double,
      wantlist: js.Array[CID[Any, Double, Double, Version]]
    ): Stats = {
      val __obj = js.Dynamic.literal(blocksReceived = blocksReceived.asInstanceOf[js.Any], blocksSent = blocksSent.asInstanceOf[js.Any], dataReceived = dataReceived.asInstanceOf[js.Any], dataSent = dataSent.asInstanceOf[js.Any], dupBlksReceived = dupBlksReceived.asInstanceOf[js.Any], dupDataReceived = dupDataReceived.asInstanceOf[js.Any], peers = peers.asInstanceOf[js.Any], provideBufLen = provideBufLen.asInstanceOf[js.Any], wantlist = wantlist.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      inline def setBlocksReceived(value: js.BigInt): Self = StObject.set(x, "blocksReceived", value.asInstanceOf[js.Any])
      
      inline def setBlocksSent(value: js.BigInt): Self = StObject.set(x, "blocksSent", value.asInstanceOf[js.Any])
      
      inline def setDataReceived(value: js.BigInt): Self = StObject.set(x, "dataReceived", value.asInstanceOf[js.Any])
      
      inline def setDataSent(value: js.BigInt): Self = StObject.set(x, "dataSent", value.asInstanceOf[js.Any])
      
      inline def setDupBlksReceived(value: js.BigInt): Self = StObject.set(x, "dupBlksReceived", value.asInstanceOf[js.Any])
      
      inline def setDupDataReceived(value: js.BigInt): Self = StObject.set(x, "dupDataReceived", value.asInstanceOf[js.Any])
      
      inline def setPeers(value: js.Array[PeerId]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
      
      inline def setPeersVarargs(value: PeerId*): Self = StObject.set(x, "peers", js.Array(value*))
      
      inline def setProvideBufLen(value: Double): Self = StObject.set(x, "provideBufLen", value.asInstanceOf[js.Any])
      
      inline def setWantlist(value: js.Array[CID[Any, Double, Double, Version]]): Self = StObject.set(x, "wantlist", value.asInstanceOf[js.Any])
      
      inline def setWantlistVarargs(value: (CID[Any, Double, Double, Version])*): Self = StObject.set(x, "wantlist", js.Array(value*))
    }
  }
}
