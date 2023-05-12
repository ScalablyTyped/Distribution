package typings.hyperformula

import typings.chevrotainTypes.mod.TokenType
import typings.hyperformula.hyperformulaStrings.Comma
import typings.hyperformula.hyperformulaStrings.Dot
import typings.hyperformula.typingsCellMod.ErrorType
import typings.hyperformula.typingsParserParserConfigMod.ParserConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserLexerConfigMod {
  
  @JSImport("hyperformula/typings/parser/LexerConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "AdditionOp")
  @js.native
  val AdditionOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "ArrayLParen")
  @js.native
  val ArrayLParen: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "ArrayRParen")
  @js.native
  val ArrayRParen: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "BooleanOp")
  @js.native
  val BooleanOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "CellReference")
  @js.native
  val CellReference: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "ColumnRange")
  @js.native
  val ColumnRange: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "ConcatenateOp")
  @js.native
  val ConcatenateOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "DivOp")
  @js.native
  val DivOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "EqualsOp")
  @js.native
  val EqualsOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "ErrorLiteral")
  @js.native
  val ErrorLiteral: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "GreaterThanOp")
  @js.native
  val GreaterThanOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "GreaterThanOrEqualOp")
  @js.native
  val GreaterThanOrEqualOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "LParen")
  @js.native
  val LParen: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "LessThanOp")
  @js.native
  val LessThanOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "LessThanOrEqualOp")
  @js.native
  val LessThanOrEqualOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "MinusOp")
  @js.native
  val MinusOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "MultiplicationOp")
  @js.native
  val MultiplicationOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "NamedExpression")
  @js.native
  val NamedExpression: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "NotEqualOp")
  @js.native
  val NotEqualOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "PercentOp")
  @js.native
  val PercentOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "PlusOp")
  @js.native
  val PlusOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "PowerOp")
  @js.native
  val PowerOp: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "ProcedureName")
  @js.native
  val ProcedureName: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "RParen")
  @js.native
  val RParen: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "RangeSeparator")
  @js.native
  val RangeSeparator: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "RowRange")
  @js.native
  val RowRange: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "StringLiteral")
  @js.native
  val StringLiteral: TokenType = js.native
  
  @JSImport("hyperformula/typings/parser/LexerConfig", "TimesOp")
  @js.native
  val TimesOp: TokenType = js.native
  
  inline def buildLexerConfig(config: ParserConfig): LexerConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("buildLexerConfig")(config.asInstanceOf[js.Any]).asInstanceOf[LexerConfig]
  
  trait LexerConfig extends StObject {
    
    var ArgSeparator: TokenType
    
    var ArrayColSeparator: TokenType
    
    var ArrayRowSeparator: TokenType
    
    var NumberLiteral: TokenType
    
    var OffsetProcedureName: TokenType
    
    var WhiteSpace: TokenType
    
    var allTokens: js.Array[TokenType]
    
    var decimalSeparator: Dot | Comma
    
    var errorMapping: Record[String, ErrorType]
    
    var functionMapping: Record[String, String]
    
    var maxColumns: Double
    
    var maxRows: Double
  }
  object LexerConfig {
    
    inline def apply(
      ArgSeparator: TokenType,
      ArrayColSeparator: TokenType,
      ArrayRowSeparator: TokenType,
      NumberLiteral: TokenType,
      OffsetProcedureName: TokenType,
      WhiteSpace: TokenType,
      allTokens: js.Array[TokenType],
      decimalSeparator: Dot | Comma,
      errorMapping: Record[String, ErrorType],
      functionMapping: Record[String, String],
      maxColumns: Double,
      maxRows: Double
    ): LexerConfig = {
      val __obj = js.Dynamic.literal(ArgSeparator = ArgSeparator.asInstanceOf[js.Any], ArrayColSeparator = ArrayColSeparator.asInstanceOf[js.Any], ArrayRowSeparator = ArrayRowSeparator.asInstanceOf[js.Any], NumberLiteral = NumberLiteral.asInstanceOf[js.Any], OffsetProcedureName = OffsetProcedureName.asInstanceOf[js.Any], WhiteSpace = WhiteSpace.asInstanceOf[js.Any], allTokens = allTokens.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], errorMapping = errorMapping.asInstanceOf[js.Any], functionMapping = functionMapping.asInstanceOf[js.Any], maxColumns = maxColumns.asInstanceOf[js.Any], maxRows = maxRows.asInstanceOf[js.Any])
      __obj.asInstanceOf[LexerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LexerConfig] (val x: Self) extends AnyVal {
      
      inline def setAllTokens(value: js.Array[TokenType]): Self = StObject.set(x, "allTokens", value.asInstanceOf[js.Any])
      
      inline def setAllTokensVarargs(value: TokenType*): Self = StObject.set(x, "allTokens", js.Array(value*))
      
      inline def setArgSeparator(value: TokenType): Self = StObject.set(x, "ArgSeparator", value.asInstanceOf[js.Any])
      
      inline def setArrayColSeparator(value: TokenType): Self = StObject.set(x, "ArrayColSeparator", value.asInstanceOf[js.Any])
      
      inline def setArrayRowSeparator(value: TokenType): Self = StObject.set(x, "ArrayRowSeparator", value.asInstanceOf[js.Any])
      
      inline def setDecimalSeparator(value: Dot | Comma): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      inline def setErrorMapping(value: Record[String, ErrorType]): Self = StObject.set(x, "errorMapping", value.asInstanceOf[js.Any])
      
      inline def setFunctionMapping(value: Record[String, String]): Self = StObject.set(x, "functionMapping", value.asInstanceOf[js.Any])
      
      inline def setMaxColumns(value: Double): Self = StObject.set(x, "maxColumns", value.asInstanceOf[js.Any])
      
      inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      inline def setNumberLiteral(value: TokenType): Self = StObject.set(x, "NumberLiteral", value.asInstanceOf[js.Any])
      
      inline def setOffsetProcedureName(value: TokenType): Self = StObject.set(x, "OffsetProcedureName", value.asInstanceOf[js.Any])
      
      inline def setWhiteSpace(value: TokenType): Self = StObject.set(x, "WhiteSpace", value.asInstanceOf[js.Any])
    }
  }
}
