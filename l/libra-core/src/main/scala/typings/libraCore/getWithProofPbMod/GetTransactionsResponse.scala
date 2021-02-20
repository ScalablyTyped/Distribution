package typings.libraCore.getWithProofPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.transactionPbMod.TransactionListWithProof
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsResponse")
@js.native
class GetTransactionsResponse () extends Message {
  
  def clearTxnListWithProof(): Unit = js.native
  
  def getTxnListWithProof(): js.UndefOr[TransactionListWithProof] = js.native
  
  def hasTxnListWithProof(): Boolean = js.native
  
  def setTxnListWithProof(): Unit = js.native
  def setTxnListWithProof(value: TransactionListWithProof): Unit = js.native
}
/* static members */
object GetTransactionsResponse {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsResponse.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): GetTransactionsResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsResponse.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: GetTransactionsResponse, reader: BinaryReader): GetTransactionsResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsResponse.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: GetTransactionsResponse, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsResponse.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: GetTransactionsResponse): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var txnListWithProof: js.UndefOr[typings.libraCore.transactionPbMod.TransactionListWithProof.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(): AsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTxnListWithProof(value: typings.libraCore.transactionPbMod.TransactionListWithProof.AsObject): Self = StObject.set(x, "txnListWithProof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxnListWithProofUndefined: Self = StObject.set(x, "txnListWithProof", js.undefined)
    }
  }
}
