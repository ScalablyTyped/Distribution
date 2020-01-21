package typings.jqueryMaskmoney.jQueryMaskMoney

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Set if the prefix and suffix will stay in the field's value after the user exits the field
    */
  var affixesStay: js.UndefOr[Boolean] = js.undefined
  /**
    * Setting to prevent negative values
    */
  var allowNegative: js.UndefOr[Boolean] = js.undefined
  /**
    * Setting to prevent users from inputing zero
    */
  var allowZero: js.UndefOr[Boolean] = js.undefined
  /**
    * The decimal separator
    */
  var decimal: js.UndefOr[String] = js.undefined
  /**
    * How many decimal places are allowed
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * The prefix to be displayed before the value entered
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * The prefix to be displayed after the value entered
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * The thousands separator
    */
  var thousands: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    affixesStay: js.UndefOr[Boolean] = js.undefined,
    allowNegative: js.UndefOr[Boolean] = js.undefined,
    allowZero: js.UndefOr[Boolean] = js.undefined,
    decimal: String = null,
    precision: Int | Double = null,
    prefix: String = null,
    suffix: String = null,
    thousands: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(affixesStay)) __obj.updateDynamic("affixesStay")(affixesStay.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNegative)) __obj.updateDynamic("allowNegative")(allowNegative.asInstanceOf[js.Any])
    if (!js.isUndefined(allowZero)) __obj.updateDynamic("allowZero")(allowZero.asInstanceOf[js.Any])
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (thousands != null) __obj.updateDynamic("thousands")(thousands.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

