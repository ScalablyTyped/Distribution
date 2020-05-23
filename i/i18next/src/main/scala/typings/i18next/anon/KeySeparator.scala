package typings.i18next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeySeparator extends js.Object {
  var keySeparator: js.UndefOr[String] = js.undefined
}

object KeySeparator {
  @scala.inline
  def apply(keySeparator: String = null): KeySeparator = {
    val __obj = js.Dynamic.literal()
    if (keySeparator != null) __obj.updateDynamic("keySeparator")(keySeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySeparator]
  }
}

