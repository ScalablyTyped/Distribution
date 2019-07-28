package typings.igniteDashUi.InfragisticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.IgValidatorLengthRule")
@js.native
class IgValidatorLengthRule protected () extends js.Object {
  def this(formatItems: js.Array[_]) = this()
  def this(name: String) = this()
  /**
  	 * Formats an error message using rule-specific values (usually from formatItems).
  	 *
  	 * @param message The unformatted error message the validator intends to display.
  	 */
  def formatMessage(message: String): String = js.native
  def getMessageType(): Unit = js.native
  /**
  	 * Gets an errorMessage from either the rule or field/global options.
  	 *
  	 * @param options
  	 */
  def getRuleMessage(options: js.Object): String = js.native
  def isValid(options: js.Object, value: js.Object): Unit = js.native
  /**
  	 * Checks if rule should run on the current field and/or value.
  	 *
  	 * @param options Options for the validator, if fields are used this parameter is already populated with inherited ones.
  	 * @param value The stringified value to check.
  	 */
  def shouldRun(options: js.Object, value: String): Boolean = js.native
}

