package typings.luminoWidgets.boxlayoutMod.BoxLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a box layout alignment.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoWidgets.luminoWidgetsStrings.start
  - typings.luminoWidgets.luminoWidgetsStrings.center
  - typings.luminoWidgets.luminoWidgetsStrings.end
  - typings.luminoWidgets.luminoWidgetsStrings.justify
*/
trait Alignment extends js.Object

object Alignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.luminoWidgets.luminoWidgetsStrings.center = this.cast("center")
  @scala.inline
  def end: typings.luminoWidgets.luminoWidgetsStrings.end = this.cast("end")
  @scala.inline
  def justify: typings.luminoWidgets.luminoWidgetsStrings.justify = this.cast("justify")
  @scala.inline
  def start: typings.luminoWidgets.luminoWidgetsStrings.start = this.cast("start")
}

