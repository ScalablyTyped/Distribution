package typings.jupyterlabNotebook

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabNotebook.mod.Notebook
import typings.jupyterlabNotebook.modestatusMod.CommandEditStatus.Model
import typings.jupyterlabNotebook.widgetMod.NotebookMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modestatusMod {
  
  @JSImport("@jupyterlab/notebook/lib/modestatus", "CommandEditStatus")
  @js.native
  /**
    * Construct a new CommandEdit status item.
    */
  class CommandEditStatus () extends VDomRenderer[Model]
  object CommandEditStatus {
    
    /**
      * A VDomModle for the CommandEdit renderer.
      */
    @JSImport("@jupyterlab/notebook/lib/modestatus", "CommandEditStatus.Model")
    @js.native
    class Model () extends VDomModel {
      
      var _notebook: js.Any = js.native
      
      var _notebookMode: js.Any = js.native
      
      /**
        * On a change to the notebook, update the mode.
        */
      var _onChanged: js.Any = js.native
      
      /**
        * Trigger a state change for the renderer.
        */
      var _triggerChange: js.Any = js.native
      
      /**
        * The current mode of the current notebook.
        */
      def notebookMode: NotebookMode = js.native
      
      /**
        * Set the current notebook for the model.
        */
      def notebook_=(notebook: Notebook | Null): Unit = js.native
    }
  }
}
