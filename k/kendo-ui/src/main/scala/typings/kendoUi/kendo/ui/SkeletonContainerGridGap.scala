package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkeletonContainerGridGap extends StObject {
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
}
object SkeletonContainerGridGap {
  
  inline def apply(): SkeletonContainerGridGap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkeletonContainerGridGap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkeletonContainerGridGap] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
