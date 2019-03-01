package typings
package jqueryDashTimeentryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeEntryRegionalOptions extends js.Object {
  /**
    * The AM and PM display text. This is one of the regional settings fields.
    *
    * default: ['AM','PM']
    */
  var ampmNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The text that separates the time from the AM and PM indicators. This is one of the regional settings fields.
    *
    * default: ''
    */
  var ampmPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The separator between time portions. This is one of the regional settings fields.
    *
    * default: ':'
    */
  var separator: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicate whether to use 12-hour (false) or 24-hour (true) time. This is one of the regional settings fields.
    *
    * default: False
    */
  var show24Hours: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The tooltip text for the spinner buttons. This is one of the regional settings fields.
    *
    * default: ['Now', 'Previous field', 'Next field', 'Increment', 'Decrement']
    */
  var spinnerTexts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ITimeEntryRegionalOptions {
  @scala.inline
  def apply(
    ampmNames: js.Array[java.lang.String] = null,
    ampmPrefix: java.lang.String = null,
    separator: java.lang.String = null,
    show24Hours: js.UndefOr[scala.Boolean] = js.undefined,
    spinnerTexts: js.Array[java.lang.String] = null
  ): ITimeEntryRegionalOptions = {
    val __obj = js.Dynamic.literal()
    if (ampmNames != null) __obj.updateDynamic("ampmNames")(ampmNames)
    if (ampmPrefix != null) __obj.updateDynamic("ampmPrefix")(ampmPrefix)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(show24Hours)) __obj.updateDynamic("show24Hours")(show24Hours)
    if (spinnerTexts != null) __obj.updateDynamic("spinnerTexts")(spinnerTexts)
    __obj.asInstanceOf[ITimeEntryRegionalOptions]
  }
}

