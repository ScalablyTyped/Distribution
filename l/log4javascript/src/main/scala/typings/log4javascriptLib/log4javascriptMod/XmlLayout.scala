package typings
package log4javascriptLib.log4javascriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4javascript", "XmlLayout")
@js.native
/**
	 * Constructor
	 * @param combineMessages Whether or not to format multiple log messages as a combined single <log4javascript:message>
	 * element composed of each individual message separated by line breaks or to include a <log4javascript:message> element for
	 * each message inside one <log4javascript:messages> element. If not specified, defaults to true.
	 */
class XmlLayout () extends Layout {
  def this(combineMessages: scala.Boolean) = this()
}

