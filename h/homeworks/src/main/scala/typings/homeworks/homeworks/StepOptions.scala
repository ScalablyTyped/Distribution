package typings.homeworks.homeworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.0
  */
trait StepOptions extends js.Object {
  var active: js.UndefOr[Double] = js.undefined
}

object StepOptions {
  @scala.inline
  def apply(active: js.UndefOr[Double] = js.undefined): StepOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepOptions]
  }
}

