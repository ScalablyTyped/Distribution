package typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools

import typings.atJupyterlabCodeeditor.atJupyterlabCodeeditorMod.JSONEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A raw metadata editor.
  */
@JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.MetadataEditorTool")
@js.native
class MetadataEditorTool_ protected () extends Tool {
  /**
    * Construct a new raw metadata tool.
    */
  def this(options: typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  /**
    * The editor used by the tool.
    */
  val editor: JSONEditor = js.native
}

