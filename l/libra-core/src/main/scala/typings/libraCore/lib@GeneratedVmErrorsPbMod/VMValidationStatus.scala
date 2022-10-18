package typings.libraCore.`lib@GeneratedVmErrorsPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatus")
@js.native
open class VMValidationStatus () extends Message {
  
  def getCode(): VMValidationStatusCode = js.native
  
  def getMessage(): String = js.native
  
  def setCode(value: VMValidationStatusCode): Unit = js.native
  
  def setMessage(value: String): Unit = js.native
}
/* static members */
object VMValidationStatus {
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatus")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): VMValidationStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[VMValidationStatus]
  
  inline def deserializeBinaryFromReader(message: VMValidationStatus, reader: BinaryReader): VMValidationStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[VMValidationStatus]
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatus.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatus.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: VMValidationStatus, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: VMValidationStatus): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var code: VMValidationStatusCode
    
    var message: String
  }
  object AsObject {
    
    inline def apply(code: VMValidationStatusCode, message: String): AsObject = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setCode(value: VMValidationStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
