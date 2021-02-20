package typings.materialDataTable

import typings.materialBase.componentMod.MDCComponent
import typings.materialCheckbox.componentMod.MDCCheckboxFactory
import typings.materialDataTable.foundationMod.MDCDataTableFoundation
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/data-table/component", "MDCDataTable")
  @js.native
  class MDCDataTable protected () extends MDCComponent[MDCDataTableFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCDataTableFoundation, args: js.Any*) = this()
    
    /**
      * @return Returns array of header row cell elements.
      */
    def getHeaderCells(): js.Array[Element] = js.native
    
    /**
      * @return Returns array of row elements.
      */
    def getRows(): js.Array[Element] = js.native
    
    /**
      * @return Returns array of selected row ids.
      */
    def getSelectedRowIds(): js.Array[String | Null] = js.native
    
    /**
      * Hides progress indicator after data table is finished loading.
      */
    def hideProgress(): Unit = js.native
    
    def initialize(): Unit = js.native
    def initialize(checkboxFactory: MDCCheckboxFactory): Unit = js.native
    
    /**
      * Re-initializes header row checkbox and row checkboxes when selectable rows are added or removed from table.
      */
    def layout(): Unit = js.native
    
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
    
    @JSImport("@material/data-table/component", "MDCDataTable.attachTo")
    @js.native
    def attachTo(root: Element): MDCDataTable = js.native
  }
}
