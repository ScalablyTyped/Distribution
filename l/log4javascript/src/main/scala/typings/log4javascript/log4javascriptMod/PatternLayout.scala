package typings.log4javascript.log4javascriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4javascript", "PatternLayout")
@js.native
class PatternLayout protected () extends Layout {
  /**
  	 * Constructor
  	 * @param pattern The conversion pattern string to use.
  	 */
  def this(pattern: String) = this()
}

/* static members */
@JSImport("log4javascript", "PatternLayout")
@js.native
object PatternLayout extends js.Object {
  /**
  	 * Built-in date format, equivalent to HH:mm:ss,SSS.
  	 */
  var ABSOLUTETIME_DATEFORMAT: String = js.native
  /**
  	 * Built-in date format, equivalent to dd MMM YYYY HH:mm:ss,SSS.
  	 */
  var DATETIME_DATEFORMAT: String = js.native
  /**
  	 * Built-in conversion pattern, equivalent to %m%n.
  	 */
  var DEFAULT_CONVERSION_PATTERN: String = js.native
  /**
  	 * Built-in date format (and also the default), equivalent to yyyy-MM-dd HH:mm:ss,SSS.
  	 */
  var ISO8601_DATEFORMAT: String = js.native
  /**
  	 * Built-in conversion pattern, equivalent to %r %p %c - %m%n.
  	 */
  var TTCC_CONVERSION_PATTERN: String = js.native
}

