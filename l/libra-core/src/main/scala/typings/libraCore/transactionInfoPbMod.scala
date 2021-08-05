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
    
    inline def deserializeBinary(bytes: Uint8Array): TransactionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[TransactionInfo]
    
    inline def deserializeBinaryFromReader(message: TransactionInfo, reader: BinaryReader): TransactionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[TransactionInfo]
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: TransactionInfo, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: TransactionInfo): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var eventRootHash: Uint8Array | String
      
      var gasUsed: String
      
      var signedTransactionHash: Uint8Array | String
      
      var stateRootHash: Uint8Array | String
    }
    object AsObject {
      
      inline def apply(
        eventRootHash: Uint8Array | String,
        gasUsed: String,
        signedTransactionHash: Uint8Array | String,
        stateRootHash: Uint8Array | String
      ): AsObject = {
        val __obj = js.Dynamic.literal(eventRootHash = eventRootHash.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], signedTransactionHash = signedTransactionHash.asInstanceOf[js.Any], stateRootHash = stateRootHash.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setEventRootHash(value: Uint8Array | String): Self = StObject.set(x, "eventRootHash", value.asInstanceOf[js.Any])
        
        inline def setGasUsed(value: String): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
        
        inline def setSignedTransactionHash(value: Uint8Array | String): Self = StObject.set(x, "signedTransactionHash", value.asInstanceOf[js.Any])
        
        inline def setStateRootHash(value: Uint8Array | String): Self = StObject.set(x, "stateRootHash", value.asInstanceOf[js.Any])
      }
    }
  }
}
