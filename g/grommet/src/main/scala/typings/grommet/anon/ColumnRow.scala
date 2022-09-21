package typings.grommet.anon

import typings.grommet.utilsMod.GapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnRow extends StObject {
  
  var column: js.UndefOr[GapType] = js.undefined
  
  var row: js.UndefOr[GapType] = js.undefined
}
object ColumnRow {
  
  inline def apply(): ColumnRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnRow]
  }
  
  extension [Self <: ColumnRow](x: Self) {
    
    inline def setColumn(value: GapType): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setRow(value: GapType): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
