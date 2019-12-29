package typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools

import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A notebook metadata editor
  */
@JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.NotebookMetadataEditorTool")
@js.native
class NotebookMetadataEditorTool protected () extends MetadataEditorTool {
  def this(options: typings.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  var _update: js.Any = js.native
  /**
    * Handle a change to the notebook metadata.
    */
  /* protected */ def onActiveNotebookPanelMetadataChanged(msg: Message): Unit = js.native
}

