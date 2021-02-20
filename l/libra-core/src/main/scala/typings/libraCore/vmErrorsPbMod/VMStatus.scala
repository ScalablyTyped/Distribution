package typings.libraCore.vmErrorsPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.vmErrorsPbMod.VMStatus.ErrorTypeCase
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus")
@js.native
class VMStatus () extends Message {
  
  def clearDeserialization(): Unit = js.native
  
  def clearExecution(): Unit = js.native
  
  def clearInvariantViolation(): Unit = js.native
  
  def clearValidation(): Unit = js.native
  
  def clearVerification(): Unit = js.native
  
  def getDeserialization(): BinaryError = js.native
  
  def getErrorTypeCase(): ErrorTypeCase = js.native
  
  def getExecution(): js.UndefOr[ExecutionStatus] = js.native
  
  def getInvariantViolation(): VMInvariantViolationError = js.native
  
  def getValidation(): js.UndefOr[VMValidationStatus] = js.native
  
  def getVerification(): js.UndefOr[VMVerificationStatusList] = js.native
  
  def hasDeserialization(): Boolean = js.native
  
  def hasExecution(): Boolean = js.native
  
  def hasInvariantViolation(): Boolean = js.native
  
  def hasValidation(): Boolean = js.native
  
  def hasVerification(): Boolean = js.native
  
  def setDeserialization(value: BinaryError): Unit = js.native
  
  def setExecution(): Unit = js.native
  def setExecution(value: ExecutionStatus): Unit = js.native
  
  def setInvariantViolation(value: VMInvariantViolationError): Unit = js.native
  
  def setValidation(): Unit = js.native
  def setValidation(value: VMValidationStatus): Unit = js.native
  
  def setVerification(): Unit = js.native
  def setVerification(value: VMVerificationStatusList): Unit = js.native
}
/* static members */
object VMStatus {
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ErrorTypeCase extends StObject
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus.ErrorTypeCase")
  @js.native
  object ErrorTypeCase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorTypeCase with Double] = js.native
    
    @js.native
    sealed trait DESERIALIZATION extends ErrorTypeCase
    /* 4 */ val DESERIALIZATION: typings.libraCore.vmErrorsPbMod.VMStatus.ErrorTypeCase.DESERIALIZATION with Double = js.native
    
    @js.native
    sealed trait ERRORTYPE_NOT_SET extends ErrorTypeCase
    /* 0 */ val ERRORTYPE_NOT_SET: typings.libraCore.vmErrorsPbMod.VMStatus.ErrorTypeCase.ERRORTYPE_NOT_SET with Double = js.native
    
    @js.native
    sealed trait EXECUTION extends ErrorTypeCase
    /* 5 */ val EXECUTION: typings.libraCore.vmErrorsPbMod.VMStatus.ErrorTypeCase.EXECUTION with Double = js.native
    
    @js.native
    sealed trait INVARIANT_VIOLATION extends ErrorTypeCase
    /* 3 */ val INVARIANT_VIOLATION: typings.libraCore.vmErrorsPbMod.VMStatus.ErrorTypeCase.INVARIANT_VIOLATION with Double = js.native
    
    @js.native
    sealed trait VALIDATION extends ErrorTypeCase
    /* 1 */ val VALIDATION: typings.libraCore.vmErrorsPbMod.VMStatus.ErrorTypeCase.VALIDATION with Double = js.native
    
    @js.native
    sealed trait VERIFICATION extends ErrorTypeCase
    /* 2 */ val VERIFICATION: typings.libraCore.vmErrorsPbMod.VMStatus.ErrorTypeCase.VERIFICATION with Double = js.native
  }
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): VMStatus = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: VMStatus, reader: BinaryReader): VMStatus = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: VMStatus, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: VMStatus): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var deserialization: BinaryError = js.native
    
    var execution: js.UndefOr[typings.libraCore.vmErrorsPbMod.ExecutionStatus.AsObject] = js.native
    
    var invariantViolation: VMInvariantViolationError = js.native
    
    var validation: js.UndefOr[typings.libraCore.vmErrorsPbMod.VMValidationStatus.AsObject] = js.native
    
    var verification: js.UndefOr[typings.libraCore.vmErrorsPbMod.VMVerificationStatusList.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(deserialization: BinaryError, invariantViolation: VMInvariantViolationError): AsObject = {
      val __obj = js.Dynamic.literal(deserialization = deserialization.asInstanceOf[js.Any], invariantViolation = invariantViolation.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeserialization(value: BinaryError): Self = StObject.set(x, "deserialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecution(value: typings.libraCore.vmErrorsPbMod.ExecutionStatus.AsObject): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
      
      @scala.inline
      def setInvariantViolation(value: VMInvariantViolationError): Self = StObject.set(x, "invariantViolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidation(value: typings.libraCore.vmErrorsPbMod.VMValidationStatus.AsObject): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
      
      @scala.inline
      def setVerification(value: typings.libraCore.vmErrorsPbMod.VMVerificationStatusList.AsObject): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
    }
  }
}
