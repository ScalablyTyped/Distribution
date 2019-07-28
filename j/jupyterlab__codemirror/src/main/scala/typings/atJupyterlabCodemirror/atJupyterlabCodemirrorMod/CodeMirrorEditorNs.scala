package typings.atJupyterlabCodemirror.atJupyterlabCodemirrorMod

import typings.atJupyterlabCodemirror.libEditorMod.CodeMirrorEditorNs.IConfig
import typings.codemirror.codemirrorMod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror", "CodeMirrorEditor")
@js.native
object CodeMirrorEditorNs extends js.Object {
  /**
    * The default configuration options for an editor.
    */
  var defaultConfig: IConfig = js.native
  /**
    * Add a command to CodeMirror.
    *
    * @param name - The name of the command to add.
    *
    * @param command - The command function.
    */
  def addCommand(name: String, command: js.Function1[/* cm */ Editor, Unit]): Unit = js.native
}

