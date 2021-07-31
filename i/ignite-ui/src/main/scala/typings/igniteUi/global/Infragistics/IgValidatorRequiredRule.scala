package typings.igniteUi.global.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Infragistics.IgValidatorRequiredRule")
@js.native
class IgValidatorRequiredRule protected ()
  extends StObject
     with typings.igniteUi.Infragistics.IgValidatorRequiredRule {
  def this(groupTypes: js.Array[js.Any]) = this()
  def this(name: String) = this()
  
  /**
    * Formats an error message using rule-specific values (usually from formatItems).
    *
    * @param message The unformatted error message the validator intends to display.
    */
  /* CompleteClass */
  override def formatMessage(message: String): String = js.native
  
  /* CompleteClass */
  override def getMessageType(options: js.Object): Unit = js.native
  
  /**
    * Gets an errorMessage from either the rule or field/global options.
    *
    * @param options
    */
  /* CompleteClass */
  override def getRuleMessage(options: js.Object): String = js.native
  
  /* CompleteClass */
  override def isValid(options: js.Object, value: js.Object): Unit = js.native
  
  /* CompleteClass */
  override def shouldRun(options: js.Object): Unit = js.native
}
