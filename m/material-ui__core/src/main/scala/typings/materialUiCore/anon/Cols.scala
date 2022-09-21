package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cols extends StObject {
  
  var cols: js.UndefOr[Double] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
}
object Cols {
  
  inline def apply(): Cols = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cols]
  }
  
  extension [Self <: Cols](x: Self) {
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
