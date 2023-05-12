package typings.hyperformula

import typings.chevrotainTypes.mod.ILexingResult
import typings.chevrotainTypes.mod.IToken
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typings.hyperformula.typingsParserAddressRepresentationConvertersMod.SheetMappingFn
import typings.hyperformula.typingsParserAstMod.Ast
import typings.hyperformula.typingsParserAstMod.ParsingError_
import typings.hyperformula.typingsParserFormulaParserMod.ExtendedToken
import typings.hyperformula.typingsParserParserConfigMod.ParserConfig
import typings.hyperformula.typingsParserRelativeDependencyMod.RelativeDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserParserWithCachingMod {
  
  @JSImport("hyperformula/typings/parser/ParserWithCaching", "ParserWithCaching")
  @js.native
  open class ParserWithCaching protected () extends StObject {
    def this(config: ParserConfig, functionRegistry: FunctionRegistry, sheetMapping: SheetMappingFn) = this()
    
    def bindWhitespacesToTokens(tokens: js.Array[IToken]): js.Array[ExtendedToken] = js.native
    
    /* private */ var cache: Any = js.native
    
    def computeHashFromAst(ast: Ast): String = js.native
    
    def computeHashFromTokens(tokens: js.Array[IToken], baseAddress: SimpleCellAddress_): String = js.native
    
    /* private */ var computeHashOfAstNode: Any = js.native
    
    /* private */ val config: Any = js.native
    
    /* private */ var convertReversedRangesToRegularRanges: Any = js.native
    
    def fetchCachedResult(hash: String): ParsingResult = js.native
    
    def fetchCachedResultForAst(ast: Ast): ParsingResult = js.native
    
    /* private */ var formulaAddress: Any = js.native
    
    /* private */ var formulaParser: Any = js.native
    
    /* private */ val functionRegistry: Any = js.native
    
    /* private */ var lexer: Any = js.native
    
    /* private */ val lexerConfig: Any = js.native
    
    /* private */ var orderCellRangeEnds: Any = js.native
    
    /* private */ var orderColumnRangeEnds: Any = js.native
    
    /* private */ var orderRowRangeEnds: Any = js.native
    
    /**
      * Parses a formula.
      *
      * @param text - formula to parse
      * @param formulaAddress - address with regard to which formula should be parsed. Impacts computed addresses in R0C0 format.
      */
    def parse(text: String, formulaAddress: SimpleCellAddress_): ParsingResult = js.native
    
    def rememberNewAst(ast: Ast): Ast = js.native
    
    /* private */ val sheetMapping: Any = js.native
    
    var statsCacheUsed: Double = js.native
    
    def tokenizeFormula(text: String): ILexingResult = js.native
  }
  /* static members */
  object ParserWithCaching {
    
    @JSImport("hyperformula/typings/parser/ParserWithCaching", "ParserWithCaching")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/parser/ParserWithCaching", "ParserWithCaching.compareSheetIds")
    @js.native
    def compareSheetIds: Any = js.native
    inline def compareSheetIds_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareSheetIds")(x.asInstanceOf[js.Any])
  }
  
  trait ParsingResult extends StObject {
    
    var ast: Ast
    
    var dependencies: js.Array[RelativeDependency]
    
    var errors: js.Array[ParsingError_]
    
    var hasStructuralChangeFunction: Boolean
    
    var hasVolatileFunction: Boolean
  }
  object ParsingResult {
    
    inline def apply(
      ast: Ast,
      dependencies: js.Array[RelativeDependency],
      errors: js.Array[ParsingError_],
      hasStructuralChangeFunction: Boolean,
      hasVolatileFunction: Boolean
    ): ParsingResult = {
      val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], hasStructuralChangeFunction = hasStructuralChangeFunction.asInstanceOf[js.Any], hasVolatileFunction = hasVolatileFunction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsingResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsingResult] (val x: Self) extends AnyVal {
      
      inline def setAst(value: Ast): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: js.Array[RelativeDependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: RelativeDependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setErrors(value: js.Array[ParsingError_]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ParsingError_ *): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setHasStructuralChangeFunction(value: Boolean): Self = StObject.set(x, "hasStructuralChangeFunction", value.asInstanceOf[js.Any])
      
      inline def setHasVolatileFunction(value: Boolean): Self = StObject.set(x, "hasVolatileFunction", value.asInstanceOf[js.Any])
    }
  }
}
