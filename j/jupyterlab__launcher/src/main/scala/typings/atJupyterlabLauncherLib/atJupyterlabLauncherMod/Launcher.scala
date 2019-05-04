package typings
package atJupyterlabLauncherLib.atJupyterlabLauncherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/launcher", "Launcher")
@js.native
class Launcher protected ()
  extends atJupyterlabApputilsLib.atJupyterlabApputilsMod.VDomRenderer[LauncherModel] {
  /**
    * Construct a new launcher widget.
    */
  def this(options: atJupyterlabLauncherLib.atJupyterlabLauncherMod.ILauncherNs.IOptions) = this()
  var _callback: js.Any = js.native
  var _commands: js.Any = js.native
  var _cwd: js.Any = js.native
  var _pending: js.Any = js.native
  /**
    * The cwd of the launcher.
    */
  var cwd: java.lang.String = js.native
  /**
    * Whether there is a pending item being launched.
    */
  var pending: scala.Boolean = js.native
}

