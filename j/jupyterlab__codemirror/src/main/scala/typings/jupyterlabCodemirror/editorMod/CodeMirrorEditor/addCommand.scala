package typings.jupyterlabCodemirror.editorMod.CodeMirrorEditor

import typings.codemirror.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor.addCommand")
@js.native
object addCommand extends js.Object {
  /**
    * Add a command to CodeMirror.
    *
    * @param name - The name of the command to add.
    *
    * @param command - The command function.
    */
  def apply(name: String, command: js.Function1[/* cm */ Editor, Unit]): Unit = js.native
}

