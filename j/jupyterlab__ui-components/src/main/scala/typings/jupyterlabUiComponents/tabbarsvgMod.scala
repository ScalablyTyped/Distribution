package typings.jupyterlabUiComponents

import typings.luminoWidgets.dockpanelMod.DockPanel.IOptions
import typings.luminoWidgets.mod.DockPanel
import typings.luminoWidgets.mod.TabBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabbarsvgMod {
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "DockPanelSvg")
  @js.native
  /**
    * Construct a new dock panel.
    *
    * @param options - The options for initializing the panel.
    */
  class DockPanelSvg () extends DockPanel {
    def this(options: IOptions) = this()
  }
  object DockPanelSvg {
    
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "DockPanelSvg.Renderer")
    @js.native
    class Renderer ()
      extends typings.luminoWidgets.mod.DockPanel.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "DockPanelSvg.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "TabBarSvg")
  @js.native
  /**
    * Construct a new tab bar. Overrides the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  class TabBarSvg[T] () extends TabBar[T] {
    def this(options: typings.luminoWidgets.tabbarMod.TabBar.IOptions[T]) = this()
  }
  object TabBarSvg {
    
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "TabBarSvg.Renderer")
    @js.native
    /**
      * Construct a new renderer.
      */
    class Renderer ()
      extends typings.luminoWidgets.mod.TabBar.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", "TabBarSvg.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
  }
}
