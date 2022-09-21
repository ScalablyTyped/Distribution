package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkeletonContainerGridItem extends StObject {
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var colStart: js.UndefOr[Double] = js.undefined
  
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  var rowStart: js.UndefOr[Double] = js.undefined
  
  var shape: js.UndefOr[String] = js.undefined
}
object SkeletonContainerGridItem {
  
  inline def apply(): SkeletonContainerGridItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkeletonContainerGridItem]
  }
  
  extension [Self <: SkeletonContainerGridItem](x: Self) {
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setColStart(value: Double): Self = StObject.set(x, "colStart", value.asInstanceOf[js.Any])
    
    inline def setColStartUndefined: Self = StObject.set(x, "colStart", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setRowStart(value: Double): Self = StObject.set(x, "rowStart", value.asInstanceOf[js.Any])
    
    inline def setRowStartUndefined: Self = StObject.set(x, "rowStart", js.undefined)
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
