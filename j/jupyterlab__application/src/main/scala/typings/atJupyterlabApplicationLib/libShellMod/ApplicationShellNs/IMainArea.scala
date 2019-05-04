package typings
package atJupyterlabApplicationLib.libShellMod.ApplicationShellNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The restorable description of the main application area.
  */
trait IMainArea extends js.Object {
  /**
    * The current widget that has application focus.
    */
  val currentWidget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget | scala.Null
  /**
    * The contents of the main application dock panel.
    */
  val dock: atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.ILayoutConfig | scala.Null
  /**
    * The document mode (i.e., multiple/single) of the main dock panel.
    */
  val mode: atPhosphorWidgetsLib.libDockpanelMod.DockPanelNs.Mode | scala.Null
}

object IMainArea {
  @scala.inline
  def apply(
    currentWidget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget = null,
    dock: atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.ILayoutConfig = null,
    mode: atPhosphorWidgetsLib.libDockpanelMod.DockPanelNs.Mode = null
  ): IMainArea = {
    val __obj = js.Dynamic.literal()
    if (currentWidget != null) __obj.updateDynamic("currentWidget")(currentWidget)
    if (dock != null) __obj.updateDynamic("dock")(dock)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[IMainArea]
  }
}

