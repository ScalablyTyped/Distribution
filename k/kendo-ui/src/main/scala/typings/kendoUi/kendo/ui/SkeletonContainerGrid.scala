package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkeletonContainerGrid extends StObject {
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var gap: js.UndefOr[SkeletonContainerGridGap] = js.undefined
  
  var items: js.UndefOr[js.Array[SkeletonContainerGridItem]] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
}
object SkeletonContainerGrid {
  
  inline def apply(): SkeletonContainerGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkeletonContainerGrid]
  }
  
  extension [Self <: SkeletonContainerGrid](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setGap(value: SkeletonContainerGridGap): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setItems(value: js.Array[SkeletonContainerGridItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SkeletonContainerGridItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
