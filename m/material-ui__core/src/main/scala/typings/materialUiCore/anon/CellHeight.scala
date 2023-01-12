package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellHeight extends StObject {
  
  var cellHeight: js.UndefOr[Double | auto] = js.undefined
  
  var cols: js.UndefOr[Double] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
}
object CellHeight {
  
  inline def apply(): CellHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellHeight] (val x: Self) extends AnyVal {
    
    inline def setCellHeight(value: Double | auto): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
