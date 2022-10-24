package typings.materialDataTable

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialDataTable.adapterMod.MDCDataTableAdapter
import typings.materialDataTable.anon.PartialMDCDataTableAdapte
import typings.materialDataTable.typesMod.RowClickEventData
import typings.materialDataTable.typesMod.SortActionEventData
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/data-table/foundation", "MDCDataTableFoundation")
  @js.native
  open class MDCDataTableFoundation () extends MDCFoundation[MDCDataTableAdapter] {
    def this(adapter: PartialMDCDataTableAdapte) = this()
    
    /**
      * @return Array of header cell elements.
      */
    def getHeaderCells(): js.Array[Element] = js.native
    
    /**
      * @return Returns array of all row ids.
      */
    def getRowIds(): js.Array[String | Null] = js.native
    
    /**
      * @return Returns array of row elements.
      */
    def getRows(): js.Array[Element] = js.native
    
    /**
      * @return Returns array of selected row ids.
      */
    def getSelectedRowIds(): js.Array[String | Null] = js.native
    
    /**
      * Handles header row checkbox change event.
      */
    def handleHeaderRowCheckboxChange(): Unit = js.native
    
    /**
      * Handles change event originated from row checkboxes.
      */
    def handleRowCheckboxChange(event: Event): Unit = js.native
    
    /**
      * Handles data table row click event.
      */
    def handleRowClick(param0: RowClickEventData): Unit = js.native
    
    /**
      * Handles sort action on sortable header cell.
      */
    def handleSortAction(eventData: SortActionEventData): Unit = js.native
    
    /**
      * Hides progress indicator when data table is finished loading.
      */
    def hideProgress(): Unit = js.native
    
    /**
      * Re-initializes header row checkbox and row checkboxes when selectable rows
      * are added or removed from table. Use this if registering checkbox is
      * synchronous.
      */
    def layout(): Unit = js.native
    
    /**
      * Re-initializes header row checkbox and row checkboxes when selectable rows
      * are added or removed from table. Use this if registering checkbox is
      * asynchronous.
      */
    def layoutAsync(): js.Promise[Unit] = js.native
    
    /**
      * Sets the attributes of row element based on selection state.
      */
    /* private */ var selectRowAtIndex: Any = js.native
    
    /**
      * Updates header row checkbox state based on number of rows selected.
      */
    /* private */ var setHeaderRowCheckboxState: Any = js.native
    
    /**
      * Sets selected row ids. Overwrites previously selected rows.
      * @param rowIds Array of row ids that needs to be selected.
      */
    def setSelectedRowIds(rowIds: js.Array[String]): Unit = js.native
    
    /**
      * Shows progress indicator blocking only the table body content when in
      * loading state.
      */
    def showProgress(): Unit = js.native
  }
}
