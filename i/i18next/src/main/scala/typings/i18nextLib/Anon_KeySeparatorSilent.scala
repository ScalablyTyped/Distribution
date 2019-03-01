package typings
package i18nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySeparatorSilent extends js.Object {
  var keySeparator: js.UndefOr[java.lang.String] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_KeySeparatorSilent {
  @scala.inline
  def apply(keySeparator: java.lang.String = null, silent: js.UndefOr[scala.Boolean] = js.undefined): Anon_KeySeparatorSilent = {
    val __obj = js.Dynamic.literal()
    if (keySeparator != null) __obj.updateDynamic("keySeparator")(keySeparator)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[Anon_KeySeparatorSilent]
  }
}

