package typings.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var process: js.UndefOr[Boolean] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined, process: js.UndefOr[Boolean] = js.undefined): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(process)) __obj.updateDynamic("process")(process.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
}

