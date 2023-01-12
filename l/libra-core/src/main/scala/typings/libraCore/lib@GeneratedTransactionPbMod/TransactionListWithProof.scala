package typings.libraCore.`lib@GeneratedTransactionPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.googleProtobufWrappersPbMod.UInt64Value
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.`lib@GeneratedEventsPbMod`.EventsForVersions
import typings.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof
import typings.libraCore.`lib@GeneratedTransactionInfoPbMod`.TransactionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionListWithProof")
@js.native
open class TransactionListWithProof () extends Message {
  
  def addInfos(): TransactionInfo = js.native
  def addInfos(value: Unit, index: Double): TransactionInfo = js.native
  def addInfos(value: TransactionInfo): TransactionInfo = js.native
  def addInfos(value: TransactionInfo, index: Double): TransactionInfo = js.native
  
  def addTransactions(): SignedTransaction = js.native
  def addTransactions(value: Unit, index: Double): SignedTransaction = js.native
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
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): TransactionListWithProof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[TransactionListWithProof]
  
  inline def deserializeBinaryFromReader(message: TransactionListWithProof, reader: BinaryReader): TransactionListWithProof = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[TransactionListWithProof]
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionListWithProof.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionListWithProof.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: TransactionListWithProof, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: TransactionListWithProof): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var eventsForVersions: js.UndefOr[typings.libraCore.`lib@GeneratedEventsPbMod`.EventsForVersions.AsObject] = js.undefined
    
    var firstTransactionVersion: js.UndefOr[typings.googleProtobuf.googleProtobufWrappersPbMod.UInt64Value.AsObject] = js.undefined
    
    var infosList: js.Array[typings.libraCore.`lib@GeneratedTransactionInfoPbMod`.TransactionInfo.AsObject]
    
    var proofOfFirstTransaction: js.UndefOr[typings.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof.AsObject] = js.undefined
    
    var proofOfLastTransaction: js.UndefOr[typings.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof.AsObject] = js.undefined
    
    var transactionsList: js.Array[typings.libraCore.`lib@GeneratedTransactionPbMod`.SignedTransaction.AsObject]
  }
  object AsObject {
    
    inline def apply(
      infosList: js.Array[typings.libraCore.`lib@GeneratedTransactionInfoPbMod`.TransactionInfo.AsObject],
      transactionsList: js.Array[typings.libraCore.`lib@GeneratedTransactionPbMod`.SignedTransaction.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(infosList = infosList.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      inline def setEventsForVersions(value: typings.libraCore.`lib@GeneratedEventsPbMod`.EventsForVersions.AsObject): Self = StObject.set(x, "eventsForVersions", value.asInstanceOf[js.Any])
      
      inline def setEventsForVersionsUndefined: Self = StObject.set(x, "eventsForVersions", js.undefined)
      
      inline def setFirstTransactionVersion(value: typings.googleProtobuf.googleProtobufWrappersPbMod.UInt64Value.AsObject): Self = StObject.set(x, "firstTransactionVersion", value.asInstanceOf[js.Any])
      
      inline def setFirstTransactionVersionUndefined: Self = StObject.set(x, "firstTransactionVersion", js.undefined)
      
      inline def setInfosList(value: js.Array[typings.libraCore.`lib@GeneratedTransactionInfoPbMod`.TransactionInfo.AsObject]): Self = StObject.set(x, "infosList", value.asInstanceOf[js.Any])
      
      inline def setInfosListVarargs(value: typings.libraCore.`lib@GeneratedTransactionInfoPbMod`.TransactionInfo.AsObject*): Self = StObject.set(x, "infosList", js.Array(value*))
      
      inline def setProofOfFirstTransaction(value: typings.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof.AsObject): Self = StObject.set(x, "proofOfFirstTransaction", value.asInstanceOf[js.Any])
      
      inline def setProofOfFirstTransactionUndefined: Self = StObject.set(x, "proofOfFirstTransaction", js.undefined)
      
      inline def setProofOfLastTransaction(value: typings.libraCore.`lib@GeneratedProofPbMod`.AccumulatorProof.AsObject): Self = StObject.set(x, "proofOfLastTransaction", value.asInstanceOf[js.Any])
      
      inline def setProofOfLastTransactionUndefined: Self = StObject.set(x, "proofOfLastTransaction", js.undefined)
      
      inline def setTransactionsList(value: js.Array[typings.libraCore.`lib@GeneratedTransactionPbMod`.SignedTransaction.AsObject]): Self = StObject.set(x, "transactionsList", value.asInstanceOf[js.Any])
      
      inline def setTransactionsListVarargs(value: typings.libraCore.`lib@GeneratedTransactionPbMod`.SignedTransaction.AsObject*): Self = StObject.set(x, "transactionsList", js.Array(value*))
    }
  }
}
