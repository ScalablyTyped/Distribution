package typings.i18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySeparator extends js.Object {
  var keySeparator: js.UndefOr[String] = js.undefined
}

object Anon_KeySeparator {
  @scala.inline
  def apply(keySeparator: String = null): Anon_KeySeparator = {
    val __obj = js.Dynamic.literal()
    if (keySeparator != null) __obj.updateDynamic("keySeparator")(keySeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeySeparator]
  }
}

