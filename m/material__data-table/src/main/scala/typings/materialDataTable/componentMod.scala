package typings.materialDataTable

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialCheckbox.componentMod.MDCCheckboxFactory
import typings.materialDataTable.foundationMod.MDCDataTableFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/data-table/component", "MDCDataTable")
  @js.native
  open class MDCDataTable protected () extends MDCComponent[MDCDataTableFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCDataTableFoundation, args: Any*) = this()
    
    /* private */ var checkboxFactory: Any = js.native
    
    /* private */ var content: Any = js.native
    
    /**
      * @return Returns array of header row cell elements.
      */
    def getHeaderCells(): js.Array[typings.std.Element] = js.native
    
    /* private */ var getLinearProgress: Any = js.native
    
    /* private */ var getLinearProgressElement: Any = js.native
    
    /* private */ var getRowByIndex: Any = js.native
    
    /* private */ var getRowIdByIndex: Any = js.native
    
    /* private */ var getRowIdByRowElement: Any = js.native
    
    /**
      * @return Returns array of row elements.
      */
    def getRows(): js.Array[typings.std.Element] = js.native
    
    /**
      * @return Returns array of selected row ids.
      */
    def getSelectedRowIds(): js.Array[String | Null] = js.native
    
    /* private */ var getSortStatusMessageBySortValue: Any = js.native
    
    /* private */ var handleContentClick: Any = js.native
    
    /* private */ var handleHeaderRowCheckboxChange: Any = js.native
    
    /* private */ var handleHeaderRowClick: Any = js.native
    
    /* private */ var handleRowCheckboxChange: Any = js.native
    
    /* private */ var headerRow: Any = js.native
    
    /* private */ var headerRowCheckbox: Any = js.native
    
    /* private */ var headerRowClickListener: Any = js.native
    
    /**
      * Hides progress indicator after data table is finished loading.
      */
    def hideProgress(): Unit = js.native
    
    def initialize(): Unit = js.native
    def initialize(checkboxFactory: MDCCheckboxFactory): Unit = js.native
    
    /**
      * Re-initializes header row checkbox and row checkboxes when selectable rows
      * are added or removed from table.
      */
    def layout(): Unit = js.native
    
    /* private */ var linearProgress: Any = js.native
    
    /* private */ var rowCheckboxList: Any = js.native
    
    /**
      * Sets selected row ids. Overwrites previously selected rows.
      * @param rowIds Array of row ids that needs to be selected.
      */
    def setSelectedRowIds(rowIds: js.Array[String]): Unit = js.native
    
    /**
      * Shows progress indicator when data table is in loading state.
      */
    def showProgress(): Unit = js.native
  }
  /* static members */
  object MDCDataTable {
    
    @JSImport("@material/data-table/component", "MDCDataTable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCDataTable = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCDataTable]
  }
}
