package typings.jupyterlabSettingeditor

import typings.luminoWidgets.typesSplitpanelMod.SplitPanel.IOptions
import typings.luminoWidgets.typesWidgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSplitpanelMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/splitpanel", "SplitPanel")
  @js.native
  /**
    * Construct a new split panel.
    *
    * @param options - The options for initializing the split panel.
    */
  open class SplitPanel ()
    extends typings.luminoWidgets.mod.SplitPanel {
    def this(options: IOptions) = this()
  }
  object SplitPanel {
    
    @JSImport("@jupyterlab/settingeditor/lib/splitpanel", "SplitPanel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default implementation of `IRenderer`.
      */
    @JSImport("@jupyterlab/settingeditor/lib/splitpanel", "SplitPanel.Renderer")
    @js.native
    open class Renderer ()
      extends typings.luminoWidgets.mod.SplitPanel.Renderer
    
    /**
      * The default `Renderer` instance.
      */
    @JSImport("@jupyterlab/settingeditor/lib/splitpanel", "SplitPanel.defaultRenderer")
    @js.native
    val defaultRenderer: typings.luminoWidgets.typesSplitpanelMod.SplitPanel.Renderer = js.native
    
    /**
      * Get the split panel stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The split panel stretch factor for the widget.
      */
    inline def getStretch(widget: Widget): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStretch")(widget.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Set the split panel stretch factor for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the stretch factor.
      */
    inline def setStretch(widget: Widget, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStretch")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
