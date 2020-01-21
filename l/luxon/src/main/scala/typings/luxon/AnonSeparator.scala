package typings.luxon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSeparator extends js.Object {
  var separator: js.UndefOr[String] = js.undefined
}

object AnonSeparator {
  @scala.inline
  def apply(separator: String = null): AnonSeparator = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSeparator]
  }
}

