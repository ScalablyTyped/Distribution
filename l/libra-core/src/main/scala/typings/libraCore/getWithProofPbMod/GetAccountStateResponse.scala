package typings.libraCore.getWithProofPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.accountStateBlobPbMod.AccountStateWithProof
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountStateResponse")
@js.native
class GetAccountStateResponse () extends Message {
  
  def clearAccountStateWithProof(): Unit = js.native
  
  def getAccountStateWithProof(): js.UndefOr[AccountStateWithProof] = js.native
  
  def hasAccountStateWithProof(): Boolean = js.native
  
  def setAccountStateWithProof(): Unit = js.native
  def setAccountStateWithProof(value: AccountStateWithProof): Unit = js.native
}
/* static members */
object GetAccountStateResponse {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountStateResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountStateResponse.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): GetAccountStateResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountStateResponse.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: GetAccountStateResponse, reader: BinaryReader): GetAccountStateResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountStateResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountStateResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountStateResponse.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: GetAccountStateResponse, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountStateResponse.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: GetAccountStateResponse): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var accountStateWithProof: js.UndefOr[typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject] = js.native
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
      def setAccountStateWithProof(value: typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject): Self = StObject.set(x, "accountStateWithProof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountStateWithProofUndefined: Self = StObject.set(x, "accountStateWithProof", js.undefined)
    }
  }
}
