package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.vmErrorsPbMod.ExecutionStatus.ExecutionStatusCase
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "ExecutionStatus")
@js.native
class ExecutionStatus () extends Message {
  
  def clearArithmeticError(): Unit = js.native
  
  def clearAssertionFailure(): Unit = js.native
  
  def clearReferenceError(): Unit = js.native
  
  def clearRuntimeStatus(): Unit = js.native
  
  def getArithmeticError(): js.UndefOr[ArithmeticError] = js.native
  
  def getAssertionFailure(): js.UndefOr[AssertionFailure] = js.native
  
  def getExecutionStatusCase(): ExecutionStatusCase = js.native
  
  def getReferenceError(): js.UndefOr[DynamicReferenceError] = js.native
  
  def getRuntimeStatus(): RuntimeStatus = js.native
  
  def hasArithmeticError(): Boolean = js.native
  
  def hasAssertionFailure(): Boolean = js.native
  
  def hasReferenceError(): Boolean = js.native
  
  def hasRuntimeStatus(): Boolean = js.native
  
  def setArithmeticError(): Unit = js.native
  def setArithmeticError(value: ArithmeticError): Unit = js.native
  
  def setAssertionFailure(): Unit = js.native
  def setAssertionFailure(value: AssertionFailure): Unit = js.native
  
  def setReferenceError(): Unit = js.native
  def setReferenceError(value: DynamicReferenceError): Unit = js.native
  
  def setRuntimeStatus(value: RuntimeStatus): Unit = js.native
}
/* static members */
object ExecutionStatus {
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ExecutionStatus")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ExecutionStatusCase extends StObject
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ExecutionStatus.ExecutionStatusCase")
  @js.native
  object ExecutionStatusCase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ExecutionStatusCase & Double] = js.native
    
    @js.native
    sealed trait ARITHMETIC_ERROR
      extends StObject
         with ExecutionStatusCase
    /* 3 */ val ARITHMETIC_ERROR: typings.libraCore.vmErrorsPbMod.ExecutionStatus.ExecutionStatusCase.ARITHMETIC_ERROR & Double = js.native
    
    @js.native
    sealed trait ASSERTION_FAILURE
      extends StObject
         with ExecutionStatusCase
    /* 2 */ val ASSERTION_FAILURE: typings.libraCore.vmErrorsPbMod.ExecutionStatus.ExecutionStatusCase.ASSERTION_FAILURE & Double = js.native
    
    @js.native
    sealed trait EXECUTIONSTATUS_NOT_SET
      extends StObject
         with ExecutionStatusCase
    /* 0 */ val EXECUTIONSTATUS_NOT_SET: typings.libraCore.vmErrorsPbMod.ExecutionStatus.ExecutionStatusCase.EXECUTIONSTATUS_NOT_SET & Double = js.native
    
    @js.native
    sealed trait REFERENCE_ERROR
      extends StObject
         with ExecutionStatusCase
    /* 4 */ val REFERENCE_ERROR: typings.libraCore.vmErrorsPbMod.ExecutionStatus.ExecutionStatusCase.REFERENCE_ERROR & Double = js.native
    
    @js.native
    sealed trait RUNTIME_STATUS
      extends StObject
         with ExecutionStatusCase
    /* 1 */ val RUNTIME_STATUS: typings.libraCore.vmErrorsPbMod.ExecutionStatus.ExecutionStatusCase.RUNTIME_STATUS & Double = js.native
  }
  
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): ExecutionStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[ExecutionStatus]
  
  @scala.inline
  def deserializeBinaryFromReader(message: ExecutionStatus, reader: BinaryReader): ExecutionStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[ExecutionStatus]
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ExecutionStatus.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "ExecutionStatus.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serializeBinaryToWriter(message: ExecutionStatus, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: ExecutionStatus): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var arithmeticError: js.UndefOr[typings.libraCore.vmErrorsPbMod.ArithmeticError.AsObject] = js.undefined
    
    var assertionFailure: js.UndefOr[typings.libraCore.vmErrorsPbMod.AssertionFailure.AsObject] = js.undefined
    
    var referenceError: js.UndefOr[typings.libraCore.vmErrorsPbMod.DynamicReferenceError.AsObject] = js.undefined
    
    var runtimeStatus: RuntimeStatus
  }
  object AsObject {
    
    @scala.inline
    def apply(runtimeStatus: RuntimeStatus): AsObject = {
      val __obj = js.Dynamic.literal(runtimeStatus = runtimeStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArithmeticError(value: typings.libraCore.vmErrorsPbMod.ArithmeticError.AsObject): Self = StObject.set(x, "arithmeticError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArithmeticErrorUndefined: Self = StObject.set(x, "arithmeticError", js.undefined)
      
      @scala.inline
      def setAssertionFailure(value: typings.libraCore.vmErrorsPbMod.AssertionFailure.AsObject): Self = StObject.set(x, "assertionFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssertionFailureUndefined: Self = StObject.set(x, "assertionFailure", js.undefined)
      
      @scala.inline
      def setReferenceError(value: typings.libraCore.vmErrorsPbMod.DynamicReferenceError.AsObject): Self = StObject.set(x, "referenceError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceErrorUndefined: Self = StObject.set(x, "referenceError", js.undefined)
      
      @scala.inline
      def setRuntimeStatus(value: RuntimeStatus): Self = StObject.set(x, "runtimeStatus", value.asInstanceOf[js.Any])
    }
  }
}
