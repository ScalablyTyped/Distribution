package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerEvents extends js.Object {
  var change: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  var create: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  var spin: js.UndefOr[SpinnerEvent[SpinnerUIParam]] = js.undefined
  var start: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  var stop: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
}

object SpinnerEvents {
  @scala.inline
  def apply(
    change: SpinnerEvent[js.Object] = null,
    create: SpinnerEvent[js.Object] = null,
    spin: SpinnerEvent[SpinnerUIParam] = null,
    start: SpinnerEvent[js.Object] = null,
    stop: SpinnerEvent[js.Object] = null
  ): SpinnerEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (create != null) __obj.updateDynamic("create")(create)
    if (spin != null) __obj.updateDynamic("spin")(spin)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[SpinnerEvents]
  }
}

