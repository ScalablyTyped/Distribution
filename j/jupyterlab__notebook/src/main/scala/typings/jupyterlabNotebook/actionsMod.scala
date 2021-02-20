package typings.jupyterlabNotebook

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.above
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.below
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.replace
import typings.jupyterlabNotebook.widgetMod.Notebook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions")
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
  class NotebookActions protected () extends StObject
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.changeCellType")
    @js.native
    def changeCellType(notebook: Notebook, value: CellType): Unit = js.native
    
    /**
      * Clear all the code outputs on the widget.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget `mode` will be preserved.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.clearAllOutputs")
    @js.native
    def clearAllOutputs(notebook: Notebook): Unit = js.native
    
    /**
      * Clear the code outputs of the selected cells.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget `mode` will be preserved.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.clearOutputs")
    @js.native
    def clearOutputs(notebook: Notebook): Unit = js.native
    
    /**
      * Copy the selected cell data to a clipboard.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.copy")
    @js.native
    def copy(notebook: Notebook): Unit = js.native
    
    /**
      * Cut the selected cell data to a clipboard.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * This action can be undone.
      * A new code cell is added if all cells are cut.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.cut")
    @js.native
    def cut(notebook: Notebook): Unit = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.deleteCells")
    @js.native
    def deleteCells(notebook: Notebook): Unit = js.native
    
    /**
      * Deselect all of the cells of the notebook.
      *
      * @param notebook - the targe notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.deselectAll")
    @js.native
    def deselectAll(notebook: Notebook): Unit = js.native
    
    /**
      * Disable output scrolling for all selected cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.disableOutputScrolling")
    @js.native
    def disableOutputScrolling(notebook: Notebook): Unit = js.native
    
    /**
      * Enable output scrolling for all selected cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.enableOutputScrolling")
    @js.native
    def enableOutputScrolling(notebook: Notebook): Unit = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.extendSelectionAbove")
    @js.native
    def extendSelectionAbove(notebook: Notebook): Unit = js.native
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.extendSelectionAbove")
    @js.native
    def extendSelectionAbove(notebook: Notebook, toTop: Boolean): Unit = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.extendSelectionBelow")
    @js.native
    def extendSelectionBelow(notebook: Notebook): Unit = js.native
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.extendSelectionBelow")
    @js.native
    def extendSelectionBelow(notebook: Notebook, toBottom: Boolean): Unit = js.native
    
    /**
      * Hide the code on all code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.hideAllCode")
    @js.native
    def hideAllCode(notebook: Notebook): Unit = js.native
    
    /**
      * Hide the output on all code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.hideAllOutputs")
    @js.native
    def hideAllOutputs(notebook: Notebook): Unit = js.native
    
    /**
      * Hide the code on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.hideCode")
    @js.native
    def hideCode(notebook: Notebook): Unit = js.native
    
    /**
      * Hide the output on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.hideOutput")
    @js.native
    def hideOutput(notebook: Notebook): Unit = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.insertAbove")
    @js.native
    def insertAbove(notebook: Notebook): Unit = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.insertBelow")
    @js.native
    def insertBelow(notebook: Notebook): Unit = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.mergeCells")
    @js.native
    def mergeCells(notebook: Notebook): Unit = js.native
    
    /**
      * Move the selected cell(s) down.
      *
      * @param notebook = The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.moveDown")
    @js.native
    def moveDown(notebook: Notebook): Unit = js.native
    
    /**
      * Move the selected cell(s) up.
      *
      * @param widget - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.moveUp")
    @js.native
    def moveUp(notebook: Notebook): Unit = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.paste")
    @js.native
    def paste(notebook: Notebook): Unit = js.native
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.paste")
    @js.native
    def paste_above(notebook: Notebook, mode: above): Unit = js.native
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.paste")
    @js.native
    def paste_below(notebook: Notebook, mode: below): Unit = js.native
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.paste")
    @js.native
    def paste_replace(notebook: Notebook, mode: replace): Unit = js.native
    
    /**
      * Redo a cell action.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * This is a no-op if there are no cell actions to redo.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.redo")
    @js.native
    def redo(notebook: Notebook): Unit = js.native
    
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.renderAllMarkdown")
    @js.native
    def renderAllMarkdown(notebook: Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.renderAllMarkdown")
    @js.native
    def renderAllMarkdown(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
    /**
      * Replaces the selection in the active cell of the notebook.
      *
      * @param notebook - The target notebook widget.
      * @param text - The text to replace the selection.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.replaceSelection")
    @js.native
    def replaceSelection(notebook: Notebook, text: String): Unit = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.run")
    @js.native
    def run(notebook: Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.run")
    @js.native
    def run(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.runAll")
    @js.native
    def runAll(notebook: Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.runAll")
    @js.native
    def runAll(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.runAllAbove")
    @js.native
    def runAllAbove(notebook: Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.runAllAbove")
    @js.native
    def runAllAbove(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.runAllBelow")
    @js.native
    def runAllBelow(notebook: Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.runAllBelow")
    @js.native
    def runAllBelow(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.runAndAdvance")
    @js.native
    def runAndAdvance(notebook: Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.runAndAdvance")
    @js.native
    def runAndAdvance(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.runAndInsert")
    @js.native
    def runAndInsert(notebook: Notebook): js.Promise[Boolean] = js.native
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.runAndInsert")
    @js.native
    def runAndInsert(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.selectAbove")
    @js.native
    def selectAbove(notebook: Notebook): Unit = js.native
    
    /**
      * Select all of the cells of the notebook.
      *
      * @param notebook - the target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.selectAll")
    @js.native
    def selectAll(notebook: Notebook): Unit = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.selectBelow")
    @js.native
    def selectBelow(notebook: Notebook): Unit = js.native
    
    /**
      * Go to the last cell that is run or current if it is running.
      *
      * Note: This requires execution timing to be toggled on or this will have
      * no effect.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.selectLastRunCell")
    @js.native
    def selectLastRunCell(notebook: Notebook): Unit = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.setMarkdownHeader")
    @js.native
    def setMarkdownHeader(notebook: Notebook, level: Double): Unit = js.native
    
    /**
      * Show the code on all code cells.
      *
      * @param widget - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.showAllCode")
    @js.native
    def showAllCode(notebook: Notebook): Unit = js.native
    
    /**
      * Show the output on all code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.showAllOutputs")
    @js.native
    def showAllOutputs(notebook: Notebook): Unit = js.native
    
    /**
      * Show the code on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.showCode")
    @js.native
    def showCode(notebook: Notebook): Unit = js.native
    
    /**
      * Show the output on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.showOutput")
    @js.native
    def showOutput(notebook: Notebook): Unit = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.splitCell")
    @js.native
    def splitCell(notebook: Notebook): Unit = js.native
    
    /**
      * Toggle the line number of all cells.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The original state is based on the state of the active cell.
      * The `mode` of the widget will be preserved.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.toggleAllLineNumbers")
    @js.native
    def toggleAllLineNumbers(notebook: Notebook): Unit = js.native
    
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
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.trust")
    @js.native
    def trust(notebook: Notebook): js.Promise[Unit] = js.native
    
    /**
      * Undo a cell action.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * This is a no-op if if there are no cell actions to undo.
      */
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions.undo")
    @js.native
    def undo(notebook: Notebook): Unit = js.native
  }
}
