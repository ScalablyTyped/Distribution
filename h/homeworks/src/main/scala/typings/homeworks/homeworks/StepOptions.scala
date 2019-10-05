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
  def apply(active: Int | Double = null): StepOptions = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepOptions]
  }
}

