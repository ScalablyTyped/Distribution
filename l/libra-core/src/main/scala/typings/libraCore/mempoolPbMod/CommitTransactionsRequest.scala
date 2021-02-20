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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsRequest")
@js.native
class CommitTransactionsRequest () extends Message {
  
  def addTransactions(): CommittedTransaction = js.native
  def addTransactions(value: js.UndefOr[scala.Nothing], index: Double): CommittedTransaction = js.native
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
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsRequest.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): CommitTransactionsRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsRequest.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: CommitTransactionsRequest, reader: BinaryReader): CommitTransactionsRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsRequest.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsRequest.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsRequest.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: CommitTransactionsRequest, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsRequest.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: CommitTransactionsRequest): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var blockTimestampUsecs: String = js.native
    
    var transactionsList: js.Array[typings.libraCore.mempoolPbMod.CommittedTransaction.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      blockTimestampUsecs: String,
      transactionsList: js.Array[typings.libraCore.mempoolPbMod.CommittedTransaction.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(blockTimestampUsecs = blockTimestampUsecs.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockTimestampUsecs(value: String): Self = StObject.set(x, "blockTimestampUsecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsList(value: js.Array[typings.libraCore.mempoolPbMod.CommittedTransaction.AsObject]): Self = StObject.set(x, "transactionsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsListVarargs(value: typings.libraCore.mempoolPbMod.CommittedTransaction.AsObject*): Self = StObject.set(x, "transactionsList", js.Array(value :_*))
    }
  }
}
