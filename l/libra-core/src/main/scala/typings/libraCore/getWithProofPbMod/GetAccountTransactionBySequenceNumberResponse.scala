package typings.libraCore.getWithProofPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.accountStateBlobPbMod.AccountStateWithProof
import typings.libraCore.transactionPbMod.SignedTransactionWithProof
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse")
@js.native
class GetAccountTransactionBySequenceNumberResponse () extends Message {
  
  def clearProofOfCurrentSequenceNumber(): Unit = js.native
  
  def clearSignedTransactionWithProof(): Unit = js.native
  
  def getProofOfCurrentSequenceNumber(): js.UndefOr[AccountStateWithProof] = js.native
  
  def getSignedTransactionWithProof(): js.UndefOr[SignedTransactionWithProof] = js.native
  
  def hasProofOfCurrentSequenceNumber(): Boolean = js.native
  
  def hasSignedTransactionWithProof(): Boolean = js.native
  
  def setProofOfCurrentSequenceNumber(): Unit = js.native
  def setProofOfCurrentSequenceNumber(value: AccountStateWithProof): Unit = js.native
  
  def setSignedTransactionWithProof(): Unit = js.native
  def setSignedTransactionWithProof(value: SignedTransactionWithProof): Unit = js.native
}
/* static members */
object GetAccountTransactionBySequenceNumberResponse {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): GetAccountTransactionBySequenceNumberResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: GetAccountTransactionBySequenceNumberResponse, reader: BinaryReader): GetAccountTransactionBySequenceNumberResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: GetAccountTransactionBySequenceNumberResponse, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: GetAccountTransactionBySequenceNumberResponse): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var proofOfCurrentSequenceNumber: js.UndefOr[typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject] = js.native
    
    var signedTransactionWithProof: js.UndefOr[typings.libraCore.transactionPbMod.SignedTransactionWithProof.AsObject] = js.native
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
      def setProofOfCurrentSequenceNumber(value: typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject): Self = StObject.set(x, "proofOfCurrentSequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProofOfCurrentSequenceNumberUndefined: Self = StObject.set(x, "proofOfCurrentSequenceNumber", js.undefined)
      
      @scala.inline
      def setSignedTransactionWithProof(value: typings.libraCore.transactionPbMod.SignedTransactionWithProof.AsObject): Self = StObject.set(x, "signedTransactionWithProof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedTransactionWithProofUndefined: Self = StObject.set(x, "signedTransactionWithProof", js.undefined)
    }
  }
}
