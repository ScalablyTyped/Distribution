package typings.atJupyterlabMainmenu.libRunMod

import typings.atJupyterlabMainmenu.libLabmenuMod.JupyterLabMenu
import typings.atPhosphorWidgets.libMenuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/run", "RunMenu")
@js.native
class RunMenu protected ()
  extends JupyterLabMenu
     with IRunMenu {
  /**
    * Construct the run menu.
    */
  def this(options: IOptions) = this()
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
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
}

