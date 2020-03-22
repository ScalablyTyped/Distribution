package typings.jupyterlabLauncher.mod

import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabLauncher.mod.ILauncher.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/launcher", "Launcher")
@js.native
class Launcher protected () extends VDomRenderer[LauncherModel] {
  /**
    * Construct a new launcher widget.
    */
  def this(options: IOptions) = this()
  var _callback: js.Any = js.native
  var _commands: js.Any = js.native
  var _cwd: js.Any = js.native
  var _pending: js.Any = js.native
  /**
    * The cwd of the launcher.
    */
  def cwd(): String = js.native
  def cwd(value: String): js.Any = js.native
  /**
    * Whether there is a pending item being launched.
    */
  def pending(): Boolean = js.native
  def pending(value: Boolean): js.Any = js.native
}

