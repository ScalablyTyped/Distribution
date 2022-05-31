package typings.jupyterlabNotebook

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabNotebook.mod.Notebook
import typings.jupyterlabNotebook.truststatusMod.NotebookTrustStatus.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object truststatusMod {
  
  @JSImport("@jupyterlab/notebook/lib/truststatus", "NotebookTrustStatus")
  @js.native
  /**
    * Construct a new status item.
    */
  class NotebookTrustStatus () extends VDomRenderer[Model]
  object NotebookTrustStatus {
    
    /**
      * A VDomModel for the NotebookTrust status item.
      */
    @JSImport("@jupyterlab/notebook/lib/truststatus", "NotebookTrustStatus.Model")
    @js.native
    class Model () extends VDomModel {
      
      /* private */ var _activeCellTrusted: js.Any = js.native
      
      /**
        * Given a notebook model, figure out how many of the cells are trusted.
        */
      /* private */ var _deriveCellTrustState: js.Any = js.native
      
      /**
        * Get the current state of the model.
        */
      /* private */ var _getAllState: js.Any = js.native
      
      /* private */ var _notebook: js.Any = js.native
      
      /**
        * When the active cell changes, update the trust state.
        */
      /* private */ var _onActiveCellChanged: js.Any = js.native
      
      /**
        * When the notebook model changes, update the trust state.
        */
      /* private */ var _onModelChanged: js.Any = js.native
      
      /* private */ var _totalCells: js.Any = js.native
      
      /**
        * Trigger a change in the renderer.
        */
      /* private */ var _triggerChange: js.Any = js.native
      
      /* private */ var _trustedCells: js.Any = js.native
      
      /**
        * Whether the active cell is trusted.
        */
      def activeCellTrusted: Boolean = js.native
      
      /**
        * The current notebook for the model.
        */
      def notebook: Notebook | Null = js.native
      def notebook_=(model: Notebook | Null): Unit = js.native
      
      /**
        * The total number of cells in the current notebook.
        */
      def totalCells: Double = js.native
      
      /**
        * The number of trusted cells in the current notebook.
        */
      def trustedCells: Double = js.native
    }
  }
}
