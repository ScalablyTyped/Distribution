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
    
    @JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): MempoolAddTransactionStatus = js.native
    
    @JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: MempoolAddTransactionStatus, reader: BinaryReader): MempoolAddTransactionStatus = js.native
    
    @JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: MempoolAddTransactionStatus, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: MempoolAddTransactionStatus): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var code: MempoolAddTransactionStatusCode = js.native
      
      var message: String = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(code: MempoolAddTransactionStatusCode, message: String): AsObject = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCode(value: MempoolAddTransactionStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  sealed trait MempoolAddTransactionStatusCode extends StObject
  @JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatusCode")
  @js.native
  object MempoolAddTransactionStatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MempoolAddTransactionStatusCode with Double] = js.native
    
    @js.native
    sealed trait INSUFFICIENTBALANCE extends MempoolAddTransactionStatusCode
    /* 1 */ val INSUFFICIENTBALANCE: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode.INSUFFICIENTBALANCE with Double = js.native
    
    @js.native
    sealed trait INVALIDSEQNUMBER extends MempoolAddTransactionStatusCode
    /* 2 */ val INVALIDSEQNUMBER: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode.INVALIDSEQNUMBER with Double = js.native
    
    @js.native
    sealed trait INVALIDUPDATE extends MempoolAddTransactionStatusCode
    /* 5 */ val INVALIDUPDATE: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode.INVALIDUPDATE with Double = js.native
    
    @js.native
    sealed trait MEMPOOLISFULL extends MempoolAddTransactionStatusCode
    /* 3 */ val MEMPOOLISFULL: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode.MEMPOOLISFULL with Double = js.native
    
    @js.native
    sealed trait TOOMANYTRANSACTIONS extends MempoolAddTransactionStatusCode
    /* 4 */ val TOOMANYTRANSACTIONS: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode.TOOMANYTRANSACTIONS with Double = js.native
    
    @js.native
    sealed trait VALID extends MempoolAddTransactionStatusCode
    /* 0 */ val VALID: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatusCode.VALID with Double = js.native
  }
}
