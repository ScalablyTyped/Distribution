package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToRelativeOptions extends js.Object {
  /** The DateTime to use as the basis to which this time is compared. Defaults to now. */
  var base: js.UndefOr[DateTime] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  /** The Intl system may choose not to honor this */
  var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
  /**
    * Padding in milliseconds. This allows you to round up the result if it fits inside the threshold.
    * Don't use in combination with {round: false} because the decimal output will include the padding.
    * Defaults to 0.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /** Defaults to `true`. */
  var round: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StringUnitLength] = js.undefined
  /** If omitted, the method will pick the unit. */
  var unit: js.UndefOr[ToRelativeUnit] = js.undefined
}

object ToRelativeOptions {
  @scala.inline
  def apply(
    base: DateTime = null,
    locale: String = null,
    numberingSystem: NumberingSystem = null,
    padding: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    style: StringUnitLength = null,
    unit: ToRelativeUnit = null
  ): ToRelativeOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (style != null) __obj.updateDynamic("style")(style)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[ToRelativeOptions]
  }
}

