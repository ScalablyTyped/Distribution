package typings.hyperformula

import typings.chevrotain.mod.EmbeddedActionsParser
import typings.chevrotainTypes.mod.ILexingResult
import typings.chevrotainTypes.mod.IToken
import typings.chevrotainTypes.mod.TokenType
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsParserAddressRepresentationConvertersMod.SheetMappingFn
import typings.hyperformula.typingsParserAstMod.Ast
import typings.hyperformula.typingsParserAstMod.ParsingError_
import typings.hyperformula.typingsParserLexerConfigMod.ILexerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserFormulaParserMod {
  
  @JSImport("hyperformula/typings/parser/FormulaParser", "FormulaLexer")
  @js.native
  open class FormulaLexer protected () extends StObject {
    def this(lexerConfig: ILexerConfig) = this()
    
    /* private */ val lexer: Any = js.native
    
    /* private */ var lexerConfig: Any = js.native
    
    /* private */ var skipWhitespacesBeforeArgSeparators: Any = js.native
    
    /* private */ var skipWhitespacesInsideRanges: Any = js.native
    
    /**
      * Returns Lexer tokens from formula string
      *
      * @param text - string representation of a formula
      */
    def tokenizeFormula(text: String): ILexingResult = js.native
    
    /* private */ var trimTrailingWhitespaces: Any = js.native
  }
  /* static members */
  object FormulaLexer {
    
    @JSImport("hyperformula/typings/parser/FormulaParser", "FormulaLexer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/parser/FormulaParser", "FormulaLexer.filterTokensByNeighbors")
    @js.native
    def filterTokensByNeighbors: Any = js.native
    inline def filterTokensByNeighbors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filterTokensByNeighbors")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hyperformula/typings/parser/FormulaParser", "FormulaParser")
  @js.native
  open class FormulaParser protected () extends EmbeddedActionsParser {
    def this(lexerConfig: ILexerConfig, sheetMapping: SheetMappingFn) = this()
    
    /**
      * Rule for addition category operators (e.g. 1 + A1, 1 - A1)
      */
    /* private */ var additionExpression: Any = js.native
    
    /* private */ var arrayExpression: Any = js.native
    
    /**
      * Cache for positiveAtomicExpression alternatives
      */
    /* private */ var atomicExpCache: Any = js.native
    
    /**
      * Rule for atomic expressions, which is positive atomic expression or negation of it
      */
    /* private */ var atomicExpression: Any = js.native
    
    /**
      * Rule for boolean expression (e.g. 1 <= A1)
      */
    /* private */ var booleanExpression: Any = js.native
    
    /* private */ var booleanExpressionOrEmpty: Any = js.native
    
    /* private */ var buildCellRange: Any = js.native
    
    /**
      * Rule for cell ranges (e.g. A1:B$3, A1:OFFSET())
      */
    /* private */ var cellRangeExpression: Any = js.native
    
    /**
      * Rule for cell reference expression (e.g. A1, $A1, A$1, $A$1, $Sheet42!A$17)
      */
    /* private */ var cellReference: Any = js.native
    
    /**
      * Rule for column range, e.g. A:B, Sheet1!A:B, Sheet1!A:Sheet1!B
      */
    /* private */ var columnRangeExpression: Any = js.native
    
    /**
      * Rule for concatenation operator expression (e.g. "=" & A1)
      */
    /* private */ var concatenateExpression: Any = js.native
    
    /* private */ var customParsingError: Any = js.native
    
    /**
      * Rule for end of range expression
      *
      * End of range may be a cell reference or OFFSET() function call
      */
    /* private */ var endOfRangeExpression: Any = js.native
    
    /**
      * Rule for end of range expression
      *
      * End of range may be a cell reference or OFFSET() function call
      */
    /* private */ var endOfRangeWithOffsetStartExpression: Any = js.native
    
    /**
      * Rule for end range reference expression with additional checks considering range start
      */
    /* private */ var endRangeReference: Any = js.native
    
    /**
      * Rule for end range reference expression starting with offset procedure with additional checks considering range start
      */
    /* private */ var endRangeWithOffsetStartReference: Any = js.native
    
    /**
      * Entry rule
      */
    def formula(idxInCallingRule: Double, args: Any*): Ast = js.native
    def formula(idxInCallingRule: Unit, args: Any*): Ast = js.native
    
    /**
      * Address of the cell in which formula is located
      */
    /* private */ var formulaAddress: Any = js.native
    
    /**
      * Entry rule wrapper that sets formula address
      *
      * @param address - address of the cell in which formula is located
      */
    /* private */ var formulaWithContext: Any = js.native
    
    /**
      * Entry rule
      */
    @JSName("formula")
    var formula_Original: AstRule = js.native
    
    /**
      * Returns {@link CellReferenceAst} or {@link CellRangeAst} based on OFFSET function arguments
      *
      * @param args - OFFSET function arguments
      */
    /* private */ var handleOffsetHeuristic: Any = js.native
    
    /* private */ var insideArrayExpression: Any = js.native
    
    /* private */ var lexerConfig: Any = js.native
    
    /**
      * Rule for multiplication category operators (e.g. 1 * A1, 1 / A1)
      */
    /* private */ var multiplicationExpression: Any = js.native
    
    /* private */ var namedExpressionExpression: Any = js.native
    
    def numericStringToNumber(input: String): Double = js.native
    
    /**
      * Rule for expressions that start with the OFFSET function.
      *
      * The OFFSET function can occur as a cell reference, or as a part of a cell range.
      * To preserve LL(k) properties, expressions that start with the OFFSET function need a separate rule.
      *
      * Depending on the presence of the {@link RangeSeparator}, a proper {@link Ast} node type is built.
      */
    /* private */ var offsetExpression: Any = js.native
    
    /**
      * Rule for OFFSET() function expression
      */
    /* private */ var offsetProcedureExpression: Any = js.native
    
    /* private */ var orderCellRangeEnds: Any = js.native
    
    /* private */ var orderColumnRangeEnds: Any = js.native
    
    /* private */ var orderRowRangeEnds: Any = js.native
    
    /**
      * Rule for parenthesis expression
      */
    /* private */ var parenthesisExpression: Any = js.native
    
    /**
      * Parses tokenized formula and builds abstract syntax tree
      *
      * @param tokens - tokenized formula
      * @param formulaAddress - address of the cell in which formula is located
      */
    def parseFromTokens(tokens: js.Array[ExtendedToken], formulaAddress: SimpleCellAddress_): FormulaParserResult = js.native
    
    /* private */ var parsingError: Any = js.native
    
    /**
      * Rule for positive atomic expressions
      */
    /* private */ var positiveAtomicExpression: Any = js.native
    
    /**
      * Rule for power expression
      */
    /* private */ var powerExpression: Any = js.native
    
    /**
      * Rule for procedure expressions: SUM(1,A1)
      */
    /* private */ var procedureExpression: Any = js.native
    
    /* private */ var rightUnaryOpAtomicExpression: Any = js.native
    
    /**
      * Rule for row range, e.g. 1:2, Sheet1!1:2, Sheet1!1:Sheet1!2
      */
    /* private */ var rowRangeExpression: Any = js.native
    
    /* private */ val sheetMapping: Any = js.native
  }
  /* static members */
  object FormulaParser {
    
    @JSImport("hyperformula/typings/parser/FormulaParser", "FormulaParser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/parser/FormulaParser", "FormulaParser.compareSheetIds")
    @js.native
    def compareSheetIds: Any = js.native
    inline def compareSheetIds_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareSheetIds")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/parser/FormulaParser", "FormulaParser.fixSheetIdsForRangeEnds")
    @js.native
    def fixSheetIdsForRangeEnds: Any = js.native
    inline def fixSheetIdsForRangeEnds_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixSheetIdsForRangeEnds")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/parser/FormulaParser", "FormulaParser.rangeSheetReferenceType")
    @js.native
    def rangeSheetReferenceType: Any = js.native
    inline def rangeSheetReferenceType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rangeSheetReferenceType")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AstRule extends StObject {
    
    def apply(idxInCallingRule: Double, args: Any*): Ast = js.native
    def apply(idxInCallingRule: Unit, args: Any*): Ast = js.native
  }
  
  trait ExtendedToken
    extends StObject
       with IToken {
    
    var leadingWhitespace: js.UndefOr[IToken] = js.undefined
  }
  object ExtendedToken {
    
    inline def apply(image: String, startOffset: Double, tokenType: TokenType, tokenTypeIdx: Double): ExtendedToken = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any], tokenTypeIdx = tokenTypeIdx.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendedToken] (val x: Self) extends AnyVal {
      
      inline def setLeadingWhitespace(value: IToken): Self = StObject.set(x, "leadingWhitespace", value.asInstanceOf[js.Any])
      
      inline def setLeadingWhitespaceUndefined: Self = StObject.set(x, "leadingWhitespace", js.undefined)
    }
  }
  
  trait FormulaParserResult extends StObject {
    
    var ast: Ast
    
    var errors: js.Array[ParsingError_]
  }
  object FormulaParserResult {
    
    inline def apply(ast: Ast, errors: js.Array[ParsingError_]): FormulaParserResult = {
      val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormulaParserResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormulaParserResult] (val x: Self) extends AnyVal {
      
      inline def setAst(value: Ast): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[ParsingError_]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ParsingError_ *): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
}
