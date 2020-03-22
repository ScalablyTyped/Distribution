package typings.jupyterlabUiComponents

import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", JSImport.Namespace)
@js.native
object menusvgMod extends js.Object {
  @js.native
  class MenuSvg protected () extends Menu {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: IOptions) = this()
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
  }
  
}

