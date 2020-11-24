package typings.luminoWidgets.mod

import typings.luminoWidgets.splitpanelMod.SplitPanel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/widgets", "SplitPanel")
@js.native
/**
  * Construct a new split panel.
  *
  * @param options - The options for initializing the split panel.
  */
class SplitPanel ()
  extends typings.luminoWidgets.splitpanelMod.SplitPanel {
  def this(options: IOptions) = this()
}
@JSImport("@lumino/widgets", "SplitPanel")
@js.native
object SplitPanel extends js.Object {
  
  /**
    * The default `Renderer` instance.
    */
  val defaultRenderer: typings.luminoWidgets.splitpanelMod.SplitPanel.Renderer = js.native
  
  /**
    * Get the split panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The split panel stretch factor for the widget.
    */
  def getStretch(widget: typings.luminoWidgets.widgetMod.Widget): Double = js.native
  
  /**
    * Set the split panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  def setStretch(widget: typings.luminoWidgets.widgetMod.Widget, value: Double): Unit = js.native
  
  /**
    * The default implementation of `IRenderer`.
    */
  @js.native
  class Renderer ()
    extends typings.luminoWidgets.splitpanelMod.SplitPanel.Renderer
}
