package typings.materialDataTable

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/data-table/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  @js.native
  sealed trait SortValue extends js.Object
  @js.native
  object SortValue extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortValue with String] = js.native
    
    @js.native
    sealed trait ASCENDING extends SortValue
    /* "ascending" */ @js.native
    object ASCENDING extends TopLevel[ASCENDING with String]
    
    @js.native
    sealed trait DESCENDING extends SortValue
    /* "descending" */ @js.native
    object DESCENDING extends TopLevel[DESCENDING with String]
    
    @js.native
    sealed trait NONE extends SortValue
    /* "none" */ @js.native
    object NONE extends TopLevel[NONE with String]
    
    @js.native
    sealed trait OTHER extends SortValue
    /* "other" */ @js.native
    object OTHER extends TopLevel[OTHER with String]
  }
  
  @js.native
  object attributes extends js.Object {
    
    var ARIA_SELECTED: String = js.native
    
    var ARIA_SORT: String = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var CELL: String = js.native
    
    var CELL_NUMERIC: String = js.native
    
    var CONTENT: String = js.native
    
    var HEADER_CELL: String = js.native
    
    var HEADER_CELL_LABEL: String = js.native
    
    var HEADER_CELL_SORTED: String = js.native
    
    var HEADER_CELL_SORTED_DESCENDING: String = js.native
    
    var HEADER_CELL_WITH_SORT: String = js.native
    
    var HEADER_CELL_WRAPPER: String = js.native
    
    var HEADER_ROW: String = js.native
    
    var HEADER_ROW_CHECKBOX: String = js.native
    
    var IN_PROGRESS: String = js.native
    
    var LINEAR_PROGRESS: String = js.native
    
    var PAGINATION_ROWS_PER_PAGE_LABEL: String = js.native
    
    var PAGINATION_ROWS_PER_PAGE_SELECT: String = js.native
    
    var PROGRESS_INDICATOR: String = js.native
    
    var ROOT: String = js.native
    
    var ROW: String = js.native
    
    var ROW_CHECKBOX: String = js.native
    
    var ROW_SELECTED: String = js.native
    
    var SORT_ICON_BUTTON: String = js.native
    
    var SORT_STATUS_LABEL: String = js.native
    
    var TABLE_CONTAINER: String = js.native
  }
  
  @js.native
  object dataAttributes extends js.Object {
    
    var COLUMN_ID: String = js.native
    
    var ROW_ID: String = js.native
  }
  
  @js.native
  object events extends js.Object {
    
    var ROW_SELECTION_CHANGED: String = js.native
    
    var SELECTED_ALL: String = js.native
    
    var SORTED: String = js.native
    
    var UNSELECTED_ALL: String = js.native
  }
  
  @js.native
  object messages extends js.Object {
    
    var SORTED_IN_ASCENDING: String = js.native
    
    var SORTED_IN_DESCENDING: String = js.native
  }
  
  @js.native
  object selectors extends js.Object {
    
    var CONTENT: String = js.native
    
    var HEADER_CELL: String = js.native
    
    var HEADER_CELL_WITH_SORT: String = js.native
    
    var HEADER_ROW: String = js.native
    
    var HEADER_ROW_CHECKBOX: String = js.native
    
    var PROGRESS_INDICATOR: String = js.native
    
    var ROW: String = js.native
    
    var ROW_CHECKBOX: String = js.native
    
    var ROW_SELECTED: String = js.native
    
    var SORT_ICON_BUTTON: String = js.native
    
    var SORT_STATUS_LABEL: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ARIA_SELECTED: String = js.native
    
    var ARIA_SORT: String = js.native
    
    var DATA_ROW_ID_ATTR: String = js.native
    
    var HEADER_ROW_CHECKBOX_SELECTOR: String = js.native
    
    var ROW_CHECKBOX_SELECTOR: String = js.native
    
    var ROW_SELECTED_SELECTOR: String = js.native
    
    var ROW_SELECTOR: String = js.native
  }
}
