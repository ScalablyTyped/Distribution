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

object Anon_AmpmNames {
  @scala.inline
  def apply(
    ampmNames: js.Array[java.lang.String],
    attribute: java.lang.String,
    dayNames: js.Array[java.lang.String],
    dayNamesShort: js.Array[java.lang.String],
    formatAttribute: java.lang.String,
    getSuffix: scala.Double => java.lang.String,
    monthNames: js.Array[java.lang.String],
    monthNamesShort: js.Array[java.lang.String],
    utc: scala.Boolean
  ): Anon_AmpmNames = {
    val __obj = js.Dynamic.literal(ampmNames = ampmNames, attribute = attribute, dayNames = dayNames, dayNamesShort = dayNamesShort, formatAttribute = formatAttribute, getSuffix = js.Any.fromFunction1(getSuffix), monthNames = monthNames, monthNamesShort = monthNamesShort, utc = utc)
  
    __obj.asInstanceOf[Anon_AmpmNames]
  }
}

