package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
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
    change: (/* event */ JQueryEventObject, js.Object) => Unit = null,
    create: (/* event */ JQueryEventObject, js.Object) => Unit = null,
    spin: (/* event */ JQueryEventObject, SpinnerUIParam) => Unit = null,
    start: (/* event */ JQueryEventObject, js.Object) => Unit = null,
    stop: (/* event */ JQueryEventObject, js.Object) => Unit = null
  ): SpinnerEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (spin != null) __obj.updateDynamic("spin")(js.Any.fromFunction2(spin))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    __obj.asInstanceOf[SpinnerEvents]
  }
}

