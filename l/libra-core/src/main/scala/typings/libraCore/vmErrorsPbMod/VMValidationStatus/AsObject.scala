package typings.libraCore.vmErrorsPbMod.VMValidationStatus

import typings.libraCore.vmErrorsPbMod.VMValidationStatusCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var code: VMValidationStatusCode
  var message: String
}

object AsObject {
  @scala.inline
  def apply(code: VMValidationStatusCode, message: String): AsObject = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

