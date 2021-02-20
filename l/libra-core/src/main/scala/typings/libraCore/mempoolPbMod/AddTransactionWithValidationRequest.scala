package typings.libraCore.mempoolPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.transactionPbMod.SignedTransaction
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationRequest")
@js.native
class AddTransactionWithValidationRequest () extends Message {
  
  def clearSignedTxn(): Unit = js.native
  
  def getAccountBalance(): String = js.native
  
  def getLatestSequenceNumber(): String = js.native
  
  def getMaxGasCost(): String = js.native
  
  def getSignedTxn(): js.UndefOr[SignedTransaction] = js.native
  
  def hasSignedTxn(): Boolean = js.native
  
  def setAccountBalance(value: String): Unit = js.native
  
  def setLatestSequenceNumber(value: String): Unit = js.native
  
  def setMaxGasCost(value: String): Unit = js.native
  
  def setSignedTxn(): Unit = js.native
  def setSignedTxn(value: SignedTransaction): Unit = js.native
}
/* static members */
object AddTransactionWithValidationRequest {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationRequest.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): AddTransactionWithValidationRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationRequest.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: AddTransactionWithValidationRequest, reader: BinaryReader): AddTransactionWithValidationRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationRequest.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationRequest.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationRequest.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: AddTransactionWithValidationRequest, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationRequest.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: AddTransactionWithValidationRequest): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var accountBalance: String = js.native
    
    var latestSequenceNumber: String = js.native
    
    var maxGasCost: String = js.native
    
    var signedTxn: js.UndefOr[typings.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(accountBalance: String, latestSequenceNumber: String, maxGasCost: String): AsObject = {
      val __obj = js.Dynamic.literal(accountBalance = accountBalance.asInstanceOf[js.Any], latestSequenceNumber = latestSequenceNumber.asInstanceOf[js.Any], maxGasCost = maxGasCost.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountBalance(value: String): Self = StObject.set(x, "accountBalance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestSequenceNumber(value: String): Self = StObject.set(x, "latestSequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxGasCost(value: String): Self = StObject.set(x, "maxGasCost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedTxn(value: typings.libraCore.transactionPbMod.SignedTransaction.AsObject): Self = StObject.set(x, "signedTxn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedTxnUndefined: Self = StObject.set(x, "signedTxn", js.undefined)
    }
  }
}
