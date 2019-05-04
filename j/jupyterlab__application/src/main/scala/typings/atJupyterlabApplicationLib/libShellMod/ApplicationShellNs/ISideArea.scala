package typings
package atJupyterlabApplicationLib.libShellMod.ApplicationShellNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The restorable description of a sidebar in the user interface.
  */
trait ISideArea extends js.Object {
  /**
    * A flag denoting whether the sidebar has been collapsed.
    */
  val collapsed: scala.Boolean
  /**
    * The current widget that has side area focus.
    */
  val currentWidget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget | scala.Null
  /**
    * The collection of widgets held by the sidebar.
    */
  val widgets: js.Array[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] | scala.Null
}

object ISideArea {
  @scala.inline
  def apply(
    collapsed: scala.Boolean,
    currentWidget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget = null,
    widgets: js.Array[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = null
  ): ISideArea = {
    val __obj = js.Dynamic.literal(collapsed = collapsed)
    if (currentWidget != null) __obj.updateDynamic("currentWidget")(currentWidget)
    if (widgets != null) __obj.updateDynamic("widgets")(widgets)
    __obj.asInstanceOf[ISideArea]
  }
}

