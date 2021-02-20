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

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest")
@js.native
class GetTransactionsRequest () extends Message {
  
  def getFetchEvents(): Boolean = js.native
  
  def getLimit(): String = js.native
  
  def getStartVersion(): String = js.native
  
  def setFetchEvents(value: Boolean): Unit = js.native
  
  def setLimit(value: String): Unit = js.native
  
  def setStartVersion(value: String): Unit = js.native
}
/* static members */
object GetTransactionsRequest {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): GetTransactionsRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: GetTransactionsRequest, reader: BinaryReader): GetTransactionsRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: GetTransactionsRequest, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: GetTransactionsRequest): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var fetchEvents: Boolean = js.native
    
    var limit: String = js.native
    
    var startVersion: String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(fetchEvents: Boolean, limit: String, startVersion: String): AsObject = {
      val __obj = js.Dynamic.literal(fetchEvents = fetchEvents.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], startVersion = startVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchEvents(value: Boolean): Self = StObject.set(x, "fetchEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartVersion(value: String): Self = StObject.set(x, "startVersion", value.asInstanceOf[js.Any])
    }
  }
}
