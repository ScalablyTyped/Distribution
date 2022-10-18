package typings.libraCore.`lib@GeneratedTransactionPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock")
@js.native
open class SignedTransactionsBlock () extends Message {
  
  def addTransactions(): SignedTransaction = js.native
  def addTransactions(value: Unit, index: Double): SignedTransaction = js.native
  def addTransactions(value: SignedTransaction): SignedTransaction = js.native
  def addTransactions(value: SignedTransaction, index: Double): SignedTransaction = js.native
  
  def clearTransactionsList(): Unit = js.native
  
  def getTransactionsList(): js.Array[SignedTransaction] = js.native
  
  def getValidatorPublicKey(): js.typedarray.Uint8Array | String = js.native
  
  def getValidatorPublicKey_asB64(): String = js.native
  
  def getValidatorPublicKey_asU8(): js.typedarray.Uint8Array = js.native
  
  def getValidatorSignature(): js.typedarray.Uint8Array | String = js.native
  
  def getValidatorSignature_asB64(): String = js.native
  
  def getValidatorSignature_asU8(): js.typedarray.Uint8Array = js.native
  
  def setTransactionsList(value: js.Array[SignedTransaction]): Unit = js.native
  
  def setValidatorPublicKey(value: String): Unit = js.native
  def setValidatorPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setValidatorSignature(value: String): Unit = js.native
  def setValidatorSignature(value: js.typedarray.Uint8Array): Unit = js.native
}
/* static members */
object SignedTransactionsBlock {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): SignedTransactionsBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SignedTransactionsBlock]
  
  inline def deserializeBinaryFromReader(message: SignedTransactionsBlock, reader: BinaryReader): SignedTransactionsBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[SignedTransactionsBlock]
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: SignedTransactionsBlock, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: SignedTransactionsBlock): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var transactionsList: js.Array[typings.libraCore.`lib@GeneratedTransactionPbMod`.SignedTransaction.AsObject]
    
    var validatorPublicKey: js.typedarray.Uint8Array | String
    
    var validatorSignature: js.typedarray.Uint8Array | String
  }
  object AsObject {
    
    inline def apply(
      transactionsList: js.Array[typings.libraCore.`lib@GeneratedTransactionPbMod`.SignedTransaction.AsObject],
      validatorPublicKey: js.typedarray.Uint8Array | String,
      validatorSignature: js.typedarray.Uint8Array | String
    ): AsObject = {
      val __obj = js.Dynamic.literal(transactionsList = transactionsList.asInstanceOf[js.Any], validatorPublicKey = validatorPublicKey.asInstanceOf[js.Any], validatorSignature = validatorSignature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setTransactionsList(value: js.Array[typings.libraCore.`lib@GeneratedTransactionPbMod`.SignedTransaction.AsObject]): Self = StObject.set(x, "transactionsList", value.asInstanceOf[js.Any])
      
      inline def setTransactionsListVarargs(value: typings.libraCore.`lib@GeneratedTransactionPbMod`.SignedTransaction.AsObject*): Self = StObject.set(x, "transactionsList", js.Array(value*))
      
      inline def setValidatorPublicKey(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "validatorPublicKey", value.asInstanceOf[js.Any])
      
      inline def setValidatorSignature(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "validatorSignature", value.asInstanceOf[js.Any])
    }
  }
}
