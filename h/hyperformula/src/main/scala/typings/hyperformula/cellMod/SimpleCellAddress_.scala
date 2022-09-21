package typings.hyperformula.cellMod

import typings.hyperformula.cellDependencyMod.CellDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleCellAddress_
  extends StObject
     with CellDependency {
  
  var col: Double
  
  var row: Double
  
  var sheet: Double
}
object SimpleCellAddress_ {
  
  inline def apply(col: Double, row: Double, sheet: Double): SimpleCellAddress_ = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleCellAddress_]
  }
  
  extension [Self <: SimpleCellAddress_](x: Self) {
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSheet(value: Double): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
  }
}
