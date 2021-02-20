package typings.jupyterlabNotebook

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabApputils.tokensMod.ISessionContextDialogs
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IToolbarItem
import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.above
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.below
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.replace
import typings.jupyterlabNotebook.modelMod.INotebookModel
import typings.jupyterlabNotebook.widgetMod.Notebook.IContentFactory
import typings.jupyterlabNotebook.widgetMod.Notebook.IOptions
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import typings.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory.IFactory
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoCoreutils.mod.Token
import typings.luminoMessaging.mod.ConflatableMessage
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/notebook", "CellTypeSwitcher")
  @js.native
  class CellTypeSwitcher protected ()
    extends typings.jupyterlabNotebook.defaultToolbarMod.CellTypeSwitcher {
    /**
      * Construct a new cell type switcher.
      */
    def this(widget: typings.jupyterlabNotebook.widgetMod.Notebook) = this()
  }
  
  @JSImport("@jupyterlab/notebook", "CommandEditStatus")
  @js.native
  /**
    * Construct a new CommandEdit status item.
    */
  class CommandEditStatus ()
    extends typings.jupyterlabNotebook.modestatusMod.CommandEditStatus
  object CommandEditStatus {
    
    /**
      * A VDomModle for the CommandEdit renderer.
      */
    @JSImport("@jupyterlab/notebook", "CommandEditStatus.Model")
    @js.native
    class Model ()
      extends typings.jupyterlabNotebook.modestatusMod.CommandEditStatus.Model
  }
  
  object INotebookTools extends Shortcut {
    
    @JSImport("@jupyterlab/notebook", "INotebookTools")
    @js.native
    val ^ : Token[typings.jupyterlabNotebook.tokensMod.INotebookTools] = js.native
    
    type _To = Token[typings.jupyterlabNotebook.tokensMod.INotebookTools]
    
    /* This means you don't have to write `^`, but can instead just say `INotebookTools.foo` */
    override def _to: Token[typings.jupyterlabNotebook.tokensMod.INotebookTools] = ^
  }
  
  @JSImport("@jupyterlab/notebook", "INotebookTracker")
  @js.native
  val INotebookTracker: Token[typings.jupyterlabNotebook.tokensMod.INotebookTracker] = js.native
  
  @JSImport("@jupyterlab/notebook", "INotebookWidgetFactory")
  @js.native
  val INotebookWidgetFactory: Token[IFactory] = js.native
  
  @JSImport("@jupyterlab/notebook", "Notebook")
  @js.native
  class Notebook protected ()
    extends typings.jupyterlabNotebook.widgetMod.Notebook {
    /**
      * Construct a notebook widget.
      */
    def this(options: IOptions) = this()
  }
  object Notebook {
    
    /**
      * The default implementation of a notebook content factory..
      *
      * #### Notes
      * Override methods on this class to customize the default notebook factory
      * methods that create notebook content.
      */
    @JSImport("@jupyterlab/notebook", "Notebook.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    class ContentFactory ()
      extends typings.jupyterlabNotebook.widgetMod.Notebook.ContentFactory {
      def this(options: typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
    }
    /**
      * A namespace for the notebook content factory.
      */
    object ContentFactory
    
    @JSImport("@jupyterlab/notebook", "Notebook.defaultContentFactory")
    @js.native
    val defaultContentFactory: IContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/notebook", "NotebookActions")
  @js.native
  /**
    * A private constructor for the `NotebookActions` class.
    *
    * #### Notes
    * This class can never be instantiated. Its static member `executed` will be
    * merged with the `NotebookActions` namespace. The reason it exists as a
    * standalone class is because at run time, the `Private.executed` variable
    * does not yet exist, so it needs to be referenced via a getter.
    */
  class NotebookActions protected ()
    extends typings.jupyterlabNotebook.actionsMod.NotebookActions
  object NotebookActions {
    
    /**
      * Change the selected cell type(s).
      *
      * @param notebook - The target notebook widget.
      *
      * @param value - The target cell type.
      *
      * #### Notes
      * It should preserve the widget mode.
      * This action can be undone.
      * The existing selection will be cleared.
      * Any cells converted to markdown will be unrendered.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.changeCellType")
    @js.native
    def changeCellType(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, value: CellType): Unit = js.native
    
    /**
      * Clear all the code outputs on the widget.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget `mode` will be preserved.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.clearAllOutputs")
    @js.native
    def clearAllOutputs(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Clear the code outputs of the selected cells.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget `mode` will be preserved.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.clearOutputs")
    @js.native
    def clearOutputs(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Copy the selected cell data to a clipboard.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.copy")
    @js.native
    def copy(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Cut the selected cell data to a clipboard.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * This action can be undone.
      * A new code cell is added if all cells are cut.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.cut")
    @js.native
    def cut(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Delete the selected cells.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The cell after the last selected cell will be activated.
      * It will add a code cell if all cells are deleted.
      * This action can be undone.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.deleteCells")
    @js.native
    def deleteCells(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Deselect all of the cells of the notebook.
      *
      * @param notebook - the targe notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.deselectAll")
    @js.native
    def deselectAll(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Disable output scrolling for all selected cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.disableOutputScrolling")
    @js.native
    def disableOutputScrolling(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Enable output scrolling for all selected cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.enableOutputScrolling")
    @js.native
    def enableOutputScrolling(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Extend the selection to the cell above.
      *
      * @param notebook - The target notebook widget.
      * @param toTop - If true, denotes selection to extend to the top.
      *
      * #### Notes
      * This is a no-op if the first cell is the active cell.
      * The new cell will be activated.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.extendSelectionAbove")
    @js.native
    def extendSelectionAbove(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    @JSImport("@jupyterlab/notebook", "NotebookActions.extendSelectionAbove")
    @js.native
    def extendSelectionAbove(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, toTop: Boolean): Unit = js.native
    
    /**
      * Extend the selection to the cell below.
      *
      * @param notebook - The target notebook widget.
      * @param toBottom - If true, denotes selection to extend to the bottom.
      *
      * #### Notes
      * This is a no-op if the last cell is the active cell.
      * The new cell will be activated.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.extendSelectionBelow")
    @js.native
    def extendSelectionBelow(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    @JSImport("@jupyterlab/notebook", "NotebookActions.extendSelectionBelow")
    @js.native
    def extendSelectionBelow(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, toBottom: Boolean): Unit = js.native
    
    /**
      * Hide the code on all code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.hideAllCode")
    @js.native
    def hideAllCode(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Hide the output on all code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.hideAllOutputs")
    @js.native
    def hideAllOutputs(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Hide the code on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.hideCode")
    @js.native
    def hideCode(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Hide the output on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.hideOutput")
    @js.native
    def hideOutput(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Insert a new code cell above the active cell.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget mode will be preserved.
      * This action can be undone.
      * The existing selection will be cleared.
      * The new cell will the active cell.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.insertAbove")
    @js.native
    def insertAbove(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Insert a new code cell below the active cell.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget mode will be preserved.
      * This action can be undone.
      * The existing selection will be cleared.
      * The new cell will be the active cell.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.insertBelow")
    @js.native
    def insertBelow(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Merge the selected cells.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget mode will be preserved.
      * If only one cell is selected, the next cell will be selected.
      * If the active cell is a code cell, its outputs will be cleared.
      * This action can be undone.
      * The final cell will have the same type as the active cell.
      * If the active cell is a markdown cell, it will be unrendered.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.mergeCells")
    @js.native
    def mergeCells(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Move the selected cell(s) down.
      *
      * @param notebook = The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.moveDown")
    @js.native
    def moveDown(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Move the selected cell(s) up.
      *
      * @param widget - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.moveUp")
    @js.native
    def moveUp(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Paste cells from the application clipboard.
      *
      * @param notebook - The target notebook widget.
      *
      * @param mode - the mode of the paste operation: 'below' pastes cells
      *   below the active cell, 'above' pastes cells above the active cell,
      *   and 'replace' removes the currently selected cells and pastes cells
      *   in their place.
      *
      * #### Notes
      * The last pasted cell becomes the active cell.
      * This is a no-op if there is no cell data on the clipboard.
      * This action can be undone.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.paste")
    @js.native
    def paste(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    @JSImport("@jupyterlab/notebook", "NotebookActions.paste")
    @js.native
    def paste_above(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, mode: above): Unit = js.native
    @JSImport("@jupyterlab/notebook", "NotebookActions.paste")
    @js.native
    def paste_below(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, mode: below): Unit = js.native
    @JSImport("@jupyterlab/notebook", "NotebookActions.paste")
    @js.native
    def paste_replace(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, mode: replace): Unit = js.native
    
    /**
      * Redo a cell action.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * This is a no-op if there are no cell actions to redo.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.redo")
    @js.native
    def redo(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    @JSImport("@jupyterlab/notebook", "NotebookActions.renderAllMarkdown")
    @js.native
    def renderAllMarkdown(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook", "NotebookActions.renderAllMarkdown")
    @js.native
    def renderAllMarkdown(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
    /**
      * Replaces the selection in the active cell of the notebook.
      *
      * @param notebook - The target notebook widget.
      * @param text - The text to replace the selection.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.replaceSelection")
    @js.native
    def replaceSelection(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, text: String): Unit = js.native
    
    /**
      * Run the selected cell(s).
      *
      * @param notebook - The target notebook widget.
      *
      * @param sessionContext - The optional client session object.
      *
      * #### Notes
      * The last selected cell will be activated, but not scrolled into view.
      * The existing selection will be cleared.
      * An execution error will prevent the remaining code cells from executing.
      * All markdown cells will be rendered.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.run")
    @js.native
    def run(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook", "NotebookActions.run")
    @js.native
    def run(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
    /**
      * Run all of the cells in the notebook.
      *
      * @param notebook - The target notebook widget.
      *
      * @param sessionContext - The optional client session object.
      *
      * #### Notes
      * The existing selection will be cleared.
      * An execution error will prevent the remaining code cells from executing.
      * All markdown cells will be rendered.
      * The last cell in the notebook will be activated and scrolled into view.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.runAll")
    @js.native
    def runAll(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook", "NotebookActions.runAll")
    @js.native
    def runAll(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
    /**
      * Run all of the cells before the currently active cell (exclusive).
      *
      * @param notebook - The target notebook widget.
      *
      * @param sessionContext - The optional client session object.
      *
      * #### Notes
      * The existing selection will be cleared.
      * An execution error will prevent the remaining code cells from executing.
      * All markdown cells will be rendered.
      * The currently active cell will remain selected.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.runAllAbove")
    @js.native
    def runAllAbove(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook", "NotebookActions.runAllAbove")
    @js.native
    def runAllAbove(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
    /**
      * Run all of the cells after the currently active cell (inclusive).
      *
      * @param notebook - The target notebook widget.
      *
      * @param sessionContext - The optional client session object.
      *
      * #### Notes
      * The existing selection will be cleared.
      * An execution error will prevent the remaining code cells from executing.
      * All markdown cells will be rendered.
      * The last cell in the notebook will be activated and scrolled into view.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.runAllBelow")
    @js.native
    def runAllBelow(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook", "NotebookActions.runAllBelow")
    @js.native
    def runAllBelow(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
    /**
      * Run the selected cell(s) and advance to the next cell.
      *
      * @param notebook - The target notebook widget.
      *
      * @param sessionContext - The optional client session object.
      *
      * #### Notes
      * The existing selection will be cleared.
      * The cell after the last selected cell will be activated and scrolled into view.
      * An execution error will prevent the remaining code cells from executing.
      * All markdown cells will be rendered.
      * If the last selected cell is the last cell, a new code cell
      * will be created in `'edit'` mode.  The new cell creation can be undone.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.runAndAdvance")
    @js.native
    def runAndAdvance(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook", "NotebookActions.runAndAdvance")
    @js.native
    def runAndAdvance(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
    /**
      * Run the selected cell(s) and insert a new code cell.
      *
      * @param notebook - The target notebook widget.
      *
      * @param sessionContext - The optional client session object.
      *
      * #### Notes
      * An execution error will prevent the remaining code cells from executing.
      * All markdown cells will be rendered.
      * The widget mode will be set to `'edit'` after running.
      * The existing selection will be cleared.
      * The cell insert can be undone.
      * The new cell will be scrolled into view.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.runAndInsert")
    @js.native
    def runAndInsert(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook", "NotebookActions.runAndInsert")
    @js.native
    def runAndInsert(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
    /**
      * Select the above the active cell.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget mode will be preserved.
      * This is a no-op if the first cell is the active cell.
      * This will skip any collapsed cells.
      * The existing selection will be cleared.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.selectAbove")
    @js.native
    def selectAbove(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Select all of the cells of the notebook.
      *
      * @param notebook - the target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.selectAll")
    @js.native
    def selectAll(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Select the cell below the active cell.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget mode will be preserved.
      * This is a no-op if the last cell is the active cell.
      * This will skip any collapsed cells.
      * The existing selection will be cleared.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.selectBelow")
    @js.native
    def selectBelow(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Go to the last cell that is run or current if it is running.
      *
      * Note: This requires execution timing to be toggled on or this will have
      * no effect.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.selectLastRunCell")
    @js.native
    def selectLastRunCell(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Set the markdown header level.
      *
      * @param notebook - The target notebook widget.
      *
      * @param level - The header level.
      *
      * #### Notes
      * All selected cells will be switched to markdown.
      * The level will be clamped between 1 and 6.
      * If there is an existing header, it will be replaced.
      * There will always be one blank space after the header.
      * The cells will be unrendered.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.setMarkdownHeader")
    @js.native
    def setMarkdownHeader(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, level: Double): Unit = js.native
    
    /**
      * Show the code on all code cells.
      *
      * @param widget - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.showAllCode")
    @js.native
    def showAllCode(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Show the output on all code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.showAllOutputs")
    @js.native
    def showAllOutputs(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Show the code on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.showCode")
    @js.native
    def showCode(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Show the output on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.showOutput")
    @js.native
    def showOutput(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Split the active cell into two or more cells.
      *
      * @param widget - The target notebook widget.
      *
      * #### Notes
      * It will preserve the existing mode.
      * The last cell will be activated.
      * The existing selection will be cleared.
      * The leading whitespace in the second cell will be removed.
      * If there is no content, two empty cells will be created.
      * Both cells will have the same type as the original cell.
      * This action can be undone.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.splitCell")
    @js.native
    def splitCell(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Toggle the line number of all cells.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The original state is based on the state of the active cell.
      * The `mode` of the widget will be preserved.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.toggleAllLineNumbers")
    @js.native
    def toggleAllLineNumbers(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
    
    /**
      * Trust the notebook after prompting the user.
      *
      * @param notebook - The target notebook widget.
      *
      * @returns a promise that resolves when the transaction is finished.
      *
      * #### Notes
      * No dialog will be presented if the notebook is already trusted.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.trust")
    @js.native
    def trust(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Unit] = js.native
    
    /**
      * Undo a cell action.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * This is a no-op if if there are no cell actions to undo.
      */
    @JSImport("@jupyterlab/notebook", "NotebookActions.undo")
    @js.native
    def undo(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = js.native
  }
  
  @JSImport("@jupyterlab/notebook", "NotebookModel")
  @js.native
  /**
    * Construct a new notebook model.
    */
  class NotebookModel ()
    extends typings.jupyterlabNotebook.modelMod.NotebookModel {
    def this(options: typings.jupyterlabNotebook.modelMod.NotebookModel.IOptions) = this()
  }
  object NotebookModel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/notebook", "NotebookModel.ContentFactory")
    @js.native
    class ContentFactory protected ()
      extends typings.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory {
      /**
        * Create a new cell model factory.
        */
      def this(options: typings.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory.IOptions) = this()
    }
    /**
      * A namespace for the notebook model content factory.
      */
    object ContentFactory
    
    /**
      * The default `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/notebook", "NotebookModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/notebook", "NotebookModelFactory")
  @js.native
  class NotebookModelFactory protected ()
    extends typings.jupyterlabNotebook.modelfactoryMod.NotebookModelFactory {
    /**
      * Construct a new notebook model factory.
      */
    def this(options: typings.jupyterlabNotebook.modelfactoryMod.NotebookModelFactory.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/notebook", "NotebookPanel")
  @js.native
  class NotebookPanel protected ()
    extends typings.jupyterlabNotebook.panelMod.NotebookPanel {
    /**
      * Construct a new notebook panel.
      */
    def this(options: typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions[typings.jupyterlabNotebook.widgetMod.Notebook, INotebookModel]) = this()
  }
  object NotebookPanel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/notebook", "NotebookPanel.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    class ContentFactory ()
      extends typings.jupyterlabNotebook.panelMod.NotebookPanel.ContentFactory {
      def this(options: typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
    }
    
    /**
      * The notebook renderer token.
      */
    @JSImport("@jupyterlab/notebook", "NotebookPanel.IContentFactory")
    @js.native
    val IContentFactory: Token[typings.jupyterlabNotebook.panelMod.NotebookPanel.IContentFactory] = js.native
    
    /**
      * Default content factory for the notebook panel.
      */
    @JSImport("@jupyterlab/notebook", "NotebookPanel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabNotebook.panelMod.NotebookPanel.ContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/notebook", "NotebookTools")
  @js.native
  class NotebookTools protected ()
    extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools {
    /**
      * Construct a new NotebookTools object.
      */
    def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.IOptions) = this()
  }
  object NotebookTools {
    
    /**
      * A singleton conflatable `'activecell-changed'` message.
      */
    @JSImport("@jupyterlab/notebook", "NotebookTools.ActiveCellMessage")
    @js.native
    val ActiveCellMessage: ConflatableMessage = js.native
    
    /**
      * A cell tool displaying the active cell contents.
      */
    @JSImport("@jupyterlab/notebook", "NotebookTools.ActiveCellTool")
    @js.native
    /**
      * Construct a new active cell tool.
      */
    class ActiveCellTool ()
      extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.ActiveCellTool
    
    /**
      * A singleton conflatable `'activenotebookpanel-changed'` message.
      */
    @JSImport("@jupyterlab/notebook", "NotebookTools.ActiveNotebookPanelMessage")
    @js.native
    val ActiveNotebookPanelMessage: ConflatableMessage = js.native
    
    /**
      * A cell metadata editor
      */
    @JSImport("@jupyterlab/notebook", "NotebookTools.CellMetadataEditorTool")
    @js.native
    class CellMetadataEditorTool protected ()
      extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.CellMetadataEditorTool {
      def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
    }
    
    /**
      * A cell tool that provides a selection for a given metadata key.
      */
    @JSImport("@jupyterlab/notebook", "NotebookTools.KeySelector")
    @js.native
    class KeySelector protected ()
      extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector {
      /**
        * Construct a new KeySelector.
        */
      def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector.IOptions) = this()
    }
    /**
      * The namespace for `KeySelector` static data.
      */
    object KeySelector
    
    /**
      * A raw metadata editor.
      */
    @JSImport("@jupyterlab/notebook", "NotebookTools.MetadataEditorTool")
    @js.native
    class MetadataEditorTool protected ()
      extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool {
      /**
        * Construct a new raw metadata tool.
        */
      def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
    }
    /**
      * The namespace for `MetadataEditorTool` static data.
      */
    object MetadataEditorTool
    
    /**
      * A notebook metadata editor
      */
    @JSImport("@jupyterlab/notebook", "NotebookTools.NotebookMetadataEditorTool")
    @js.native
    class NotebookMetadataEditorTool protected ()
      extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.NotebookMetadataEditorTool {
      def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
    }
    
    /**
      * A singleton conflatable `'selection-changed'` message.
      */
    @JSImport("@jupyterlab/notebook", "NotebookTools.SelectionMessage")
    @js.native
    val SelectionMessage: ConflatableMessage = js.native
    
    /**
      * The base notebook tool, meant to be subclassed.
      */
    @JSImport("@jupyterlab/notebook", "NotebookTools.Tool")
    @js.native
    /**
      * Construct a new widget.
      *
      * @param options - The options for initializing the widget.
      */
    class Tool ()
      extends typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.Tool {
      def this(options: typings.luminoWidgets.widgetMod.Widget.IOptions) = this()
    }
    
    /**
      * Create an nbconvert selector.
      */
    @JSImport("@jupyterlab/notebook", "NotebookTools.createNBConvertSelector")
    @js.native
    def createNBConvertSelector(optionsMap: ReadonlyPartialJSONObject): typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector = js.native
    
    /**
      * Create a slideshow selector.
      */
    @JSImport("@jupyterlab/notebook", "NotebookTools.createSlideShowSelector")
    @js.native
    def createSlideShowSelector(): typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector = js.native
  }
  
  @JSImport("@jupyterlab/notebook", "NotebookTracker")
  @js.native
  class NotebookTracker protected ()
    extends typings.jupyterlabNotebook.trackerMod.NotebookTracker {
    /**
      * Create a new widget tracker.
      *
      * @param options - The instantiation options for a widget tracker.
      */
    def this(options: typings.jupyterlabApputils.widgettrackerMod.WidgetTracker.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/notebook", "NotebookTrustStatus")
  @js.native
  /**
    * Construct a new status item.
    */
  class NotebookTrustStatus ()
    extends typings.jupyterlabNotebook.truststatusMod.NotebookTrustStatus
  object NotebookTrustStatus {
    
    /**
      * A VDomModel for the NotebookTrust status item.
      */
    @JSImport("@jupyterlab/notebook", "NotebookTrustStatus.Model")
    @js.native
    class Model ()
      extends typings.jupyterlabNotebook.truststatusMod.NotebookTrustStatus.Model
  }
  
  @JSImport("@jupyterlab/notebook", "NotebookWidgetFactory")
  @js.native
  class NotebookWidgetFactory protected ()
    extends typings.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory {
    /**
      * Construct a new notebook widget factory.
      *
      * @param options - The options used to construct the factory.
      */
    def this(options: typings.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory.IOptions[typings.jupyterlabNotebook.panelMod.NotebookPanel]) = this()
  }
  
  @JSImport("@jupyterlab/notebook", "StaticNotebook")
  @js.native
  class StaticNotebook protected ()
    extends typings.jupyterlabNotebook.widgetMod.StaticNotebook {
    /**
      * Construct a notebook widget.
      */
    def this(options: typings.jupyterlabNotebook.widgetMod.StaticNotebook.IOptions) = this()
  }
  object StaticNotebook {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/notebook", "StaticNotebook.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    class ContentFactory ()
      extends typings.jupyterlabNotebook.widgetMod.StaticNotebook.ContentFactory {
      def this(options: typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
    }
    /**
      * A namespace for the staic notebook content factory.
      */
    object ContentFactory
    
    /**
      * Default content factory for the static notebook widget.
      */
    @JSImport("@jupyterlab/notebook", "StaticNotebook.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabNotebook.widgetMod.StaticNotebook.IContentFactory = js.native
    
    /**
      * Default configuration options for cell editors.
      */
    @JSImport("@jupyterlab/notebook", "StaticNotebook.defaultEditorConfig")
    @js.native
    val defaultEditorConfig: IEditorConfig = js.native
    
    /**
      * Default configuration options for notebooks.
      */
    @JSImport("@jupyterlab/notebook", "StaticNotebook.defaultNotebookConfig")
    @js.native
    val defaultNotebookConfig: INotebookConfig = js.native
  }
  
  object ToolbarItems {
    
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
    @JSImport("@jupyterlab/notebook", "ToolbarItems.createCellTypeItem")
    @js.native
    def createCellTypeItem(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
    
    /**
      * Create a copy toolbar item.
      */
    @JSImport("@jupyterlab/notebook", "ToolbarItems.createCopyButton")
    @js.native
    def createCopyButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
    
    /**
      * Create a cut toolbar item.
      */
    @JSImport("@jupyterlab/notebook", "ToolbarItems.createCutButton")
    @js.native
    def createCutButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
    
    /**
      * Create an insert toolbar item.
      */
    @JSImport("@jupyterlab/notebook", "ToolbarItems.createInsertButton")
    @js.native
    def createInsertButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
    
    /**
      * Create a paste toolbar item.
      */
    @JSImport("@jupyterlab/notebook", "ToolbarItems.createPasteButton")
    @js.native
    def createPasteButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
    
    /**
      * Create a restart run all toolbar item
      */
    @JSImport("@jupyterlab/notebook", "ToolbarItems.createRestartRunAllButton")
    @js.native
    def createRestartRunAllButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
    @JSImport("@jupyterlab/notebook", "ToolbarItems.createRestartRunAllButton")
    @js.native
    def createRestartRunAllButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel, dialogs: IDialogs): Widget = js.native
    
    /**
      * Create a run toolbar item.
      */
    @JSImport("@jupyterlab/notebook", "ToolbarItems.createRunButton")
    @js.native
    def createRunButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
    
    /**
      * Create save button toolbar item.
      */
    @JSImport("@jupyterlab/notebook", "ToolbarItems.createSaveButton")
    @js.native
    def createSaveButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = js.native
    
    /**
      * Get the default toolbar items for panel
      */
    @JSImport("@jupyterlab/notebook", "ToolbarItems.getDefaultItems")
    @js.native
    def getDefaultItems(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): js.Array[IToolbarItem] = js.native
    @JSImport("@jupyterlab/notebook", "ToolbarItems.getDefaultItems")
    @js.native
    def getDefaultItems(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel, sessionDialogs: ISessionContextDialogs): js.Array[IToolbarItem] = js.native
  }
}
