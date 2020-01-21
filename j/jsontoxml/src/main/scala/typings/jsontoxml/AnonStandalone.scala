package typings.jsontoxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStandalone extends js.Object {
  var standalone: js.UndefOr[Boolean] = js.undefined
}

object AnonStandalone {
  @scala.inline
  def apply(standalone: js.UndefOr[Boolean] = js.undefined): AnonStandalone = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStandalone]
  }
}

