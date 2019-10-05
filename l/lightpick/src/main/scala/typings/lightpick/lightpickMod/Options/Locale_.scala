package typings.lightpick.lightpickMod.Options

import typings.lightpick.lightpickMod.Options.Locale.Buttons
import typings.lightpick.lightpickMod.Options.Locale.PluralizeFn
import typings.lightpick.lightpickMod.Options.Locale.PluralizeFnLocale
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Locale")
trait Locale_ extends js.Object {
  /**
    * Text for buttons.
    */
  var buttons: js.UndefOr[Buttons] = js.undefined
  var pluralize: js.UndefOr[PluralizeFn] = js.undefined
  /**
    * Text for tooltip.
    */
  var tooltip: js.UndefOr[Partial[PluralizeFnLocale]] = js.undefined
  /**
    * Show tooltip text on disabled dates. (Eg. «Already booked»)
    */
  var tooltipOnDisabled: js.UndefOr[String] = js.undefined
}

object Locale_ {
  @scala.inline
  def apply(
    buttons: Buttons = null,
    pluralize: (/* i */ String | Double, /* locale */ PluralizeFnLocale) => String = null,
    tooltip: Partial[PluralizeFnLocale] = null,
    tooltipOnDisabled: String = null
  ): Locale_ = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (pluralize != null) __obj.updateDynamic("pluralize")(js.Any.fromFunction2(pluralize))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOnDisabled != null) __obj.updateDynamic("tooltipOnDisabled")(tooltipOnDisabled)
    __obj.asInstanceOf[Locale_]
  }
}

