package typings.jupyterlabMainmenu.labmenuMod

import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * The underlying Phosphor menu.
    */
  val menu: Menu = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Whether the menu has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MJupyterLabMenu: Boolean = js.native
}

