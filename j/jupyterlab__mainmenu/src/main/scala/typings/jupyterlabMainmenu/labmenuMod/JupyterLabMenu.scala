package typings.jupyterlabMainmenu.labmenuMod

import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/mainmenu/lib/labmenu", "JupyterLabMenu")
@js.native
class JupyterLabMenu protected () extends IJupyterLabMenu {
  /**
    * Construct a new menu.
    *
    * @param options - Options for the phosphor menu.
    *
    * @param includeSeparators - whether to include separators between the
    *   groups that are added to the menu.
    */
  def this(options: IOptions) = this()
  def this(options: IOptions, includeSeparators: Boolean) = this()
  
  var _groups: js.Any = js.native
  
  var _includeSeparators: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  /**
    * Whether the menu has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MJupyterLabMenu: Boolean = js.native
  
  /**
    * The underlying Phosphor menu.
    */
  val menu: Menu = js.native
}
