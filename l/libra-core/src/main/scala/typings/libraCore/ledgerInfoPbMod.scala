package typings.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ledgerInfoPbMod {
  
  @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfo")
  @js.native
  class LedgerInfo () extends Message {
    
    def getConsensusBlockId(): Uint8Array | String = js.native
    
    def getConsensusBlockId_asB64(): String = js.native
    
    def getConsensusBlockId_asU8(): Uint8Array = js.native
    
    def getConsensusDataHash(): Uint8Array | String = js.native
    
    def getConsensusDataHash_asB64(): String = js.native
    
    def getConsensusDataHash_asU8(): Uint8Array = js.native
    
    def getEpochNum(): String = js.native
    
    def getTimestampUsecs(): String = js.native
    
    def getTransactionAccumulatorHash(): Uint8Array | String = js.native
    
    def getTransactionAccumulatorHash_asB64(): String = js.native
    
    def getTransactionAccumulatorHash_asU8(): Uint8Array = js.native
    
    def getVersion(): String = js.native
    
    def setConsensusBlockId(value: String): Unit = js.native
    def setConsensusBlockId(value: Uint8Array): Unit = js.native
    
    def setConsensusDataHash(value: String): Unit = js.native
    def setConsensusDataHash(value: Uint8Array): Unit = js.native
    
    def setEpochNum(value: String): Unit = js.native
    
    def setTimestampUsecs(value: String): Unit = js.native
    
    def setTransactionAccumulatorHash(value: String): Unit = js.native
    def setTransactionAccumulatorHash(value: Uint8Array): Unit = js.native
    
    def setVersion(value: String): Unit = js.native
  }
  /* static members */
  object LedgerInfo {
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfo.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): LedgerInfo = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfo.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: LedgerInfo, reader: BinaryReader): LedgerInfo = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfo.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfo.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfo.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: LedgerInfo, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfo.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: LedgerInfo): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var consensusBlockId: Uint8Array | String = js.native
      
      var consensusDataHash: Uint8Array | String = js.native
      
      var epochNum: String = js.native
      
      var timestampUsecs: String = js.native
      
      var transactionAccumulatorHash: Uint8Array | String = js.native
      
      var version: String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(
        consensusBlockId: Uint8Array | String,
        consensusDataHash: Uint8Array | String,
        epochNum: String,
        timestampUsecs: String,
        transactionAccumulatorHash: Uint8Array | String,
        version: String
      ): AsObject = {
        val __obj = js.Dynamic.literal(consensusBlockId = consensusBlockId.asInstanceOf[js.Any], consensusDataHash = consensusDataHash.asInstanceOf[js.Any], epochNum = epochNum.asInstanceOf[js.Any], timestampUsecs = timestampUsecs.asInstanceOf[js.Any], transactionAccumulatorHash = transactionAccumulatorHash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConsensusBlockId(value: Uint8Array | String): Self = StObject.set(x, "consensusBlockId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConsensusDataHash(value: Uint8Array | String): Self = StObject.set(x, "consensusDataHash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEpochNum(value: String): Self = StObject.set(x, "epochNum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimestampUsecs(value: String): Self = StObject.set(x, "timestampUsecs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionAccumulatorHash(value: Uint8Array | String): Self = StObject.set(x, "transactionAccumulatorHash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfoWithSignatures")
  @js.native
  class LedgerInfoWithSignatures () extends Message {
    
    def addSignatures(): ValidatorSignature = js.native
    def addSignatures(value: js.UndefOr[scala.Nothing], index: Double): ValidatorSignature = js.native
    def addSignatures(value: ValidatorSignature): ValidatorSignature = js.native
    def addSignatures(value: ValidatorSignature, index: Double): ValidatorSignature = js.native
    
    def clearLedgerInfo(): Unit = js.native
    
    def clearSignaturesList(): Unit = js.native
    
    def getLedgerInfo(): js.UndefOr[LedgerInfo] = js.native
    
    def getSignaturesList(): js.Array[ValidatorSignature] = js.native
    
    def hasLedgerInfo(): Boolean = js.native
    
    def setLedgerInfo(): Unit = js.native
    def setLedgerInfo(value: LedgerInfo): Unit = js.native
    
    def setSignaturesList(value: js.Array[ValidatorSignature]): Unit = js.native
  }
  /* static members */
  object LedgerInfoWithSignatures {
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfoWithSignatures")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfoWithSignatures.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): LedgerInfoWithSignatures = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfoWithSignatures.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: LedgerInfoWithSignatures, reader: BinaryReader): LedgerInfoWithSignatures = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfoWithSignatures.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfoWithSignatures.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfoWithSignatures.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: LedgerInfoWithSignatures, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfoWithSignatures.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: LedgerInfoWithSignatures): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var ledgerInfo: js.UndefOr[typings.libraCore.ledgerInfoPbMod.LedgerInfo.AsObject] = js.native
      
      var signaturesList: js.Array[typings.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(signaturesList: js.Array[typings.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject]): AsObject = {
        val __obj = js.Dynamic.literal(signaturesList = signaturesList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLedgerInfo(value: typings.libraCore.ledgerInfoPbMod.LedgerInfo.AsObject): Self = StObject.set(x, "ledgerInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLedgerInfoUndefined: Self = StObject.set(x, "ledgerInfo", js.undefined)
        
        @scala.inline
        def setSignaturesList(value: js.Array[typings.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject]): Self = StObject.set(x, "signaturesList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSignaturesListVarargs(value: typings.libraCore.ledgerInfoPbMod.ValidatorSignature.AsObject*): Self = StObject.set(x, "signaturesList", js.Array(value :_*))
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/ledger_info_pb", "ValidatorSignature")
  @js.native
  class ValidatorSignature () extends Message {
    
    def getSignature(): Uint8Array | String = js.native
    
    def getSignature_asB64(): String = js.native
    
    def getSignature_asU8(): Uint8Array = js.native
    
    def getValidatorId(): Uint8Array | String = js.native
    
    def getValidatorId_asB64(): String = js.native
    
    def getValidatorId_asU8(): Uint8Array = js.native
    
    def setSignature(value: String): Unit = js.native
    def setSignature(value: Uint8Array): Unit = js.native
    
    def setValidatorId(value: String): Unit = js.native
    def setValidatorId(value: Uint8Array): Unit = js.native
  }
  /* static members */
  object ValidatorSignature {
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "ValidatorSignature")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "ValidatorSignature.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): ValidatorSignature = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "ValidatorSignature.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: ValidatorSignature, reader: BinaryReader): ValidatorSignature = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "ValidatorSignature.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "ValidatorSignature.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "ValidatorSignature.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: ValidatorSignature, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/ledger_info_pb", "ValidatorSignature.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: ValidatorSignature): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var signature: Uint8Array | String = js.native
      
      var validatorId: Uint8Array | String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(signature: Uint8Array | String, validatorId: Uint8Array | String): AsObject = {
        val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], validatorId = validatorId.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSignature(value: Uint8Array | String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValidatorId(value: Uint8Array | String): Self = StObject.set(x, "validatorId", value.asInstanceOf[js.Any])
      }
    }
  }
}
