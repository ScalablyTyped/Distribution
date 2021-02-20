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

object transactionInfoPbMod {
  
  @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo")
  @js.native
  class TransactionInfo () extends Message {
    
    def getEventRootHash(): Uint8Array | String = js.native
    
    def getEventRootHash_asB64(): String = js.native
    
    def getEventRootHash_asU8(): Uint8Array = js.native
    
    def getGasUsed(): String = js.native
    
    def getSignedTransactionHash(): Uint8Array | String = js.native
    
    def getSignedTransactionHash_asB64(): String = js.native
    
    def getSignedTransactionHash_asU8(): Uint8Array = js.native
    
    def getStateRootHash(): Uint8Array | String = js.native
    
    def getStateRootHash_asB64(): String = js.native
    
    def getStateRootHash_asU8(): Uint8Array = js.native
    
    def setEventRootHash(value: String): Unit = js.native
    def setEventRootHash(value: Uint8Array): Unit = js.native
    
    def setGasUsed(value: String): Unit = js.native
    
    def setSignedTransactionHash(value: String): Unit = js.native
    def setSignedTransactionHash(value: Uint8Array): Unit = js.native
    
    def setStateRootHash(value: String): Unit = js.native
    def setStateRootHash(value: Uint8Array): Unit = js.native
  }
  /* static members */
  object TransactionInfo {
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): TransactionInfo = js.native
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: TransactionInfo, reader: BinaryReader): TransactionInfo = js.native
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: TransactionInfo, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: TransactionInfo): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var eventRootHash: Uint8Array | String = js.native
      
      var gasUsed: String = js.native
      
      var signedTransactionHash: Uint8Array | String = js.native
      
      var stateRootHash: Uint8Array | String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(
        eventRootHash: Uint8Array | String,
        gasUsed: String,
        signedTransactionHash: Uint8Array | String,
        stateRootHash: Uint8Array | String
      ): AsObject = {
        val __obj = js.Dynamic.literal(eventRootHash = eventRootHash.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], signedTransactionHash = signedTransactionHash.asInstanceOf[js.Any], stateRootHash = stateRootHash.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEventRootHash(value: Uint8Array | String): Self = StObject.set(x, "eventRootHash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGasUsed(value: String): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSignedTransactionHash(value: Uint8Array | String): Self = StObject.set(x, "signedTransactionHash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateRootHash(value: Uint8Array | String): Self = StObject.set(x, "stateRootHash", value.asInstanceOf[js.Any])
      }
    }
  }
}
