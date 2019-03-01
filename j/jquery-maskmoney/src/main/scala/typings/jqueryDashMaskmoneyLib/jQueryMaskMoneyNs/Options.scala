package typings
package jqueryDashMaskmoneyLib.jQueryMaskMoneyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Set if the prefix and suffix will stay in the field's value after the user exits the field
    */
  var affixesStay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Setting to prevent negative values
    */
  var allowNegative: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Setting to prevent users from inputing zero
    */
  var allowZero: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The decimal separator
    */
  var decimal: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How many decimal places are allowed
    */
  var precision: js.UndefOr[scala.Double] = js.undefined
  /**
    * The prefix to be displayed before the value entered
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The prefix to be displayed after the value entered
    */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The thousands separator
    */
  var thousands: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    affixesStay: js.UndefOr[scala.Boolean] = js.undefined,
    allowNegative: js.UndefOr[scala.Boolean] = js.undefined,
    allowZero: js.UndefOr[scala.Boolean] = js.undefined,
    decimal: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null,
    thousands: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(affixesStay)) __obj.updateDynamic("affixesStay")(affixesStay)
    if (!js.isUndefined(allowNegative)) __obj.updateDynamic("allowNegative")(allowNegative)
    if (!js.isUndefined(allowZero)) __obj.updateDynamic("allowZero")(allowZero)
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (thousands != null) __obj.updateDynamic("thousands")(thousands)
    __obj.asInstanceOf[Options]
  }
}

