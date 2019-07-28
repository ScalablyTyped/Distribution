package typings.jqueryDashFormatdatetime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmpmNames extends js.Object {
  /**
    * Names of the 12-hour clock periods, e.g. AM
    */
  var ampmNames: js.Array[String]
  /**
    * Attribute which contains the datetime
    */
  var attribute: String
  /**
    * Names of the days, e.g. Sunday
    */
  var dayNames: js.Array[String]
  /**
    * Shortened names of the days, e.g. Sun
    */
  var dayNamesShort: js.Array[String]
  /**
    * Attribute which contains the datetime format
    */
  var formatAttribute: String
  /**
    * Names of the months, e.g. January
    */
  var monthNames: js.Array[String]
  /**
    * Shortened names of the months, e.g. Jan
    */
  var monthNamesShort: js.Array[String]
  /**
    * Render dates in UTC instead of local timezone
    */
  var utc: Boolean
  /**
    * Callback to convert number to ordinal suffix, e.g. 1 to st
    */
  def getSuffix(num: Double): String
}

object Anon_AmpmNames {
  @scala.inline
  def apply(
    ampmNames: js.Array[String],
    attribute: String,
    dayNames: js.Array[String],
    dayNamesShort: js.Array[String],
    formatAttribute: String,
    getSuffix: Double => String,
    monthNames: js.Array[String],
    monthNamesShort: js.Array[String],
    utc: Boolean
  ): Anon_AmpmNames = {
    val __obj = js.Dynamic.literal(ampmNames = ampmNames, attribute = attribute, dayNames = dayNames, dayNamesShort = dayNamesShort, formatAttribute = formatAttribute, getSuffix = js.Any.fromFunction1(getSuffix), monthNames = monthNames, monthNamesShort = monthNamesShort, utc = utc)
  
    __obj.asInstanceOf[Anon_AmpmNames]
  }
}

