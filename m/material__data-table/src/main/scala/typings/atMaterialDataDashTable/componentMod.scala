package typings.atMaterialDataDashTable

import typings.atMaterialBase.componentMod.MDCComponent
import typings.atMaterialBase.foundationMod.default
import typings.atMaterialDataDashTable.componentMod.MDCDataTable
import typings.atMaterialDataDashTable.foundationMod.MDCDataTableFoundation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/data-table/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCDataTable () extends MDCComponent[MDCDataTableFoundation, default[MDCDataTableFoundation]] {
    /**
      * @return Returns array of row elements.
      */
    def getRows(): js.Array[Element] = js.native
    /**
      * @return Returns array of selected row ids.
      */
    def getSelectedRowIds(): js.Array[String | Null] = js.native
    def initialize(): Unit = js.native
    def initialize(
      checkboxFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MDCCheckboxFactory */ js.Any
    ): Unit = js.native
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

