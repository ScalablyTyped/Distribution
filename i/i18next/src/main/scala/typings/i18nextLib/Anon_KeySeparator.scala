package typings
package i18nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySeparator extends js.Object {
  var keySeparator: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_KeySeparator {
  @scala.inline
  def apply(keySeparator: java.lang.String = null): Anon_KeySeparator = {
    val __obj = js.Dynamic.literal()
    if (keySeparator != null) __obj.updateDynamic("keySeparator")(keySeparator)
    __obj.asInstanceOf[Anon_KeySeparator]
  }
}

