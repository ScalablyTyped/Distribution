package typings.hyperformula.astMod

import typings.hyperformula.astMod.AstNodeType.ARRAY
import typings.hyperformula.astMod.AstNodeType.CELL_RANGE
import typings.hyperformula.astMod.AstNodeType.CELL_REFERENCE
import typings.hyperformula.astMod.AstNodeType.COLUMN_RANGE
import typings.hyperformula.astMod.AstNodeType.CONCATENATE_OP
import typings.hyperformula.astMod.AstNodeType.DIV_OP
import typings.hyperformula.astMod.AstNodeType.EMPTY
import typings.hyperformula.astMod.AstNodeType.EQUALS_OP
import typings.hyperformula.astMod.AstNodeType.ERROR
import typings.hyperformula.astMod.AstNodeType.ERROR_WITH_RAW_INPUT
import typings.hyperformula.astMod.AstNodeType.FUNCTION_CALL
import typings.hyperformula.astMod.AstNodeType.GREATER_THAN_OP
import typings.hyperformula.astMod.AstNodeType.GREATER_THAN_OR_EQUAL_OP
import typings.hyperformula.astMod.AstNodeType.LESS_THAN_OP
import typings.hyperformula.astMod.AstNodeType.LESS_THAN_OR_EQUAL_OP
import typings.hyperformula.astMod.AstNodeType.MINUS_OP
import typings.hyperformula.astMod.AstNodeType.MINUS_UNARY_OP
import typings.hyperformula.astMod.AstNodeType.NAMED_EXPRESSION
import typings.hyperformula.astMod.AstNodeType.NOT_EQUAL_OP
import typings.hyperformula.astMod.AstNodeType.NUMBER
import typings.hyperformula.astMod.AstNodeType.PARENTHESIS
import typings.hyperformula.astMod.AstNodeType.PERCENT_OP
import typings.hyperformula.astMod.AstNodeType.PLUS_OP
import typings.hyperformula.astMod.AstNodeType.PLUS_UNARY_OP
import typings.hyperformula.astMod.AstNodeType.POWER_OP
import typings.hyperformula.astMod.AstNodeType.ROW_RANGE
import typings.hyperformula.astMod.AstNodeType.STRING
import typings.hyperformula.astMod.AstNodeType.TIMES_OP
import typings.hyperformula.cellAddressMod.CellAddress
import typings.hyperformula.cellMod.CellError
import typings.hyperformula.columnAddressMod.ColumnAddress
import typings.hyperformula.rowAddressMod.RowAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hyperformula.astMod.NumberAst
  - typings.hyperformula.astMod.StringAst
  - typings.hyperformula.astMod.CellReferenceAst
  - typings.hyperformula.astMod.CellRangeAst
  - typings.hyperformula.astMod.ColumnRangeAst
  - typings.hyperformula.astMod.RowRangeAst
  - typings.hyperformula.astMod.ConcatenateOpAst
  - typings.hyperformula.astMod.MinusUnaryOpAst
  - typings.hyperformula.astMod.PlusUnaryOpAst
  - typings.hyperformula.astMod.PercentOpAst
  - typings.hyperformula.astMod.EqualsOpAst
  - typings.hyperformula.astMod.NotEqualOpAst
  - typings.hyperformula.astMod.GreaterThanOpAst
  - typings.hyperformula.astMod.LessThanOpAst
  - typings.hyperformula.astMod.LessThanOrEqualOpAst
  - typings.hyperformula.astMod.GreaterThanOrEqualOpAst
  - typings.hyperformula.astMod.PlusOpAst
  - typings.hyperformula.astMod.MinusOpAst
  - typings.hyperformula.astMod.TimesOpAst
  - typings.hyperformula.astMod.DivOpAst
  - typings.hyperformula.astMod.PowerOpAst
  - typings.hyperformula.astMod.ProcedureAst
  - typings.hyperformula.astMod.NamedExpressionAst
  - typings.hyperformula.astMod.ParenthesisAst
  - typings.hyperformula.astMod.ErrorAst
  - typings.hyperformula.astMod.ErrorWithRawInputAst
  - typings.hyperformula.astMod.EmptyArgAst
  - typings.hyperformula.astMod.ArrayAst
*/
trait Ast extends StObject
object Ast {
  
