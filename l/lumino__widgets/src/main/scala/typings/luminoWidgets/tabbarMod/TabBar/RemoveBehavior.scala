package typings.luminoWidgets.tabbarMod.TabBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the selection behavior on tab remove.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoWidgets.luminoWidgetsStrings.none
  - typings.luminoWidgets.luminoWidgetsStrings.`select-tab-after`
  - typings.luminoWidgets.luminoWidgetsStrings.`select-tab-before`
  - typings.luminoWidgets.luminoWidgetsStrings.`select-previous-tab`
*/
trait RemoveBehavior extends js.Object

object RemoveBehavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.luminoWidgets.luminoWidgetsStrings.none = this.cast("none")
  @scala.inline
  def `select-previous-tab`: typings.luminoWidgets.luminoWidgetsStrings.`select-previous-tab` = this.cast("select-previous-tab")
  @scala.inline
  def `select-tab-after`: typings.luminoWidgets.luminoWidgetsStrings.`select-tab-after` = this.cast("select-tab-after")
  @scala.inline
  def `select-tab-before`: typings.luminoWidgets.luminoWidgetsStrings.`select-tab-before` = this.cast("select-tab-before")
}

