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

object mempoolStatusPbMod {
  
  @JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus")
  @js.native
  class MempoolAddTransactionStatus () extends Message {
    
    def getCode(): MempoolAddTransactionStatusCode = js.native
    
    def getMessage(): String = js.native
    
    def setCode(value: MempoolAddTransactionStatusCode): Unit = js.native
    
    def setMessage(value: String): Unit = js.native
  }
  /* static members */
  object MempoolAddTransactionStatus {
    
    @JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: Uint8Array): MempoolAddTransactionStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[MempoolAddTransactionStatus]
    
    inline def deserializeBinaryFromReader(message: MempoolAddTransactionStatus, reader: BinaryReader): MempoolAddTransactionStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[MempoolAddTransactionStatus]
    
    @JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: MempoolAddTransactionStatus, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: MempoolAddTransactionStatus): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var code: MempoolAddTransactionStatusCode
      
      var message: String
    }
    object AsObject {
      
      inline def apply(code: MempoolAddTransactionStatusCode, message: String): AsObject = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setCode(value: MempoolAddTransactionStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  sealed trait MempoolAddTransactionStatusCode extends StObject
  @JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatusCode")
  @js.native
  object MempoolAddTransactionStatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MempoolAddTransactionStatusCode & Double] = js.native
    
    @js.native
    sealed trait INSUFFICIENTBALANCE
      extends StObject
         with MempoolAddTransactionStatusCode
    /* 1 */ val INSUFFICIENTBALANCE: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode.INSUFFICIENTBALANCE & Double = js.native
    
    @js.native
    sealed trait INVALIDSEQNUMBER
      extends StObject
         with MempoolAddTransactionStatusCode
    /* 2 */ val INVALIDSEQNUMBER: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode.INVALIDSEQNUMBER & Double = js.native
    
    @js.native
    sealed trait INVALIDUPDATE
      extends StObject
         with MempoolAddTransactionStatusCode
    /* 5 */ val INVALIDUPDATE: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode.INVALIDUPDATE & Double = js.native
    
    @js.native
    sealed trait MEMPOOLISFULL
      extends StObject
         with MempoolAddTransactionStatusCode
    /* 3 */ val MEMPOOLISFULL: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode.MEMPOOLISFULL & Double = js.native
    
    @js.native
    sealed trait TOOMANYTRANSACTIONS
      extends StObject
         with MempoolAddTransactionStatusCode
    /* 4 */ val TOOMANYTRANSACTIONS: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode.TOOMANYTRANSACTIONS & Double = js.native
    
    @js.native
    sealed trait VALID
      extends StObject
         with MempoolAddTransactionStatusCode
    /* 0 */ val VALID: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode.VALID & Double = js.native
  }
}
