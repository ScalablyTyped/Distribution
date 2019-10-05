package typings.homeworks.homeworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.0
  */
trait SpinnerOptions extends js.Object {
  var empty: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object SpinnerOptions {
  @scala.inline
  def apply(empty: js.Any = null, `type`: js.Any = null): SpinnerOptions = {
    val __obj = js.Dynamic.literal()
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SpinnerOptions]
  }
}

