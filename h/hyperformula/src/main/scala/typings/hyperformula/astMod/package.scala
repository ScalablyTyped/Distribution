package typings.hyperformula.astMod

import typings.chevrotainTypes.mod.IToken
import typings.hyperformula.anon.Message
import typings.hyperformula.astMod.^
import typings.hyperformula.cellAddressMod.CellAddress
import typings.hyperformula.cellMod.CellError
import typings.hyperformula.columnAddressMod.ColumnAddress
import typings.hyperformula.formulaParserMod.ExtendedToken
import typings.hyperformula.rowAddressMod.RowAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def buildArrayAst(args: js.Array[js.Array[Ast]]): ArrayAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildArrayAst")(args.asInstanceOf[js.Any]).asInstanceOf[ArrayAst]
inline def buildArrayAst(args: js.Array[js.Array[Ast]], leadingWhitespace: Unit, internalWhitespace: IToken): ArrayAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildArrayAst")(args.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any], internalWhitespace.asInstanceOf[js.Any])).asInstanceOf[ArrayAst]
inline def buildArrayAst(args: js.Array[js.Array[Ast]], leadingWhitespace: IToken): ArrayAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildArrayAst")(args.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[ArrayAst]
inline def buildArrayAst(args: js.Array[js.Array[Ast]], leadingWhitespace: IToken, internalWhitespace: IToken): ArrayAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildArrayAst")(args.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any], internalWhitespace.asInstanceOf[js.Any])).asInstanceOf[ArrayAst]

inline def buildCellErrorAst(error: CellError): ErrorAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildCellErrorAst")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorAst]
inline def buildCellErrorAst(error: CellError, leadingWhitespace: IToken): ErrorAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCellErrorAst")(error.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[ErrorAst]

inline def buildCellRangeAst(start: CellAddress, end: CellAddress, sheetReferenceType: RangeSheetReferenceType): CellRangeAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCellRangeAst")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sheetReferenceType.asInstanceOf[js.Any])).asInstanceOf[CellRangeAst]
inline def buildCellRangeAst(
  start: CellAddress,
  end: CellAddress,
  sheetReferenceType: RangeSheetReferenceType,
  leadingWhitespace: String
): CellRangeAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCellRangeAst")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sheetReferenceType.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[CellRangeAst]

inline def buildCellReferenceAst(reference: CellAddress): CellReferenceAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildCellReferenceAst")(reference.asInstanceOf[js.Any]).asInstanceOf[CellReferenceAst]
inline def buildCellReferenceAst(reference: CellAddress, leadingWhitespace: IToken): CellReferenceAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCellReferenceAst")(reference.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[CellReferenceAst]

inline def buildColumnRangeAst(start: ColumnAddress, end: ColumnAddress, sheetReferenceType: RangeSheetReferenceType): ColumnRangeAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildColumnRangeAst")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sheetReferenceType.asInstanceOf[js.Any])).asInstanceOf[ColumnRangeAst]
inline def buildColumnRangeAst(
  start: ColumnAddress,
  end: ColumnAddress,
  sheetReferenceType: RangeSheetReferenceType,
  leadingWhitespace: IToken
): ColumnRangeAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildColumnRangeAst")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sheetReferenceType.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[ColumnRangeAst]

inline def buildConcatenateOpAst(left: Ast, right: Ast): ConcatenateOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildConcatenateOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[ConcatenateOpAst]
inline def buildConcatenateOpAst(left: Ast, right: Ast, leadingWhitespace: IToken): ConcatenateOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildConcatenateOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[ConcatenateOpAst]

inline def buildDivOpAst(left: Ast, right: Ast): DivOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDivOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[DivOpAst]
inline def buildDivOpAst(left: Ast, right: Ast, leadingWhitespace: IToken): DivOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDivOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[DivOpAst]

inline def buildEmptyArgAst(): EmptyArgAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildEmptyArgAst")().asInstanceOf[EmptyArgAst]
inline def buildEmptyArgAst(leadingWhitespace: IToken): EmptyArgAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildEmptyArgAst")(leadingWhitespace.asInstanceOf[js.Any]).asInstanceOf[EmptyArgAst]

