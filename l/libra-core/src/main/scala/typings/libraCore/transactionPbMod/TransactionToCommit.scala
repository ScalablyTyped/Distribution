package typings.libraCore.transactionPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.eventsPbMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit")
@js.native
open class TransactionToCommit () extends Message {
  
  def addAccountStates(): AccountState = js.native
  def addAccountStates(value: Unit, index: Double): AccountState = js.native
  def addAccountStates(value: AccountState): AccountState = js.native
  def addAccountStates(value: AccountState, index: Double): AccountState = js.native
  
  def addEvents(): Event = js.native
  def addEvents(value: Unit, index: Double): Event = js.native
  def addEvents(value: Event): Event = js.native
  def addEvents(value: Event, index: Double): Event = js.native
  
  def clearAccountStatesList(): Unit = js.native
  
  def clearEventsList(): Unit = js.native
  
  def clearSignedTxn(): Unit = js.native
  
  def getAccountStatesList(): js.Array[AccountState] = js.native
  
  def getEventsList(): js.Array[Event] = js.native
  
  def getGasUsed(): String = js.native
  
  def getSignedTxn(): js.UndefOr[SignedTransaction] = js.native
  
  def hasSignedTxn(): Boolean = js.native
  
  def setAccountStatesList(value: js.Array[AccountState]): Unit = js.native
  
  def setEventsList(value: js.Array[Event]): Unit = js.native
  
  def setGasUsed(value: String): Unit = js.native
  
  def setSignedTxn(): Unit = js.native
  def setSignedTxn(value: SignedTransaction): Unit = js.native
}
/* static members */
object TransactionToCommit {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): TransactionToCommit = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[TransactionToCommit]
  
  inline def deserializeBinaryFromReader(message: TransactionToCommit, reader: BinaryReader): TransactionToCommit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[TransactionToCommit]
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: TransactionToCommit, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: TransactionToCommit): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var accountStatesList: js.Array[typings.libraCore.transactionPbMod.AccountState.AsObject]
    
    var eventsList: js.Array[typings.libraCore.eventsPbMod.Event.AsObject]
    
    var gasUsed: String
    
    var signedTxn: js.UndefOr[typings.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.undefined
  }
  object AsObject {
    
    inline def apply(
      accountStatesList: js.Array[typings.libraCore.transactionPbMod.AccountState.AsObject],
      eventsList: js.Array[typings.libraCore.eventsPbMod.Event.AsObject],
      gasUsed: String
    ): AsObject = {
      val __obj = js.Dynamic.literal(accountStatesList = accountStatesList.asInstanceOf[js.Any], eventsList = eventsList.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setAccountStatesList(value: js.Array[typings.libraCore.transactionPbMod.AccountState.AsObject]): Self = StObject.set(x, "accountStatesList", value.asInstanceOf[js.Any])
      
      inline def setAccountStatesListVarargs(value: typings.libraCore.transactionPbMod.AccountState.AsObject*): Self = StObject.set(x, "accountStatesList", js.Array(value*))
      
      inline def setEventsList(value: js.Array[typings.libraCore.eventsPbMod.Event.AsObject]): Self = StObject.set(x, "eventsList", value.asInstanceOf[js.Any])
      
      inline def setEventsListVarargs(value: typings.libraCore.eventsPbMod.Event.AsObject*): Self = StObject.set(x, "eventsList", js.Array(value*))
      
      inline def setGasUsed(value: String): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      inline def setSignedTxn(value: typings.libraCore.transactionPbMod.SignedTransaction.AsObject): Self = StObject.set(x, "signedTxn", value.asInstanceOf[js.Any])
      
      inline def setSignedTxnUndefined: Self = StObject.set(x, "signedTxn", js.undefined)
    }
  }
}
