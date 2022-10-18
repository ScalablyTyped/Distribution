package typings.libraCore.`lib@GeneratedGetWithProofPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.`lib@GeneratedAccessPathPbMod`.AccessPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest")
@js.native
open class GetEventsByEventAccessPathRequest () extends Message {
  
  def clearAccessPath(): Unit = js.native
  
  def getAccessPath(): js.UndefOr[AccessPath] = js.native
  
  def getAscending(): Boolean = js.native
  
  def getLimit(): String = js.native
  
  def getStartEventSeqNum(): String = js.native
  
  def hasAccessPath(): Boolean = js.native
  
  def setAccessPath(): Unit = js.native
  def setAccessPath(value: AccessPath): Unit = js.native
  
  def setAscending(value: Boolean): Unit = js.native
  
  def setLimit(value: String): Unit = js.native
  
  def setStartEventSeqNum(value: String): Unit = js.native
}
/* static members */
object GetEventsByEventAccessPathRequest {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): GetEventsByEventAccessPathRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[GetEventsByEventAccessPathRequest]
  
  inline def deserializeBinaryFromReader(message: GetEventsByEventAccessPathRequest, reader: BinaryReader): GetEventsByEventAccessPathRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[GetEventsByEventAccessPathRequest]
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: GetEventsByEventAccessPathRequest, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: GetEventsByEventAccessPathRequest): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var accessPath: js.UndefOr[typings.libraCore.`lib@GeneratedAccessPathPbMod`.AccessPath.AsObject] = js.undefined
    
    var ascending: Boolean
    
    var limit: String
    
    var startEventSeqNum: String
  }
  object AsObject {
    
    inline def apply(ascending: Boolean, limit: String, startEventSeqNum: String): AsObject = {
      val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], startEventSeqNum = startEventSeqNum.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setAccessPath(value: typings.libraCore.`lib@GeneratedAccessPathPbMod`.AccessPath.AsObject): Self = StObject.set(x, "accessPath", value.asInstanceOf[js.Any])
      
      inline def setAccessPathUndefined: Self = StObject.set(x, "accessPath", js.undefined)
      
      inline def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setStartEventSeqNum(value: String): Self = StObject.set(x, "startEventSeqNum", value.asInstanceOf[js.Any])
    }
  }
}
