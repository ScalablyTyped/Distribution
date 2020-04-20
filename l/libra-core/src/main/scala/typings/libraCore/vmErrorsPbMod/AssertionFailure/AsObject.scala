package typings.libraCore.vmErrorsPbMod.AssertionFailure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var assertionErrorCode: String
}

object AsObject {
  @scala.inline
  def apply(assertionErrorCode: String): AsObject = {
    val __obj = js.Dynamic.literal(assertionErrorCode = assertionErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

