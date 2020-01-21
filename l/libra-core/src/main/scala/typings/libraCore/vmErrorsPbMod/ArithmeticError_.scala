package typings.libraCore.vmErrorsPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.vmErrorsPbMod.ArithmeticError.ArithmeticErrorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError")
@js.native
class ArithmeticError_ () extends Message {
  def getErrorCode(): ArithmeticErrorType = js.native
  def setErrorCode(value: ArithmeticErrorType): Unit = js.native
}

