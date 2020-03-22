package typings.luminoWidgets.docklayoutMod.DockLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported insertion modes.
  *
  * An insert mode is used to specify how a widget should be added
  * to the dock layout relative to a reference widget.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoWidgets.luminoWidgetsStrings.`split-top`
  - typings.luminoWidgets.luminoWidgetsStrings.`split-left`
  - typings.luminoWidgets.luminoWidgetsStrings.`split-right`
  - typings.luminoWidgets.luminoWidgetsStrings.`split-bottom`
  - typings.luminoWidgets.luminoWidgetsStrings.`tab-before`
  - typings.luminoWidgets.luminoWidgetsStrings.`tab-after`
*/
trait InsertMode extends js.Object

object InsertMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `split-bottom`: typings.luminoWidgets.luminoWidgetsStrings.`split-bottom` = this.cast("split-bottom")
  @scala.inline
  def `split-left`: typings.luminoWidgets.luminoWidgetsStrings.`split-left` = this.cast("split-left")
  @scala.inline
  def `split-right`: typings.luminoWidgets.luminoWidgetsStrings.`split-right` = this.cast("split-right")
  @scala.inline
  def `split-top`: typings.luminoWidgets.luminoWidgetsStrings.`split-top` = this.cast("split-top")
  @scala.inline
  def `tab-after`: typings.luminoWidgets.luminoWidgetsStrings.`tab-after` = this.cast("tab-after")
  @scala.inline
  def `tab-before`: typings.luminoWidgets.luminoWidgetsStrings.`tab-before` = this.cast("tab-before")
}

