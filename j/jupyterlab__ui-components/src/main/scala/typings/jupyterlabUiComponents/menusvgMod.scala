package typings.jupyterlabUiComponents

import typings.luminoWidgets.contextmenuMod.ContextMenu.IOptions
import typings.luminoWidgets.mod.ContextMenu
import typings.luminoWidgets.mod.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menusvgMod {
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "ContextMenuSvg")
  @js.native
  class ContextMenuSvg protected () extends ContextMenu {
    /**
      * Construct a new context menu.
      *
      * @param options - The options for initializing the menu.
      */
    def this(options: IOptions) = this()
    
    @JSName("menu")
    val menu_ContextMenuSvg: MenuSvg = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "MenuSvg")
  @js.native
  class MenuSvg protected () extends Menu {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typings.luminoWidgets.menuMod.Menu.IOptions) = this()
  }
  object MenuSvg {
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "MenuSvg")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * a modified implementation of the Menu Renderer
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "MenuSvg.Renderer")
    @js.native
    /**
      * Construct a new renderer.
      */
    class Renderer ()
      extends typings.luminoWidgets.mod.Menu.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "MenuSvg.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    inline def overrideDefaultRenderer(menu: Menu): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideDefaultRenderer")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
