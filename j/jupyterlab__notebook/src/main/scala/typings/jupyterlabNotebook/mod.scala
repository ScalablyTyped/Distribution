package typings.jupyterlabNotebook

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
  
  @JSImport("@jupyterlab/notebook", "INotebookTools")
  @js.native
  val INotebookTools: Token[typings.jupyterlabNotebook.tokensMod.INotebookTools] = js.native
  
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
  /* private */ class NotebookActions ()
    extends typings.jupyterlabNotebook.actionsMod.NotebookActions
  object NotebookActions {
    
    @JSImport("@jupyterlab/notebook", "NotebookActions")
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
    inline def changeCellType(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, value: CellType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changeCellType")(notebook.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Clear all the code outputs on the widget.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget `mode` will be preserved.
      */
    inline def clearAllOutputs(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllOutputs")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Clear the code outputs of the selected cells.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The widget `mode` will be preserved.
      */
    inline def clearOutputs(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearOutputs")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Copy the selected cell data to a clipboard.
      *
      * @param notebook - The target notebook widget.
      */
    inline def copy(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Cut the selected cell data to a clipboard.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * This action can be undone.
      * A new code cell is added if all cells are cut.
      */
    inline def cut(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cut")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def deleteCells(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCells")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Deselect all of the cells of the notebook.
      *
      * @param notebook - the targe notebook widget.
      */
    inline def deselectAll(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deselectAll")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Disable output scrolling for all selected cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def disableOutputScrolling(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableOutputScrolling")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Enable output scrolling for all selected cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def enableOutputScrolling(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableOutputScrolling")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def extendSelectionAbove(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendSelectionAbove")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def extendSelectionAbove(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, toTop: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendSelectionAbove")(notebook.asInstanceOf[js.Any], toTop.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def extendSelectionBelow(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendSelectionBelow")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def extendSelectionBelow(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, toBottom: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendSelectionBelow")(notebook.asInstanceOf[js.Any], toBottom.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Hide the code on all code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def hideAllCode(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAllCode")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Hide the output on all code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def hideAllOutputs(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAllOutputs")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Hide the code on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def hideCode(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideCode")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Hide the output on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def hideOutput(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideOutput")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def insertAbove(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertAbove")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def insertBelow(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertBelow")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def mergeCells(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCells")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Move the selected cell(s) down.
      *
      * @param notebook = The target notebook widget.
      */
    inline def moveDown(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("moveDown")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Move the selected cell(s) up.
      *
      * @param widget - The target notebook widget.
      */
    inline def moveUp(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("moveUp")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def paste(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def paste_above(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, mode: above): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(notebook.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def paste_below(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, mode: below): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(notebook.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def paste_replace(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, mode: replace): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(notebook.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Redo a cell action.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * This is a no-op if there are no cell actions to redo.
      */
    inline def redo(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("redo")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def renderAllMarkdown(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderAllMarkdown")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def renderAllMarkdown(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderAllMarkdown")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Replaces the selection in the active cell of the notebook.
      *
      * @param notebook - The target notebook widget.
      * @param text - The text to replace the selection.
      */
    inline def replaceSelection(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSelection")(notebook.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def run(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def run(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
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
    inline def runAll(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAll")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def runAll(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAll")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
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
    inline def runAllAbove(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAllAbove")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def runAllAbove(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAllAbove")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
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
    inline def runAllBelow(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAllBelow")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def runAllBelow(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAllBelow")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
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
    inline def runAndAdvance(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAndAdvance")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def runAndAdvance(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAndAdvance")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
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
    inline def runAndInsert(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAndInsert")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def runAndInsert(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, sessionContext: ISessionContext): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAndInsert")(notebook.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    
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
    inline def selectAbove(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAbove")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Select all of the cells of the notebook.
      *
      * @param notebook - the target notebook widget.
      */
    inline def selectAll(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def selectBelow(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectBelow")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Go to the last cell that is run or current if it is running.
      *
      * Note: This requires execution timing to be toggled on or this will have
      * no effect.
      *
      * @param notebook - The target notebook widget.
      */
    inline def selectLastRunCell(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectLastRunCell")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def setMarkdownHeader(notebook: typings.jupyterlabNotebook.widgetMod.Notebook, level: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMarkdownHeader")(notebook.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Show the code on all code cells.
      *
      * @param widget - The target notebook widget.
      */
    inline def showAllCode(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAllCode")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Show the output on all code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def showAllOutputs(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAllOutputs")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Show the code on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def showCode(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showCode")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Show the output on selected code cells.
      *
      * @param notebook - The target notebook widget.
      */
    inline def showOutput(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showOutput")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def splitCell(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCell")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Toggle the line number of all cells.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * The original state is based on the state of the active cell.
      * The `mode` of the widget will be preserved.
      */
    inline def toggleAllLineNumbers(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleAllLineNumbers")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def trust(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("trust")(notebook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Undo a cell action.
      *
      * @param notebook - The target notebook widget.
      *
      * #### Notes
      * This is a no-op if if there are no cell actions to undo.
      */
    inline def undo(notebook: typings.jupyterlabNotebook.widgetMod.Notebook): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("undo")(notebook.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
    
    @JSImport("@jupyterlab/notebook", "NotebookTools")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def createNBConvertSelector(optionsMap: ReadonlyPartialJSONObject): typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createNBConvertSelector")(optionsMap.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector]
    
    /**
      * Create a slideshow selector.
      */
    inline def createSlideShowSelector(): typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlideShowSelector")().asInstanceOf[typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector]
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
    
    @JSImport("@jupyterlab/notebook", "ToolbarItems")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def createCellTypeItem(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createCellTypeItem")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create a copy toolbar item.
      */
    inline def createCopyButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createCopyButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create a cut toolbar item.
      */
    inline def createCutButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createCutButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create an insert toolbar item.
      */
    inline def createInsertButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsertButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create a paste toolbar item.
      */
    inline def createPasteButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createPasteButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create a restart run all toolbar item
      */
    inline def createRestartRunAllButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createRestartRunAllButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    inline def createRestartRunAllButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel, dialogs: IDialogs): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createRestartRunAllButton")(panel.asInstanceOf[js.Any], dialogs.asInstanceOf[js.Any])).asInstanceOf[Widget]
    
    /**
      * Create a run toolbar item.
      */
    inline def createRunButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createRunButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create save button toolbar item.
      */
    inline def createSaveButton(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createSaveButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Get the default toolbar items for panel
      */
    inline def getDefaultItems(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel): js.Array[IToolbarItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultItems")(panel.asInstanceOf[js.Any]).asInstanceOf[js.Array[IToolbarItem]]
    inline def getDefaultItems(panel: typings.jupyterlabNotebook.panelMod.NotebookPanel, sessionDialogs: ISessionContextDialogs): js.Array[IToolbarItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultItems")(panel.asInstanceOf[js.Any], sessionDialogs.asInstanceOf[js.Any])).asInstanceOf[js.Array[IToolbarItem]]
  }
}
