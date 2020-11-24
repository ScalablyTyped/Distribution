package typings.libraCore.vmErrorsPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.vmErrorsPbMod.VMStatus.ErrorTypeCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus")
@js.native
class VMStatus_ () extends Message {
  
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
