package typings.ipfsBitswap

import typings.ipfsBitswap.anon.PartialBlock
import typings.ipfsBitswap.anon.PartialBlockPresence
import typings.ipfsBitswap.anon.PartialEntry
import typings.ipfsBitswap.anon.PartialMessage
import typings.ipfsBitswap.anon.PartialWantlist
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Block
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.BlockPresence
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist.Entry
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessageMessageMod {
  
  trait Message extends StObject {
    
    var blockPresences: js.Array[BlockPresence]
    
    var blocks: js.Array[js.typedarray.Uint8Array]
    
    var payload: js.Array[Block]
    
    var pendingBytes: Double
    
    var wantlist: js.UndefOr[Wantlist] = js.undefined
  }
  object Message {
    
    inline def apply(
      blockPresences: js.Array[BlockPresence],
      blocks: js.Array[js.typedarray.Uint8Array],
      payload: js.Array[Block],
      pendingBytes: Double
    ): Message = {
      val __obj = js.Dynamic.literal(blockPresences = blockPresences.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], pendingBytes = pendingBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @JSImport("ipfs-bitswap/dist/src/message/message", "Message")
    @js.native
    val ^ : js.Any = js.native
    
    trait Block extends StObject {
      
      var data: js.typedarray.Uint8Array
      
      var prefix: js.typedarray.Uint8Array
    }
    object Block {
      
      inline def apply(data: js.typedarray.Uint8Array, prefix: js.typedarray.Uint8Array): Block = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
        __obj.asInstanceOf[Block]
      }
      
      @JSImport("ipfs-bitswap/dist/src/message/message", "Message.Block")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[Block] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Block]]
      
      inline def decode(buf: js.typedarray.Uint8Array): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Block]
      inline def decode(buf: Uint8ArrayList): Block = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Block]
      
      inline def encode(obj: PartialBlock): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
        
        inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setPrefix(value: js.typedarray.Uint8Array): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      }
    }
    
    trait BlockPresence extends StObject {
      
      var cid: js.typedarray.Uint8Array
      
      var `type`: BlockPresenceType
    }
    object BlockPresence {
      
      inline def apply(cid: js.typedarray.Uint8Array, `type`: BlockPresenceType): BlockPresence = {
        val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[BlockPresence]
      }
      
      @JSImport("ipfs-bitswap/dist/src/message/message", "Message.BlockPresence")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[BlockPresence] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[BlockPresence]]
      
      inline def decode(buf: js.typedarray.Uint8Array): BlockPresence = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[BlockPresence]
      inline def decode(buf: Uint8ArrayList): BlockPresence = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[BlockPresence]
      
      inline def encode(obj: PartialBlockPresence): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BlockPresence] (val x: Self) extends AnyVal {
        
        inline def setCid(value: js.typedarray.Uint8Array): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
        
        inline def setType(value: BlockPresenceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    sealed trait BlockPresenceType extends StObject
    @JSImport("ipfs-bitswap/dist/src/message/message", "Message.BlockPresenceType")
    @js.native
    object BlockPresenceType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[BlockPresenceType & String] = js.native
      
      @js.native
      sealed trait DontHave
        extends StObject
           with BlockPresenceType
      /* "DontHave" */ val DontHave: typings.ipfsBitswap.distSrcMessageMessageMod.Message.BlockPresenceType.DontHave & String = js.native
      
      @js.native
      sealed trait Have
        extends StObject
           with BlockPresenceType
      /* "Have" */ val Have: typings.ipfsBitswap.distSrcMessageMessageMod.Message.BlockPresenceType.Have & String = js.native
      
      def codec(): Codec[BlockPresenceType] = js.native
    }
    
    trait Wantlist extends StObject {
      
      var entries: js.Array[Entry]
      
      var full: Boolean
    }
    object Wantlist {
      
      inline def apply(entries: js.Array[Entry], full: Boolean): Wantlist = {
        val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any])
        __obj.asInstanceOf[Wantlist]
      }
      
      @JSImport("ipfs-bitswap/dist/src/message/message", "Message.Wantlist")
      @js.native
      val ^ : js.Any = js.native
      
      trait Entry extends StObject {
        
        var block: js.typedarray.Uint8Array
        
        var cancel: Boolean
        
        var priority: Double
        
        var sendDontHave: Boolean
        
        var wantType: WantType
      }
      object Entry {
        
        inline def apply(
          block: js.typedarray.Uint8Array,
          cancel: Boolean,
          priority: Double,
          sendDontHave: Boolean,
          wantType: WantType
        ): Entry = {
          val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], sendDontHave = sendDontHave.asInstanceOf[js.Any], wantType = wantType.asInstanceOf[js.Any])
          __obj.asInstanceOf[Entry]
        }
        
        @JSImport("ipfs-bitswap/dist/src/message/message", "Message.Wantlist.Entry")
        @js.native
        val ^ : js.Any = js.native
        
        inline def codec(): Codec[Entry] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Entry]]
        
        inline def decode(buf: js.typedarray.Uint8Array): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Entry]
        inline def decode(buf: Uint8ArrayList): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Entry]
        
        inline def encode(obj: PartialEntry): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
          
          inline def setBlock(value: js.typedarray.Uint8Array): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
          
          inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
          
          inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
          
          inline def setSendDontHave(value: Boolean): Self = StObject.set(x, "sendDontHave", value.asInstanceOf[js.Any])
          
          inline def setWantType(value: WantType): Self = StObject.set(x, "wantType", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      sealed trait WantType extends StObject
      @JSImport("ipfs-bitswap/dist/src/message/message", "Message.Wantlist.WantType")
      @js.native
      object WantType extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[WantType & String] = js.native
        
        @js.native
        sealed trait Block
          extends StObject
             with WantType
        /* "Block" */ val Block: typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist.WantType.Block & String = js.native
        
        @js.native
        sealed trait Have
          extends StObject
             with WantType
        /* "Have" */ val Have: typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist.WantType.Have & String = js.native
        
        def codec(): Codec[WantType] = js.native
      }
      
      inline def codec(): Codec[Wantlist] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Wantlist]]
      
      inline def decode(buf: js.typedarray.Uint8Array): Wantlist = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Wantlist]
      inline def decode(buf: Uint8ArrayList): Wantlist = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Wantlist]
      
      inline def encode(obj: PartialWantlist): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Wantlist] (val x: Self) extends AnyVal {
        
        inline def setEntries(value: js.Array[Entry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
        
        inline def setEntriesVarargs(value: Entry*): Self = StObject.set(x, "entries", js.Array(value*))
        
        inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      }
    }
    
    inline def codec(): Codec[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Message]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Message]
    inline def decode(buf: Uint8ArrayList): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    inline def encode(obj: PartialMessage): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setBlockPresences(value: js.Array[BlockPresence]): Self = StObject.set(x, "blockPresences", value.asInstanceOf[js.Any])
      
      inline def setBlockPresencesVarargs(value: BlockPresence*): Self = StObject.set(x, "blockPresences", js.Array(value*))
      
      inline def setBlocks(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setPayload(value: js.Array[Block]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadVarargs(value: Block*): Self = StObject.set(x, "payload", js.Array(value*))
      
      inline def setPendingBytes(value: Double): Self = StObject.set(x, "pendingBytes", value.asInstanceOf[js.Any])
      
      inline def setWantlist(value: Wantlist): Self = StObject.set(x, "wantlist", value.asInstanceOf[js.Any])
      
      inline def setWantlistUndefined: Self = StObject.set(x, "wantlist", js.undefined)
    }
  }
}
