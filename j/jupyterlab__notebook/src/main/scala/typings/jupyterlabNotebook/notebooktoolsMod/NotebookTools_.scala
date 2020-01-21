package typings.jupyterlabNotebook.notebooktoolsMod

import typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.IOptions
import typings.jupyterlabNotebook.tokensMod.INotebookTools
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools")
@js.native
class NotebookTools_ protected () extends INotebookTools {
  /**
    * Construct a new NotebookTools object.
    */
  def this(options: IOptions) = this()
  var _advancedTools: js.Any = js.native
  var _commonTools: js.Any = js.native
  /**
    * Handle a change to the active cell.
    */
  var _onActiveCellChanged: js.Any = js.native
  /**
    * Handle a change in the notebook model metadata.
    */
  var _onActiveCellMetadataChanged: js.Any = js.native
  /**
    * Handle a change to the notebook panel.
    */
  var _onActiveNotebookPanelChanged: js.Any = js.native
  /**
    * Handle a change in the active cell metadata.
    */
  var _onActiveNotebookPanelMetadataChanged: js.Any = js.native
  /**
    * Handle a change in the selection.
    */
  var _onSelectionChanged: js.Any = js.native
  var _prevActiveCell: js.Any = js.native
  var _prevActiveNotebookModel: js.Any = js.native
  var _toolChildren: js.Any = js.native
  var _tracker: js.Any = js.native
}

