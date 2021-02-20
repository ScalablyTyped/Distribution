package typings.jupyterlabUiComponents

import typings.luminoWidgets.contextmenuMod.ContextMenu.IOptions
import typings.luminoWidgets.mod.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetsMod {
  
  object CommandPaletteSvg {
    
    /**
      * a modified implementation of the CommandPalette Renderer
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "CommandPaletteSvg.Renderer")
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.commandpalettesvgMod.CommandPaletteSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "CommandPaletteSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabUiComponents.commandpalettesvgMod.CommandPaletteSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "ContextMenuSvg")
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
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "DockPanelSvg")
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
  object DockPanelSvg {
    
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "DockPanelSvg.Renderer")
    @js.native
    class Renderer ()
      extends typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "DockPanelSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabUiComponents.tabbarsvgMod.DockPanelSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "MenuSvg")
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
  object MenuSvg {
    
    /**
      * a modified implementation of the Menu Renderer
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "MenuSvg.Renderer")
    @js.native
    /**
      * Construct a new renderer.
      */
    class Renderer ()
      extends typings.jupyterlabUiComponents.menusvgMod.MenuSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "MenuSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabUiComponents.menusvgMod.MenuSvg.Renderer = js.native
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "MenuSvg.overrideDefaultRenderer")
    @js.native
    def overrideDefaultRenderer(menu: Menu): Unit = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "TabBarSvg")
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
  object TabBarSvg {
    
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "TabBarSvg.Renderer")
    @js.native
    /**
      * Construct a new renderer.
      */
    class Renderer ()
      extends typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "TabBarSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabUiComponents.tabbarsvgMod.TabBarSvg.Renderer = js.native
  }
}
