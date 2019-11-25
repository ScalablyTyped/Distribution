package typings.i18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySeparatorSilent extends js.Object {
  var keySeparator: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object Anon_KeySeparatorSilent {
  @scala.inline
  def apply(keySeparator: String = null, silent: js.UndefOr[Boolean] = js.undefined): Anon_KeySeparatorSilent = {
    val __obj = js.Dynamic.literal()
    if (keySeparator != null) __obj.updateDynamic("keySeparator")(keySeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeySeparatorSilent]
  }
}

