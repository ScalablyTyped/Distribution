package typings.igniteUi.global.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.IgValidatorControlRule")
@js.native
class IgValidatorControlRule protected ()
  extends typings.igniteUi.Infragistics.IgValidatorControlRule {
  def this(formatItems: js.Array[_]) = this()
  def this(name: String) = this()
  /**
    * Formats an error message using rule-specific values (usually from formatItems).
    *
    * @param message The unformatted error message the validator intends to display.
    */
  /* CompleteClass */
  override def formatMessage(message: String): String = js.native
  /* CompleteClass */
  override def getMessageType(): Unit = js.native
  /**
    * Returns an error message for the rule from options
    *
    * @param options
    */
  /* CompleteClass */
  override def getRuleMessage(options: js.Object): Unit = js.native
  /* CompleteClass */
  override def isValid(options: js.Object): Unit = js.native
  /* CompleteClass */
  override def shouldRun(options: js.Object, value: js.Object): Unit = js.native
}

