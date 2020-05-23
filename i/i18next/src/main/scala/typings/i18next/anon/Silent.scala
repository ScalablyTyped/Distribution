package typings.i18next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Silent extends js.Object {
  var keySeparator: js.UndefOr[String] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object Silent {
  @scala.inline
  def apply(keySeparator: String = null, silent: js.UndefOr[Boolean] = js.undefined): Silent = {
    val __obj = js.Dynamic.literal()
    if (keySeparator != null) __obj.updateDynamic("keySeparator")(keySeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Silent]
  }
}

