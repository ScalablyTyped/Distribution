package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsCellMod.CellError
import typings.hyperformula.typingsParserAstMod.AstNodeType.ARRAY
import typings.hyperformula.typingsParserAstMod.AstNodeType.CELL_RANGE
import typings.hyperformula.typingsParserAstMod.AstNodeType.CELL_REFERENCE
import typings.hyperformula.typingsParserAstMod.AstNodeType.COLUMN_RANGE
import typings.hyperformula.typingsParserAstMod.AstNodeType.CONCATENATE_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.DIV_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.EMPTY
import typings.hyperformula.typingsParserAstMod.AstNodeType.EQUALS_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.ERROR
import typings.hyperformula.typingsParserAstMod.AstNodeType.ERROR_WITH_RAW_INPUT
import typings.hyperformula.typingsParserAstMod.AstNodeType.FUNCTION_CALL
import typings.hyperformula.typingsParserAstMod.AstNodeType.GREATER_THAN_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.GREATER_THAN_OR_EQUAL_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.LESS_THAN_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.LESS_THAN_OR_EQUAL_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.MINUS_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.MINUS_UNARY_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.NAMED_EXPRESSION
import typings.hyperformula.typingsParserAstMod.AstNodeType.NOT_EQUAL_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.NUMBER
import typings.hyperformula.typingsParserAstMod.AstNodeType.PARENTHESIS
import typings.hyperformula.typingsParserAstMod.AstNodeType.PERCENT_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.PLUS_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.PLUS_UNARY_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.POWER_OP
import typings.hyperformula.typingsParserAstMod.AstNodeType.ROW_RANGE
import typings.hyperformula.typingsParserAstMod.AstNodeType.STRING
import typings.hyperformula.typingsParserAstMod.AstNodeType.TIMES_OP
import typings.hyperformula.typingsParserCellAddressMod.CellAddress
import typings.hyperformula.typingsParserColumnAddressMod.ColumnAddress
import typings.hyperformula.typingsParserRowAddressMod.RowAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hyperformula.typingsParserAstMod.NumberAst
  - typings.hyperformula.typingsParserAstMod.StringAst
  - typings.hyperformula.typingsParserAstMod.CellReferenceAst
  - typings.hyperformula.typingsParserAstMod.CellRangeAst
  - typings.hyperformula.typingsParserAstMod.ColumnRangeAst
  - typings.hyperformula.typingsParserAstMod.RowRangeAst
  - typings.hyperformula.typingsParserAstMod.ConcatenateOpAst
  - typings.hyperformula.typingsParserAstMod.MinusUnaryOpAst
  - typings.hyperformula.typingsParserAstMod.PlusUnaryOpAst
  - typings.hyperformula.typingsParserAstMod.PercentOpAst
  - typings.hyperformula.typingsParserAstMod.EqualsOpAst
  - typings.hyperformula.typingsParserAstMod.NotEqualOpAst
  - typings.hyperformula.typingsParserAstMod.GreaterThanOpAst
  - typings.hyperformula.typingsParserAstMod.LessThanOpAst
  - typings.hyperformula.typingsParserAstMod.LessThanOrEqualOpAst
  - typings.hyperformula.typingsParserAstMod.GreaterThanOrEqualOpAst
  - typings.hyperformula.typingsParserAstMod.PlusOpAst
  - typings.hyperformula.typingsParserAstMod.MinusOpAst
  - typings.hyperformula.typingsParserAstMod.TimesOpAst
  - typings.hyperformula.typingsParserAstMod.DivOpAst
  - typings.hyperformula.typingsParserAstMod.PowerOpAst
  - typings.hyperformula.typingsParserAstMod.ProcedureAst
  - typings.hyperformula.typingsParserAstMod.NamedExpressionAst
  - typings.hyperformula.typingsParserAstMod.ParenthesisAst
  - typings.hyperformula.typingsParserAstMod.ErrorAst
  - typings.hyperformula.typingsParserAstMod.ErrorWithRawInputAst
  - typings.hyperformula.typingsParserAstMod.EmptyArgAst
  - typings.hyperformula.typingsParserAstMod.ArrayAst
*/
trait Ast extends StObject
object Ast {
  
