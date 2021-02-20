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

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "AssertionFailure")
@js.native
class AssertionFailure () extends Message {
  
  def getAssertionErrorCode(): String = js.native
  
  def setAssertionErrorCode(value: String): Unit = js.native
}
/* static members */
object AssertionFailure {
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "AssertionFailure")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "AssertionFailure.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): AssertionFailure = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "AssertionFailure.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: AssertionFailure, reader: BinaryReader): AssertionFailure = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "AssertionFailure.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "AssertionFailure.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "AssertionFailure.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: AssertionFailure, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "AssertionFailure.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: AssertionFailure): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var assertionErrorCode: String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(assertionErrorCode: String): AsObject = {
      val __obj = js.Dynamic.literal(assertionErrorCode = assertionErrorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssertionErrorCode(value: String): Self = StObject.set(x, "assertionErrorCode", value.asInstanceOf[js.Any])
    }
  }
}
