package typings.hyperformula.astMod

import typings.hyperformula.astMod.AstNodeType.CELL_RANGE
import typings.hyperformula.cellAddressMod.CellAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellRangeAst
  extends StObject
     with AstWithWhitespace
     with Ast {
  
  var end: CellAddress
  
  var sheetReferenceType: RangeSheetReferenceType
  
  var start: CellAddress
  
  var `type`: CELL_RANGE
}
object CellRangeAst {
  
  inline def apply(
    end: CellAddress,
    sheetReferenceType: RangeSheetReferenceType,
    start: CellAddress,
    `type`: CELL_RANGE
  ): CellRangeAst = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], sheetReferenceType = sheetReferenceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRangeAst]
  }
  
  extension [Self <: CellRangeAst](x: Self) {
    
    inline def setEnd(value: CellAddress): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setSheetReferenceType(value: RangeSheetReferenceType): Self = StObject.set(x, "sheetReferenceType", value.asInstanceOf[js.Any])
    
    inline def setStart(value: CellAddress): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: CELL_RANGE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