inline def buildEqualsOpAst(left: Ast, right: Ast): EqualsOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEqualsOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[EqualsOpAst]
inline def buildEqualsOpAst(left: Ast, right: Ast, leadingWhitespace: IToken): EqualsOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEqualsOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[EqualsOpAst]

inline def buildErrorWithRawInputAst(rawInput: String, error: CellError): ErrorWithRawInputAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildErrorWithRawInputAst")(rawInput.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[ErrorWithRawInputAst]
inline def buildErrorWithRawInputAst(rawInput: String, error: CellError, leadingWhitespace: IToken): ErrorWithRawInputAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildErrorWithRawInputAst")(rawInput.asInstanceOf[js.Any], error.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[ErrorWithRawInputAst]

inline def buildGreaterThanOpAst(left: Ast, right: Ast): GreaterThanOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGreaterThanOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[GreaterThanOpAst]
inline def buildGreaterThanOpAst(left: Ast, right: Ast, leadingWhitespace: IToken): GreaterThanOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGreaterThanOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[GreaterThanOpAst]

inline def buildGreaterThanOrEqualOpAst(left: Ast, right: Ast): GreaterThanOrEqualOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGreaterThanOrEqualOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[GreaterThanOrEqualOpAst]
inline def buildGreaterThanOrEqualOpAst(left: Ast, right: Ast, leadingWhitespace: IToken): GreaterThanOrEqualOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildGreaterThanOrEqualOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[GreaterThanOrEqualOpAst]

inline def buildLessThanOpAst(left: Ast, right: Ast): LessThanOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLessThanOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[LessThanOpAst]
inline def buildLessThanOpAst(left: Ast, right: Ast, leadingWhitespace: IToken): LessThanOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLessThanOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[LessThanOpAst]

inline def buildLessThanOrEqualOpAst(left: Ast, right: Ast): LessThanOrEqualOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLessThanOrEqualOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[LessThanOrEqualOpAst]
inline def buildLessThanOrEqualOpAst(left: Ast, right: Ast, leadingWhitespace: IToken): LessThanOrEqualOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildLessThanOrEqualOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[LessThanOrEqualOpAst]

inline def buildMinusOpAst(left: Ast, right: Ast): MinusOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMinusOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[MinusOpAst]
inline def buildMinusOpAst(left: Ast, right: Ast, leadingWhitespace: IToken): MinusOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMinusOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[MinusOpAst]

inline def buildMinusUnaryOpAst(value: Ast): MinusUnaryOpAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildMinusUnaryOpAst")(value.asInstanceOf[js.Any]).asInstanceOf[MinusUnaryOpAst]
inline def buildMinusUnaryOpAst(value: Ast, leadingWhitespace: IToken): MinusUnaryOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMinusUnaryOpAst")(value.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[MinusUnaryOpAst]

inline def buildNamedExpressionAst(expressionName: String): NamedExpressionAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildNamedExpressionAst")(expressionName.asInstanceOf[js.Any]).asInstanceOf[NamedExpressionAst]
inline def buildNamedExpressionAst(expressionName: String, leadingWhitespace: IToken): NamedExpressionAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNamedExpressionAst")(expressionName.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[NamedExpressionAst]

inline def buildNotEqualOpAst(left: Ast, right: Ast): NotEqualOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNotEqualOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[NotEqualOpAst]
inline def buildNotEqualOpAst(left: Ast, right: Ast, leadingWhitespace: IToken): NotEqualOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNotEqualOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[NotEqualOpAst]

inline def buildNumberAst(value: Double): NumberAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildNumberAst")(value.asInstanceOf[js.Any]).asInstanceOf[NumberAst]
inline def buildNumberAst(value: Double, leadingWhitespace: IToken): NumberAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNumberAst")(value.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[NumberAst]

