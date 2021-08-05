package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatusList")
@js.native
class VMVerificationStatusList () extends Message {
  
  def addStatusList(): VMVerificationStatus = js.native
  def addStatusList(value: Unit, index: Double): VMVerificationStatus = js.native
  def addStatusList(value: VMVerificationStatus): VMVerificationStatus = js.native
  def addStatusList(value: VMVerificationStatus, index: Double): VMVerificationStatus = js.native
  
  def clearStatusListList(): Unit = js.native
  
  def getStatusListList(): js.Array[VMVerificationStatus] = js.native
  
  def setStatusListList(value: js.Array[VMVerificationStatus]): Unit = js.native
}
/* static members */
object VMVerificationStatusList {
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatusList")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: Uint8Array): VMVerificationStatusList = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[VMVerificationStatusList]
  
  inline def deserializeBinaryFromReader(message: VMVerificationStatusList, reader: BinaryReader): VMVerificationStatusList = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[VMVerificationStatusList]
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatusList.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatusList.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: VMVerificationStatusList, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: VMVerificationStatusList): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var statusListList: js.Array[typings.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject]
  }
  object AsObject {
    
    inline def apply(statusListList: js.Array[typings.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject]): AsObject = {
      val __obj = js.Dynamic.literal(statusListList = statusListList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setStatusListList(value: js.Array[typings.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject]): Self = StObject.set(x, "statusListList", value.asInstanceOf[js.Any])
      
      inline def setStatusListListVarargs(value: typings.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject*): Self = StObject.set(x, "statusListList", js.Array(value :_*))
    }
  }
}
