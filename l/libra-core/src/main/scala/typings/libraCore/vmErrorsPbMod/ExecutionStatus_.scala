package typings.libraCore.vmErrorsPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.vmErrorsPbMod.ExecutionStatus.ExecutionStatusCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "ExecutionStatus")
@js.native
class ExecutionStatus_ () extends Message {
  
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
