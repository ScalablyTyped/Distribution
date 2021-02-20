package typings.libraCore.transactionPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.wrappersPbMod.UInt64Value
import typings.libraCore.eventsPbMod.EventsForVersions
import typings.libraCore.proofPbMod.AccumulatorProof
import typings.libraCore.transactionInfoPbMod.TransactionInfo
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionListWithProof")
@js.native
class TransactionListWithProof () extends Message {
  
  def addInfos(): TransactionInfo = js.native
  def addInfos(value: js.UndefOr[scala.Nothing], index: Double): TransactionInfo = js.native
  def addInfos(value: TransactionInfo): TransactionInfo = js.native
  def addInfos(value: TransactionInfo, index: Double): TransactionInfo = js.native
  
  def addTransactions(): SignedTransaction = js.native
  def addTransactions(value: js.UndefOr[scala.Nothing], index: Double): SignedTransaction = js.native
  def addTransactions(value: SignedTransaction): SignedTransaction = js.native
  def addTransactions(value: SignedTransaction, index: Double): SignedTransaction = js.native
  
  def clearEventsForVersions(): Unit = js.native
  
  def clearFirstTransactionVersion(): Unit = js.native
  
  def clearInfosList(): Unit = js.native
  
  def clearProofOfFirstTransaction(): Unit = js.native
  
  def clearProofOfLastTransaction(): Unit = js.native
  
  def clearTransactionsList(): Unit = js.native
  
  def getEventsForVersions(): js.UndefOr[EventsForVersions] = js.native
  
  def getFirstTransactionVersion(): js.UndefOr[UInt64Value] = js.native
  
  def getInfosList(): js.Array[TransactionInfo] = js.native
  
  def getProofOfFirstTransaction(): js.UndefOr[AccumulatorProof] = js.native
  
  def getProofOfLastTransaction(): js.UndefOr[AccumulatorProof] = js.native
  
  def getTransactionsList(): js.Array[SignedTransaction] = js.native
  
  def hasEventsForVersions(): Boolean = js.native
  
  def hasFirstTransactionVersion(): Boolean = js.native
  
  def hasProofOfFirstTransaction(): Boolean = js.native
  
  def hasProofOfLastTransaction(): Boolean = js.native
  
  def setEventsForVersions(): Unit = js.native
  def setEventsForVersions(value: EventsForVersions): Unit = js.native
  
  def setFirstTransactionVersion(): Unit = js.native
  def setFirstTransactionVersion(value: UInt64Value): Unit = js.native
  
  def setInfosList(value: js.Array[TransactionInfo]): Unit = js.native
  
  def setProofOfFirstTransaction(): Unit = js.native
  def setProofOfFirstTransaction(value: AccumulatorProof): Unit = js.native
  
  def setProofOfLastTransaction(): Unit = js.native
  def setProofOfLastTransaction(value: AccumulatorProof): Unit = js.native
  
  def setTransactionsList(value: js.Array[SignedTransaction]): Unit = js.native
}
/* static members */
object TransactionListWithProof {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionListWithProof")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionListWithProof.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): TransactionListWithProof = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionListWithProof.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: TransactionListWithProof, reader: BinaryReader): TransactionListWithProof = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionListWithProof.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionListWithProof.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionListWithProof.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: TransactionListWithProof, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionListWithProof.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: TransactionListWithProof): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var eventsForVersions: js.UndefOr[typings.libraCore.eventsPbMod.EventsForVersions.AsObject] = js.native
    
    var firstTransactionVersion: js.UndefOr[typings.googleProtobuf.wrappersPbMod.UInt64Value.AsObject] = js.native
    
    var infosList: js.Array[typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject] = js.native
    
    var proofOfFirstTransaction: js.UndefOr[typings.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.native
    
    var proofOfLastTransaction: js.UndefOr[typings.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.native
    
    var transactionsList: js.Array[typings.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      infosList: js.Array[typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject],
      transactionsList: js.Array[typings.libraCore.transactionPbMod.SignedTransaction.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(infosList = infosList.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventsForVersions(value: typings.libraCore.eventsPbMod.EventsForVersions.AsObject): Self = StObject.set(x, "eventsForVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsForVersionsUndefined: Self = StObject.set(x, "eventsForVersions", js.undefined)
      
      @scala.inline
      def setFirstTransactionVersion(value: typings.googleProtobuf.wrappersPbMod.UInt64Value.AsObject): Self = StObject.set(x, "firstTransactionVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstTransactionVersionUndefined: Self = StObject.set(x, "firstTransactionVersion", js.undefined)
      
      @scala.inline
      def setInfosList(value: js.Array[typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject]): Self = StObject.set(x, "infosList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfosListVarargs(value: typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject*): Self = StObject.set(x, "infosList", js.Array(value :_*))
      
      @scala.inline
      def setProofOfFirstTransaction(value: typings.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = StObject.set(x, "proofOfFirstTransaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProofOfFirstTransactionUndefined: Self = StObject.set(x, "proofOfFirstTransaction", js.undefined)
      
      @scala.inline
      def setProofOfLastTransaction(value: typings.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = StObject.set(x, "proofOfLastTransaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProofOfLastTransactionUndefined: Self = StObject.set(x, "proofOfLastTransaction", js.undefined)
      
      @scala.inline
      def setTransactionsList(value: js.Array[typings.libraCore.transactionPbMod.SignedTransaction.AsObject]): Self = StObject.set(x, "transactionsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsListVarargs(value: typings.libraCore.transactionPbMod.SignedTransaction.AsObject*): Self = StObject.set(x, "transactionsList", js.Array(value :_*))
    }
  }
}
