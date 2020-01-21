package typings.i18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeySeparator extends js.Object {
  var keySeparator: js.UndefOr[String] = js.undefined
}

object AnonKeySeparator {
  @scala.inline
  def apply(keySeparator: String = null): AnonKeySeparator = {
    val __obj = js.Dynamic.literal()
    if (keySeparator != null) __obj.updateDynamic("keySeparator")(keySeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeySeparator]
  }
}

