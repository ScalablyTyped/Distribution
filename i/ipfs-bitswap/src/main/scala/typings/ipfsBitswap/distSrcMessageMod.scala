package typings.ipfsBitswap

import org.scalablytyped.runtime.Instantiable5
import typings.ipfsBitswap.anon.DontHave
import typings.ipfsBitswap.anon.Have
import typings.ipfsBitswap.distSrcMessageEntryMod.BitswapMessageEntry
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.BlockPresenceType
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist.WantType
import typings.ipfsBitswap.mod.MultihashHasherLoader
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
    def this(full: Boolean) = this()
    
    def addBlock(cid: CID[Any, Double, Double, Version], block: js.typedarray.Uint8Array): Unit = js.native
    
    def addDontHave(cid: CID[Any, Double, Double, Version]): Unit = js.native
    
    def addEntry(cid: CID[Any, Double, Double, Version], priority: Double): Unit = js.native
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
    def addEntry(cid: CID[Any, Double, Double, Version], priority: Double, wantType: WantType): Unit = js.native
    def addEntry(cid: CID[Any, Double, Double, Version], priority: Double, wantType: WantType, cancel: Boolean): Unit = js.native
    def addEntry(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: WantType,
      cancel: Boolean,
      sendDontHave: Boolean
    ): Unit = js.native
    def addEntry(
      cid: CID[Any, Double, Double, Version],
      priority: Double,
      wantType: WantType,
      cancel: Unit,
      sendDontHave: Boolean
    ): Unit = js.native
    
    def addHave(cid: CID[Any, Double, Double, Version]): Unit = js.native
    
    var blockPresences: Map[String, BlockPresenceType] = js.native
    
    var blocks: Map[String, js.typedarray.Uint8Array] = js.native
    
    def cancel(cid: CID[Any, Double, Double, Version]): Unit = js.native
    
    def empty: Boolean = js.native
    
    def equals(other: BitswapMessage): Boolean = js.native
    
    var full: Boolean = js.native
    
    var get: Any = js.native
    
    var pendingBytes: Double = js.native
    
    /**
      * Serializes to Bitswap Message protobuf of
      * version 1.0.0
      */
    def serializeToBitswap100(): js.typedarray.Uint8Array = js.native
    
    /**
      * Serializes to Bitswap Message protobuf of
      * version 1.1.0
      */
    def serializeToBitswap110(): js.typedarray.Uint8Array = js.native
    
    def setPendingBytes(size: Double): Unit = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    var wantlist: Map[String, BitswapMessageEntry] = js.native
  }
  /* static members */
  object BitswapMessage {
    
    @JSImport("ipfs-bitswap/dist/src/message", "BitswapMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-bitswap/dist/src/message", "BitswapMessage.BlockPresenceType")
    @js.native
    def BlockPresenceType: DontHave = js.native
    inline def BlockPresenceType_=(x: DontHave): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlockPresenceType")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-bitswap/dist/src/message", "BitswapMessage.Entry")
    @js.native
    def Entry: Instantiable5[
        /* cid */ CID[Any, Double, Double, Version], 
        /* priority */ Double, 
        /* wantType */ WantType, 
        /* cancel */ js.UndefOr[Boolean], 
        /* sendDontHave */ js.UndefOr[Boolean], 
        BitswapMessageEntry
      ] = js.native
    inline def Entry_=(
      x: Instantiable5[
          /* cid */ CID[Any, Double, Double, Version], 
          /* priority */ Double, 
          /* wantType */ WantType, 
          /* cancel */ js.UndefOr[Boolean], 
          /* sendDontHave */ js.UndefOr[Boolean], 
          BitswapMessageEntry
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Entry")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-bitswap/dist/src/message", "BitswapMessage.WantType")
    @js.native
    def WantType: Have = js.native
    inline def WantType_=(x: Have): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WantType")(x.asInstanceOf[js.Any])
    
    inline def blockPresenceSize(cid: CID[Any, Double, Double, Version]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blockPresenceSize")(cid.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def deserialize(raw: js.typedarray.Uint8Array): js.Promise[BitswapMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(raw.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BitswapMessage]]
    inline def deserialize(raw: js.typedarray.Uint8Array, hashLoader: MultihashHasherLoader): js.Promise[BitswapMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(raw.asInstanceOf[js.Any], hashLoader.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BitswapMessage]]
  }
}
