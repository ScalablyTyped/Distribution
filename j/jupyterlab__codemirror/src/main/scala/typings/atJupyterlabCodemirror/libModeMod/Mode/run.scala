package typings.atJupyterlabCodemirror.libModeMod.Mode

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/mode", "Mode.run")
@js.native
object run extends js.Object {
  /**
    * Running a CodeMirror mode outside of an editor.
    */
  def apply(code: String, mode: String, el: HTMLElement): Unit = js.native
  def apply(code: String, mode: ISpec, el: HTMLElement): Unit = js.native
}

