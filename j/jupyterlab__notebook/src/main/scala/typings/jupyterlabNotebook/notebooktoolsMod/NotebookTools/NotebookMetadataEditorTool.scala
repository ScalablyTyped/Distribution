package typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools

import typings.luminoMessaging.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A notebook metadata editor
  */
@JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.NotebookMetadataEditorTool")
@js.native
class NotebookMetadataEditorTool protected () extends MetadataEditorTool {
  def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  
  var _update: js.Any = js.native
  
  /**
    * Handle a change to the notebook metadata.
    */
  /* protected */ def onActiveNotebookPanelMetadataChanged(msg: Message): Unit = js.native
}
