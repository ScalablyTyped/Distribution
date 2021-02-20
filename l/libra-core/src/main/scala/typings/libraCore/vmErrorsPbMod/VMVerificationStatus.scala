package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.languageStoragePbMod.ModuleId
import typings.libraCore.vmErrorsPbMod.VMVerificationStatus.StatusKind
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus")
@js.native
class VMVerificationStatus () extends Message {
  
  def clearDependencyId(): Unit = js.native
  
  def getDependencyId(): js.UndefOr[ModuleId] = js.native
  
  def getErrorKind(): VMVerificationErrorKind = js.native
  
  def getMessage(): String = js.native
  
  def getModuleIdx(): Double = js.native
  
  def getStatusKind(): StatusKind = js.native
  
  def hasDependencyId(): Boolean = js.native
  
  def setDependencyId(): Unit = js.native
  def setDependencyId(value: ModuleId): Unit = js.native
  
  def setErrorKind(value: VMVerificationErrorKind): Unit = js.native
  
  def setMessage(value: String): Unit = js.native
  
  def setModuleIdx(value: Double): Unit = js.native
  
  def setStatusKind(value: StatusKind): Unit = js.native
}
/* static members */
object VMVerificationStatus {
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait StatusKind extends StObject
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus.StatusKind")
  @js.native
  object StatusKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StatusKind with Double] = js.native
    
    @js.native
    sealed trait DEPENDENCY extends StatusKind
    /* 2 */ val DEPENDENCY: typings.libraCore.vmErrorsPbMod.VMVerificationStatus.StatusKind.DEPENDENCY with Double = js.native
    
    @js.native
    sealed trait MODULE extends StatusKind
    /* 1 */ val MODULE: typings.libraCore.vmErrorsPbMod.VMVerificationStatus.StatusKind.MODULE with Double = js.native
    
    @js.native
    sealed trait SCRIPT extends StatusKind
    /* 0 */ val SCRIPT: typings.libraCore.vmErrorsPbMod.VMVerificationStatus.StatusKind.SCRIPT with Double = js.native
  }
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): VMVerificationStatus = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: VMVerificationStatus, reader: BinaryReader): VMVerificationStatus = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: VMVerificationStatus, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: VMVerificationStatus): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var dependencyId: js.UndefOr[typings.libraCore.languageStoragePbMod.ModuleId.AsObject] = js.native
    
    var errorKind: VMVerificationErrorKind = js.native
    
    var message: String = js.native
    
    var moduleIdx: Double = js.native
    
    var statusKind: StatusKind = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(errorKind: VMVerificationErrorKind, message: String, moduleIdx: Double, statusKind: StatusKind): AsObject = {
      val __obj = js.Dynamic.literal(errorKind = errorKind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], moduleIdx = moduleIdx.asInstanceOf[js.Any], statusKind = statusKind.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencyId(value: typings.libraCore.languageStoragePbMod.ModuleId.AsObject): Self = StObject.set(x, "dependencyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependencyIdUndefined: Self = StObject.set(x, "dependencyId", js.undefined)
      
      @scala.inline
      def setErrorKind(value: VMVerificationErrorKind): Self = StObject.set(x, "errorKind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleIdx(value: Double): Self = StObject.set(x, "moduleIdx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusKind(value: StatusKind): Self = StObject.set(x, "statusKind", value.asInstanceOf[js.Any])
    }
  }
}
