package typings.materialUiCore.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rows extends StObject {
  
  /**
    * While you can pass any node as children, the main use case is for an img.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Width of the item in number of grid columns.
    */
  var cols: js.UndefOr[Double] = js.undefined
  
  /**
    * Height of the item in number of grid rows.
    */
  var rows: js.UndefOr[Double] = js.undefined
}
object Rows {
  
  inline def apply(): Rows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rows]
  }
  
  extension [Self <: Rows](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
