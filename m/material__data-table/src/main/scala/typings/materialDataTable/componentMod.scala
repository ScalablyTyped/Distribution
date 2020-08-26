package typings.materialDataTable

import typings.materialBase.componentMod.MDCComponent
import typings.materialCheckbox.componentMod.MDCCheckboxFactory
import typings.materialDataTable.foundationMod.MDCDataTableFoundation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/data-table/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCDataTable () extends MDCComponent[MDCDataTableFoundation] {
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
  }
  
  /* static members */
  @js.native
  object MDCDataTable extends js.Object {
    def attachTo(root: Element): MDCDataTable = js.native
  }
  
}

