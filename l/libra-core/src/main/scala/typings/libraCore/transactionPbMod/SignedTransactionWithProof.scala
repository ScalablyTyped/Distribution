package typings.libraCore.transactionPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.eventsPbMod.EventsList
import typings.libraCore.proofPbMod.SignedTransactionProof
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof")
@js.native
class SignedTransactionWithProof () extends Message {
  
  def clearEvents(): Unit = js.native
  
  def clearProof(): Unit = js.native
  
  def clearSignedTransaction(): Unit = js.native
  
  def getEvents(): js.UndefOr[EventsList] = js.native
  
  def getProof(): js.UndefOr[SignedTransactionProof] = js.native
  
  def getSignedTransaction(): js.UndefOr[SignedTransaction] = js.native
  
  def getVersion(): String = js.native
  
  def hasEvents(): Boolean = js.native
  
  def hasProof(): Boolean = js.native
  
  def hasSignedTransaction(): Boolean = js.native
  
  def setEvents(): Unit = js.native
  def setEvents(value: EventsList): Unit = js.native
  
  def setProof(): Unit = js.native
  def setProof(value: SignedTransactionProof): Unit = js.native
  
  def setSignedTransaction(): Unit = js.native
  def setSignedTransaction(value: SignedTransaction): Unit = js.native
  
  def setVersion(value: String): Unit = js.native
}
/* static members */
object SignedTransactionWithProof {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): SignedTransactionWithProof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SignedTransactionWithProof]
  
  @scala.inline
  def deserializeBinaryFromReader(message: SignedTransactionWithProof, reader: BinaryReader): SignedTransactionWithProof = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[SignedTransactionWithProof]
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serializeBinaryToWriter(message: SignedTransactionWithProof, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: SignedTransactionWithProof): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var events: js.UndefOr[typings.libraCore.eventsPbMod.EventsList.AsObject] = js.undefined
    
    var proof: js.UndefOr[typings.libraCore.proofPbMod.SignedTransactionProof.AsObject] = js.undefined
    
    var signedTransaction: js.UndefOr[typings.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.undefined
    
    var version: String
  }
  object AsObject {
    
    @scala.inline
    def apply(version: String): AsObject = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: typings.libraCore.eventsPbMod.EventsList.AsObject): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setProof(value: typings.libraCore.proofPbMod.SignedTransactionProof.AsObject): Self = StObject.set(x, "proof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProofUndefined: Self = StObject.set(x, "proof", js.undefined)
      
      @scala.inline
      def setSignedTransaction(value: typings.libraCore.transactionPbMod.SignedTransaction.AsObject): Self = StObject.set(x, "signedTransaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedTransactionUndefined: Self = StObject.set(x, "signedTransaction", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
