package typings.libraCore.transactionPbMod

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

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock")
@js.native
class SignedTransactionsBlock () extends Message {
  
  def addTransactions(): SignedTransaction = js.native
  def addTransactions(value: js.UndefOr[scala.Nothing], index: Double): SignedTransaction = js.native
  def addTransactions(value: SignedTransaction): SignedTransaction = js.native
  def addTransactions(value: SignedTransaction, index: Double): SignedTransaction = js.native
  
  def clearTransactionsList(): Unit = js.native
  
  def getTransactionsList(): js.Array[SignedTransaction] = js.native
  
  def getValidatorPublicKey(): Uint8Array | String = js.native
  
  def getValidatorPublicKey_asB64(): String = js.native
  
  def getValidatorPublicKey_asU8(): Uint8Array = js.native
  
  def getValidatorSignature(): Uint8Array | String = js.native
  
  def getValidatorSignature_asB64(): String = js.native
  
  def getValidatorSignature_asU8(): Uint8Array = js.native
  
  def setTransactionsList(value: js.Array[SignedTransaction]): Unit = js.native
  
  def setValidatorPublicKey(value: String): Unit = js.native
  def setValidatorPublicKey(value: Uint8Array): Unit = js.native
  
  def setValidatorSignature(value: String): Unit = js.native
  def setValidatorSignature(value: Uint8Array): Unit = js.native
}
/* static members */
object SignedTransactionsBlock {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): SignedTransactionsBlock = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: SignedTransactionsBlock, reader: BinaryReader): SignedTransactionsBlock = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: SignedTransactionsBlock, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: SignedTransactionsBlock): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var transactionsList: js.Array[typings.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
    
    var validatorPublicKey: Uint8Array | String = js.native
    
    var validatorSignature: Uint8Array | String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      transactionsList: js.Array[typings.libraCore.transactionPbMod.SignedTransaction.AsObject],
      validatorPublicKey: Uint8Array | String,
      validatorSignature: Uint8Array | String
    ): AsObject = {
      val __obj = js.Dynamic.literal(transactionsList = transactionsList.asInstanceOf[js.Any], validatorPublicKey = validatorPublicKey.asInstanceOf[js.Any], validatorSignature = validatorSignature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransactionsList(value: js.Array[typings.libraCore.transactionPbMod.SignedTransaction.AsObject]): Self = StObject.set(x, "transactionsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsListVarargs(value: typings.libraCore.transactionPbMod.SignedTransaction.AsObject*): Self = StObject.set(x, "transactionsList", js.Array(value :_*))
      
      @scala.inline
      def setValidatorPublicKey(value: Uint8Array | String): Self = StObject.set(x, "validatorPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorSignature(value: Uint8Array | String): Self = StObject.set(x, "validatorSignature", value.asInstanceOf[js.Any])
    }
  }
}
