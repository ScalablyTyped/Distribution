package typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools

import typings.phosphorMessaging.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A cell metadata editor
  */
@JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.CellMetadataEditorTool")
@js.native
class CellMetadataEditorTool protected () extends MetadataEditorTool {
  def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  var _update: js.Any = js.native
  /**
    * Handle a change to the active cell metadata.
    */
  /* protected */ def onActiveCellMetadataChanged(msg: Message): Unit = js.native
}

