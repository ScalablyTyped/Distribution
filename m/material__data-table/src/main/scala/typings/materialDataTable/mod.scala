package typings.materialDataTable

import typings.materialDataTable.adapterMod.MDCDataTableAdapter
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/data-table", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCDataTable ()
    extends typings.materialDataTable.componentMod.MDCDataTable
  
  @js.native
  class MDCDataTableFoundation ()
    extends typings.materialDataTable.foundationMod.MDCDataTableFoundation {
    def this(adapter: Partial[MDCDataTableAdapter]) = this()
  }
  
  /* static members */
  @js.native
  object MDCDataTable extends js.Object {
    def attachTo(root: Element): typings.materialDataTable.componentMod.MDCDataTable = js.native
  }
  
  /* static members */
  @js.native
  object MDCDataTableFoundation extends js.Object {
    val defaultAdapter: MDCDataTableAdapter = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    var CELL: String = js.native
    var CELL_NUMERIC: String = js.native
    var CONTENT: String = js.native
    var HEADER_ROW: String = js.native
    var HEADER_ROW_CHECKBOX: String = js.native
    var ROOT: String = js.native
    var ROW: String = js.native
    var ROW_CHECKBOX: String = js.native
    var ROW_SELECTED: String = js.native
  }
  
  @js.native
  object events extends js.Object {
    var ROW_SELECTION_CHANGED: String = js.native
    var SELECTED_ALL: String = js.native
    var UNSELECTED_ALL: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var ARIA_SELECTED: String = js.native
    var DATA_ROW_ID_ATTR: String = js.native
    var HEADER_ROW_CHECKBOX_SELECTOR: String = js.native
    var ROW_CHECKBOX_SELECTOR: String = js.native
    var ROW_SELECTED_SELECTOR: String = js.native
    var ROW_SELECTOR: String = js.native
  }
  
}

