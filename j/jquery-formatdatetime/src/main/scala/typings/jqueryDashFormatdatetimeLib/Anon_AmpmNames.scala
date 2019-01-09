package typings
package jqueryDashFormatdatetimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmpmNames extends js.Object {
  /**
    * Names of the 12-hour clock periods, e.g. AM
    */
  var ampmNames: js.Array[java.lang.String]
  /**
    * Attribute which contains the datetime
    */
  var attribute: java.lang.String
  /**
    * Names of the days, e.g. Sunday
    */
  var dayNames: js.Array[java.lang.String]
  /**
    * Shortened names of the days, e.g. Sun
    */
  var dayNamesShort: js.Array[java.lang.String]
  /**
    * Attribute which contains the datetime format
    */
  var formatAttribute: java.lang.String
  /**
    * Names of the months, e.g. January
    */
  var monthNames: js.Array[java.lang.String]
  /**
    * Shortened names of the months, e.g. Jan
    */
  var monthNamesShort: js.Array[java.lang.String]
  /**
    * Render dates in UTC instead of local timezone
    */
  var utc: scala.Boolean
  /**
    * Callback to convert number to ordinal suffix, e.g. 1 to st
    */
  def getSuffix(num: scala.Double): java.lang.String
}

