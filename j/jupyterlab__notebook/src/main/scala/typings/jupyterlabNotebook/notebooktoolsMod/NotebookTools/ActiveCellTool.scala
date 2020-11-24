package typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A cell tool displaying the active cell contents.
  */
@JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.ActiveCellTool")
@js.native
/**
  * Construct a new active cell tool.
  */
class ActiveCellTool () extends Tool {
  
  var _cellModel: js.Any = js.native
  
  var _model: js.Any = js.native
  
  /**
    * Handle a change to the current editor mimetype.
    */
  var _onMimeTypeChanged: js.Any = js.native
  
  /**
    * Handle a change to the current editor value.
    */
  var _onValueChanged: js.Any = js.native
  
  /**
    * Handle a change to the active cell.
    */
  /* protected */ def onActiveCellChanged(): Unit = js.native
}
