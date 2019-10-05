package typings.jqueryui.JQueryUI

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Spinner //////////////////////////////////////////////////
trait SpinnerOptions extends SpinnerEvents {
  var culture: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var incremental: js.UndefOr[js.Any] = js.undefined
   // boolean or ()
  var max: js.UndefOr[js.Any] = js.undefined
   // number or string
  var min: js.UndefOr[js.Any] = js.undefined
   // number or string
  var numberFormat: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[js.Any] = js.undefined
}

object SpinnerOptions {
  @scala.inline
  def apply(
    change: (/* event */ Event, js.Object) => Unit = null,
    create: (/* event */ Event, js.Object) => Unit = null,
    culture: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icons: js.Any = null,
    incremental: js.Any = null,
    max: js.Any = null,
    min: js.Any = null,
    numberFormat: String = null,
    page: Int | Double = null,
    spin: (/* event */ Event, SpinnerUIParam) => Unit = null,
    start: (/* event */ Event, js.Object) => Unit = null,
    step: js.Any = null,
    stop: (/* event */ Event, js.Object) => Unit = null
  ): SpinnerOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (incremental != null) __obj.updateDynamic("incremental")(incremental)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (spin != null) __obj.updateDynamic("spin")(js.Any.fromFunction2(spin))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (step != null) __obj.updateDynamic("step")(step)
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    __obj.asInstanceOf[SpinnerOptions]
  }
}

