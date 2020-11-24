package typings.luminoWidgets.stackedpanelMod

import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.panelMod.Panel
import typings.luminoWidgets.stackedpanelMod.StackedPanel.IOptions
import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets/types/stackedpanel", "StackedPanel")
@js.native
/**
  * Construct a new stacked panel.
  *
  * @param options - The options for initializing the panel.
  */
class StackedPanel_ () extends Panel {
  def this(options: IOptions) = this()
  
  var _widgetRemoved: js.Any = js.native
  
  /**
    * A signal emitted when a widget is removed from a stacked panel.
    */
  val widgetRemoved: ISignal[this.type, Widget] = js.native
}
