package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.COLUMN_RANGE
import typings.hyperformula.typingsParserColumnAddressMod.ColumnAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnRangeAst
  extends StObject
     with AstWithWhitespace
     with Ast {
  
  var end: ColumnAddress
  
  var sheetReferenceType: RangeSheetReferenceType
  
  var start: ColumnAddress
  
  var `type`: COLUMN_RANGE
}
object ColumnRangeAst {
  
  inline def apply(
    end: ColumnAddress,
    sheetReferenceType: RangeSheetReferenceType,
    start: ColumnAddress,
    `type`: COLUMN_RANGE
  ): ColumnRangeAst = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], sheetReferenceType = sheetReferenceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnRangeAst]
  }
  
  extension [Self <: ColumnRangeAst](x: Self) {
    
    inline def setEnd(value: ColumnAddress): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setSheetReferenceType(value: RangeSheetReferenceType): Self = StObject.set(x, "sheetReferenceType", value.asInstanceOf[js.Any])
    
    inline def setStart(value: ColumnAddress): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: COLUMN_RANGE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
