package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
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
    change: (/* event */ JQueryEventObject, js.Object) => Unit = null,
    create: (/* event */ JQueryEventObject, js.Object) => Unit = null,
    culture: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icons: js.Any = null,
    incremental: js.Any = null,
    max: js.Any = null,
    min: js.Any = null,
    numberFormat: String = null,
    page: Int | Double = null,
    spin: (/* event */ JQueryEventObject, SpinnerUIParam) => Unit = null,
    start: (/* event */ JQueryEventObject, js.Object) => Unit = null,
    step: js.Any = null,
    stop: (/* event */ JQueryEventObject, js.Object) => Unit = null
  ): SpinnerOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (incremental != null) __obj.updateDynamic("incremental")(incremental.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (spin != null) __obj.updateDynamic("spin")(js.Any.fromFunction2(spin))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2(start))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2(stop))
    __obj.asInstanceOf[SpinnerOptions]
  }
}

