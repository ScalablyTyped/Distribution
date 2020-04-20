package typings.libraCore.vmErrorsPbMod.DynamicReferenceError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var errorCode: DynamicReferenceErrorType
}

object AsObject {
  @scala.inline
  def apply(errorCode: DynamicReferenceErrorType): AsObject = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

