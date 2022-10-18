package typings.jupyterlabUiComponents

import typings.luminoWidgets.mod.Menu
import typings.luminoWidgets.typesContextmenuMod.ContextMenu.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconWidgetsMod {
  
  object CommandPaletteSvg {
    
    /**
      * a modified implementation of the CommandPalette Renderer
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "CommandPaletteSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typings.jupyterlabUiComponents.libIconWidgetsCommandpalettesvgMod.CommandPaletteSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "CommandPaletteSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabUiComponents.libIconWidgetsCommandpalettesvgMod.CommandPaletteSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "ContextMenuSvg")
  @js.native
  open class ContextMenuSvg protected ()
    extends typings.jupyterlabUiComponents.libIconWidgetsMenusvgMod.ContextMenuSvg {
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
  open class DockPanelSvg ()
    extends typings.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.DockPanelSvg {
    def this(options: typings.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.DockPanelSvg.IOptions) = this()
  }
  object DockPanelSvg {
    
    /**
      * A modified implementation of the DockPanel Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "DockPanelSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typings.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.DockPanelSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "DockPanelSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.DockPanelSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "MenuSvg")
  @js.native
  open class MenuSvg protected ()
    extends typings.jupyterlabUiComponents.libIconWidgetsMenusvgMod.MenuSvg {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typings.luminoWidgets.typesMenuMod.Menu.IOptions) = this()
  }
  object MenuSvg {
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "MenuSvg")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * a modified implementation of the Menu Renderer
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "MenuSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typings.jupyterlabUiComponents.libIconWidgetsMenusvgMod.MenuSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "MenuSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabUiComponents.libIconWidgetsMenusvgMod.MenuSvg.Renderer = js.native
    
    inline def overrideDefaultRenderer(menu: Menu): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideDefaultRenderer")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "TabBarSvg")
  @js.native
  /**
    * Construct a new tab bar. Overrides the default renderer.
    *
    * @param options - The options for initializing the tab bar.
    */
  open class TabBarSvg[T] ()
    extends typings.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg[T] {
    def this(options: typings.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg.IOptions[T]) = this()
  }
  object TabBarSvg {
    
    /**
      * A modified implementation of the TabBar Renderer.
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "TabBarSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typings.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "TabBarSvg.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabBarSvg.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets", "TabPanelSvg")
  @js.native
  /**
    * Construct a new tab panel.
    *
    * @param options - The options for initializing the tab panel.
    */
  open class TabPanelSvg ()
    extends typings.jupyterlabUiComponents.libIconWidgetsTabbarsvgMod.TabPanelSvg {
    def this(options: typings.luminoWidgets.typesTabpanelMod.TabPanel.IOptions) = this()
  }
}
