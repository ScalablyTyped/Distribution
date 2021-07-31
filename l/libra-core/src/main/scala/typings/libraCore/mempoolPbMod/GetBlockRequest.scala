package typings.libraCore.mempoolPbMod

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

@JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest")
@js.native
class GetBlockRequest () extends Message {
  
  def addTransactions(): TransactionExclusion = js.native
  def addTransactions(value: Unit, index: Double): TransactionExclusion = js.native
  def addTransactions(value: TransactionExclusion): TransactionExclusion = js.native
  def addTransactions(value: TransactionExclusion, index: Double): TransactionExclusion = js.native
  
  def clearTransactionsList(): Unit = js.native
  
  def getMaxBlockSize(): String = js.native
  
  def getTransactionsList(): js.Array[TransactionExclusion] = js.native
  
  def setMaxBlockSize(value: String): Unit = js.native
  
  def setTransactionsList(value: js.Array[TransactionExclusion]): Unit = js.native
}
/* static members */
object GetBlockRequest {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): GetBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[GetBlockRequest]
  
  @scala.inline
  def deserializeBinaryFromReader(message: GetBlockRequest, reader: BinaryReader): GetBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[GetBlockRequest]
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serializeBinaryToWriter(message: GetBlockRequest, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: GetBlockRequest): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var maxBlockSize: String
    
    var transactionsList: js.Array[typings.libraCore.mempoolPbMod.TransactionExclusion.AsObject]
  }
  object AsObject {
    
    @scala.inline
    def apply(
      maxBlockSize: String,
      transactionsList: js.Array[typings.libraCore.mempoolPbMod.TransactionExclusion.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(maxBlockSize = maxBlockSize.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxBlockSize(value: String): Self = StObject.set(x, "maxBlockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsList(value: js.Array[typings.libraCore.mempoolPbMod.TransactionExclusion.AsObject]): Self = StObject.set(x, "transactionsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsListVarargs(value: typings.libraCore.mempoolPbMod.TransactionExclusion.AsObject*): Self = StObject.set(x, "transactionsList", js.Array(value :_*))
    }
  }
}
