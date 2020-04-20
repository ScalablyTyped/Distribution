package typings.libraCore.vmErrorsPbMod.ArithmeticError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var errorCode: ArithmeticErrorType
}

object AsObject {
  @scala.inline
  def apply(errorCode: ArithmeticErrorType): AsObject = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

