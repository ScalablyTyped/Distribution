package typings.libraCore.getWithProofPbMod

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

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerRequest")
@js.native
class UpdateToLatestLedgerRequest () extends Message {
  
  def addRequestedItems(): RequestItem = js.native
  def addRequestedItems(value: js.UndefOr[scala.Nothing], index: Double): RequestItem = js.native
  def addRequestedItems(value: RequestItem): RequestItem = js.native
  def addRequestedItems(value: RequestItem, index: Double): RequestItem = js.native
  
  def clearRequestedItemsList(): Unit = js.native
  
  def getClientKnownVersion(): String = js.native
  
  def getRequestedItemsList(): js.Array[RequestItem] = js.native
  
  def setClientKnownVersion(value: String): Unit = js.native
  
  def setRequestedItemsList(value: js.Array[RequestItem]): Unit = js.native
}
/* static members */
object UpdateToLatestLedgerRequest {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerRequest.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): UpdateToLatestLedgerRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerRequest.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: UpdateToLatestLedgerRequest, reader: BinaryReader): UpdateToLatestLedgerRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerRequest.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerRequest.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerRequest.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: UpdateToLatestLedgerRequest, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerRequest.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: UpdateToLatestLedgerRequest): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var clientKnownVersion: String = js.native
    
    var requestedItemsList: js.Array[typings.libraCore.getWithProofPbMod.RequestItem.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      clientKnownVersion: String,
      requestedItemsList: js.Array[typings.libraCore.getWithProofPbMod.RequestItem.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(clientKnownVersion = clientKnownVersion.asInstanceOf[js.Any], requestedItemsList = requestedItemsList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientKnownVersion(value: String): Self = StObject.set(x, "clientKnownVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestedItemsList(value: js.Array[typings.libraCore.getWithProofPbMod.RequestItem.AsObject]): Self = StObject.set(x, "requestedItemsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestedItemsListVarargs(value: typings.libraCore.getWithProofPbMod.RequestItem.AsObject*): Self = StObject.set(x, "requestedItemsList", js.Array(value :_*))
    }
  }
}
