package typings.hyperformula

import typings.chevrotainTypes.mod.IToken
import typings.hyperformula.typingsAbsoluteCellRangeMod.SimpleCellRange_
import typings.hyperformula.typingsCellMod.CellError
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.hyperformula.typingsNamedExpressionsMod.NamedExpressions
import typings.hyperformula.typingsParserAddressRepresentationConvertersMod.SheetIndexMappingFn
import typings.hyperformula.typingsParserAddressRepresentationConvertersMod.SheetMappingFn
import typings.hyperformula.typingsParserAstMod.Ast
import typings.hyperformula.typingsParserAstMod.CellRangeAst
import typings.hyperformula.typingsParserAstMod.ErrorAst
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import typings.hyperformula.typingsParserAstMod.RangeSheetReferenceType
import typings.hyperformula.typingsParserCellAddressMod.CellReferenceType
import typings.hyperformula.typingsParserColumnAddressMod.ColumnAddress
import typings.hyperformula.typingsParserLexerConfigMod.ILexerConfig
import typings.hyperformula.typingsParserParserConfigMod.ParserConfig
import typings.hyperformula.typingsParserRelativeDependencyMod.RelativeDependency
import typings.hyperformula.typingsParserRowAddressMod.RowAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserMod {
  
  @JSImport("hyperformula/typings/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/parser", "AddressDependency")
  @js.native
  open class AddressDependency protected ()
    extends typings.hyperformula.typingsParserRelativeDependencyMod.AddressDependency {
    def this(dependency: CellAddress) = this()
  }
  
  @JSImport("hyperformula/typings/parser", "AstNodeType")
  @js.native
  object AstNodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.hyperformula.typingsParserAstMod.AstNodeType & String] = js.native
    
    /* "ARRAY" */ val ARRAY: typings.hyperformula.typingsParserAstMod.AstNodeType.ARRAY & String = js.native
    
    /* "CELL_RANGE" */ val CELL_RANGE: typings.hyperformula.typingsParserAstMod.AstNodeType.CELL_RANGE & String = js.native
    
    /* "CELL_REFERENCE" */ val CELL_REFERENCE: typings.hyperformula.typingsParserAstMod.AstNodeType.CELL_REFERENCE & String = js.native
    
    /* "COLUMN_RANGE" */ val COLUMN_RANGE: typings.hyperformula.typingsParserAstMod.AstNodeType.COLUMN_RANGE & String = js.native
    
    /* "CONCATENATE_OP" */ val CONCATENATE_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.CONCATENATE_OP & String = js.native
    
    /* "DIV_OP" */ val DIV_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.DIV_OP & String = js.native
    
    /* "EMPTY" */ val EMPTY: typings.hyperformula.typingsParserAstMod.AstNodeType.EMPTY & String = js.native
    
    /* "EQUALS_OP" */ val EQUALS_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.EQUALS_OP & String = js.native
    
    /* "ERROR" */ val ERROR: typings.hyperformula.typingsParserAstMod.AstNodeType.ERROR & String = js.native
    
    /* "ERROR_WITH_RAW_INPUT" */ val ERROR_WITH_RAW_INPUT: typings.hyperformula.typingsParserAstMod.AstNodeType.ERROR_WITH_RAW_INPUT & String = js.native
    
    /* "FUNCTION_CALL" */ val FUNCTION_CALL: typings.hyperformula.typingsParserAstMod.AstNodeType.FUNCTION_CALL & String = js.native
    
    /* "GREATER_THAN_OP" */ val GREATER_THAN_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.GREATER_THAN_OP & String = js.native
    
    /* "GREATER_THAN_OR_EQUAL_OP" */ val GREATER_THAN_OR_EQUAL_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.GREATER_THAN_OR_EQUAL_OP & String = js.native
    
    /* "LESS_THAN_OP" */ val LESS_THAN_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.LESS_THAN_OP & String = js.native
    
    /* "LESS_THAN_OR_EQUAL_OP" */ val LESS_THAN_OR_EQUAL_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.LESS_THAN_OR_EQUAL_OP & String = js.native
    
    /* "MINUS_OP" */ val MINUS_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.MINUS_OP & String = js.native
    
    /* "MINUS_UNARY_OP" */ val MINUS_UNARY_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.MINUS_UNARY_OP & String = js.native
    
    /* "NAMED_EXPRESSION" */ val NAMED_EXPRESSION: typings.hyperformula.typingsParserAstMod.AstNodeType.NAMED_EXPRESSION & String = js.native
    
    /* "NOT_EQUAL_OP" */ val NOT_EQUAL_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.NOT_EQUAL_OP & String = js.native
    
    /* "NUMBER" */ val NUMBER: typings.hyperformula.typingsParserAstMod.AstNodeType.NUMBER & String = js.native
    
    /* "PARENTHESES" */ val PARENTHESIS: typings.hyperformula.typingsParserAstMod.AstNodeType.PARENTHESIS & String = js.native
    
    /* "PERCENT_OP" */ val PERCENT_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.PERCENT_OP & String = js.native
    
    /* "PLUS_OP" */ val PLUS_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.PLUS_OP & String = js.native
    
    /* "PLUS_UNARY_OP" */ val PLUS_UNARY_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.PLUS_UNARY_OP & String = js.native
    
    /* "POWER_OP" */ val POWER_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.POWER_OP & String = js.native
    
    /* "ROW_RANGE" */ val ROW_RANGE: typings.hyperformula.typingsParserAstMod.AstNodeType.ROW_RANGE & String = js.native
    
    /* "STRING" */ val STRING: typings.hyperformula.typingsParserAstMod.AstNodeType.STRING & String = js.native
    
    /* "TIMES_OP" */ val TIMES_OP: typings.hyperformula.typingsParserAstMod.AstNodeType.TIMES_OP & String = js.native
  }
  
  @JSImport("hyperformula/typings/parser", "CellAddress")
  @js.native
  open class CellAddress protected ()
    extends typings.hyperformula.typingsParserCellAddressMod.CellAddress {
    def this(col: Double, row: Double, `type`: CellReferenceType) = this()
    def this(col: Double, row: Double, `type`: CellReferenceType, sheet: Double) = this()
  }
  /* static members */
  object CellAddress {
    
    @JSImport("hyperformula/typings/parser", "CellAddress")
    @js.native
    val ^ : js.Any = js.native
    
    inline def absolute(col: Double, row: Double): typings.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absolute")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsParserCellAddressMod.CellAddress]
    inline def absolute(col: Double, row: Double, sheet: Double): typings.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absolute")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsParserCellAddressMod.CellAddress]
    
    inline def absoluteCol(col: Double, row: Double): typings.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteCol")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsParserCellAddressMod.CellAddress]
    inline def absoluteCol(col: Double, row: Double, sheet: Double): typings.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteCol")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsParserCellAddressMod.CellAddress]
    
    inline def absoluteRow(col: Double, row: Double): typings.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteRow")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsParserCellAddressMod.CellAddress]
    inline def absoluteRow(col: Double, row: Double, sheet: Double): typings.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteRow")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsParserCellAddressMod.CellAddress]
    
    inline def fromColAndRow(col: ColumnAddress, row: RowAddress): typings.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColAndRow")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsParserCellAddressMod.CellAddress]
    inline def fromColAndRow(col: ColumnAddress, row: RowAddress, sheet: Double): typings.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColAndRow")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsParserCellAddressMod.CellAddress]
    
    inline def relative(row: Double, col: Double): typings.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(row.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsParserCellAddressMod.CellAddress]
    inline def relative(row: Double, col: Double, sheet: Double): typings.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(row.asInstanceOf[js.Any], col.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.typingsParserCellAddressMod.CellAddress]
  }
  
  @JSImport("hyperformula/typings/parser", "CellRangeDependency")
  @js.native
  open class CellRangeDependency protected ()
    extends typings.hyperformula.typingsParserRelativeDependencyMod.CellRangeDependency {
    def this(start: CellAddress, end: CellAddress) = this()
  }
  
  @JSImport("hyperformula/typings/parser", "ColumnRangeDependency")
  @js.native
  open class ColumnRangeDependency protected ()
    extends typings.hyperformula.typingsParserRelativeDependencyMod.ColumnRangeDependency {
    def this(start: ColumnAddress, end: ColumnAddress) = this()
  }
  
  @JSImport("hyperformula/typings/parser", "FormulaLexer")
  @js.native
  open class FormulaLexer protected ()
    extends typings.hyperformula.typingsParserFormulaParserMod.FormulaLexer {
    def this(lexerConfig: ILexerConfig) = this()
  }
  /* static members */
  object FormulaLexer {
    
    @JSImport("hyperformula/typings/parser", "FormulaLexer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/parser", "FormulaLexer.filterTokensByNeighbors")
    @js.native
    def filterTokensByNeighbors: Any = js.native
    inline def filterTokensByNeighbors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filterTokensByNeighbors")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hyperformula/typings/parser", "NamedExpressionDependency")
  @js.native
  open class NamedExpressionDependency protected ()
    extends typings.hyperformula.typingsParserRelativeDependencyMod.NamedExpressionDependency {
    def this(name: String) = this()
  }
  
  @JSImport("hyperformula/typings/parser", "ParserWithCaching")
  @js.native
  open class ParserWithCaching protected ()
    extends typings.hyperformula.typingsParserParserWithCachingMod.ParserWithCaching {
    def this(config: ParserConfig, functionRegistry: FunctionRegistry, sheetMapping: SheetMappingFn) = this()
  }
  
  @JSImport("hyperformula/typings/parser", "ParsingErrorType")
  @js.native
  object ParsingErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.hyperformula.typingsParserAstMod.ParsingErrorType & String] = js.native
    
    /* "LexingError" */ val LexingError: typings.hyperformula.typingsParserAstMod.ParsingErrorType.LexingError & String = js.native
    
    /* "ParsingError" */ val ParserError: typings.hyperformula.typingsParserAstMod.ParsingErrorType.ParserError & String = js.native
    
    /* "RangeOffsetNotAllowed" */ val RangeOffsetNotAllowed: typings.hyperformula.typingsParserAstMod.ParsingErrorType.RangeOffsetNotAllowed & String = js.native
    
    /* "StaticOffsetError" */ val StaticOffsetError: typings.hyperformula.typingsParserAstMod.ParsingErrorType.StaticOffsetError & String = js.native
    
    /* "StaticOffsetOutOfRangeError" */ val StaticOffsetOutOfRangeError: typings.hyperformula.typingsParserAstMod.ParsingErrorType.StaticOffsetOutOfRangeError & String = js.native
  }
  
  @JSImport("hyperformula/typings/parser", "RowRangeDependency")
  @js.native
  open class RowRangeDependency protected ()
    extends typings.hyperformula.typingsParserRelativeDependencyMod.RowRangeDependency {
    def this(start: RowAddress, end: RowAddress) = this()
  }
  
  @JSImport("hyperformula/typings/parser", "Unparser")
  @js.native
  open class Unparser protected ()
    extends typings.hyperformula.typingsParserUnparserMod.Unparser {
    def this(
      config: ParserConfig,
      lexerConfig: ILexerConfig,
      sheetMappingFn: SheetIndexMappingFn,
      namedExpressions: NamedExpressions
    ) = this()
  }
  
  inline def buildCellErrorAst(error: CellError): ErrorAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildCellErrorAst")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorAst]
  inline def buildCellErrorAst(error: CellError, leadingWhitespace: IToken): ErrorAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCellErrorAst")(error.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[ErrorAst]
  
  inline def buildCellRangeAst(
    start: typings.hyperformula.typingsParserCellAddressMod.CellAddress,
    end: typings.hyperformula.typingsParserCellAddressMod.CellAddress,
    sheetReferenceType: RangeSheetReferenceType
  ): CellRangeAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCellRangeAst")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sheetReferenceType.asInstanceOf[js.Any])).asInstanceOf[CellRangeAst]
  inline def buildCellRangeAst(
    start: typings.hyperformula.typingsParserCellAddressMod.CellAddress,
    end: typings.hyperformula.typingsParserCellAddressMod.CellAddress,
    sheetReferenceType: RangeSheetReferenceType,
    leadingWhitespace: String
  ): CellRangeAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCellRangeAst")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sheetReferenceType.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[CellRangeAst]
  
  inline def buildLexerConfig(config: ParserConfig): ILexerConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("buildLexerConfig")(config.asInstanceOf[js.Any]).asInstanceOf[ILexerConfig]
  
  inline def buildParsingErrorAst(): ErrorAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildParsingErrorAst")().asInstanceOf[ErrorAst]
  
  inline def buildProcedureAst(procedureName: String, args: js.Array[Ast]): ProcedureAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProcedureAst")(procedureName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ProcedureAst]
  inline def buildProcedureAst(procedureName: String, args: js.Array[Ast], leadingWhitespace: Unit, internalWhitespace: IToken): ProcedureAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProcedureAst")(procedureName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any], internalWhitespace.asInstanceOf[js.Any])).asInstanceOf[ProcedureAst]
  inline def buildProcedureAst(procedureName: String, args: js.Array[Ast], leadingWhitespace: IToken): ProcedureAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProcedureAst")(procedureName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[ProcedureAst]
  inline def buildProcedureAst(procedureName: String, args: js.Array[Ast], leadingWhitespace: IToken, internalWhitespace: IToken): ProcedureAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProcedureAst")(procedureName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any], internalWhitespace.asInstanceOf[js.Any])).asInstanceOf[ProcedureAst]
  
  inline def cellAddressFromString(sheetMapping: SheetMappingFn, stringAddress: String, baseAddress: SimpleCellAddress_): Maybe[typings.hyperformula.typingsParserCellAddressMod.CellAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("cellAddressFromString")(sheetMapping.asInstanceOf[js.Any], stringAddress.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[Maybe[typings.hyperformula.typingsParserCellAddressMod.CellAddress]]
  
  inline def collectDependencies(ast: Ast, functionRegistry: FunctionRegistry): js.Array[RelativeDependency] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectDependencies")(ast.asInstanceOf[js.Any], functionRegistry.asInstanceOf[js.Any])).asInstanceOf[js.Array[RelativeDependency]]
  
  inline def simpleCellAddressFromString(sheetMapping: SheetMappingFn, stringAddress: String, sheetContext: Double): Maybe[SimpleCellAddress_] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellAddressFromString")(sheetMapping.asInstanceOf[js.Any], stringAddress.asInstanceOf[js.Any], sheetContext.asInstanceOf[js.Any])).asInstanceOf[Maybe[SimpleCellAddress_]]
  
  inline def simpleCellAddressToString(sheetIndexMapping: SheetIndexMappingFn, address: SimpleCellAddress_, sheetIndex: Double): Maybe[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellAddressToString")(sheetIndexMapping.asInstanceOf[js.Any], address.asInstanceOf[js.Any], sheetIndex.asInstanceOf[js.Any])).asInstanceOf[Maybe[String]]
  
  inline def simpleCellRangeFromString(sheetMapping: SheetMappingFn, stringAddress: String, sheetContext: Double): Maybe[SimpleCellRange_] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellRangeFromString")(sheetMapping.asInstanceOf[js.Any], stringAddress.asInstanceOf[js.Any], sheetContext.asInstanceOf[js.Any])).asInstanceOf[Maybe[SimpleCellRange_]]
  
  inline def simpleCellRangeToString(sheetIndexMapping: SheetIndexMappingFn, address: SimpleCellRange_, sheetIndex: Double): Maybe[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellRangeToString")(sheetIndexMapping.asInstanceOf[js.Any], address.asInstanceOf[js.Any], sheetIndex.asInstanceOf[js.Any])).asInstanceOf[Maybe[String]]
}
