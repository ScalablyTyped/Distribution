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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatusList")
@js.native
class VMVerificationStatusList () extends Message {
  
  def addStatusList(): VMVerificationStatus = js.native
  def addStatusList(value: js.UndefOr[scala.Nothing], index: Double): VMVerificationStatus = js.native
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
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatusList.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): VMVerificationStatusList = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatusList.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: VMVerificationStatusList, reader: BinaryReader): VMVerificationStatusList = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatusList.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatusList.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatusList.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: VMVerificationStatusList, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatusList.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: VMVerificationStatusList): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var statusListList: js.Array[typings.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(statusListList: js.Array[typings.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject]): AsObject = {
      val __obj = js.Dynamic.literal(statusListList = statusListList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatusListList(value: js.Array[typings.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject]): Self = StObject.set(x, "statusListList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusListListVarargs(value: typings.libraCore.vmErrorsPbMod.VMVerificationStatus.AsObject*): Self = StObject.set(x, "statusListList", js.Array(value :_*))
    }
  }
}
