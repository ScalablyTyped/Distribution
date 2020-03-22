package typings.i18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSilent extends js.Object {
  var keySeparator: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object AnonSilent {
  @scala.inline
  def apply(keySeparator: String = null, silent: js.UndefOr[Boolean] = js.undefined): AnonSilent = {
    val __obj = js.Dynamic.literal()
    if (keySeparator != null) __obj.updateDynamic("keySeparator")(keySeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSilent]
  }
}

