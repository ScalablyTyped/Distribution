package typings.atJupyterlabNotebook

import typings.atJupyterlabApputils.libVdomMod.VDomModel
import typings.atJupyterlabApputils.libVdomMod.VDomRenderer
import typings.atJupyterlabNotebook.atJupyterlabNotebookMod.Notebook
import typings.atJupyterlabNotebook.libTruststatusMod.NotebookTrustStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/truststatus", JSImport.Namespace)
@js.native
object libTruststatusMod extends js.Object {
  @js.native
  /**
    * Construct a new status item.
    */
  class NotebookTrustStatus () extends VDomRenderer[Model]
  
  @js.native
  object NotebookTrustStatus extends js.Object {
    /**
      * A VDomModel for the NotebookTrust status item.
      */
    @js.native
    class Model () extends VDomModel {
      var _activeCellTrusted: js.Any = js.native
      /**
        * Given a notebook model, figure out how many of the cells are trusted.
        */
      var _deriveCellTrustState: js.Any = js.native
      /**
        * Get the current state of the model.
        */
      var _getAllState: js.Any = js.native
      var _notebook: js.Any = js.native
      /**
        * When the active cell changes, update the trust state.
        */
      var _onActiveCellChanged: js.Any = js.native
      /**
        * When the notebook model changes, update the trust state.
        */
      var _onModelChanged: js.Any = js.native
      var _totalCells: js.Any = js.native
      /**
        * Trigger a change in the renderer.
        */
      var _triggerChange: js.Any = js.native
      var _trustedCells: js.Any = js.native
      /**
        * Whether the active cell is trusted.
        */
      val activeCellTrusted: Boolean = js.native
      /**
        * The current notebook for the model.
        */
      var notebook: Notebook | Null = js.native
      /**
        * The total number of cells in the current notebook.
        */
      val totalCells: Double = js.native
      /**
        * The number of trusted cells in the current notebook.
        */
      val trustedCells: Double = js.native
    }
    
  }
  
}

