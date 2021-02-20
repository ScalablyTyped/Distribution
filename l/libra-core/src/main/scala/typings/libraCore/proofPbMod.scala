package typings.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.transactionInfoPbMod.TransactionInfo
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proofPbMod {
  
  @JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof")
  @js.native
  class AccountStateProof () extends Message {
    
    def clearLedgerInfoToTransactionInfoProof(): Unit = js.native
    
    def clearTransactionInfo(): Unit = js.native
    
    def clearTransactionInfoToAccountProof(): Unit = js.native
    
    def getLedgerInfoToTransactionInfoProof(): js.UndefOr[AccumulatorProof] = js.native
    
    def getTransactionInfo(): js.UndefOr[TransactionInfo] = js.native
    
    def getTransactionInfoToAccountProof(): js.UndefOr[SparseMerkleProof] = js.native
    
    def hasLedgerInfoToTransactionInfoProof(): Boolean = js.native
    
    def hasTransactionInfo(): Boolean = js.native
    
    def hasTransactionInfoToAccountProof(): Boolean = js.native
    
    def setLedgerInfoToTransactionInfoProof(): Unit = js.native
    def setLedgerInfoToTransactionInfoProof(value: AccumulatorProof): Unit = js.native
    
    def setTransactionInfo(): Unit = js.native
    def setTransactionInfo(value: TransactionInfo): Unit = js.native
    
    def setTransactionInfoToAccountProof(): Unit = js.native
    def setTransactionInfoToAccountProof(value: SparseMerkleProof): Unit = js.native
  }
  /* static members */
  object AccountStateProof {
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): AccountStateProof = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: AccountStateProof, reader: BinaryReader): AccountStateProof = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: AccountStateProof, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: AccountStateProof): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var ledgerInfoToTransactionInfoProof: js.UndefOr[typings.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.native
      
      var transactionInfo: js.UndefOr[typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject] = js.native
      
      var transactionInfoToAccountProof: js.UndefOr[typings.libraCore.proofPbMod.SparseMerkleProof.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(): AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLedgerInfoToTransactionInfoProof(value: typings.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = StObject.set(x, "ledgerInfoToTransactionInfoProof", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLedgerInfoToTransactionInfoProofUndefined: Self = StObject.set(x, "ledgerInfoToTransactionInfoProof", js.undefined)
        
        @scala.inline
        def setTransactionInfo(value: typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionInfoToAccountProof(value: typings.libraCore.proofPbMod.SparseMerkleProof.AsObject): Self = StObject.set(x, "transactionInfoToAccountProof", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionInfoToAccountProofUndefined: Self = StObject.set(x, "transactionInfoToAccountProof", js.undefined)
        
        @scala.inline
        def setTransactionInfoUndefined: Self = StObject.set(x, "transactionInfo", js.undefined)
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof")
  @js.native
  class AccumulatorProof () extends Message {
    
    def addNonDefaultSiblings(value: String): Uint8Array | String = js.native
    def addNonDefaultSiblings(value: String, index: Double): Uint8Array | String = js.native
    def addNonDefaultSiblings(value: Uint8Array): Uint8Array | String = js.native
    def addNonDefaultSiblings(value: Uint8Array, index: Double): Uint8Array | String = js.native
    
    def clearNonDefaultSiblingsList(): Unit = js.native
    
    def getBitmap(): String = js.native
    
    def getNonDefaultSiblingsList(): js.Array[Uint8Array | String] = js.native
    
    def getNonDefaultSiblingsList_asB64(): js.Array[String] = js.native
    
    def getNonDefaultSiblingsList_asU8(): js.Array[Uint8Array] = js.native
    
    def setBitmap(value: String): Unit = js.native
    
    def setNonDefaultSiblingsList(value: js.Array[Uint8Array | String]): Unit = js.native
  }
  /* static members */
  object AccumulatorProof {
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): AccumulatorProof = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: AccumulatorProof, reader: BinaryReader): AccumulatorProof = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: AccumulatorProof, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: AccumulatorProof): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var bitmap: String = js.native
      
      var nonDefaultSiblingsList: js.Array[Uint8Array | String] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(bitmap: String, nonDefaultSiblingsList: js.Array[Uint8Array | String]): AsObject = {
        val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], nonDefaultSiblingsList = nonDefaultSiblingsList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBitmap(value: String): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNonDefaultSiblingsList(value: js.Array[Uint8Array | String]): Self = StObject.set(x, "nonDefaultSiblingsList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNonDefaultSiblingsListVarargs(value: (Uint8Array | String)*): Self = StObject.set(x, "nonDefaultSiblingsList", js.Array(value :_*))
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/proof_pb", "EventProof")
  @js.native
  class EventProof () extends Message {
    
    def clearLedgerInfoToTransactionInfoProof(): Unit = js.native
    
    def clearTransactionInfo(): Unit = js.native
    
    def clearTransactionInfoToEventProof(): Unit = js.native
    
    def getLedgerInfoToTransactionInfoProof(): js.UndefOr[AccumulatorProof] = js.native
    
    def getTransactionInfo(): js.UndefOr[TransactionInfo] = js.native
    
    def getTransactionInfoToEventProof(): js.UndefOr[AccumulatorProof] = js.native
    
    def hasLedgerInfoToTransactionInfoProof(): Boolean = js.native
    
    def hasTransactionInfo(): Boolean = js.native
    
    def hasTransactionInfoToEventProof(): Boolean = js.native
    
    def setLedgerInfoToTransactionInfoProof(): Unit = js.native
    def setLedgerInfoToTransactionInfoProof(value: AccumulatorProof): Unit = js.native
    
    def setTransactionInfo(): Unit = js.native
    def setTransactionInfo(value: TransactionInfo): Unit = js.native
    
    def setTransactionInfoToEventProof(): Unit = js.native
    def setTransactionInfoToEventProof(value: AccumulatorProof): Unit = js.native
  }
  /* static members */
  object EventProof {
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "EventProof")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "EventProof.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): EventProof = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "EventProof.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: EventProof, reader: BinaryReader): EventProof = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "EventProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "EventProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "EventProof.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: EventProof, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "EventProof.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: EventProof): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var ledgerInfoToTransactionInfoProof: js.UndefOr[typings.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.native
      
      var transactionInfo: js.UndefOr[typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject] = js.native
      
      var transactionInfoToEventProof: js.UndefOr[typings.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(): AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLedgerInfoToTransactionInfoProof(value: typings.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = StObject.set(x, "ledgerInfoToTransactionInfoProof", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLedgerInfoToTransactionInfoProofUndefined: Self = StObject.set(x, "ledgerInfoToTransactionInfoProof", js.undefined)
        
        @scala.inline
        def setTransactionInfo(value: typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionInfoToEventProof(value: typings.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = StObject.set(x, "transactionInfoToEventProof", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionInfoToEventProofUndefined: Self = StObject.set(x, "transactionInfoToEventProof", js.undefined)
        
        @scala.inline
        def setTransactionInfoUndefined: Self = StObject.set(x, "transactionInfo", js.undefined)
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof")
  @js.native
  class SignedTransactionProof () extends Message {
    
    def clearLedgerInfoToTransactionInfoProof(): Unit = js.native
    
    def clearTransactionInfo(): Unit = js.native
    
    def getLedgerInfoToTransactionInfoProof(): js.UndefOr[AccumulatorProof] = js.native
    
    def getTransactionInfo(): js.UndefOr[TransactionInfo] = js.native
    
    def hasLedgerInfoToTransactionInfoProof(): Boolean = js.native
    
    def hasTransactionInfo(): Boolean = js.native
    
    def setLedgerInfoToTransactionInfoProof(): Unit = js.native
    def setLedgerInfoToTransactionInfoProof(value: AccumulatorProof): Unit = js.native
    
    def setTransactionInfo(): Unit = js.native
    def setTransactionInfo(value: TransactionInfo): Unit = js.native
  }
  /* static members */
  object SignedTransactionProof {
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): SignedTransactionProof = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: SignedTransactionProof, reader: BinaryReader): SignedTransactionProof = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: SignedTransactionProof, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: SignedTransactionProof): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var ledgerInfoToTransactionInfoProof: js.UndefOr[typings.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.native
      
      var transactionInfo: js.UndefOr[typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(): AsObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLedgerInfoToTransactionInfoProof(value: typings.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = StObject.set(x, "ledgerInfoToTransactionInfoProof", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLedgerInfoToTransactionInfoProofUndefined: Self = StObject.set(x, "ledgerInfoToTransactionInfoProof", js.undefined)
        
        @scala.inline
        def setTransactionInfo(value: typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionInfoUndefined: Self = StObject.set(x, "transactionInfo", js.undefined)
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof")
  @js.native
  class SparseMerkleProof () extends Message {
    
    def addNonDefaultSiblings(value: String): Uint8Array | String = js.native
    def addNonDefaultSiblings(value: String, index: Double): Uint8Array | String = js.native
    def addNonDefaultSiblings(value: Uint8Array): Uint8Array | String = js.native
    def addNonDefaultSiblings(value: Uint8Array, index: Double): Uint8Array | String = js.native
    
    def clearNonDefaultSiblingsList(): Unit = js.native
    
    def getBitmap(): Uint8Array | String = js.native
    
    def getBitmap_asB64(): String = js.native
    
    def getBitmap_asU8(): Uint8Array = js.native
    
    def getLeaf(): Uint8Array | String = js.native
    
    def getLeaf_asB64(): String = js.native
    
    def getLeaf_asU8(): Uint8Array = js.native
    
    def getNonDefaultSiblingsList(): js.Array[Uint8Array | String] = js.native
    
    def getNonDefaultSiblingsList_asB64(): js.Array[String] = js.native
    
    def getNonDefaultSiblingsList_asU8(): js.Array[Uint8Array] = js.native
    
    def setBitmap(value: String): Unit = js.native
    def setBitmap(value: Uint8Array): Unit = js.native
    
    def setLeaf(value: String): Unit = js.native
    def setLeaf(value: Uint8Array): Unit = js.native
    
    def setNonDefaultSiblingsList(value: js.Array[Uint8Array | String]): Unit = js.native
  }
  /* static members */
  object SparseMerkleProof {
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): SparseMerkleProof = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: SparseMerkleProof, reader: BinaryReader): SparseMerkleProof = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: SparseMerkleProof, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: SparseMerkleProof): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var bitmap: Uint8Array | String = js.native
      
      var leaf: Uint8Array | String = js.native
      
      var nonDefaultSiblingsList: js.Array[Uint8Array | String] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(
        bitmap: Uint8Array | String,
        leaf: Uint8Array | String,
        nonDefaultSiblingsList: js.Array[Uint8Array | String]
      ): AsObject = {
        val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], nonDefaultSiblingsList = nonDefaultSiblingsList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBitmap(value: Uint8Array | String): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeaf(value: Uint8Array | String): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNonDefaultSiblingsList(value: js.Array[Uint8Array | String]): Self = StObject.set(x, "nonDefaultSiblingsList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNonDefaultSiblingsListVarargs(value: (Uint8Array | String)*): Self = StObject.set(x, "nonDefaultSiblingsList", js.Array(value :_*))
      }
    }
  }
}
