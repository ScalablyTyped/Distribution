package typings.atJupyterlabApplication.libShellMod.ILabShellNs

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.atPhosphorWidgets.libDocklayoutMod.DockLayoutNs.ILayoutConfig
import typings.atPhosphorWidgets.libDockpanelMod.DockPanelNs.Mode
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
  val currentWidget: Widget | Null
  /**
    * The contents of the main application dock panel.
    */
  val dock: ILayoutConfig | Null
  /**
    * The document mode (i.e., multiple/single) of the main dock panel.
    */
  val mode: Mode | Null
}

object IMainArea {
  @scala.inline
  def apply(currentWidget: Widget = null, dock: ILayoutConfig = null, mode: Mode = null): IMainArea = {
    val __obj = js.Dynamic.literal()
    if (currentWidget != null) __obj.updateDynamic("currentWidget")(currentWidget)
    if (dock != null) __obj.updateDynamic("dock")(dock)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[IMainArea]
  }
}

