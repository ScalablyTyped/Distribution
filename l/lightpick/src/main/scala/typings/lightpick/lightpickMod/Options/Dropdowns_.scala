package typings.lightpick.lightpickMod.Options

import typings.lightpick.lightpickMod.Options.Dropdowns.Years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Dropdowns")
trait Dropdowns_ extends js.Object {
  /**
    * true/false for enable/disable dropdown of months.
    */
  var months: js.UndefOr[Boolean] = js.undefined
  /**
    * Can be false for disable dropdown of years.
    */
  var years: js.UndefOr[Boolean | Years] = js.undefined
}

object Dropdowns_ {
  @scala.inline
  def apply(months: js.UndefOr[Boolean] = js.undefined, years: Boolean | Years = null): Dropdowns_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(months)) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dropdowns_]
  }
}

