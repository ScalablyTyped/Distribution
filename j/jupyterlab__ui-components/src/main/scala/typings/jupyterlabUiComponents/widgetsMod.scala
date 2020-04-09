package typings.jupyterlabUiComponents

import typings.luminoWidgets.contextmenuMod.ContextMenu.IOptions
import typings.luminoWidgets.mod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components/lib/icon/widgets", JSImport.Namespace)
@js.native
object widgetsMod extends js.Object {
  @js.native
  class ContextMenuSvg protected ()
    extends typings.jupyterlabUiComponents.menusvgMod.ContextMenuSvg {
    /**
      * Construct a new context menu.
      *
      * @param options - The options for initializing the menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new dock panel.
    *
    * @param options - The options for initializing the panel.
    */
  class DockPanelSvg ()
    extends typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg {
    def this(options: typings.luminoWidgets.dockpanelMod.DockPanel.IOptions) = this()
  }
  
  @js.native
  class MenuSvg protected ()
    extends typings.jupyterlabUiComponents.menusvgMod.MenuSvg {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typings.luminoWidgets.menuMod.Menu.IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new tab bar. Overrides the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  class TabBarSvg[T] ()
    extends typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg[T] {
    def this(options: typings.luminoWidgets.tabbarMod.TabBar.IOptions[T]) = this()
  }
  
  @js.native
  object CommandPaletteSvg extends js.Object {
    /**
      * a modified implementation of the CommandPalette Renderer
      */
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.commandpalettesvgMod.CommandPaletteSvg.Renderer
    
    val defaultRenderer: typings.jupyterlabUiComponents.commandpalettesvgMod.CommandPaletteSvg.Renderer = js.native
  }
  
  @js.native
  object DockPanelSvg extends js.Object {
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.Renderer
    
    val defaultRenderer: typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.Renderer = js.native
  }
  
  @js.native
  object MenuSvg extends js.Object {
    /**
      * a modified implementation of the Menu Renderer
      */
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.menusvgMod.MenuSvg.Renderer
    
    val defaultRenderer: typings.jupyterlabUiComponents.menusvgMod.MenuSvg.Renderer = js.native
    def overrideDefaultRenderer(menu: Menu): Unit = js.native
  }
  
  @js.native
  object TabBarSvg extends js.Object {
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.Renderer
    
    val defaultRenderer: typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.Renderer = js.native
  }
  
}

