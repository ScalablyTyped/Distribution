package typings.materialDataTable

import typings.materialDataTable.constantsMod.SortValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait MDCDataTableRowSelectionChangedEventDetail extends StObject {
    
    var rowId: String | Null
    
    var rowIndex: Double
    
    var selected: Boolean
  }
  object MDCDataTableRowSelectionChangedEventDetail {
    
    @scala.inline
    def apply(rowIndex: Double, selected: Boolean): MDCDataTableRowSelectionChangedEventDetail = {
      val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], rowId = null)
      __obj.asInstanceOf[MDCDataTableRowSelectionChangedEventDetail]
    }
    
    @scala.inline
    implicit class MDCDataTableRowSelectionChangedEventDetailMutableBuilder[Self <: MDCDataTableRowSelectionChangedEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRowId(value: String): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIdNull: Self = StObject.set(x, "rowId", null)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProgressIndicatorStyles extends StObject {
    
    var height: String
    
    var top: String
  }
  object ProgressIndicatorStyles {
    
    @scala.inline
    def apply(height: String, top: String): ProgressIndicatorStyles = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressIndicatorStyles]
    }
    
    @scala.inline
    implicit class ProgressIndicatorStylesMutableBuilder[Self <: ProgressIndicatorStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait SortActionEventData extends StObject {
    
    var columnId: String | Null
    
    var columnIndex: Double
    
    var headerCell: HTMLElement
  }
  object SortActionEventData {
    
    @scala.inline
    def apply(columnIndex: Double, headerCell: HTMLElement): SortActionEventData = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], columnId = null)
      __obj.asInstanceOf[SortActionEventData]
    }
    
    @scala.inline
    implicit class SortActionEventDataMutableBuilder[Self <: SortActionEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIdNull: Self = StObject.set(x, "columnId", null)
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderCell(value: HTMLElement): Self = StObject.set(x, "headerCell", value.asInstanceOf[js.Any])
    }
  }
  
  trait SortActionEventDetail extends StObject {
    
    var columnId: String | Null
    
    var columnIndex: Double
    
    var headerCell: HTMLElement
    
    var sortValue: SortValue
  }
  object SortActionEventDetail {
    
    @scala.inline
    def apply(columnIndex: Double, headerCell: HTMLElement, sortValue: SortValue): SortActionEventDetail = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], sortValue = sortValue.asInstanceOf[js.Any], columnId = null)
      __obj.asInstanceOf[SortActionEventDetail]
    }
    
    @scala.inline
    implicit class SortActionEventDetailMutableBuilder[Self <: SortActionEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIdNull: Self = StObject.set(x, "columnId", null)
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderCell(value: HTMLElement): Self = StObject.set(x, "headerCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortValue(value: SortValue): Self = StObject.set(x, "sortValue", value.asInstanceOf[js.Any])
    }
  }
}
