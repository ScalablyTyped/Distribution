package typings.libraCore.`lib@GeneratedMempoolPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsRequest")
@js.native
open class CommitTransactionsRequest () extends Message {
  
  def addTransactions(): CommittedTransaction = js.native
  def addTransactions(value: Unit, index: Double): CommittedTransaction = js.native
  def addTransactions(value: CommittedTransaction): CommittedTransaction = js.native
  def addTransactions(value: CommittedTransaction, index: Double): CommittedTransaction = js.native
  
  def clearTransactionsList(): Unit = js.native
  
  def getBlockTimestampUsecs(): String = js.native
  
  def getTransactionsList(): js.Array[CommittedTransaction] = js.native
  
  def setBlockTimestampUsecs(value: String): Unit = js.native
  
  def setTransactionsList(value: js.Array[CommittedTransaction]): Unit = js.native
}
/* static members */
object CommitTransactionsRequest {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): CommitTransactionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[CommitTransactionsRequest]
  
  inline def deserializeBinaryFromReader(message: CommitTransactionsRequest, reader: BinaryReader): CommitTransactionsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[CommitTransactionsRequest]
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsRequest.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsRequest.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: CommitTransactionsRequest, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: CommitTransactionsRequest): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var blockTimestampUsecs: String
    
    var transactionsList: js.Array[typings.libraCore.`lib@GeneratedMempoolPbMod`.CommittedTransaction.AsObject]
  }
  object AsObject {
    
    inline def apply(
      blockTimestampUsecs: String,
      transactionsList: js.Array[typings.libraCore.`lib@GeneratedMempoolPbMod`.CommittedTransaction.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(blockTimestampUsecs = blockTimestampUsecs.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      inline def setBlockTimestampUsecs(value: String): Self = StObject.set(x, "blockTimestampUsecs", value.asInstanceOf[js.Any])
      
      inline def setTransactionsList(value: js.Array[typings.libraCore.`lib@GeneratedMempoolPbMod`.CommittedTransaction.AsObject]): Self = StObject.set(x, "transactionsList", value.asInstanceOf[js.Any])
      
      inline def setTransactionsListVarargs(value: typings.libraCore.`lib@GeneratedMempoolPbMod`.CommittedTransaction.AsObject*): Self = StObject.set(x, "transactionsList", js.Array(value*))
    }
  }
}
