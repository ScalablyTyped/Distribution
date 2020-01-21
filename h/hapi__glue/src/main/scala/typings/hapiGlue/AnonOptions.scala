package typings.hapiGlue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
  var register: String
}

object AnonOptions {
  @scala.inline
  def apply(register: String, options: js.Any = null): AnonOptions = {
    val __obj = js.Dynamic.literal(register = register.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}

