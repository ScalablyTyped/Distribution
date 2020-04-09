package typings.jupyterlabNotebook.mod

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabApputils.tokensMod.ISessionContextDialogs
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IToolbarItem
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "ToolbarItems")
@js.native
object ToolbarItems extends js.Object {
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
  def createCellTypeItem(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Create a copy toolbar item.
    */
  def createCopyButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Create a cut toolbar item.
    */
  def createCutButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Create an insert toolbar item.
    */
  def createInsertButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Create a paste toolbar item.
    */
  def createPasteButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Create a restart run all toolbar item
    */
  def createRestartRunAllButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  def createRestartRunAllButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel, dialogs: IDialogs): Widget = js.native
  /**
    * Create a run toolbar item.
    */
  def createRunButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Create save button toolbar item.
    */
  def createSaveButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
  /**
    * Get the default toolbar items for panel
    */
  def getDefaultItems(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): js.Array[IToolbarItem] = js.native
  def getDefaultItems(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel, sessionDialogs: ISessionContextDialogs): js.Array[IToolbarItem] = js.native
}

