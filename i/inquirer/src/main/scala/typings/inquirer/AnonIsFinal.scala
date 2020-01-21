package typings.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsFinal extends js.Object {
  var isFinal: js.UndefOr[Boolean] = js.undefined
}

object AnonIsFinal {
  @scala.inline
  def apply(isFinal: js.UndefOr[Boolean] = js.undefined): AnonIsFinal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isFinal)) __obj.updateDynamic("isFinal")(isFinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsFinal]
  }
}

