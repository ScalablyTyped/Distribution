package typings.jupyterlabUiComponents

import typings.luminoWidgets.dockpanelMod.DockPanel.IOptions
import typings.luminoWidgets.mod.DockPanel
import typings.luminoWidgets.mod.TabBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/ui-components/lib/icon/widgets/tabbarsvg", JSImport.Namespace)
@js.native
object tabbarsvgMod extends js.Object {
  
  @js.native
  /**
    * Construct a new dock panel.
    *
    * @param options - The options for initializing the panel.
    */
  class DockPanelSvg () extends DockPanel {
    def this(options: IOptions) = this()
  }
  @js.native
  object DockPanelSvg extends js.Object {
    
    val defaultRenderer: Renderer = js.native
    
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @js.native
    class Renderer ()
      extends typings.luminoWidgets.dockpanelMod.DockPanel.Renderer
  }
  
  @js.native
  /**
    * Construct a new tab bar. Overrides the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  class TabBarSvg[T] () extends TabBar[T] {
    def this(options: typings.luminoWidgets.tabbarMod.TabBar.IOptions[T]) = this()
  }
  @js.native
  object TabBarSvg extends js.Object {
    
    val defaultRenderer: Renderer = js.native
    
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @js.native
    class Renderer ()
      extends typings.luminoWidgets.mod.TabBar.Renderer
  }
}
