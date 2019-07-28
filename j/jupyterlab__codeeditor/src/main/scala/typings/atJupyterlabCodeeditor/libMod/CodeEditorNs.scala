package typings.atJupyterlabCodeeditor.libMod

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IConfig
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.ISelectionStyle
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.ModelNs.IOptions
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
    extends typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.Model {
    def this(options: IOptions) = this()
  }
  
  /**
    * The default configuration options for an editor.
    */
  var defaultConfig: IConfig = js.native
  /**
    * The default selection style.
    */
  val defaultSelectionStyle: ISelectionStyle = js.native
}

