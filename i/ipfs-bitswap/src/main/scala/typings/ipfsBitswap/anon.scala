package typings.ipfsBitswap

import typings.ipfsBitswap.distSrcMessageMessageMod.Message.BlockPresence
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.BlockPresenceType
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist.Entry
import typings.ipfsBitswap.distSrcMessageMessageMod.Message.Wantlist.WantType
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Block extends StObject {
    
    var block: js.typedarray.Uint8Array
    
    var cid: CID[Any, Double, Double, Version]
  }
  object Block {
    
    inline def apply(block: js.typedarray.Uint8Array, cid: CID[Any, Double, Double, Version]): Block = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: js.typedarray.Uint8Array): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    }
  }
  
  trait BytesRecv extends StObject {
    
    var bytesRecv: Double
    
    var bytesSent: Double
  }
  object BytesRecv {
    
    inline def apply(bytesRecv: Double, bytesSent: Double): BytesRecv = {
      val __obj = js.Dynamic.literal(bytesRecv = bytesRecv.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesRecv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BytesRecv] (val x: Self) extends AnyVal {
      
      inline def setBytesRecv(value: Double): Self = StObject.set(x, "bytesRecv", value.asInstanceOf[js.Any])
      
      inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cid extends StObject {
    
    var cid: CID[Any, Double, Double, Version]
    
    var priority: Double
  }
  object Cid {
    
    inline def apply(cid: CID[Any, Double, Double, Version], priority: Double): Cid = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cid] (val x: Self) extends AnyVal {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  trait DontHave extends StObject {
    
    var DontHave: BlockPresenceType
    
    var Have: BlockPresenceType
  }
  object DontHave {
    
    inline def apply(DontHave: BlockPresenceType, Have: BlockPresenceType): DontHave = {
      val __obj = js.Dynamic.literal(DontHave = DontHave.asInstanceOf[js.Any], Have = Have.asInstanceOf[js.Any])
      __obj.asInstanceOf[DontHave]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DontHave] (val x: Self) extends AnyVal {
      
      inline def setDontHave(value: BlockPresenceType): Self = StObject.set(x, "DontHave", value.asInstanceOf[js.Any])
      
      inline def setHave(value: BlockPresenceType): Self = StObject.set(x, "Have", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: js.Error
    
    var peer: PeerId
  }
  object Error {
    
    inline def apply(error: js.Error, peer: PeerId): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    }
  }
  
  trait Have extends StObject {
    
    var Block: WantType
    
    var Have: WantType
  }
  object Have {
    
    inline def apply(Block: WantType, Have: WantType): Have = {
      val __obj = js.Dynamic.literal(Block = Block.asInstanceOf[js.Any], Have = Have.asInstanceOf[js.Any])
      __obj.asInstanceOf[Have]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Have] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: WantType): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
      
      inline def setHave(value: WantType): Self = StObject.set(x, "Have", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<ipfs-bitswap.ipfs-bitswap/dist/src/message/message.Message.Block> */
  trait PartialBlock extends StObject {
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var prefix: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialBlock {
    
    inline def apply(): PartialBlock = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBlock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialBlock] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPrefix(value: js.typedarray.Uint8Array): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  /* Inlined std.Partial<ipfs-bitswap.ipfs-bitswap/dist/src/message/message.Message.BlockPresence> */
  trait PartialBlockPresence extends StObject {
    
    var cid: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var `type`: js.UndefOr[BlockPresenceType] = js.undefined
  }
  object PartialBlockPresence {
    
    inline def apply(): PartialBlockPresence = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBlockPresence]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialBlockPresence] (val x: Self) extends AnyVal {
      
      inline def setCid(value: js.typedarray.Uint8Array): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setType(value: BlockPresenceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<ipfs-bitswap.ipfs-bitswap/dist/src/message/message.Message.Wantlist.Entry> */
  trait PartialEntry extends StObject {
    
    var block: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var sendDontHave: js.UndefOr[Boolean] = js.undefined
    
    var wantType: js.UndefOr[WantType] = js.undefined
  }
  object PartialEntry {
    
    inline def apply(): PartialEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialEntry] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: js.typedarray.Uint8Array): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSendDontHave(value: Boolean): Self = StObject.set(x, "sendDontHave", value.asInstanceOf[js.Any])
      
      inline def setSendDontHaveUndefined: Self = StObject.set(x, "sendDontHave", js.undefined)
      
      inline def setWantType(value: WantType): Self = StObject.set(x, "wantType", value.asInstanceOf[js.Any])
      
      inline def setWantTypeUndefined: Self = StObject.set(x, "wantType", js.undefined)
    }
  }
  
  /* Inlined std.Partial<ipfs-bitswap.ipfs-bitswap/dist/src/message/message.Message> */
  trait PartialMessage extends StObject {
    
    var blockPresences: js.UndefOr[js.Array[BlockPresence]] = js.undefined
    
    var blocks: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
    
    var payload: js.UndefOr[js.Array[typings.ipfsBitswap.distSrcMessageMessageMod.Message.Block]] = js.undefined
    
    var pendingBytes: js.UndefOr[Double] = js.undefined
    
    var wantlist: js.UndefOr[Wantlist] = js.undefined
  }
  object PartialMessage {
    
    inline def apply(): PartialMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMessage] (val x: Self) extends AnyVal {
      
      inline def setBlockPresences(value: js.Array[BlockPresence]): Self = StObject.set(x, "blockPresences", value.asInstanceOf[js.Any])
      
      inline def setBlockPresencesUndefined: Self = StObject.set(x, "blockPresences", js.undefined)
      
      inline def setBlockPresencesVarargs(value: BlockPresence*): Self = StObject.set(x, "blockPresences", js.Array(value*))
      
      inline def setBlocks(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      inline def setBlocksVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setPayload(value: js.Array[typings.ipfsBitswap.distSrcMessageMessageMod.Message.Block]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setPayloadVarargs(value: typings.ipfsBitswap.distSrcMessageMessageMod.Message.Block*): Self = StObject.set(x, "payload", js.Array(value*))
      
      inline def setPendingBytes(value: Double): Self = StObject.set(x, "pendingBytes", value.asInstanceOf[js.Any])
      
      inline def setPendingBytesUndefined: Self = StObject.set(x, "pendingBytes", js.undefined)
      
      inline def setWantlist(value: Wantlist): Self = StObject.set(x, "wantlist", value.asInstanceOf[js.Any])
      
      inline def setWantlistUndefined: Self = StObject.set(x, "wantlist", js.undefined)
    }
  }
  
  /* Inlined std.Partial<ipfs-bitswap.ipfs-bitswap/dist/src/message/message.Message.Wantlist> */
  trait PartialWantlist extends StObject {
    
    var entries: js.UndefOr[js.Array[Entry]] = js.undefined
    
    var full: js.UndefOr[Boolean] = js.undefined
  }
  object PartialWantlist {
    
    inline def apply(): PartialWantlist = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWantlist]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialWantlist] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: js.Array[Entry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEntriesVarargs(value: Entry*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    }
  }
  
  /* Inlined std.Required<ipfs-bitswap.ipfs-bitswap/dist/src/decision-engine.DecisionEngineOptions> */
  trait RequiredDecisionEngineOpt extends StObject {
    
    var maxSizeReplaceHasWithBlock: Double
    
    var targetMessageSize: Double
  }
  object RequiredDecisionEngineOpt {
    
    inline def apply(maxSizeReplaceHasWithBlock: Double, targetMessageSize: Double): RequiredDecisionEngineOpt = {
      val __obj = js.Dynamic.literal(maxSizeReplaceHasWithBlock = maxSizeReplaceHasWithBlock.asInstanceOf[js.Any], targetMessageSize = targetMessageSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredDecisionEngineOpt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredDecisionEngineOpt] (val x: Self) extends AnyVal {
      
      inline def setMaxSizeReplaceHasWithBlock(value: Double): Self = StObject.set(x, "maxSizeReplaceHasWithBlock", value.asInstanceOf[js.Any])
      
      inline def setTargetMessageSize(value: Double): Self = StObject.set(x, "targetMessageSize", value.asInstanceOf[js.Any])
    }
  }
}