  inline def ArrayAst(args: js.Array[js.Array[Ast]], `type`: ARRAY): typings.hyperformula.astMod.ArrayAst = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.ArrayAst]
  }
  
  inline def CellRangeAst(
    end: CellAddress,
    sheetReferenceType: RangeSheetReferenceType,
    start: CellAddress,
    `type`: CELL_RANGE
  ): typings.hyperformula.astMod.CellRangeAst = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], sheetReferenceType = sheetReferenceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.CellRangeAst]
  }
  
  inline def CellReferenceAst(reference: CellAddress, `type`: CELL_REFERENCE): typings.hyperformula.astMod.CellReferenceAst = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.CellReferenceAst]
  }
  
  inline def ColumnRangeAst(
    end: ColumnAddress,
    sheetReferenceType: RangeSheetReferenceType,
    start: ColumnAddress,
    `type`: COLUMN_RANGE
  ): typings.hyperformula.astMod.ColumnRangeAst = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], sheetReferenceType = sheetReferenceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.ColumnRangeAst]
  }
  
  inline def ConcatenateOpAst(left: Ast, right: Ast, `type`: CONCATENATE_OP): typings.hyperformula.astMod.ConcatenateOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.ConcatenateOpAst]
  }
  
  inline def DivOpAst(left: Ast, right: Ast, `type`: DIV_OP): typings.hyperformula.astMod.DivOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.DivOpAst]
  }
  
  inline def EmptyArgAst(`type`: EMPTY): typings.hyperformula.astMod.EmptyArgAst = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.EmptyArgAst]
  }
  
  inline def EqualsOpAst(left: Ast, right: Ast, `type`: EQUALS_OP): typings.hyperformula.astMod.EqualsOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.EqualsOpAst]
  }
  
  inline def ErrorAst(error: CellError, `type`: ERROR): typings.hyperformula.astMod.ErrorAst = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.ErrorAst]
  }
  
  inline def ErrorWithRawInputAst(error: CellError, rawInput: String, `type`: ERROR_WITH_RAW_INPUT): typings.hyperformula.astMod.ErrorWithRawInputAst = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], rawInput = rawInput.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.ErrorWithRawInputAst]
  }
  
  inline def GreaterThanOpAst(left: Ast, right: Ast, `type`: GREATER_THAN_OP): typings.hyperformula.astMod.GreaterThanOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.GreaterThanOpAst]
  }
  
  inline def GreaterThanOrEqualOpAst(left: Ast, right: Ast, `type`: GREATER_THAN_OR_EQUAL_OP): typings.hyperformula.astMod.GreaterThanOrEqualOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.GreaterThanOrEqualOpAst]
  }
  
  inline def LessThanOpAst(left: Ast, right: Ast, `type`: LESS_THAN_OP): typings.hyperformula.astMod.LessThanOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.LessThanOpAst]
  }
  
  inline def LessThanOrEqualOpAst(left: Ast, right: Ast, `type`: LESS_THAN_OR_EQUAL_OP): typings.hyperformula.astMod.LessThanOrEqualOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.LessThanOrEqualOpAst]
  }
  
  inline def MinusOpAst(left: Ast, right: Ast, `type`: MINUS_OP): typings.hyperformula.astMod.MinusOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.MinusOpAst]
  }
  
  inline def MinusUnaryOpAst(`type`: MINUS_UNARY_OP, value: Ast): typings.hyperformula.astMod.MinusUnaryOpAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.MinusUnaryOpAst]
  }
  
  inline def NamedExpressionAst(expressionName: String, `type`: NAMED_EXPRESSION): typings.hyperformula.astMod.NamedExpressionAst = {
    val __obj = js.Dynamic.literal(expressionName = expressionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.NamedExpressionAst]
  }
  
  inline def NotEqualOpAst(left: Ast, right: Ast, `type`: NOT_EQUAL_OP): typings.hyperformula.astMod.NotEqualOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.NotEqualOpAst]
  }
  
  inline def NumberAst(`type`: NUMBER, value: Double): typings.hyperformula.astMod.NumberAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.NumberAst]
  }
  
  inline def ParenthesisAst(expression: Ast, `type`: PARENTHESIS): typings.hyperformula.astMod.ParenthesisAst = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.ParenthesisAst]
  }
  
  inline def PercentOpAst(`type`: PERCENT_OP, value: Ast): typings.hyperformula.astMod.PercentOpAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.PercentOpAst]
  }
  
  inline def PlusOpAst(left: Ast, right: Ast, `type`: PLUS_OP): typings.hyperformula.astMod.PlusOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.PlusOpAst]
  }
  
  inline def PlusUnaryOpAst(`type`: PLUS_UNARY_OP, value: Ast): typings.hyperformula.astMod.PlusUnaryOpAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.PlusUnaryOpAst]
  }
  
  inline def PowerOpAst(left: Ast, right: Ast, `type`: POWER_OP): typings.hyperformula.astMod.PowerOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.PowerOpAst]
  }
  
  inline def ProcedureAst(args: js.Array[Ast], procedureName: String, `type`: FUNCTION_CALL): typings.hyperformula.astMod.ProcedureAst = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], procedureName = procedureName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.ProcedureAst]
  }
  
  inline def RowRangeAst(end: RowAddress, sheetReferenceType: RangeSheetReferenceType, start: RowAddress, `type`: ROW_RANGE): typings.hyperformula.astMod.RowRangeAst = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], sheetReferenceType = sheetReferenceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.RowRangeAst]
  }
  
  inline def StringAst(`type`: STRING, value: String): typings.hyperformula.astMod.StringAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.StringAst]
  }
  
  inline def TimesOpAst(left: Ast, right: Ast, `type`: TIMES_OP): typings.hyperformula.astMod.TimesOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.astMod.TimesOpAst]
  }
}
