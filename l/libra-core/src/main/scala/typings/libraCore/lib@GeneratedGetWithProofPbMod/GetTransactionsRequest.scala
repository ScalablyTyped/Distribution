package typings.libraCore.`lib@GeneratedGetWithProofPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest")
@js.native
open class GetTransactionsRequest () extends Message {
  
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
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): GetTransactionsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[GetTransactionsRequest]
  
  inline def deserializeBinaryFromReader(message: GetTransactionsRequest, reader: BinaryReader): GetTransactionsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[GetTransactionsRequest]
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsRequest.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: GetTransactionsRequest, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: GetTransactionsRequest): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var fetchEvents: Boolean
    
    var limit: String
    
    var startVersion: String
  }
  object AsObject {
    
    inline def apply(fetchEvents: Boolean, limit: String, startVersion: String): AsObject = {
      val __obj = js.Dynamic.literal(fetchEvents = fetchEvents.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], startVersion = startVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      inline def setFetchEvents(value: Boolean): Self = StObject.set(x, "fetchEvents", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setStartVersion(value: String): Self = StObject.set(x, "startVersion", value.asInstanceOf[js.Any])
    }
  }
}
