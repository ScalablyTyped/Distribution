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

