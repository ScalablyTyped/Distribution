package typings.libraCore.`lib@GeneratedVmErrorsPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.`lib@GeneratedLanguageStoragePbMod`.ModuleId
import typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMVerificationStatus.StatusKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus")
@js.native
open class VMVerificationStatus () extends Message {
  
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
    def apply(value: Double): js.UndefOr[StatusKind & Double] = js.native
    
    @js.native
    sealed trait DEPENDENCY
      extends StObject
         with StatusKind
    /* 2 */ val DEPENDENCY: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMVerificationStatus.StatusKind.DEPENDENCY & Double = js.native
    
    @js.native
    sealed trait MODULE
      extends StObject
         with StatusKind
    /* 1 */ val MODULE: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMVerificationStatus.StatusKind.MODULE & Double = js.native
    
    @js.native
    sealed trait SCRIPT
      extends StObject
         with StatusKind
    /* 0 */ val SCRIPT: typings.libraCore.`lib@GeneratedVmErrorsPbMod`.VMVerificationStatus.StatusKind.SCRIPT & Double = js.native
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): VMVerificationStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[VMVerificationStatus]
  
  inline def deserializeBinaryFromReader(message: VMVerificationStatus, reader: BinaryReader): VMVerificationStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[VMVerificationStatus]
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatus.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: VMVerificationStatus, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: VMVerificationStatus): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var dependencyId: js.UndefOr[typings.libraCore.`lib@GeneratedLanguageStoragePbMod`.ModuleId.AsObject] = js.undefined
    
    var errorKind: VMVerificationErrorKind
    
    var message: String
    
    var moduleIdx: Double
    
    var statusKind: StatusKind
  }
  object AsObject {
    
    inline def apply(errorKind: VMVerificationErrorKind, message: String, moduleIdx: Double, statusKind: StatusKind): AsObject = {
      val __obj = js.Dynamic.literal(errorKind = errorKind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], moduleIdx = moduleIdx.asInstanceOf[js.Any], statusKind = statusKind.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setDependencyId(value: typings.libraCore.`lib@GeneratedLanguageStoragePbMod`.ModuleId.AsObject): Self = StObject.set(x, "dependencyId", value.asInstanceOf[js.Any])
      
      inline def setDependencyIdUndefined: Self = StObject.set(x, "dependencyId", js.undefined)
      
      inline def setErrorKind(value: VMVerificationErrorKind): Self = StObject.set(x, "errorKind", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setModuleIdx(value: Double): Self = StObject.set(x, "moduleIdx", value.asInstanceOf[js.Any])
      
      inline def setStatusKind(value: StatusKind): Self = StObject.set(x, "statusKind", value.asInstanceOf[js.Any])
    }
  }
}
