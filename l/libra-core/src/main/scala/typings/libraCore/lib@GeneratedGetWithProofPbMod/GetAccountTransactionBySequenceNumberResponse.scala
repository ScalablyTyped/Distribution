package typings.libraCore.`lib@GeneratedGetWithProofPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.`lib@GeneratedAccountStateBlobPbMod`.AccountStateWithProof
import typings.libraCore.`lib@GeneratedTransactionPbMod`.SignedTransactionWithProof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse")
@js.native
open class GetAccountTransactionBySequenceNumberResponse () extends Message {
  
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
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): GetAccountTransactionBySequenceNumberResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[GetAccountTransactionBySequenceNumberResponse]
  
  inline def deserializeBinaryFromReader(message: GetAccountTransactionBySequenceNumberResponse, reader: BinaryReader): GetAccountTransactionBySequenceNumberResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[GetAccountTransactionBySequenceNumberResponse]
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: GetAccountTransactionBySequenceNumberResponse, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: GetAccountTransactionBySequenceNumberResponse): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var proofOfCurrentSequenceNumber: js.UndefOr[
        typings.libraCore.`lib@GeneratedAccountStateBlobPbMod`.AccountStateWithProof.AsObject
      ] = js.undefined
    
    var signedTransactionWithProof: js.UndefOr[
        typings.libraCore.`lib@GeneratedTransactionPbMod`.SignedTransactionWithProof.AsObject
      ] = js.undefined
  }
  object AsObject {
    
    inline def apply(): AsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setProofOfCurrentSequenceNumber(value: typings.libraCore.`lib@GeneratedAccountStateBlobPbMod`.AccountStateWithProof.AsObject): Self = StObject.set(x, "proofOfCurrentSequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setProofOfCurrentSequenceNumberUndefined: Self = StObject.set(x, "proofOfCurrentSequenceNumber", js.undefined)
      
      inline def setSignedTransactionWithProof(value: typings.libraCore.`lib@GeneratedTransactionPbMod`.SignedTransactionWithProof.AsObject): Self = StObject.set(x, "signedTransactionWithProof", value.asInstanceOf[js.Any])
      
      inline def setSignedTransactionWithProofUndefined: Self = StObject.set(x, "signedTransactionWithProof", js.undefined)
    }
  }
}
