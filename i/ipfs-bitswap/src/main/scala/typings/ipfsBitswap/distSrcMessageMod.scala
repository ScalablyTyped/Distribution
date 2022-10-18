package typings.ipfsBitswap

import typings.ipfsBitswap.distSrcMessageEntryMod.BitswapMessageEntry
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessageMod {
  
  @JSImport("ipfs-bitswap/dist/src/message", "BitswapMessage")
  @js.native
  open class BitswapMessage protected () extends StObject {
    /**
      * @param {boolean} full
      */
    def this(full: Boolean) = this()
    
    /**
      * @param {CID} cid
      * @param {Uint8Array} block
      * @returns {void}
      */
    def addBlock(cid: CID[Any, Double, Double, Version], block: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * @param {CID} cid
      */
    def addDontHave(cid: CID[Any, Double, Double, Version]): Unit = js.native
    
    /**
      *
      * @param {CID} cid
      * @param {number} priority
      * @param {import('./message').Message.Wantlist.WantType | null} [wantType]
      * @param {boolean} [cancel]
      * @param {boolean} [sendDontHave]
      * @returns {void}
      */
    def addEntry(cid: CID[Any, Double, Double, Version], priority: Double): Unit = js.native
    def addEntry(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any
    ): Unit = js.native
    def addEntry(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any,
      cancel: Boolean
    ): Unit = js.native
    def addEntry(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any,
      cancel: Boolean,
      sendDontHave: Boolean
    ): Unit = js.native
    def addEntry(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any,
      cancel: Unit,
      sendDontHave: Boolean
    ): Unit = js.native
    def addEntry(cid: CID[Any, Double, Double, Version], priority: Double, wantType: Null, cancel: Boolean): Unit = js.native
    def addEntry(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: Null,
      cancel: Boolean,
      sendDontHave: Boolean
    ): Unit = js.native
    def addEntry(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: Null,
      cancel: Unit,
      sendDontHave: Boolean
    ): Unit = js.native
    def addEntry(cid: CID[Any, Double, Double, Version], priority: Double, wantType: Unit, cancel: Boolean): Unit = js.native
    def addEntry(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: Unit,
      cancel: Boolean,
      sendDontHave: Boolean
    ): Unit = js.native
    def addEntry(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: Unit,
      cancel: Unit,
      sendDontHave: Boolean
    ): Unit = js.native
    
    /**
      * @param {CID} cid
      */
    def addHave(cid: CID[Any, Double, Double, Version]): Unit = js.native
    
    /** @type {Map<string, import('./message').Message.BlockPresenceType>} */
    var blockPresences: Map[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_message.Message.BlockPresenceType */ Any
      ] = js.native
    
    /** @type {Map<string, Uint8Array>} */
    var blocks: Map[String, js.typedarray.Uint8Array] = js.native
    
    /**
      * @param {CID} cid
      */
    def cancel(cid: CID[Any, Double, Double, Version]): Unit = js.native
    
    def empty: Boolean = js.native
    
    /**
      * @param {BitswapMessage} other
      * @returns {boolean}
      */
    def equals(other: BitswapMessage): Boolean = js.native
    
    var full: Boolean = js.native
    
    var get: Any = js.native
    
    var pendingBytes: Double = js.native
    
    /**
      * Serializes to Bitswap Message protobuf of
      * version 1.0.0
      *
      * @returns {Uint8Array}
      */
    def serializeToBitswap100(): js.typedarray.Uint8Array = js.native
    
    /**
      * Serializes to Bitswap Message protobuf of
      * version 1.1.0
      *
      * @returns {Uint8Array}
      */
    def serializeToBitswap110(): js.typedarray.Uint8Array = js.native
    
    /**
      * @param {number} size
      */
    def setPendingBytes(size: Double): Unit = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    /** @type {Map<string, Entry>} */
    var wantlist: Map[String, BitswapMessageEntry] = js.native
  }
  object BitswapMessage {
    
    @JSImport("ipfs-bitswap/dist/src/message", "BitswapMessage")
    @js.native
    val ^ : js.Any = js.native
    
    object BlockPresenceType {
      
      @JSImport("ipfs-bitswap/dist/src/message", "BitswapMessage.BlockPresenceType.DontHave")
      @js.native
      val DontHave: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.BlockPresenceType */ Any = js.native
      
      @JSImport("ipfs-bitswap/dist/src/message", "BitswapMessage.BlockPresenceType.Have_1")
      @js.native
      val Have1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.BlockPresenceType */ Any = js.native
    }
    
    object WantType {
      
      @JSImport("ipfs-bitswap/dist/src/message", "BitswapMessage.WantType.Block")
      @js.native
      val Block: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any = js.native
      
      @JSImport("ipfs-bitswap/dist/src/message", "BitswapMessage.WantType.Have")
      @js.native
      val Have: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Message.Wantlist.WantType */ Any = js.native
    }
    
    inline def blockPresenceSize(cid: CID[Any, Double, Double, Version]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blockPresenceSize")(cid.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def deserialize(raw: js.typedarray.Uint8Array): js.Promise[BitswapMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(raw.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BitswapMessage]]
    inline def deserialize(
      raw: js.typedarray.Uint8Array,
      hashLoader: typings.ipfsBitswap.distSrcTypesMod.MultihashHasherLoader
    ): js.Promise[BitswapMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(raw.asInstanceOf[js.Any], hashLoader.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BitswapMessage]]
  }
  
  type MultihashHasherLoader = typings.ipfsBitswap.distSrcTypesMod.MultihashHasherLoader
}
