package typings.materialDataTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @js.native
  sealed trait SortValue extends StObject
  @JSImport("@material/data-table/constants", "SortValue")
  @js.native
  object SortValue extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortValue with String] = js.native
    
    @js.native
    sealed trait ASCENDING extends SortValue
    /* "ascending" */ val ASCENDING: typings.materialDataTable.constantsMod.SortValue.ASCENDING with String = js.native
    
    @js.native
    sealed trait DESCENDING extends SortValue
    /* "descending" */ val DESCENDING: typings.materialDataTable.constantsMod.SortValue.DESCENDING with String = js.native
    
    @js.native
    sealed trait NONE extends SortValue
    /* "none" */ val NONE: typings.materialDataTable.constantsMod.SortValue.NONE with String = js.native
    
    @js.native
    sealed trait OTHER extends SortValue
    /* "other" */ val OTHER: typings.materialDataTable.constantsMod.SortValue.OTHER with String = js.native
  }
  
  object attributes {
    
    @JSImport("@material/data-table/constants", "attributes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/data-table/constants", "attributes.ARIA_SELECTED")
    @js.native
    def ARIA_SELECTED: String = js.native
    @scala.inline
    def ARIA_SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_SELECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "attributes.ARIA_SORT")
    @js.native
    def ARIA_SORT: String = js.native
    @scala.inline
    def ARIA_SORT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_SORT")(x.asInstanceOf[js.Any])
  }
  
  object cssClasses {
    
    @JSImport("@material/data-table/constants", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/data-table/constants", "cssClasses.CELL")
    @js.native
    def CELL: String = js.native
    @scala.inline
    def CELL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CELL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.CELL_NUMERIC")
    @js.native
    def CELL_NUMERIC: String = js.native
    @scala.inline
    def CELL_NUMERIC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CELL_NUMERIC")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.CONTENT")
    @js.native
    def CONTENT: String = js.native
    @scala.inline
    def CONTENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.HEADER_CELL")
    @js.native
    def HEADER_CELL: String = js.native
    @scala.inline
    def HEADER_CELL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_CELL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.HEADER_CELL_LABEL")
    @js.native
    def HEADER_CELL_LABEL: String = js.native
    @scala.inline
    def HEADER_CELL_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_CELL_LABEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.HEADER_CELL_SORTED")
    @js.native
    def HEADER_CELL_SORTED: String = js.native
    @scala.inline
    def HEADER_CELL_SORTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_CELL_SORTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.HEADER_CELL_SORTED_DESCENDING")
    @js.native
    def HEADER_CELL_SORTED_DESCENDING: String = js.native
    @scala.inline
    def HEADER_CELL_SORTED_DESCENDING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_CELL_SORTED_DESCENDING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.HEADER_CELL_WITH_SORT")
    @js.native
    def HEADER_CELL_WITH_SORT: String = js.native
    @scala.inline
    def HEADER_CELL_WITH_SORT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_CELL_WITH_SORT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.HEADER_CELL_WRAPPER")
    @js.native
    def HEADER_CELL_WRAPPER: String = js.native
    @scala.inline
    def HEADER_CELL_WRAPPER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_CELL_WRAPPER")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.HEADER_ROW")
    @js.native
    def HEADER_ROW: String = js.native
    @scala.inline
    def HEADER_ROW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_ROW")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.HEADER_ROW_CHECKBOX")
    @js.native
    def HEADER_ROW_CHECKBOX: String = js.native
    @scala.inline
    def HEADER_ROW_CHECKBOX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_ROW_CHECKBOX")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.IN_PROGRESS")
    @js.native
    def IN_PROGRESS: String = js.native
    @scala.inline
    def IN_PROGRESS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IN_PROGRESS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.LINEAR_PROGRESS")
    @js.native
    def LINEAR_PROGRESS: String = js.native
    @scala.inline
    def LINEAR_PROGRESS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR_PROGRESS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.PAGINATION_ROWS_PER_PAGE_LABEL")
    @js.native
    def PAGINATION_ROWS_PER_PAGE_LABEL: String = js.native
    @scala.inline
    def PAGINATION_ROWS_PER_PAGE_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAGINATION_ROWS_PER_PAGE_LABEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.PAGINATION_ROWS_PER_PAGE_SELECT")
    @js.native
    def PAGINATION_ROWS_PER_PAGE_SELECT: String = js.native
    @scala.inline
    def PAGINATION_ROWS_PER_PAGE_SELECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAGINATION_ROWS_PER_PAGE_SELECT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.PROGRESS_INDICATOR")
    @js.native
    def PROGRESS_INDICATOR: String = js.native
    @scala.inline
    def PROGRESS_INDICATOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROGRESS_INDICATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.ROW")
    @js.native
    def ROW: String = js.native
    @scala.inline
    def ROW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROW")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.ROW_CHECKBOX")
    @js.native
    def ROW_CHECKBOX: String = js.native
    @scala.inline
    def ROW_CHECKBOX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROW_CHECKBOX")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.ROW_SELECTED")
    @js.native
    def ROW_SELECTED: String = js.native
    @scala.inline
    def ROW_SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROW_SELECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.SORT_ICON_BUTTON")
    @js.native
    def SORT_ICON_BUTTON: String = js.native
    @scala.inline
    def SORT_ICON_BUTTON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORT_ICON_BUTTON")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.SORT_STATUS_LABEL")
    @js.native
    def SORT_STATUS_LABEL: String = js.native
    @scala.inline
    def SORT_STATUS_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORT_STATUS_LABEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "cssClasses.TABLE_CONTAINER")
    @js.native
    def TABLE_CONTAINER: String = js.native
    @scala.inline
    def TABLE_CONTAINER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TABLE_CONTAINER")(x.asInstanceOf[js.Any])
  }
  
  object dataAttributes {
    
    @JSImport("@material/data-table/constants", "dataAttributes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/data-table/constants", "dataAttributes.COLUMN_ID")
    @js.native
    def COLUMN_ID: String = js.native
    @scala.inline
    def COLUMN_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLUMN_ID")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "dataAttributes.ROW_ID")
    @js.native
    def ROW_ID: String = js.native
    @scala.inline
    def ROW_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROW_ID")(x.asInstanceOf[js.Any])
  }
  
  object events {
    
    @JSImport("@material/data-table/constants", "events")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/data-table/constants", "events.ROW_SELECTION_CHANGED")
    @js.native
    def ROW_SELECTION_CHANGED: String = js.native
    @scala.inline
    def ROW_SELECTION_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROW_SELECTION_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "events.SELECTED_ALL")
    @js.native
    def SELECTED_ALL: String = js.native
    @scala.inline
    def SELECTED_ALL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "events.SORTED")
    @js.native
    def SORTED: String = js.native
    @scala.inline
    def SORTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "events.UNSELECTED_ALL")
    @js.native
    def UNSELECTED_ALL: String = js.native
    @scala.inline
    def UNSELECTED_ALL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSELECTED_ALL")(x.asInstanceOf[js.Any])
  }
  
  object messages {
    
    @JSImport("@material/data-table/constants", "messages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/data-table/constants", "messages.SORTED_IN_ASCENDING")
    @js.native
    def SORTED_IN_ASCENDING: String = js.native
    @scala.inline
    def SORTED_IN_ASCENDING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORTED_IN_ASCENDING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "messages.SORTED_IN_DESCENDING")
    @js.native
    def SORTED_IN_DESCENDING: String = js.native
    @scala.inline
    def SORTED_IN_DESCENDING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORTED_IN_DESCENDING")(x.asInstanceOf[js.Any])
  }
  
  object selectors {
    
    @JSImport("@material/data-table/constants", "selectors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/data-table/constants", "selectors.CONTENT")
    @js.native
    def CONTENT: String = js.native
    @scala.inline
    def CONTENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "selectors.HEADER_CELL")
    @js.native
    def HEADER_CELL: String = js.native
    @scala.inline
    def HEADER_CELL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_CELL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "selectors.HEADER_CELL_WITH_SORT")
    @js.native
    def HEADER_CELL_WITH_SORT: String = js.native
    @scala.inline
    def HEADER_CELL_WITH_SORT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_CELL_WITH_SORT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "selectors.HEADER_ROW")
    @js.native
    def HEADER_ROW: String = js.native
    @scala.inline
    def HEADER_ROW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_ROW")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "selectors.HEADER_ROW_CHECKBOX")
    @js.native
    def HEADER_ROW_CHECKBOX: String = js.native
    @scala.inline
    def HEADER_ROW_CHECKBOX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_ROW_CHECKBOX")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "selectors.PROGRESS_INDICATOR")
    @js.native
    def PROGRESS_INDICATOR: String = js.native
    @scala.inline
    def PROGRESS_INDICATOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROGRESS_INDICATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "selectors.ROW")
    @js.native
    def ROW: String = js.native
    @scala.inline
    def ROW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROW")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "selectors.ROW_CHECKBOX")
    @js.native
    def ROW_CHECKBOX: String = js.native
    @scala.inline
    def ROW_CHECKBOX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROW_CHECKBOX")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "selectors.ROW_SELECTED")
    @js.native
    def ROW_SELECTED: String = js.native
    @scala.inline
    def ROW_SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROW_SELECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "selectors.SORT_ICON_BUTTON")
    @js.native
    def SORT_ICON_BUTTON: String = js.native
    @scala.inline
    def SORT_ICON_BUTTON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORT_ICON_BUTTON")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "selectors.SORT_STATUS_LABEL")
    @js.native
    def SORT_STATUS_LABEL: String = js.native
    @scala.inline
    def SORT_STATUS_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SORT_STATUS_LABEL")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/data-table/constants", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/data-table/constants", "strings.ARIA_SELECTED")
    @js.native
    def ARIA_SELECTED: String = js.native
    @scala.inline
    def ARIA_SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_SELECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "strings.ARIA_SORT")
    @js.native
    def ARIA_SORT: String = js.native
    @scala.inline
    def ARIA_SORT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_SORT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "strings.DATA_ROW_ID_ATTR")
    @js.native
    def DATA_ROW_ID_ATTR: String = js.native
    @scala.inline
    def DATA_ROW_ID_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_ROW_ID_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "strings.HEADER_ROW_CHECKBOX_SELECTOR")
    @js.native
    def HEADER_ROW_CHECKBOX_SELECTOR: String = js.native
    @scala.inline
    def HEADER_ROW_CHECKBOX_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADER_ROW_CHECKBOX_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "strings.ROW_CHECKBOX_SELECTOR")
    @js.native
    def ROW_CHECKBOX_SELECTOR: String = js.native
    @scala.inline
    def ROW_CHECKBOX_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROW_CHECKBOX_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "strings.ROW_SELECTED_SELECTOR")
    @js.native
    def ROW_SELECTED_SELECTOR: String = js.native
    @scala.inline
    def ROW_SELECTED_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROW_SELECTED_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/data-table/constants", "strings.ROW_SELECTOR")
    @js.native
    def ROW_SELECTOR: String = js.native
    @scala.inline
    def ROW_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROW_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
