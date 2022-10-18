package typings.libraCore.`lib@GeneratedTransactionPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.`lib@GeneratedTransactionPbMod`.RawTransaction.PayloadCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "RawTransaction")
@js.native
open class RawTransaction () extends Message {
  
  def clearProgram(): Unit = js.native
  
  def clearWriteSet(): Unit = js.native
  
  def getExpirationTime(): String = js.native
  
  def getGasUnitPrice(): String = js.native
  
  def getMaxGasAmount(): String = js.native
  
  def getPayloadCase(): PayloadCase = js.native
  
  def getProgram(): js.UndefOr[Program] = js.native
  
  def getSenderAccount(): js.typedarray.Uint8Array | String = js.native
  
  def getSenderAccount_asB64(): String = js.native
  
  def getSenderAccount_asU8(): js.typedarray.Uint8Array = js.native
  
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
  def setSenderAccount(value: js.typedarray.Uint8Array): Unit = js.native
  
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
    /* 0 */ val PAYLOAD_NOT_SET: typings.libraCore.`lib@GeneratedTransactionPbMod`.RawTransaction.PayloadCase.PAYLOAD_NOT_SET & Double = js.native
    
    @js.native
    sealed trait PROGRAM
      extends StObject
         with PayloadCase
    /* 3 */ val PROGRAM: typings.libraCore.`lib@GeneratedTransactionPbMod`.RawTransaction.PayloadCase.PROGRAM & Double = js.native
    
    @js.native
    sealed trait WRITE_SET
      extends StObject
         with PayloadCase
    /* 4 */ val WRITE_SET: typings.libraCore.`lib@GeneratedTransactionPbMod`.RawTransaction.PayloadCase.WRITE_SET & Double = js.native
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): RawTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[RawTransaction]
  
  inline def deserializeBinaryFromReader(message: RawTransaction, reader: BinaryReader): RawTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[RawTransaction]
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "RawTransaction.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "RawTransaction.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: RawTransaction, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: RawTransaction): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var expirationTime: String
    
    var gasUnitPrice: String
    
    var maxGasAmount: String
    
    var program: js.UndefOr[typings.libraCore.`lib@GeneratedTransactionPbMod`.Program.AsObject] = js.undefined
    
    var senderAccount: js.typedarray.Uint8Array | String
    
    var sequenceNumber: String
    
    var writeSet: js.UndefOr[typings.libraCore.`lib@GeneratedTransactionPbMod`.WriteSet.AsObject] = js.undefined
  }
  object AsObject {
    
    inline def apply(
      expirationTime: String,
      gasUnitPrice: String,
      maxGasAmount: String,
      senderAccount: js.typedarray.Uint8Array | String,
      sequenceNumber: String
    ): AsObject = {
      val __obj = js.Dynamic.literal(expirationTime = expirationTime.asInstanceOf[js.Any], gasUnitPrice = gasUnitPrice.asInstanceOf[js.Any], maxGasAmount = maxGasAmount.asInstanceOf[js.Any], senderAccount = senderAccount.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
      
      inline def setGasUnitPrice(value: String): Self = StObject.set(x, "gasUnitPrice", value.asInstanceOf[js.Any])
      
      inline def setMaxGasAmount(value: String): Self = StObject.set(x, "maxGasAmount", value.asInstanceOf[js.Any])
      
      inline def setProgram(value: typings.libraCore.`lib@GeneratedTransactionPbMod`.Program.AsObject): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      inline def setSenderAccount(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "senderAccount", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setWriteSet(value: typings.libraCore.`lib@GeneratedTransactionPbMod`.WriteSet.AsObject): Self = StObject.set(x, "writeSet", value.asInstanceOf[js.Any])
      
      inline def setWriteSetUndefined: Self = StObject.set(x, "writeSet", js.undefined)
    }
  }
}
