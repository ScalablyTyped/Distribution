package typings.jqueryTimeentry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeEntryRegionalOptions extends js.Object {
  /**
    * The AM and PM display text. This is one of the regional settings fields.
    *
    * default: ['AM','PM']
    */
  var ampmNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The text that separates the time from the AM and PM indicators. This is one of the regional settings fields.
    *
    * default: ''
    */
  var ampmPrefix: js.UndefOr[String] = js.undefined
  /**
    * The separator between time portions. This is one of the regional settings fields.
    *
    * default: ':'
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    * Indicate whether to use 12-hour (false) or 24-hour (true) time. This is one of the regional settings fields.
    *
    * default: False
    */
  var show24Hours: js.UndefOr[Boolean] = js.undefined
  /**
    * The tooltip text for the spinner buttons. This is one of the regional settings fields.
    *
    * default: ['Now', 'Previous field', 'Next field', 'Increment', 'Decrement']
    */
  var spinnerTexts: js.UndefOr[js.Array[String]] = js.undefined
}

object ITimeEntryRegionalOptions {
  @scala.inline
  def apply(
    ampmNames: js.Array[String] = null,
    ampmPrefix: String = null,
    separator: String = null,
    show24Hours: js.UndefOr[Boolean] = js.undefined,
    spinnerTexts: js.Array[String] = null
  ): ITimeEntryRegionalOptions = {
    val __obj = js.Dynamic.literal()
    if (ampmNames != null) __obj.updateDynamic("ampmNames")(ampmNames.asInstanceOf[js.Any])
    if (ampmPrefix != null) __obj.updateDynamic("ampmPrefix")(ampmPrefix.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(show24Hours)) __obj.updateDynamic("show24Hours")(show24Hours.get.asInstanceOf[js.Any])
    if (spinnerTexts != null) __obj.updateDynamic("spinnerTexts")(spinnerTexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeEntryRegionalOptions]
  }
}

