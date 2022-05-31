package typings.jupyterlabNotebook

import typings.jupyterlabApputils.mod.ReactWidget
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabApputils.tokensMod.ISessionContextDialogs
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IToolbarItem
import typings.jupyterlabNotebook.panelMod.NotebookPanel
import typings.jupyterlabNotebook.widgetMod.Notebook
import typings.luminoWidgets.mod.Widget
import typings.react.mod.ChangeEvent
import typings.react.mod.KeyboardEvent
import typings.std.Element
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultToolbarMod {
  
  @JSImport("@jupyterlab/notebook/lib/default-toolbar", "CellTypeSwitcher")
  @js.native
  class CellTypeSwitcher protected () extends ReactWidget {
    /**
      * Construct a new cell type switcher.
      */
    def this(widget: Notebook) = this()
    
    /* private */ var _notebook: js.Any = js.native
    
    /**
      * Handle `change` events for the HTMLSelect component.
      */
    def handleChange(event: ChangeEvent[HTMLSelectElement]): Unit = js.native
    
    /**
      * Handle `keydown` events for the HTMLSelect component.
      */
    def handleKeyDown(event: KeyboardEvent[Element]): Unit = js.native
  }
  
  object ToolbarItems {
    
    @JSImport("@jupyterlab/notebook/lib/default-toolbar", "ToolbarItems")
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
    inline def createCellTypeItem(panel: NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createCellTypeItem")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create a copy toolbar item.
      */
    inline def createCopyButton(panel: NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createCopyButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create a cut toolbar item.
      */
    inline def createCutButton(panel: NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createCutButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create an insert toolbar item.
      */
    inline def createInsertButton(panel: NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInsertButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create a paste toolbar item.
      */
    inline def createPasteButton(panel: NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createPasteButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create a restart run all toolbar item
      */
    inline def createRestartRunAllButton(panel: NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createRestartRunAllButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    inline def createRestartRunAllButton(panel: NotebookPanel, dialogs: IDialogs): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createRestartRunAllButton")(panel.asInstanceOf[js.Any], dialogs.asInstanceOf[js.Any])).asInstanceOf[Widget]
    
    /**
      * Create a run toolbar item.
      */
    inline def createRunButton(panel: NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createRunButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create save button toolbar item.
      */
    inline def createSaveButton(panel: NotebookPanel): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createSaveButton")(panel.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Get the default toolbar items for panel
      */
    inline def getDefaultItems(panel: NotebookPanel): js.Array[IToolbarItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultItems")(panel.asInstanceOf[js.Any]).asInstanceOf[js.Array[IToolbarItem]]
    inline def getDefaultItems(panel: NotebookPanel, sessionDialogs: ISessionContextDialogs): js.Array[IToolbarItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultItems")(panel.asInstanceOf[js.Any], sessionDialogs.asInstanceOf[js.Any])).asInstanceOf[js.Array[IToolbarItem]]
  }
}