inline def buildParenthesisAst(expression: Ast): ParenthesisAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildParenthesisAst")(expression.asInstanceOf[js.Any]).asInstanceOf[ParenthesisAst]
inline def buildParenthesisAst(expression: Ast, leadingWhitespace: Unit, internalWhitespace: IToken): ParenthesisAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildParenthesisAst")(expression.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any], internalWhitespace.asInstanceOf[js.Any])).asInstanceOf[ParenthesisAst]
inline def buildParenthesisAst(expression: Ast, leadingWhitespace: IToken): ParenthesisAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildParenthesisAst")(expression.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[ParenthesisAst]
inline def buildParenthesisAst(expression: Ast, leadingWhitespace: IToken, internalWhitespace: IToken): ParenthesisAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildParenthesisAst")(expression.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any], internalWhitespace.asInstanceOf[js.Any])).asInstanceOf[ParenthesisAst]

inline def buildParsingErrorAst(): ErrorAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildParsingErrorAst")().asInstanceOf[ErrorAst]

inline def buildPercentOpAst(value: Ast): PercentOpAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPercentOpAst")(value.asInstanceOf[js.Any]).asInstanceOf[PercentOpAst]
inline def buildPercentOpAst(value: Ast, leadingWhitespace: IToken): PercentOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPercentOpAst")(value.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[PercentOpAst]

inline def buildPlusOpAst(left: Ast, right: Ast): PlusOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPlusOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[PlusOpAst]
inline def buildPlusOpAst(left: Ast, right: Ast, leadingWhitespace: IToken): PlusOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPlusOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[PlusOpAst]

inline def buildPlusUnaryOpAst(value: Ast): PlusUnaryOpAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPlusUnaryOpAst")(value.asInstanceOf[js.Any]).asInstanceOf[PlusUnaryOpAst]
inline def buildPlusUnaryOpAst(value: Ast, leadingWhitespace: IToken): PlusUnaryOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPlusUnaryOpAst")(value.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[PlusUnaryOpAst]

inline def buildPowerOpAst(left: Ast, right: Ast): PowerOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPowerOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[PowerOpAst]
inline def buildPowerOpAst(left: Ast, right: Ast, leadingWhitespace: IToken): PowerOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPowerOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[PowerOpAst]

inline def buildProcedureAst(procedureName: String, args: js.Array[Ast]): ProcedureAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProcedureAst")(procedureName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ProcedureAst]
inline def buildProcedureAst(procedureName: String, args: js.Array[Ast], leadingWhitespace: Unit, internalWhitespace: IToken): ProcedureAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProcedureAst")(procedureName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any], internalWhitespace.asInstanceOf[js.Any])).asInstanceOf[ProcedureAst]
inline def buildProcedureAst(procedureName: String, args: js.Array[Ast], leadingWhitespace: IToken): ProcedureAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProcedureAst")(procedureName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[ProcedureAst]
inline def buildProcedureAst(procedureName: String, args: js.Array[Ast], leadingWhitespace: IToken, internalWhitespace: IToken): ProcedureAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProcedureAst")(procedureName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any], internalWhitespace.asInstanceOf[js.Any])).asInstanceOf[ProcedureAst]

inline def buildRowRangeAst(start: RowAddress, end: RowAddress, sheetReferenceType: RangeSheetReferenceType): RowRangeAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildRowRangeAst")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sheetReferenceType.asInstanceOf[js.Any])).asInstanceOf[RowRangeAst]
inline def buildRowRangeAst(
  start: RowAddress,
  end: RowAddress,
  sheetReferenceType: RangeSheetReferenceType,
  leadingWhitespace: IToken
): RowRangeAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildRowRangeAst")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sheetReferenceType.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[RowRangeAst]

inline def buildStringAst(token: ExtendedToken): StringAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildStringAst")(token.asInstanceOf[js.Any]).asInstanceOf[StringAst]

inline def buildTimesOpAst(left: Ast, right: Ast): TimesOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildTimesOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[TimesOpAst]
inline def buildTimesOpAst(left: Ast, right: Ast, leadingWhitespace: IToken): TimesOpAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildTimesOpAst")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[TimesOpAst]

inline def imageWithWhitespace(image: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("imageWithWhitespace")(image.asInstanceOf[js.Any]).asInstanceOf[String]
inline def imageWithWhitespace(image: String, leadingWhitespace: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageWithWhitespace")(image.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[String]

inline def parsingError(`type`: ParsingErrorType, message: String): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("parsingError")(`type`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Message]
