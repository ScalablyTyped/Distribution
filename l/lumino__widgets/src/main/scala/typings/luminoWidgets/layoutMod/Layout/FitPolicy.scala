package typings.luminoWidgets.layoutMod.Layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the layout fit policy.
  *
  * #### Notes
  * The fit policy controls the computed size constraints which are
  * applied to the parent widget by the layout.
  *
  * Some layout implementations may ignore the fit policy.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoWidgets.luminoWidgetsStrings.`set-no-constraint`
  - typings.luminoWidgets.luminoWidgetsStrings.`set-min-size`
*/
trait FitPolicy extends js.Object

object FitPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `set-min-size`: typings.luminoWidgets.luminoWidgetsStrings.`set-min-size` = this.cast("set-min-size")
  @scala.inline
  def `set-no-constraint`: typings.luminoWidgets.luminoWidgetsStrings.`set-no-constraint` = this.cast("set-no-constraint")
}

