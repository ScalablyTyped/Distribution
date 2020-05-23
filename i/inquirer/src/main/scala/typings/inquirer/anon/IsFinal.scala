package typings.inquirer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsFinal extends js.Object {
  var isFinal: js.UndefOr[Boolean] = js.undefined
}

object IsFinal {
  @scala.inline
  def apply(isFinal: js.UndefOr[Boolean] = js.undefined): IsFinal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isFinal)) __obj.updateDynamic("isFinal")(isFinal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFinal]
  }
}

