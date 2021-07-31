package typings.luminoWidgets.mod

import typings.luminoWidgets.splitpanelMod.SplitPanel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
object SplitPanel {
  
  @JSImport("@lumino/widgets", "SplitPanel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default implementation of `IRenderer`.
    */
  @JSImport("@lumino/widgets", "SplitPanel.Renderer")
  @js.native
  class Renderer ()
    extends typings.luminoWidgets.splitpanelMod.SplitPanel.Renderer
  
  /**
    * The default `Renderer` instance.
    */
  @JSImport("@lumino/widgets", "SplitPanel.defaultRenderer")
  @js.native
  val defaultRenderer: typings.luminoWidgets.splitpanelMod.SplitPanel.Renderer = js.native
  
  /**
    * Get the split panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The split panel stretch factor for the widget.
    */
  @scala.inline
  def getStretch(widget: typings.luminoWidgets.widgetMod.Widget): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStretch")(widget.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Set the split panel stretch factor for the given widget.
    *
    * @param widget - The widget of interest.
    *
    * @param value - The value for the stretch factor.
    */
  @scala.inline
  def setStretch(widget: typings.luminoWidgets.widgetMod.Widget, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStretch")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
