package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError")
@js.native
open class DynamicReferenceError () extends Message {
  
  def getErrorCode(): DynamicReferenceErrorType = js.native
  
  def setErrorCode(value: DynamicReferenceErrorType): Unit = js.native
}
/* static members */
object DynamicReferenceError {
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait DynamicReferenceErrorType extends StObject
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError.DynamicReferenceErrorType")
  @js.native
  object DynamicReferenceErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DynamicReferenceErrorType & Double] = js.native
    
    @js.native
    sealed trait GLOBALALREADYBORROWED
      extends StObject
         with DynamicReferenceErrorType
    /* 4 */ val GLOBALALREADYBORROWED: typings.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType.GLOBALALREADYBORROWED & Double = js.native
    
    @js.native
    sealed trait GLOBALREFALREADYRELEASED
      extends StObject
         with DynamicReferenceErrorType
    /* 2 */ val GLOBALREFALREADYRELEASED: typings.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType.GLOBALREFALREADYRELEASED & Double = js.native
    
    @js.native
    sealed trait MISSINGRELEASEREF
      extends StObject
         with DynamicReferenceErrorType
    /* 3 */ val MISSINGRELEASEREF: typings.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType.MISSINGRELEASEREF & Double = js.native
    
    @js.native
    sealed trait MOVEOFBORROWEDRESOURCE
      extends StObject
         with DynamicReferenceErrorType
    /* 1 */ val MOVEOFBORROWEDRESOURCE: typings.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType.MOVEOFBORROWEDRESOURCE & Double = js.native
    
    @js.native
    sealed trait UNKNOWNDYNAMICREFERENCEERROR
      extends StObject
         with DynamicReferenceErrorType
    /* 0 */ val UNKNOWNDYNAMICREFERENCEERROR: typings.libraCore.vmErrorsPbMod.DynamicReferenceError.DynamicReferenceErrorType.UNKNOWNDYNAMICREFERENCEERROR & Double = js.native
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): DynamicReferenceError = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[DynamicReferenceError]
  
  inline def deserializeBinaryFromReader(message: DynamicReferenceError, reader: BinaryReader): DynamicReferenceError = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[DynamicReferenceError]
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: DynamicReferenceError, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: DynamicReferenceError): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var errorCode: DynamicReferenceErrorType
  }
  object AsObject {
    
    inline def apply(errorCode: DynamicReferenceErrorType): AsObject = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setErrorCode(value: DynamicReferenceErrorType): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    }
  }
}
