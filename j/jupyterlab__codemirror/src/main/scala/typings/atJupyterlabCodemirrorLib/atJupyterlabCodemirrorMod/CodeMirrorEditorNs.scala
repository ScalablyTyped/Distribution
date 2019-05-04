package typings
package atJupyterlabCodemirrorLib.atJupyterlabCodemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror", "CodeMirrorEditor")
@js.native
object CodeMirrorEditorNs extends js.Object {
  /**
    * The default configuration options for an editor.
    */
  var defaultConfig: atJupyterlabCodemirrorLib.libEditorMod.CodeMirrorEditorNs.IConfig = js.native
  /**
    * Add a command to CodeMirror.
    *
    * @param name - The name of the command to add.
    *
    * @param command - The command function.
    */
  def addCommand(
    name: java.lang.String,
    command: js.Function1[/* cm */ codemirrorLib.codemirrorMod.Editor, scala.Unit]
  ): scala.Unit = js.native
}

