package typings.handsontable.anon

import typings.handsontable.commonMod.CellValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueCellValue extends StObject {
  
  var value: CellValue
}
object ValueCellValue {
  
  inline def apply(value: CellValue): ValueCellValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueCellValue]
  }
  
  extension [Self <: ValueCellValue](x: Self) {
    
    inline def setValue(value: CellValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
