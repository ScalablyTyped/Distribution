package typings.libraCore.transactionPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.transactionPbMod.RawTransaction.PayloadCase
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "RawTransaction")
@js.native
class RawTransaction () extends Message {
  
  def clearProgram(): Unit = js.native
  
  def clearWriteSet(): Unit = js.native
  
  def getExpirationTime(): String = js.native
  
  def getGasUnitPrice(): String = js.native
  
  def getMaxGasAmount(): String = js.native
  
  def getPayloadCase(): PayloadCase = js.native
  
  def getProgram(): js.UndefOr[Program] = js.native
  
  def getSenderAccount(): Uint8Array | String = js.native
  
  def getSenderAccount_asB64(): String = js.native
  
  def getSenderAccount_asU8(): Uint8Array = js.native
  
  def getSequenceNumber(): String = js.native
  
  def getWriteSet(): js.UndefOr[WriteSet] = js.native
  
  def hasProgram(): Boolean = js.native
  
  def hasWriteSet(): Boolean = js.native
  
  def setExpirationTime(value: String): Unit = js.native
  
  def setGasUnitPrice(value: String): Unit = js.native
  
  def setMaxGasAmount(value: String): Unit = js.native
  
  def setProgram(): Unit = js.native
  def setProgram(value: Program): Unit = js.native
  
  def setSenderAccount(value: String): Unit = js.native
  def setSenderAccount(value: Uint8Array): Unit = js.native
  
  def setSequenceNumber(value: String): Unit = js.native
  
  def setWriteSet(): Unit = js.native
  def setWriteSet(value: WriteSet): Unit = js.native
}
/* static members */
object RawTransaction {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "RawTransaction")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait PayloadCase extends StObject
  @JSImport("libra-core/lib/@/generated/transaction_pb", "RawTransaction.PayloadCase")
  @js.native
  object PayloadCase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PayloadCase & Double] = js.native
    
    @js.native
    sealed trait PAYLOAD_NOT_SET
      extends StObject
         with PayloadCase
    /* 0 */ val PAYLOAD_NOT_SET: typings.libraCore.transactionPbMod.RawTransaction.PayloadCase.PAYLOAD_NOT_SET & Double = js.native
    
    @js.native
    sealed trait PROGRAM
      extends StObject
         with PayloadCase
    /* 3 */ val PROGRAM: typings.libraCore.transactionPbMod.RawTransaction.PayloadCase.PROGRAM & Double = js.native
    
    @js.native
    sealed trait WRITE_SET
      extends StObject
         with PayloadCase
    /* 4 */ val WRITE_SET: typings.libraCore.transactionPbMod.RawTransaction.PayloadCase.WRITE_SET & Double = js.native
  }
  
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): RawTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[RawTransaction]
  
  @scala.inline
  def deserializeBinaryFromReader(message: RawTransaction, reader: BinaryReader): RawTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[RawTransaction]
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "RawTransaction.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "RawTransaction.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serializeBinaryToWriter(message: RawTransaction, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: RawTransaction): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var expirationTime: String
    
    var gasUnitPrice: String
    
    var maxGasAmount: String
    
    var program: js.UndefOr[typings.libraCore.transactionPbMod.Program.AsObject] = js.undefined
    
    var senderAccount: Uint8Array | String
    
    var sequenceNumber: String
    
    var writeSet: js.UndefOr[typings.libraCore.transactionPbMod.WriteSet.AsObject] = js.undefined
  }
  object AsObject {
    
    @scala.inline
    def apply(
      expirationTime: String,
      gasUnitPrice: String,
      maxGasAmount: String,
      senderAccount: Uint8Array | String,
      sequenceNumber: String
    ): AsObject = {
      val __obj = js.Dynamic.literal(expirationTime = expirationTime.asInstanceOf[js.Any], gasUnitPrice = gasUnitPrice.asInstanceOf[js.Any], maxGasAmount = maxGasAmount.asInstanceOf[js.Any], senderAccount = senderAccount.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasUnitPrice(value: String): Self = StObject.set(x, "gasUnitPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxGasAmount(value: String): Self = StObject.set(x, "maxGasAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgram(value: typings.libraCore.transactionPbMod.Program.AsObject): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      @scala.inline
      def setSenderAccount(value: Uint8Array | String): Self = StObject.set(x, "senderAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteSet(value: typings.libraCore.transactionPbMod.WriteSet.AsObject): Self = StObject.set(x, "writeSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteSetUndefined: Self = StObject.set(x, "writeSet", js.undefined)
    }
  }
}
