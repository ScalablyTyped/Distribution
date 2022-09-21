package typings.hyperformula.astMod

import typings.hyperformula.astMod.AstNodeType.ROW_RANGE
import typings.hyperformula.rowAddressMod.RowAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowRangeAst
  extends StObject
     with AstWithWhitespace
     with Ast {
  
  var end: RowAddress
  
  var sheetReferenceType: RangeSheetReferenceType
  
  var start: RowAddress
  
  var `type`: ROW_RANGE
}
object RowRangeAst {
  
  inline def apply(end: RowAddress, sheetReferenceType: RangeSheetReferenceType, start: RowAddress, `type`: ROW_RANGE): RowRangeAst = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], sheetReferenceType = sheetReferenceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowRangeAst]
  }
  
  extension [Self <: RowRangeAst](x: Self) {
    
    inline def setEnd(value: RowAddress): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setSheetReferenceType(value: RangeSheetReferenceType): Self = StObject.set(x, "sheetReferenceType", value.asInstanceOf[js.Any])
    
    inline def setStart(value: RowAddress): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: ROW_RANGE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
