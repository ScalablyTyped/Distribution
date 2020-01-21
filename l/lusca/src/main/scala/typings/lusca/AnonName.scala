package typings.lusca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var options: js.UndefOr[js.Object] = js.undefined
}

object AnonName {
  @scala.inline
  def apply(name: String, options: js.Object = null): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