  inline def ArrayAst(args: js.Array[js.Array[Ast]], `type`: ARRAY): typings.hyperformula.typingsParserAstMod.ArrayAst = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.ArrayAst]
  }
  
  inline def CellRangeAst(
    end: CellAddress,
    sheetReferenceType: RangeSheetReferenceType,
    start: CellAddress,
    `type`: CELL_RANGE
  ): typings.hyperformula.typingsParserAstMod.CellRangeAst = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], sheetReferenceType = sheetReferenceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.CellRangeAst]
  }
  
  inline def CellReferenceAst(reference: CellAddress, `type`: CELL_REFERENCE): typings.hyperformula.typingsParserAstMod.CellReferenceAst = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.CellReferenceAst]
  }
  
  inline def ColumnRangeAst(
    end: ColumnAddress,
    sheetReferenceType: RangeSheetReferenceType,
    start: ColumnAddress,
    `type`: COLUMN_RANGE
  ): typings.hyperformula.typingsParserAstMod.ColumnRangeAst = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], sheetReferenceType = sheetReferenceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.ColumnRangeAst]
  }
  
  inline def ConcatenateOpAst(left: Ast, right: Ast, `type`: CONCATENATE_OP): typings.hyperformula.typingsParserAstMod.ConcatenateOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.ConcatenateOpAst]
  }
  
  inline def DivOpAst(left: Ast, right: Ast, `type`: DIV_OP): typings.hyperformula.typingsParserAstMod.DivOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.DivOpAst]
  }
  
  inline def EmptyArgAst(`type`: EMPTY): typings.hyperformula.typingsParserAstMod.EmptyArgAst = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.EmptyArgAst]
  }
  
  inline def EqualsOpAst(left: Ast, right: Ast, `type`: EQUALS_OP): typings.hyperformula.typingsParserAstMod.EqualsOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.EqualsOpAst]
  }
  
  inline def ErrorAst(error: CellError, `type`: ERROR): typings.hyperformula.typingsParserAstMod.ErrorAst = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.ErrorAst]
  }
  
  inline def ErrorWithRawInputAst(error: CellError, rawInput: String, `type`: ERROR_WITH_RAW_INPUT): typings.hyperformula.typingsParserAstMod.ErrorWithRawInputAst = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], rawInput = rawInput.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.ErrorWithRawInputAst]
  }
  
  inline def GreaterThanOpAst(left: Ast, right: Ast, `type`: GREATER_THAN_OP): typings.hyperformula.typingsParserAstMod.GreaterThanOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.GreaterThanOpAst]
  }
  
  inline def GreaterThanOrEqualOpAst(left: Ast, right: Ast, `type`: GREATER_THAN_OR_EQUAL_OP): typings.hyperformula.typingsParserAstMod.GreaterThanOrEqualOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.GreaterThanOrEqualOpAst]
  }
  
  inline def LessThanOpAst(left: Ast, right: Ast, `type`: LESS_THAN_OP): typings.hyperformula.typingsParserAstMod.LessThanOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.LessThanOpAst]
  }
  
  inline def LessThanOrEqualOpAst(left: Ast, right: Ast, `type`: LESS_THAN_OR_EQUAL_OP): typings.hyperformula.typingsParserAstMod.LessThanOrEqualOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.LessThanOrEqualOpAst]
  }
  
  inline def MinusOpAst(left: Ast, right: Ast, `type`: MINUS_OP): typings.hyperformula.typingsParserAstMod.MinusOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.MinusOpAst]
  }
  
  inline def MinusUnaryOpAst(`type`: MINUS_UNARY_OP, value: Ast): typings.hyperformula.typingsParserAstMod.MinusUnaryOpAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.MinusUnaryOpAst]
  }
  
  inline def NamedExpressionAst(expressionName: String, `type`: NAMED_EXPRESSION): typings.hyperformula.typingsParserAstMod.NamedExpressionAst = {
    val __obj = js.Dynamic.literal(expressionName = expressionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.NamedExpressionAst]
  }
  
  inline def NotEqualOpAst(left: Ast, right: Ast, `type`: NOT_EQUAL_OP): typings.hyperformula.typingsParserAstMod.NotEqualOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.NotEqualOpAst]
  }
  
  inline def NumberAst(`type`: NUMBER, value: Double): typings.hyperformula.typingsParserAstMod.NumberAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.NumberAst]
  }
  
  inline def ParenthesisAst(expression: Ast, `type`: PARENTHESIS): typings.hyperformula.typingsParserAstMod.ParenthesisAst = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.ParenthesisAst]
  }
  
  inline def PercentOpAst(`type`: PERCENT_OP, value: Ast): typings.hyperformula.typingsParserAstMod.PercentOpAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.PercentOpAst]
  }
  
  inline def PlusOpAst(left: Ast, right: Ast, `type`: PLUS_OP): typings.hyperformula.typingsParserAstMod.PlusOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.PlusOpAst]
  }
  
  inline def PlusUnaryOpAst(`type`: PLUS_UNARY_OP, value: Ast): typings.hyperformula.typingsParserAstMod.PlusUnaryOpAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.PlusUnaryOpAst]
  }
  
  inline def PowerOpAst(left: Ast, right: Ast, `type`: POWER_OP): typings.hyperformula.typingsParserAstMod.PowerOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.PowerOpAst]
  }
  
  inline def ProcedureAst(args: js.Array[Ast], procedureName: String, `type`: FUNCTION_CALL): typings.hyperformula.typingsParserAstMod.ProcedureAst = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], procedureName = procedureName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.ProcedureAst]
  }
  
  inline def RowRangeAst(end: RowAddress, sheetReferenceType: RangeSheetReferenceType, start: RowAddress, `type`: ROW_RANGE): typings.hyperformula.typingsParserAstMod.RowRangeAst = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], sheetReferenceType = sheetReferenceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.RowRangeAst]
  }
  
  inline def StringAst(`type`: STRING, value: String): typings.hyperformula.typingsParserAstMod.StringAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.StringAst]
  }
  
  inline def TimesOpAst(left: Ast, right: Ast, `type`: TIMES_OP): typings.hyperformula.typingsParserAstMod.TimesOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hyperformula.typingsParserAstMod.TimesOpAst]
  }
}
