package typings.jupyterlabNotebook

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.above
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.below
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.replace
import typings.jupyterlabNotebook.widgetMod.Notebook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  /* private */ class NotebookActions () extends StObject
  object NotebookActions {
    
    @JSImport("@jupyterlab/notebook/lib/actions", "NotebookActions")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def changeCellType(notebook: Notebook, value: CellType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changeCellType")(notebook.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Clear all the code outputs on the widget.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget `mode` will be preserved.
      */
    inline def clearAllOutputs(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllOutputs")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Clear the code outputs of the selected cells.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget `mode` will be preserved.
      */
    inline def clearOutputs(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearOutputs")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Copy the selected cell data to a clipboard.
      *
      * @param notebook - The target notebook widget.
      */
    inline def copy(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Cut the selected cell data to a clipboard.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * This action can be undone.
      * A new code cell is added if all cells are cut.
      */
    inline def cut(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cut")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def deleteCells(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCells")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Deselect all of the cells of the notebook.
      *
      * @param notebook - the targe notebook widget.
      */
    inline def deselectAll(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deselectAll")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Disable output scrolling for all selected cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def disableOutputScrolling(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableOutputScrolling")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Enable output scrolling for all selected cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def enableOutputScrolling(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableOutputScrolling")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def extendSelectionAbove(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendSelectionAbove")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def extendSelectionAbove(notebook: Notebook, toTop: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendSelectionAbove")(notebook.asInstanceOf[js.Any], toTop.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def extendSelectionBelow(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendSelectionBelow")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def extendSelectionBelow(notebook: Notebook, toBottom: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendSelectionBelow")(notebook.asInstanceOf[js.Any], toBottom.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Hide the code on all code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def hideAllCode(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAllCode")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Hide the output on all code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def hideAllOutputs(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAllOutputs")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Hide the code on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def hideCode(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideCode")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Hide the output on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def hideOutput(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideOutput")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def insertAbove(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertAbove")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def insertBelow(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertBelow")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def mergeCells(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCells")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Move the selected cell(s) down.
      *
      * @param notebook = The target notebook widget.
      */
    inline def moveDown(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("moveDown")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Move the selected cell(s) up.
      *
      * @param widget - The target notebook widget.
      */
    inline def moveUp(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("moveUp")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def paste(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def paste_above(notebook: Notebook, mode: above): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(notebook.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def paste_below(notebook: Notebook, mode: below): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(notebook.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def paste_replace(notebook: Notebook, mode: replace): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(notebook.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Redo a cell action.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * This is a no-op if there are no cell actions to redo.
      */
    inline def redo(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("redo")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def renderAllMarkdown(notebook: Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderAllMarkdown")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def renderAllMarkdown(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderAllMarkdown")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Replaces the selection in the active cell of the notebook.
      *
      * @param notebook - The target notebook widget.
      * @param text - The text to replace the selection.
      */
    inline def replaceSelection(notebook: Notebook, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSelection")(notebook.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def run(notebook: Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def run(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
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
    inline def runAll(notebook: Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAll")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def runAll(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAll")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
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
    inline def runAllAbove(notebook: Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAllAbove")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def runAllAbove(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAllAbove")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
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
    inline def runAllBelow(notebook: Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAllBelow")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def runAllBelow(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAllBelow")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
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
    inline def runAndAdvance(notebook: Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAndAdvance")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def runAndAdvance(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAndAdvance")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
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
    inline def runAndInsert(notebook: Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAndInsert")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def runAndInsert(notebook: Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAndInsert")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
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
    inline def selectAbove(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAbove")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Select all of the cells of the notebook.
      *
      * @param notebook - the target notebook widget.
      */
    inline def selectAll(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def selectBelow(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectBelow")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Go to the last cell that is run or current if it is running.
      *
      * Note: This requires execution timing to be toggled on or this will have
      * no effect.
      *
      * @param notebook - The target notebook widget.
      */
    inline def selectLastRunCell(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectLastRunCell")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def setMarkdownHeader(notebook: Notebook, level: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMarkdownHeader")(notebook.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Show the code on all code cells.
      *
      * @param widget - The target notebook widget.
      */
    inline def showAllCode(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAllCode")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Show the output on all code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def showAllOutputs(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAllOutputs")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Show the code on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def showCode(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showCode")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Show the output on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def showOutput(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showOutput")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def splitCell(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCell")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Toggle the line number of all cells.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The original state is based on the state of the active cell.
      * The `mode` of the widget will be preserved.
      */
    inline def toggleAllLineNumbers(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleAllLineNumbers")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def trust(notebook: Notebook): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("trust")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Undo a cell action.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * This is a no-op if if there are no cell actions to undo.
      */
    inline def undo(notebook: Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("undo")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
