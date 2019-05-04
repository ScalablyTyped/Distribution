package typings
package atJupyterlabCodeeditorLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codeeditor/lib", "CodeEditor")
@js.native
object CodeEditorNs extends js.Object {
  /**
    * The default implementation of the editor model.
    */
  @js.native
  /**
    * Construct a new Model.
    */
  class Model ()
    extends atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.Model {
    def this(options: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.ModelNs.IOptions) = this()
  }
  
  /**
    * The default configuration options for an editor.
    */
  var defaultConfig: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IConfig = js.native
  /**
    * The default selection style.
    */
  val defaultSelectionStyle: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.ISelectionStyle = js.native
}

