package typings
package atJupyterlabNotebookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/default-toolbar", JSImport.Namespace)
@js.native
object libDefaultDashToolbarMod extends js.Object {
  @JSName("ToolbarItems")
  @js.native
  object ToolbarItemsNs extends js.Object {
    /**
      * Create a cell type switcher item.
      *
      * #### Notes
      * It will display the type of the current active cell.
      * If more than one cell is selected but are of different types,
      * it will display `'-'`.
      * When the user changes the cell type, it will change the
      * cell types of the selected cells.
      * It can handle a change to the context.
      */
    def createCellTypeItem(panel: atJupyterlabNotebookLib.libPanelMod.NotebookPanel): atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget = js.native
    /**
      * Create a copy toolbar item.
      */
    def createCopyButton(panel: atJupyterlabNotebookLib.libPanelMod.NotebookPanel): atJupyterlabApputilsLib.atJupyterlabApputilsMod.ToolbarButton = js.native
    /**
      * Create a cut toolbar item.
      */
    def createCutButton(panel: atJupyterlabNotebookLib.libPanelMod.NotebookPanel): atJupyterlabApputilsLib.atJupyterlabApputilsMod.ToolbarButton = js.native
    /**
      * Create an insert toolbar item.
      */
    def createInsertButton(panel: atJupyterlabNotebookLib.libPanelMod.NotebookPanel): atJupyterlabApputilsLib.atJupyterlabApputilsMod.ToolbarButton = js.native
    /**
      * Create a paste toolbar item.
      */
    def createPasteButton(panel: atJupyterlabNotebookLib.libPanelMod.NotebookPanel): atJupyterlabApputilsLib.atJupyterlabApputilsMod.ToolbarButton = js.native
    /**
      * Create a run toolbar item.
      */
    def createRunButton(panel: atJupyterlabNotebookLib.libPanelMod.NotebookPanel): atJupyterlabApputilsLib.atJupyterlabApputilsMod.ToolbarButton = js.native
    /**
      * Create save button toolbar item.
      */
    def createSaveButton(panel: atJupyterlabNotebookLib.libPanelMod.NotebookPanel): atJupyterlabApputilsLib.atJupyterlabApputilsMod.ToolbarButton = js.native
    /**
      * Get the default toolbar items for panel
      */
    def getDefaultItems(panel: atJupyterlabNotebookLib.libPanelMod.NotebookPanel): js.Array[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IToolbarItem] = js.native
    /**
      * Add the default items to the panel toolbar.
      */
    def populateDefaults(panel: atJupyterlabNotebookLib.libPanelMod.NotebookPanel): scala.Unit = js.native
  }
  
}

