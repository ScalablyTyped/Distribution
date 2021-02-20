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

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatus")
@js.native
class VMValidationStatus () extends Message {
  
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
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatus.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): VMValidationStatus = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatus.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: VMValidationStatus, reader: BinaryReader): VMValidationStatus = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatus.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatus.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatus.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: VMValidationStatus, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMValidationStatus.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: VMValidationStatus): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var code: VMValidationStatusCode = js.native
    
    var message: String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(code: VMValidationStatusCode, message: String): AsObject = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: VMValidationStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
