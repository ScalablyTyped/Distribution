package typings.atJupyterlabApplication.libShellMod.ILabShell

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
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
  val collapsed: Boolean
  /**
    * The current widget that has side area focus.
    */
  val currentWidget: Widget | Null
  /**
    * The collection of widgets held by the sidebar.
    */
  val widgets: js.Array[Widget] | Null
}

object ISideArea {
  @scala.inline
  def apply(collapsed: Boolean, currentWidget: Widget = null, widgets: js.Array[Widget] = null): ISideArea = {
    val __obj = js.Dynamic.literal(collapsed = collapsed)
    if (currentWidget != null) __obj.updateDynamic("currentWidget")(currentWidget)
    if (widgets != null) __obj.updateDynamic("widgets")(widgets)
    __obj.asInstanceOf[ISideArea]
  }
}

