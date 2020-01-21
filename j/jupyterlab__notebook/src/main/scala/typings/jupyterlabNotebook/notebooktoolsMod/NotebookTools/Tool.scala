package typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools

import typings.jupyterlabNotebook.tokensMod.INotebookTools.ITool
import typings.jupyterlabObservables.mod.ObservableJSON.ChangeMessage
import typings.phosphorMessaging.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base notebook tool, meant to be subclassed.
  */
@JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.Tool")
@js.native
class Tool () extends ITool {
  /**
    * Handle a change to the active cell.
    *
    * #### Notes
    * The default implementation is a no-op.
    */
  /* protected */ def onActiveCellChanged(msg: Message): Unit = js.native
  /**
    * Handle a change to the metadata of the active cell.
    *
    * #### Notes
    * The default implementation is a no-op.
    */
  /* protected */ def onActiveCellMetadataChanged(msg: ChangeMessage): Unit = js.native
  /**
    * Handle a change to the notebook panel.
    *
    * #### Notes
    * The default implementation is a no-op.
    */
  /* protected */ def onActiveNotebookPanelChanged(msg: Message): Unit = js.native
  /**
    * Handle a change to the metadata of the active cell.
    *
    * #### Notes
    * The default implementation is a no-op.
    */
  /* protected */ def onActiveNotebookPanelMetadataChanged(msg: ChangeMessage): Unit = js.native
  /**
    * Handle a change to the selection.
    *
    * #### Notes
    * The default implementation is a no-op.
    */
  /* protected */ def onSelectionChanged(msg: Message): Unit = js.native
}

