package typings.libraCore.getWithProofPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.accessPathPbMod.AccessPath
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest")
@js.native
class GetEventsByEventAccessPathRequest () extends Message {
  
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
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): GetEventsByEventAccessPathRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: GetEventsByEventAccessPathRequest, reader: BinaryReader): GetEventsByEventAccessPathRequest = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: GetEventsByEventAccessPathRequest, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: GetEventsByEventAccessPathRequest): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var accessPath: js.UndefOr[typings.libraCore.accessPathPbMod.AccessPath.AsObject] = js.native
    
    var ascending: Boolean = js.native
    
    var limit: String = js.native
    
    var startEventSeqNum: String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(ascending: Boolean, limit: String, startEventSeqNum: String): AsObject = {
      val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], startEventSeqNum = startEventSeqNum.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPath(value: typings.libraCore.accessPathPbMod.AccessPath.AsObject): Self = StObject.set(x, "accessPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessPathUndefined: Self = StObject.set(x, "accessPath", js.undefined)
      
      @scala.inline
      def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEventSeqNum(value: String): Self = StObject.set(x, "startEventSeqNum", value.asInstanceOf[js.Any])
    }
  }
}
