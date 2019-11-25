package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToRelativeCalendarOptions extends js.Object {
  /** The DateTime to use as the basis to which this time is compared. Defaults to now. */
  var base: js.UndefOr[DateTime] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  /** The Intl system may choose not to honor this. */
  var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
  /** If omitted, the method will pick the unit. */
  var unit: js.UndefOr[ToRelativeUnit] = js.undefined
}

object ToRelativeCalendarOptions {
  @scala.inline
  def apply(
    base: DateTime = null,
    locale: String = null,
    numberingSystem: NumberingSystem = null,
    unit: ToRelativeUnit = null
  ): ToRelativeCalendarOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToRelativeCalendarOptions]
  }
}

