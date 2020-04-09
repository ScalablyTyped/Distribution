package typings.jupyterlabUiComponents

import typings.luminoWidgets.contextmenuMod.ContextMenu.IOptions
import typings.luminoWidgets.mod.ContextMenu
import typings.luminoWidgets.mod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", JSImport.Namespace)
@js.native
object menusvgMod extends js.Object {
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
  
  @js.native
  class MenuSvg protected () extends Menu {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typings.luminoWidgets.menuMod.Menu.IOptions) = this()
  }
  
  @js.native
  object MenuSvg extends js.Object {
    /**
      * a modified implementation of the Menu Renderer
      */
    @js.native
    class Renderer ()
      extends typings.luminoWidgets.mod.Menu.Renderer
    
    val defaultRenderer: Renderer = js.native
    def overrideDefaultRenderer(menu: Menu): Unit = js.native
  }
  
}

